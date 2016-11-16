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
    
    
    public static String registerMerchant(Submarchant submarchant)
    {
        return null;
    }
     
    
    
    public static XzlResponse pay(PayInfo payInfo) throws Exception
    {
        String sign = DigestUtils.md5Hex(XZLStringUtils.payOrder(payInfo)).toUpperCase();
        Map<String, Object> paramMap = XZLStringUtils.payOrder(payInfo, sign);
        String pos= HttpUtils.sendToServer(EndpointConfig.XZL_PAY,paramMap,"utf-8");
        System.out.println("test-------- "+ pos);
        
        return (XzlResponse)XZLStringUtils.getEntityFromString(XzlResponse.class, pos);
    }
    
   
    
    public static void main(String[] args) throws Exception
    {
        
        Date date=new Date();
        String tradeamt = "10";
        String merchantid="000000061";
        //流水号
        String orderid="LS" + date.getTime() + (int) (Math.random() * 10000000);
        String backurl="www";
        String callbackurl="www";
        String pay_type="123";
        String manualsettle="1";
        String orderInfo ="购买华为笔记本";
        String settlement_type="130";
        String platform_code="880002";
        String key="c04f33a33a6a4faea047b8c247e9ef53f6964d6b789a47fb8f28+z.1230e5732e6";
        
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
        
        pay(payInfo);
    }
}
