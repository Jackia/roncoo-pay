/*
 * 类文件名:  PayInfo.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.entity;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author 曾云龙
 * @version V001Z0001
 * @date 2016年11月9日
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class PayInfo
{
    
    private String order_id; // 商户订单号 N Max(50) 唯一验证
    
    private String goods_name; // 商品名称
    
    private String trade_amount; // 支付金额 N Max(11) 单位：元
    
    private String return_url; // 回调链接
    
    private String merchant_no; //字符串 是   平台商户号
    
    /**
     * 120- 微信正扫 121-支付宝正扫
     */
    private String pay_type; // 交易类型 N Max(20) 123：T0微信扫码
    
//    private String manualsettle; // 是否清分 N Max(1) 1：清分，2:不清分
    
//    private String orderInfo; // 商品名称 N Max(50) 商户订单内容，商品信息
    
    /**
     * 交易方式 130 - T0 131 - T1
     */
    private String settlement_type;
    
    private String platform_code; // 平台码 N 鑫中利下发平台码
    
    private String sign; // 签名信息 N 将列表中的以上参数值+key签名
    
    private String key;
    
    private String id_number; // 身份证
    
    private String phone_no; // 字符串 否 手机号
    
    private String name; // 字符串 否 姓名
    
    private String bank_card_no; // 字符串 否 银行卡号
    
    private String bank_unionpay_code; // 字符串 否 联行号
    
    /**
     * 获取 order_id
     * 
     * @return 返回 order_id
     */
    public String getOrder_id()
    {
        return order_id;
    }
    
    /**
     * 设置 order_id
     * 
     * @param 对order_id进行赋值
     */
    public void setOrder_id(String order_id)
    {
        this.order_id = order_id;
    }
    
    /**
     * 获取 goods_name
     * 
     * @return 返回 goods_name
     */
    public String getGoods_name()
    {
        return goods_name;
    }
    
    /**
     * 设置 goods_name
     * 
     * @param 对goods_name进行赋值
     */
    public void setGoods_name(String goods_name)
    {
        this.goods_name = goods_name;
    }
    
    /**
     * 获取 trade_amount
     * 
     * @return 返回 trade_amount
     */
    public String getTrade_amount()
    {
        return trade_amount;
    }
    
    /**
     * 设置 trade_amount
     * 
     * @param 对trade_amount进行赋值
     */
    public void setTrade_amount(String trade_amount)
    {
        this.trade_amount = trade_amount;
    }
    
    /**
     * 获取 return_url
     * 
     * @return 返回 return_url
     */
    public String getReturn_url()
    {
        return return_url;
    }
    
    /**
     * 设置 return_url
     * 
     * @param 对return_url进行赋值
     */
    public void setReturn_url(String return_url)
    {
        this.return_url = return_url;
    }
    
    /**
     * 获取 pay_type
     * 
     * @return 返回 pay_type
     */
    public String getPay_type()
    {
        return pay_type;
    }
    
    /**
     * 设置 pay_type
     * 
     * @param 对pay_type进行赋值
     */
    public void setPay_type(String pay_type)
    {
        this.pay_type = pay_type;
    }
    
    
    /**
     * 获取 settlement_type
     * 
     * @return 返回 settlement_type
     */
    public String getSettlement_type()
    {
        return settlement_type;
    }
    
    /**
     * 设置 settlement_type
     * 
     * @param 对settlement_type进行赋值
     */
    public void setSettlement_type(String settlement_type)
    {
        this.settlement_type = settlement_type;
    }
    
    /**
     * 获取 platform_code
     * 
     * @return 返回 platform_code
     */
    public String getPlatform_code()
    {
        return platform_code;
    }
    
    /**
     * 设置 platform_code
     * 
     * @param 对platform_code进行赋值
     */
    public void setPlatform_code(String platform_code)
    {
        this.platform_code = platform_code;
    }
    
    /**
     * 获取 sign
     * 
     * @return 返回 sign
     */
    public String getSign()
    {
        return sign;
    }
    
    /**
     * 设置 sign
     * 
     * @param 对sign进行赋值
     */
    public void setSign(String sign)
    {
        this.sign = sign;
    }
    
    /**
     * 获取 key
     * 
     * @return 返回 key
     */
    public String getKey()
    {
        return key;
    }
    
    /**
     * 设置 key
     * 
     * @param 对key进行赋值
     */
    public void setKey(String key)
    {
        this.key = key;
    }
    
    /**
     * 获取 id_number
     * 
     * @return 返回 id_number
     */
    public String getId_number()
    {
        return id_number;
    }
    
    /**
     * 设置 id_number
     * 
     * @param 对id_number进行赋值
     */
    public void setId_number(String id_number)
    {
        this.id_number = id_number;
    }
    
    /**
     * 获取 phone_no
     * 
     * @return 返回 phone_no
     */
    public String getPhone_no()
    {
        return phone_no;
    }
    
    /**
     * 设置 phone_no
     * 
     * @param 对phone_no进行赋值
     */
    public void setPhone_no(String phone_no)
    {
        this.phone_no = phone_no;
    }
    
    /**
     * 获取 name
     * 
     * @return 返回 name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * 设置 name
     * 
     * @param 对name进行赋值
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * 获取 bank_card_no
     * 
     * @return 返回 bank_card_no
     */
    public String getBank_card_no()
    {
        return bank_card_no;
    }
    
    /**
     * 设置 bank_card_no
     * 
     * @param 对bank_card_no进行赋值
     */
    public void setBank_card_no(String bank_card_no)
    {
        this.bank_card_no = bank_card_no;
    }
    
    /**
     * 获取 bank_unionpay_code
     * 
     * @return 返回 bank_unionpay_code
     */
    public String getBank_unionpay_code()
    {
        return bank_unionpay_code;
    }
    
    /**
     * 设置 bank_unionpay_code
     * 
     * @param 对bank_unionpay_code进行赋值
     */
    public void setBank_unionpay_code(String bank_unionpay_code)
    {
        this.bank_unionpay_code = bank_unionpay_code;
    }

    /**
     * 获取 merchant_no
     * @return 返回 merchant_no
     */
    public String getMerchant_no()
    {
        return merchant_no;
    }

    /**
     * 设置 merchant_no
     * @param 对merchant_no进行赋值
     */
    public void setMerchant_no(String merchant_no)
    {
        this.merchant_no = merchant_no;
    }
}
