/*
 * Copyright 2015-2102 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.roncoo.pay.controller.account;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.alibaba.fastjson.JSON;
import com.roncoo.pay.account.entity.RpAccount;
import com.roncoo.pay.account.entity.RpAccountHistory;
import com.roncoo.pay.account.service.RpAccountHistoryService;
import com.roncoo.pay.account.service.RpAccountService;
import com.roncoo.pay.common.core.entity.ApiCommonResultVo;
import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.common.core.utils.EncryptUtil;
import com.roncoo.pay.common.core.utils.StringUtil;
import com.roncoo.pay.controller.common.BaseController;
import com.roncoo.pay.controller.common.ConstantClass;
import com.roncoo.pay.controller.common.JSONParam;
import com.roncoo.pay.user.entity.MerchantAccount;
import com.roncoo.pay.user.entity.RpPayWay;
import com.roncoo.pay.user.entity.RpUserInfo;
import com.roncoo.pay.user.entity.RpUserPayConfig;
import com.roncoo.pay.user.service.RpPayWayService;
import com.roncoo.pay.user.service.RpUserInfoService;
import com.roncoo.pay.user.service.RpUserPayConfigService;

/**
 * 账户信息 龙果学院：www.roncoo.com
 * 
 * @author zenghao
 */
@Controller
public class RegistrationController extends BaseController
{
    @Autowired
    private RpUserPayConfigService rpUserPayConfigService;
    
    @Autowired
    private RpAccountService rpAccountService;
    
    @Autowired
    private RpPayWayService rpPayWayService;
    
    @Autowired
    private RpAccountHistoryService rpAccountHistoryService;
    
    @Autowired
    private RpUserInfoService rpUserInfoService;
    
    @RequestMapping(value = "/registration.html", method = {RequestMethod.POST, RequestMethod.GET})
    public String init(HttpServletRequest request, Model model)
    {
        
        return "system/registration_wizard";
    }
    
    @RequestMapping(value = "/register.html", method = {RequestMethod.POST, RequestMethod.GET})
    public String register(HttpServletRequest request, MerchantAccount merchantAccount,
        @RequestParam("idCardFront") CommonsMultipartFile idCardFront,
        @RequestParam("idCardBack") CommonsMultipartFile idCardBack,
        @RequestParam("bankCardFront") CommonsMultipartFile bankCardFront,
        @RequestParam("personPhoto") CommonsMultipartFile personPhoto)
    {
        String userNo = rpUserInfoService.getUserNo();
        
        String idCardFrontPath = null;
        String idCardBackPath = null;
        String bankCardFrontPath = null;
        String personPhotoPath = null;
        if (userNo != null && !userNo.equals(""))
        {
            // |获取在Web服务器上的 绝对路径
            String path = request.getRealPath("/statics/fileupload/" + userNo);
            
            try
            {
                 idCardFrontPath = getSaveFilePath(path, idCardFront);
                 idCardBackPath = getSaveFilePath(path, idCardBack);
                 bankCardFrontPath = getSaveFilePath(path, bankCardFront);
                 personPhotoPath = getSaveFilePath(path, personPhoto);
            }
            catch (Exception e)
            {
                request.setAttribute("errorMsg", "上传图片失败，每张图片不能炒作512K");
                 return "system/registration_wizard";
            }
            
        }
        
        merchantAccount.setUserNo(userNo);
        merchantAccount.setIdCardFrontPath(idCardFrontPath);
        merchantAccount.setIdCardBackPath(idCardBackPath);
        merchantAccount.setBankCardFrontPath(bankCardFrontPath);
        merchantAccount.setPersonPhotoPath(personPhotoPath);
        
        rpUserInfoService.registerByMerchant(merchantAccount, idCardFront, idCardBack, bankCardFront, personPhoto);
        
        return "/login";
    }
    
    private String getSaveFilePath(String fileCatage, CommonsMultipartFile multipartFile) throws Exception
    {
        String fileName = multipartFile.getOriginalFilename();
        InputStream input = multipartFile.getInputStream();
        String newFileName = StringUtil.get32UUID() +  fileName.substring(fileName.indexOf("."), fileName.length());
        
        File file = null;
        
        file = new File(fileCatage);  
        if (!file.isDirectory())  
            file.mkdir();  
        
        file = new File(fileCatage,newFileName);
        if (!file.exists())
        {
            file.createNewFile();
        }
        
        //|文件输出流  
        OutputStream os =new FileOutputStream(file);  
        //|循环写入  
        int length=0;  
        byte [] buffer=new byte[2048];  
        while((length=input.read(buffer))!=-1)  
        {  
            os.write(buffer,0, length);  
        }  
        input.close();  
        os.close(); 
        
        return fileCatage + "/" + newFileName;
    }
    
    /**
     * 函数功能说明 ： 查询用户信息
     * 
     * @参数： @return
     * @return String
     * @throws
     */
    @RequestMapping(value = "/getAccountInfo", method = {RequestMethod.POST, RequestMethod.GET})
    public String getAccountInfo(HttpServletRequest request)
    {
        RpUserInfo rpUserInfo = (RpUserInfo)request.getSession().getAttribute(ConstantClass.USER);
        String userNo = rpUserInfo.getUserNo();
        RpAccount rpAccount = rpAccountService.getDataByUserNo(userNo);
        RpUserPayConfig rpUserPayConfig = rpUserPayConfigService.getByUserNo(userNo);
        List<RpPayWay> rpPayWayList = rpPayWayService.listByProductCode(rpUserPayConfig.getProductCode());
        
        request.setAttribute("rpAccount", rpAccount);
        request.setAttribute("rpUserPayConfig", rpUserPayConfig);
        request.setAttribute("rpPayWayList", rpPayWayList);
        return "account/info";
    }
    
    @RequestMapping(value = "/ajaxAccountInfo", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String ajaxAccountInfo(HttpServletRequest request, @RequestBody JSONParam[] params)
        throws IllegalAccessException, InvocationTargetException
    {
        RpUserInfo rpUserInfo = (RpUserInfo)request.getSession().getAttribute(ConstantClass.USER);
        String userNo = rpUserInfo.getUserNo();
        // convertToMap定义于父类，将参数数组中的所有元素加入一个HashMap
        HashMap<String, String> paramMap = convertToMap(params);
        String sEcho = paramMap.get("sEcho");
        int start = Integer.parseInt(paramMap.get("iDisplayStart"));
        int length = Integer.parseInt(paramMap.get("iDisplayLength"));
        
        // customerService.search返回的第一个元素是满足查询条件的记录总数，后面的是
        // 页面当前页需要显示的记录数据
        PageParam pageParam = new PageParam(start / length + 1, length);
        RpAccountHistory rpAccountHistory = new RpAccountHistory();
        rpAccountHistory.setUserNo(userNo);
        PageBean pageBean = rpAccountHistoryService.listPage(pageParam, rpAccountHistory);
        Long count = Long.valueOf(pageBean.getTotalCount() + "");
        
        String jsonString = JSON.toJSONString(pageBean.getRecordList());
        String json =
            "{\"sEcho\":" + sEcho + ",\"iTotalRecords\":" + count.longValue() + ",\"iTotalDisplayRecords\":"
                + count.longValue() + ",\"aaData\":" + jsonString + "}";
        return json;
    }
    
    @RequestMapping(value = "/savePassword", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ApiCommonResultVo savePassword(HttpServletRequest request)
        throws IllegalAccessException, InvocationTargetException
    {
        RpUserInfo rpUserInfo = (RpUserInfo)request.getSession().getAttribute(ConstantClass.USER);
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        if (!EncryptUtil.encodeMD5String(oldPassword).equals(rpUserInfo.getPassword()))
        {
            return new ApiCommonResultVo(-1, "操作失败，密码错误", "");
        }
        else
        {
            rpUserInfo.setPassword(EncryptUtil.encodeMD5String(newPassword));
            rpUserInfoService.updateData(rpUserInfo);
            request.getSession().setAttribute(ConstantClass.USER, rpUserInfo);
            return new ApiCommonResultVo(0, "操作成功", "");
        }
    }
}
