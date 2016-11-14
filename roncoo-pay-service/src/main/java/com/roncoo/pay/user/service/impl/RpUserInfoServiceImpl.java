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
package com.roncoo.pay.user.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.roncoo.pay.account.entity.RpAccount;
import com.roncoo.pay.account.service.RpAccountService;
import com.roncoo.pay.common.core.enums.PublicStatusEnum;
import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;
import com.roncoo.pay.common.core.utils.EncryptUtil;
import com.roncoo.pay.common.core.utils.StringUtil;
import com.roncoo.pay.user.dao.RpUserInfoDao;
import com.roncoo.pay.user.entity.MerchantAccount;
import com.roncoo.pay.user.entity.RpUserBankAccount;
import com.roncoo.pay.user.entity.RpUserInfo;
import com.roncoo.pay.user.enums.CardTypeEnum;
import com.roncoo.pay.user.service.BuildNoService;
import com.roncoo.pay.user.service.RpUserBankAccountService;
import com.roncoo.pay.user.service.RpUserInfoService;

/**
 * 用户信息service实现类
 * 龙果学院：www.roncoo.com
 * @author：zenghao
 */
@Service("rpUserInfoService")
public class RpUserInfoServiceImpl implements RpUserInfoService{

	@Autowired
	private RpUserInfoDao rpUserInfoDao;
	
	@Autowired
	private BuildNoService buildNoService;
	
	@Autowired
	private RpAccountService rpAccountService;
	
	@Autowired
	private RpUserBankAccountService rpUserBankAccountService;
	
	@Override
	public void saveData(RpUserInfo rpUserInfo) {
		rpUserInfoDao.insert(rpUserInfo);
	}

	@Override
	public void updateData(RpUserInfo rpUserInfo) {
		rpUserInfoDao.update(rpUserInfo);
	}

	@Override
	public RpUserInfo getDataById(String id) {
		return rpUserInfoDao.getById(id);
	}

	@Override
	public PageBean listPage(PageParam pageParam, RpUserInfo rpUserInfo) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userNo", rpUserInfo.getUserNo());
		return rpUserInfoDao.listPage(pageParam, paramMap);
	}
	
    /**
     * 用户线下注册
     * 
     * @param userName
     *            用户名
     * @param mobile
     *            手机号
     * @param password
     *            密码
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void registerOffline(String userName, String mobile, String password) {
        String userNo = buildNoService.buildUserNo();
        String accountNo = buildNoService.buildAccountNo();

        //生成用户信息
        RpUserInfo rpUserInfo = new RpUserInfo();
        rpUserInfo.setAccountNo(accountNo);
        rpUserInfo.setCreateTime(new Date());
        rpUserInfo.setId(StringUtil.get32UUID());
        rpUserInfo.setStatus(PublicStatusEnum.ACTIVE.name());
        rpUserInfo.setUserName(userName);
        rpUserInfo.setUserNo(userNo);
        rpUserInfo.setMobile(mobile);
        rpUserInfo.setPassword(EncryptUtil.encodeMD5String(password));
        rpUserInfo.setVersion(0);
        this.saveData(rpUserInfo);

        // 生成账户信息
        RpAccount rpAccount = new RpAccount();
        rpAccount.setAccountNo(accountNo);
        rpAccount.setAccountType("0");
        rpAccount.setCreateTime(new Date());
        rpAccount.setEditTime(new Date());
        rpAccount.setId(StringUtil.get32UUID());
        rpAccount.setStatus(PublicStatusEnum.ACTIVE.name());
        rpAccount.setUserNo(userNo);
        rpAccount.setBalance(new BigDecimal("0"));
        rpAccount.setSecurityMoney(new BigDecimal("0"));
        rpAccount.setSettAmount(new BigDecimal("0"));
        rpAccount.setTodayExpend(new BigDecimal("0"));
        rpAccount.setTodayIncome(new BigDecimal("0"));
        rpAccount.setUnbalance(new BigDecimal("0"));
        rpAccount.setTotalExpend(new BigDecimal("0"));
        rpAccount.setTotalIncome(new BigDecimal("0"));
        rpAccountService.saveData(rpAccount);
    }
    
    /**
     * 上传个人信息资质
     * @param merchantAccount
     * @param idCardFront
     * @param idCardBack
     * @param bankCardFront
     * @param personPhoto
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void registerByMerchant(MerchantAccount merchantAccount)
    {
        String accountNo = buildNoService.buildAccountNo();

        //生成用户信息
        RpUserInfo rpUserInfo = new RpUserInfo();
        rpUserInfo.setAccountNo(accountNo);
        rpUserInfo.setCreateTime(new Date());
        rpUserInfo.setId(StringUtil.get32UUID());
        rpUserInfo.setStatus(PublicStatusEnum.ACTIVE.name());
        rpUserInfo.setUserName(merchantAccount.getUserName());
        rpUserInfo.setUserNo(merchantAccount.getUserNo());
        rpUserInfo.setMobile(merchantAccount.getMobile());
        rpUserInfo.setPassword(EncryptUtil.encodeMD5String(merchantAccount.getPassword()));
        rpUserInfo.setVersion(0);
        
        rpUserInfo.setIdCardFrontPath(merchantAccount.getIdCardFrontPath());
        rpUserInfo.setIdCardBackPath(merchantAccount.getIdCardBackPath());
        rpUserInfo.setBankCardFrontPath(merchantAccount.getBankCardFrontPath());
        rpUserInfo.setPersonPhotoPath(merchantAccount.getPersonPhotoPath());
        this.saveData(rpUserInfo);

        // 生成账户信息
        RpAccount rpAccount = new RpAccount();
        rpAccount.setAccountNo(accountNo);
        rpAccount.setAccountType("0");
        rpAccount.setCreateTime(new Date());
        rpAccount.setEditTime(new Date());
        rpAccount.setId(StringUtil.get32UUID());
        rpAccount.setStatus(PublicStatusEnum.ACTIVE.name());
        rpAccount.setUserNo(merchantAccount.getUserNo());
        rpAccount.setBalance(new BigDecimal("0"));
        rpAccount.setSecurityMoney(new BigDecimal("0"));
        rpAccount.setSettAmount(new BigDecimal("0"));
        rpAccount.setTodayExpend(new BigDecimal("0"));
        rpAccount.setTodayIncome(new BigDecimal("0"));
        rpAccount.setUnbalance(new BigDecimal("0"));
        rpAccount.setTotalExpend(new BigDecimal("0"));
        rpAccount.setTotalIncome(new BigDecimal("0"));
        rpAccountService.saveData(rpAccount);
        
        //创建银行信息
        RpUserBankAccount rpUserBankAccount = new RpUserBankAccount();
        rpUserBankAccount.setUserNo(merchantAccount.getUserNo());
        rpUserBankAccount.setAreas(merchantAccount.getAreas());
        rpUserBankAccount.setBankAccountName(merchantAccount.getAccountname());
        rpUserBankAccount.setBankAccountType("PRIVATE_DEBIT_ACCOUNT");
//        rpUserBankAccount.setBankCode(merchantAccount.getBankaccountnumber());
        rpUserBankAccount.setBankName(merchantAccount.getBankheadofficename());
        rpUserBankAccount.setCardNo(merchantAccount.getBankaccountnumber());
//        rpUserBankAccount.setCardType(merchantAccount.get);
        rpUserBankAccount.setMobileNo(merchantAccount.getMobile());
        rpUserBankAccount.setCity(merchantAccount.getCity());
        rpUserBankAccount.setProvince(merchantAccount.getProvince());
        rpUserBankAccount.setStreet(merchantAccount.getBankname());
        rpUserBankAccount.setBankCode(merchantAccount.getBankheadofficename());
        rpUserBankAccount.setBankAccountNo(merchantAccount.getBankaccountnumber());
        rpUserBankAccount.setCardType(CardTypeEnum.IDENTITY.name());
        
        
        rpUserBankAccountService.createOrUpdate(rpUserBankAccount);
    }
    
    /**
     * 重载方法
     * @return
     */
    @Override
    public String getUserNo()
    {
        String userNo = buildNoService.buildUserNo();
        return userNo;
    }

    /**
     * 根据商户编号获取商户信息
     *
     * @param merchantNo
     * @return
     */
    @Override
    public RpUserInfo getDataByMerchentNo(String merchantNo) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userNo", merchantNo);
		paramMap.put("status", PublicStatusEnum.ACTIVE.name());
		return rpUserInfoDao.getBy(paramMap);
    }
    
    /**
	 * 根据手机号获取商户信息
	 * @param mobile
	 * @return
	 */
    @Override
    public RpUserInfo getDataByMobile(String mobile){
    	Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("mobile", mobile);
		paramMap.put("status", PublicStatusEnum.ACTIVE.name());
		return rpUserInfoDao.getBy(paramMap);
    }
    
    /**
	 * 获取所有用户
	 * @return
	 */
    @Override
    public List<RpUserInfo> listAll(){
    	Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("status", PublicStatusEnum.ACTIVE.name());
		return rpUserInfoDao.listBy(paramMap);
	}
}