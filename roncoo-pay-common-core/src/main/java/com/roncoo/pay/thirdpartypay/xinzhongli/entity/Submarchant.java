/*
 * 类文件名:  Submarchant.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.entity;

import java.io.Serializable;

/**
 * 子商户注册
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Submarchant implements Serializable
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4747074629167758465L;
    
    private String platform_code;        //字符串 是   机构号
    private String merchant_code;        //字符串 是   渠道自定义商户号编号
    private String merchant_name;        //字符串 是   商户全称（同营业执照）
    private String merchant_short_name;        //字符串 是   商户简称
    
    /**
     * is_cert 是否有证0:否 1：是 ，如果填0，license_no 字符串 是 营业执照号 
        license_expire_dt 字符串 否 执照有效期 
        wx_industry_id 字符串 否 微信商户类别 
        ali_industry_id 字符串 否 支付宝商户类别 
                    可以不填
     */
    private String is_cert;        // 字符串 是   是否有证
    private String license_no;        //  字符串 是   营业执照号
    private String license_expire_dt;        //   字符串 否   执照有效期
    private String wx_industry_id;        //  字符串 否   微信商户类别
    private String ali_industry_id;        // 字符串 否   支付宝商户类别
    private String legal_name;        //  字符串 是   法人姓名
    private String id_number;        //   字符串 是   身份证号
    private String phone_no;        //    字符串 是   手机号
    private String province;        //    字符串 是   省
    private String city;        //    字符串 是   市
    private String merchant_address;        //字符串 是   经营地址
    private String settlement_type;        //字符串 是   清算周期（T0、T1），低于10块钱默认T1
    private String wx_rate;        //字符串 是   微信费率 例如：0.004
    private String ali_rate;        //字符串 是   支付宝费率 例如：0.004 
    private String out_fee;        //字符串 否   出款手续费（笔）例如：0.8元
    private String acct_name;        //字符串 是   开户名
    private String bank_card_no;        //字符串 是   银行卡号
    private String bank_name;        //字符串 是   开户行
    private String bank_sub_name;        //字符串 是   开户行支行名称
    private String bank_unionpay_code;        //字符串 否   联行号
    private String sign;        //字符串 是   
    
    private String key;
    /**
     * 获取 platform_code
     * @return 返回 platform_code
     */
    public String getPlatform_code()
    {
        return platform_code;
    }
    /**
     * 设置 platform_code
     * @param 对platform_code进行赋值
     */
    public void setPlatform_code(String platform_code)
    {
        this.platform_code = platform_code;
    }
    /**
     * 获取 merchant_code
     * @return 返回 merchant_code
     */
    public String getMerchant_code()
    {
        return merchant_code;
    }
    /**
     * 设置 merchant_code
     * @param 对merchant_code进行赋值
     */
    public void setMerchant_code(String merchant_code)
    {
        this.merchant_code = merchant_code;
    }
    /**
     * 获取 merchant_name
     * @return 返回 merchant_name
     */
    public String getMerchant_name()
    {
        return merchant_name;
    }
    /**
     * 设置 merchant_name
     * @param 对merchant_name进行赋值
     */
    public void setMerchant_name(String merchant_name)
    {
        this.merchant_name = merchant_name;
    }
    /**
     * 获取 merchant_short_name
     * @return 返回 merchant_short_name
     */
    public String getMerchant_short_name()
    {
        return merchant_short_name;
    }
    /**
     * 设置 merchant_short_name
     * @param 对merchant_short_name进行赋值
     */
    public void setMerchant_short_name(String merchant_short_name)
    {
        this.merchant_short_name = merchant_short_name;
    }
    /**
     * 获取 is_cert
     * @return 返回 is_cert
     */
    public String getIs_cert()
    {
        return is_cert;
    }
    /**
     * 设置 is_cert
     * @param 对is_cert进行赋值
     */
    public void setIs_cert(String is_cert)
    {
        this.is_cert = is_cert;
    }
    /**
     * 获取 license_no
     * @return 返回 license_no
     */
    public String getLicense_no()
    {
        return license_no;
    }
    /**
     * 设置 license_no
     * @param 对license_no进行赋值
     */
    public void setLicense_no(String license_no)
    {
        this.license_no = license_no;
    }
    /**
     * 获取 license_expire_dt
     * @return 返回 license_expire_dt
     */
    public String getLicense_expire_dt()
    {
        return license_expire_dt;
    }
    /**
     * 设置 license_expire_dt
     * @param 对license_expire_dt进行赋值
     */
    public void setLicense_expire_dt(String license_expire_dt)
    {
        this.license_expire_dt = license_expire_dt;
    }
    /**
     * 获取 wx_industry_id
     * @return 返回 wx_industry_id
     */
    public String getWx_industry_id()
    {
        return wx_industry_id;
    }
    /**
     * 设置 wx_industry_id
     * @param 对wx_industry_id进行赋值
     */
    public void setWx_industry_id(String wx_industry_id)
    {
        this.wx_industry_id = wx_industry_id;
    }
    /**
     * 获取 ali_industry_id
     * @return 返回 ali_industry_id
     */
    public String getAli_industry_id()
    {
        return ali_industry_id;
    }
    /**
     * 设置 ali_industry_id
     * @param 对ali_industry_id进行赋值
     */
    public void setAli_industry_id(String ali_industry_id)
    {
        this.ali_industry_id = ali_industry_id;
    }
    /**
     * 获取 legal_name
     * @return 返回 legal_name
     */
    public String getLegal_name()
    {
        return legal_name;
    }
    /**
     * 设置 legal_name
     * @param 对legal_name进行赋值
     */
    public void setLegal_name(String legal_name)
    {
        this.legal_name = legal_name;
    }
    /**
     * 获取 id_number
     * @return 返回 id_number
     */
    public String getId_number()
    {
        return id_number;
    }
    /**
     * 设置 id_number
     * @param 对id_number进行赋值
     */
    public void setId_number(String id_number)
    {
        this.id_number = id_number;
    }
    /**
     * 获取 phone_no
     * @return 返回 phone_no
     */
    public String getPhone_no()
    {
        return phone_no;
    }
    /**
     * 设置 phone_no
     * @param 对phone_no进行赋值
     */
    public void setPhone_no(String phone_no)
    {
        this.phone_no = phone_no;
    }
    /**
     * 获取 province
     * @return 返回 province
     */
    public String getProvince()
    {
        return province;
    }
    /**
     * 设置 province
     * @param 对province进行赋值
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    /**
     * 获取 city
     * @return 返回 city
     */
    public String getCity()
    {
        return city;
    }
    /**
     * 设置 city
     * @param 对city进行赋值
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    /**
     * 获取 merchant_address
     * @return 返回 merchant_address
     */
    public String getMerchant_address()
    {
        return merchant_address;
    }
    /**
     * 设置 merchant_address
     * @param 对merchant_address进行赋值
     */
    public void setMerchant_address(String merchant_address)
    {
        this.merchant_address = merchant_address;
    }
    /**
     * 获取 settlement_type
     * @return 返回 settlement_type
     */
    public String getSettlement_type()
    {
        return settlement_type;
    }
    /**
     * 设置 settlement_type
     * @param 对settlement_type进行赋值
     */
    public void setSettlement_type(String settlement_type)
    {
        this.settlement_type = settlement_type;
    }
    /**
     * 获取 wx_rate
     * @return 返回 wx_rate
     */
    public String getWx_rate()
    {
        return wx_rate;
    }
    /**
     * 设置 wx_rate
     * @param 对wx_rate进行赋值
     */
    public void setWx_rate(String wx_rate)
    {
        this.wx_rate = wx_rate;
    }
    /**
     * 获取 ali_rate
     * @return 返回 ali_rate
     */
    public String getAli_rate()
    {
        return ali_rate;
    }
    /**
     * 设置 ali_rate
     * @param 对ali_rate进行赋值
     */
    public void setAli_rate(String ali_rate)
    {
        this.ali_rate = ali_rate;
    }
    /**
     * 获取 out_fee
     * @return 返回 out_fee
     */
    public String getOut_fee()
    {
        return out_fee;
    }
    /**
     * 设置 out_fee
     * @param 对out_fee进行赋值
     */
    public void setOut_fee(String out_fee)
    {
        this.out_fee = out_fee;
    }
    /**
     * 获取 acct_name
     * @return 返回 acct_name
     */
    public String getAcct_name()
    {
        return acct_name;
    }
    /**
     * 设置 acct_name
     * @param 对acct_name进行赋值
     */
    public void setAcct_name(String acct_name)
    {
        this.acct_name = acct_name;
    }
    /**
     * 获取 bank_card_no
     * @return 返回 bank_card_no
     */
    public String getBank_card_no()
    {
        return bank_card_no;
    }
    /**
     * 设置 bank_card_no
     * @param 对bank_card_no进行赋值
     */
    public void setBank_card_no(String bank_card_no)
    {
        this.bank_card_no = bank_card_no;
    }
    /**
     * 获取 bank_name
     * @return 返回 bank_name
     */
    public String getBank_name()
    {
        return bank_name;
    }
    /**
     * 设置 bank_name
     * @param 对bank_name进行赋值
     */
    public void setBank_name(String bank_name)
    {
        this.bank_name = bank_name;
    }
    /**
     * 获取 bank_sub_name
     * @return 返回 bank_sub_name
     */
    public String getBank_sub_name()
    {
        return bank_sub_name;
    }
    /**
     * 设置 bank_sub_name
     * @param 对bank_sub_name进行赋值
     */
    public void setBank_sub_name(String bank_sub_name)
    {
        this.bank_sub_name = bank_sub_name;
    }
    /**
     * 获取 bank_unionpay_code
     * @return 返回 bank_unionpay_code
     */
    public String getBank_unionpay_code()
    {
        return bank_unionpay_code;
    }
    /**
     * 设置 bank_unionpay_code
     * @param 对bank_unionpay_code进行赋值
     */
    public void setBank_unionpay_code(String bank_unionpay_code)
    {
        this.bank_unionpay_code = bank_unionpay_code;
    }
    /**
     * 获取 sign
     * @return 返回 sign
     */
    public String getSign()
    {
        return sign;
    }
    /**
     * 设置 sign
     * @param 对sign进行赋值
     */
    public void setSign(String sign)
    {
        this.sign = sign;
    }
    /**
     * 获取 key
     * @return 返回 key
     */
    public String getKey()
    {
        return key;
    }
    /**
     * 设置 key
     * @param 对key进行赋值
     */
    public void setKey(String key)
    {
        this.key = key;
    }
}
