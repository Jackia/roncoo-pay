/*
 * 类文件名:  XZLStringUtils.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.utils;

import java.util.LinkedHashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.roncoo.pay.thirdpartypay.xinzhongli.entity.PayInfo;

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
public class XZLStringUtils
{
    public static String payOrder(PayInfo payInfo)
    {
        StringBuffer sbs = new StringBuffer();
        sbs.append("backurl=");
        sbs.append(payInfo.getBackurl());
        sbs.append("&callbackurl=");
        sbs.append(payInfo.getCallbackurl());
        sbs.append("&manualsettle=");
        sbs.append(payInfo.getManualsettle());
        sbs.append("&merchantid=");
        sbs.append(payInfo.getMerchantid());
        sbs.append("&orderid=");
        sbs.append(payInfo.getOrderid());
        sbs.append("&orderInfo=");
        sbs.append(payInfo.getOrderInfo() );
        sbs.append("&pay_type=");
        sbs.append(payInfo.getPay_type());
        sbs.append("&platform_code=");
        sbs.append(payInfo.getPlatform_code());
        sbs.append("&settlement_type=");
        sbs.append(payInfo.getSettlement_type());
        sbs.append("&tradeamt=");
        sbs.append(payInfo.getTradeamt());
        sbs.append("&key=");
        sbs.append(payInfo.getKey());
        
        return sbs.toString();
    }
    
    public static Map<String, Object> payOrder(PayInfo payInfo, String sign)
    {
        Map<String, Object> paramMap = new LinkedHashMap<String, Object>();
        //民生返回信息
        paramMap.put("manualsettle",payInfo.getManualsettle() );
        paramMap.put("backurl",payInfo.getBackurl() );
        paramMap.put("callbackurl",payInfo.getCallbackurl() );
        paramMap.put("merchantid",payInfo.getMerchantid() );
        paramMap.put("orderInfo",payInfo.getOrderInfo() );
        paramMap.put("orderid",payInfo.getOrderid() );
        paramMap.put("pay_type",payInfo.getPay_type() );
        paramMap.put("platform_code",payInfo.getPlatform_code() );
        paramMap.put("tradeamt",payInfo.getTradeamt() );
        paramMap.put("settlement_type",payInfo.getSettlement_type() );
        paramMap.put("sign",sign);
        
        return paramMap;
    }
    
    public static Object getEntityFromString(Class returnType, String param)
    {
       try
    {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(param, returnType);
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
       return null;
    }
}
