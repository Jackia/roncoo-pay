/*
 * 类文件名:  XzlPayAPI.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.api;

import java.util.Date;
import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;

import com.roncoo.pay.thirdpartypay.xinzhongli.entity.PayInfo;
import com.roncoo.pay.thirdpartypay.xinzhongli.entity.Submarchant;
import com.roncoo.pay.thirdpartypay.xinzhongli.entity.XzlResponse;
import com.roncoo.pay.thirdpartypay.xinzhongli.utils.EndpointConfig;
import com.roncoo.pay.thirdpartypay.xinzhongli.utils.HttpUtils;
import com.roncoo.pay.thirdpartypay.xinzhongli.utils.XZLStringUtils;

/**
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public final class XzlPayAPI
{
    
    
    public static XzlResponse registerMerchant(Submarchant submarchant) throws Exception
    {
        String sign = DigestUtils.md5Hex(XZLStringUtils.merchantRegister(submarchant)).toUpperCase();
        Map<String, Object> paramMap = XZLStringUtils.merchantRegister(submarchant, sign);
        String pos= HttpUtils.sendToServer(EndpointConfig.XZL_SUBMERCHANT_REGISTER,paramMap,"utf-8");
        System.out.println("test-------- "+ pos);
        
        return (XzlResponse)XZLStringUtils.getEntityFromString(XzlResponse.class, pos);
    }
     
    
    
    public static XzlResponse pay(PayInfo payInfo) throws Exception
    {
        String sign = DigestUtils.md5Hex(XZLStringUtils.payOrder(payInfo)).toUpperCase();
        Map<String, Object> paramMap = XZLStringUtils.payOrder(payInfo, sign);
        String pos= HttpUtils.sendToServer(EndpointConfig.XZL_PAY,paramMap,"utf-8");
        System.out.println("test-------- "+ pos);
        
        return (XzlResponse)XZLStringUtils.getEntityFromString(XzlResponse.class, pos);
    }
    
    public static void testpay() throws Exception
    {
        Submarchant submarchant = new Submarchant();
        submarchant.setAcct_name("曾云龙");
        submarchant.setAli_industry_id("");
        submarchant.setAli_rate("0.0031");
        submarchant.setBank_card_no("6226097556815075");
        submarchant.setBank_name("招商银行");
        submarchant.setBank_sub_name("招商银行南头支行");
        submarchant.setBank_unionpay_code("308584001057");
        submarchant.setCity("深圳市");
        submarchant.setId_number("430524198411046631");
        submarchant.setIs_cert("0");
        submarchant.setLegal_name("曾云龙");
        submarchant.setLicense_expire_dt("");
        submarchant.setLicense_no("");
        submarchant.setMerchant_address("广东省深圳市");
        submarchant.setMerchant_code("ML0000001");
        submarchant.setMerchant_name("曾云龙");
        submarchant.setMerchant_short_name("曾云龙");
        submarchant.setOut_fee("0.8");
        submarchant.setPhone_no("13510492707");
        submarchant.setPlatform_code("880002");
        submarchant.setProvince("广东省");
        submarchant.setSettlement_type("T0");
        submarchant.setWx_industry_id("");
        submarchant.setWx_rate("0.0031");
        submarchant.setKey("f4fcb30e002211584a199ce6ab200afc3c28920dcddeaa59c0558d4439d30b0758661db6247d0ae0d888e9991c4cbd9564473cf787f05f27ecbb7b3f77d9c797+z.1230e5732e6");
        
        registerMerchant(submarchant);
    }
    
   
    
    public static void main(String[] args) throws Exception
    {
        
        Date date=new Date();
        String tradeamt = "10";
        String merchantid="105799954663750238208";
        //流水号
        String orderid="LS" + date.getTime() + (int) (Math.random() * 10000000);
        String backurl="www";
        String callbackurl="www";
        String pay_type="123";
        String manualsettle="1";
        String orderInfo ="购买华为笔记本";
        String settlement_type="130";
        String platform_code="880002";
        String key="f4fcb30e002211584a199ce6ab200afc3c28920dcddeaa59c0558d4439d30b0758661db6247d0ae0d888e9991c4cbd9564473cf787f05f27ecbb7b3f77d9c797+z.1230e5732e6";
        
        PayInfo payInfo = new PayInfo();
//        payInfo.setTradeamt(tradeamt);
//        payInfo.setMerchantid(merchantid);
//        payInfo.setOrderid(orderid);
//        payInfo.setBackurl(callbackurl);
//        payInfo.setCallbackurl(callbackurl);
//        payInfo.setPay_type(pay_type);
//        payInfo.setManualsettle(manualsettle);
//        payInfo.setOrderInfo(orderInfo);
//        payInfo.setSettlement_type(settlement_type);
//        payInfo.setPlatform_code(platform_code);
        payInfo.setKey(key);
        
        
        
//        pay(payInfo);
        
//        testpay();
    }
}
