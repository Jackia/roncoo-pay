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
import com.roncoo.pay.thirdpartypay.xinzhongli.entity.Submarchant;

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
        
        sbs.append("bank_card_no=");
        sbs.append(payInfo.getBank_card_no() );
        
        sbs.append("&bank_unionpay_code=");
        sbs.append(payInfo.getBank_unionpay_code() );
        
        sbs.append("&goods_name=");
        sbs.append(payInfo.getGoods_name() );
        
        sbs.append("&id_number=");
        sbs.append(payInfo.getId_number() );
        
        sbs.append("&merchant_no=");
        sbs.append(payInfo.getMerchant_no());
        
        sbs.append("&name=");
        sbs.append(payInfo.getName());
        
        sbs.append("&order_id=");
        sbs.append(payInfo.getOrder_id());
        
        sbs.append("&pay_type=");
        sbs.append(payInfo.getPay_type());
        
        sbs.append("&phone_no=");
        sbs.append(payInfo.getPhone_no());
        
        sbs.append("&platform_code=");
        sbs.append(payInfo.getPlatform_code());
        sbs.append("&return_url=");
        sbs.append(payInfo.getReturn_url());
        
        sbs.append("&settlement_type=");
        sbs.append(payInfo.getSettlement_type());
        sbs.append("&trade_amount=");
        sbs.append(payInfo.getTrade_amount());
        sbs.append("&key=");
        
        sbs.append(payInfo.getKey());
        
        return sbs.toString();
    }
    
    public static Map<String, Object> payOrder(PayInfo payInfo, String sign)
    {
        Map<String, Object> paramMap = new LinkedHashMap<String, Object>();
        //民生返回信息
        
        paramMap.put("return_url",payInfo.getReturn_url() );
        paramMap.put("goods_name",payInfo.getGoods_name() );
        paramMap.put("order_id",payInfo.getOrder_id() );
        paramMap.put("pay_type",payInfo.getPay_type() );
        paramMap.put("platform_code",payInfo.getPlatform_code() );
        paramMap.put("trade_amount",payInfo.getTrade_amount() );
        paramMap.put("settlement_type",payInfo.getSettlement_type() );
        
        paramMap.put("id_number",payInfo.getId_number());
        paramMap.put("phone_no",payInfo.getPhone_no());
        paramMap.put("name",payInfo.getName());
        paramMap.put("bank_card_no",payInfo.getBank_card_no());
        paramMap.put("bank_unionpay_code",payInfo.getBank_unionpay_code());
        paramMap.put("merchant_no",payInfo.getMerchant_no());
        
        paramMap.put("sign",sign);
        
        return paramMap;
    }
    
    public static String merchantRegister(Submarchant submarchant)
    {
        StringBuffer sbs = new StringBuffer();
        
        sbs.append("acct_name=");
        sbs.append(submarchant.getAcct_name() );
        
        sbs.append("&ali_industry_id=");
        sbs.append(submarchant.getAli_industry_id());
        
        sbs.append("&ali_rate=");
        sbs.append(submarchant.getAli_rate());
        
//        sbs.append("&id_number=");
//        sbs.append(submarchant.getId_number() );
        
        sbs.append("&bank_card_no=");
        sbs.append(submarchant.getBank_card_no());
        
        sbs.append("&bank_name=");
        sbs.append(submarchant.getBank_name());
        
        sbs.append("&bank_sub_name=");
        sbs.append(submarchant.getBank_sub_name());
        
        sbs.append("&bank_unionpay_code=");
        sbs.append(submarchant.getBank_unionpay_code());
        sbs.append("&city=");
        sbs.append(submarchant.getCity());
        
        sbs.append("&id_number=");
        sbs.append(submarchant.getId_number());
        sbs.append("&is_cert=");
        sbs.append(submarchant.getIs_cert());
        
        sbs.append("&legal_name=");
        sbs.append(submarchant.getLegal_name());
        
        
        
        sbs.append("&license_expire_dt=");
        sbs.append(submarchant.getLicense_expire_dt());
        
        sbs.append("&license_no=");
        sbs.append(submarchant.getLicense_no());
        
        sbs.append("&merchant_address=");
        sbs.append(submarchant.getMerchant_address());
        sbs.append("&merchant_code=");
        sbs.append(submarchant.getMerchant_code());
        sbs.append("&merchant_name=");
        sbs.append(submarchant.getMerchant_name());
        sbs.append("&merchant_short_name=");
        sbs.append(submarchant.getMerchant_short_name());
        sbs.append("&out_fee=");
        sbs.append(submarchant.getOut_fee());
        sbs.append("&phone_no=");
        sbs.append(submarchant.getPhone_no());
        sbs.append("&platform_code=");
        sbs.append(submarchant.getPlatform_code());
        sbs.append("&province=");
        sbs.append(submarchant.getProvince());
        
        //名称不一致
//        sbs.append("&settle_type=");
        sbs.append("&settlement_type=");
        
        sbs.append(submarchant.getSettlement_type());
        sbs.append("&wx_industry_id=");
        sbs.append(submarchant.getWx_industry_id());
        sbs.append("&wx_rate=");
        sbs.append(submarchant.getWx_rate());
        
        
        sbs.append("&key=");
        
        sbs.append(submarchant.getKey());
        
        return sbs.toString();
    }
    
    public static Map<String, Object> merchantRegister(Submarchant submarchant, String sign)
    {
        Map<String, Object> paramMap = new LinkedHashMap<String, Object>();
        //民生返回信息
        
        paramMap.put("acct_name",submarchant.getAcct_name() );
        paramMap.put("ali_industry_id",submarchant.getAli_industry_id() );
        paramMap.put("ali_rate",submarchant.getAli_rate() );
//        paramMap.put("id_number",submarchant.getId_number() );
        paramMap.put("bank_card_no",submarchant.getBank_card_no() );
        paramMap.put("bank_name",submarchant.getBank_name() );
        paramMap.put("bank_sub_name",submarchant.getBank_sub_name() );
        
        paramMap.put("bank_unionpay_code",submarchant.getBank_unionpay_code());
        paramMap.put("city",submarchant.getCity());
        paramMap.put("id_number",submarchant.getId_number());
        paramMap.put("is_cert",submarchant.getIs_cert());
        paramMap.put("legal_name",submarchant.getLegal_name());
        paramMap.put("license_expire_dt",submarchant.getLicense_expire_dt());
        
        paramMap.put("license_no",submarchant.getLicense_no());
        paramMap.put("merchant_address",submarchant.getMerchant_address());
        paramMap.put("merchant_code",submarchant.getMerchant_code());
        paramMap.put("merchant_name",submarchant.getMerchant_name());
        paramMap.put("merchant_short_name",submarchant.getMerchant_short_name());
        paramMap.put("out_fee",submarchant.getOut_fee());
        paramMap.put("phone_no",submarchant.getPhone_no());
        paramMap.put("platform_code",submarchant.getPlatform_code());
        paramMap.put("province",submarchant.getProvince());
        paramMap.put("settlement_type",submarchant.getSettlement_type());
        paramMap.put("wx_industry_id",submarchant.getWx_industry_id());
        paramMap.put("wx_rate",submarchant.getWx_rate());
        
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
