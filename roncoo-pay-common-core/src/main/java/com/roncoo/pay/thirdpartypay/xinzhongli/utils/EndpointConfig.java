/*
 * 类文件名:  EndpointConfig.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.utils;

/**
 * 接口URL 地址
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface EndpointConfig
{
    public static String URL_PREFIX = "http://ewm.qiantangchina.cc/";
    
    
    public static String XZL_PAY = URL_PREFIX + "wwPayController/xzl_Pay.do";
    
    public static String XZL_PAY_T1 = URL_PREFIX + "wwPayController/xzl_Apppay_CheckOrderId.do";
    
    public static String XZL_PAY_QUERY = URL_PREFIX + "wwPayController/xzl_Apppay_CheckOrderId.do";  
   
    public static String XZL_FEE_QUERY = URL_PREFIX + "wwPayController/inquire_fee.do";
    
    public static String XZL_FEE_SET = URL_PREFIX + "wwPayController/merchant_fee.do";
    
    public static String XZL_SUBMERCHANT_INSERT = URL_PREFIX + "wwPayController/Register.do";
    
    public static String XZL_SUBMERCHANT_UPLOAD = URL_PREFIX + "wwPayController/merchant_Upload.do";
    
    public static String XZL_SUBMERCHANT_QUERY = URL_PREFIX + "wwPayController/Information.do";
}
