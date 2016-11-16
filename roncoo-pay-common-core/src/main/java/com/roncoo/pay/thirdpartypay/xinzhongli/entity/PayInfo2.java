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
 * <一句话功能简述>
 * <功能详细描述>
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class PayInfo2
{
    private String merchantid;  //商户id    Y   Max(9)  为空钱收到接入商账号、不为空钱收到子商户账号
    private String orderid; // 商户订单号   N   Max(50) 唯一验证
    
    private String order_id; // 商户订单号   N   Max(50) 唯一验证
    
    private String goods_name; //商品名称
    
    private String backurl; //支付成功通知地址    N   Max(255)    
    private String callbackurl; //清算成功通知地址    N   Max(255)    
    private String tradeamt;     //支付金额   N   Max(11) 单位：元
    
    private String trade_amount;     //支付金额   N   Max(11) 单位：元
    
    private String return_url; //回调链接
    
    /**
     * 120- 微信正扫
     * 121-支付宝正扫
     */
    private String pay_type;    //交易类型    N   Max(20) 123：T0微信扫码
    private String manualsettle;    //是否清分    N   Max(1)  1：清分，2:不清分
    private String orderInfo;   //商品名称    N   Max(50) 商户订单内容，商品信息
    
    /**
     * 130 - T0
     * 131 - T1
     */
    private String settlement_type; //交易方式    N   Max(1)  T0=130  
    private String platform_code;   //平台码 N       鑫中利下发平台码
    private String sign;    //签名信息    N       将列表中的以上参数值+key签名
    
    private String key;
    /**
     * 获取 merchantid
     * @return 返回 merchantid
     */
    public String getMerchantid()
    {
        return merchantid;
    }
    /**
     * 设置 merchantid
     * @param 对merchantid进行赋值
     */
    public void setMerchantid(String merchantid)
    {
        this.merchantid = merchantid;
    }
    /**
     * 获取 orderid
     * @return 返回 orderid
     */
    public String getOrderid()
    {
        return orderid;
    }
    /**
     * 设置 orderid
     * @param 对orderid进行赋值
     */
    public void setOrderid(String orderid)
    {
        this.orderid = orderid;
    }
    /**
     * 获取 backurl
     * @return 返回 backurl
     */
    public String getBackurl()
    {
        return backurl;
    }
    /**
     * 设置 backurl
     * @param 对backurl进行赋值
     */
    public void setBackurl(String backurl)
    {
        this.backurl = backurl;
    }
    /**
     * 获取 callbackurl
     * @return 返回 callbackurl
     */
    public String getCallbackurl()
    {
        return callbackurl;
    }
    /**
     * 设置 callbackurl
     * @param 对callbackurl进行赋值
     */
    public void setCallbackurl(String callbackurl)
    {
        this.callbackurl = callbackurl;
    }
    /**
     * 获取 tradeamt
     * @return 返回 tradeamt
     */
    public String getTradeamt()
    {
        return tradeamt;
    }
    /**
     * 设置 tradeamt
     * @param 对tradeamt进行赋值
     */
    public void setTradeamt(String tradeamt)
    {
        this.tradeamt = tradeamt;
    }
    /**
     * 获取 pay_type
     * @return 返回 pay_type
     */
    public String getPay_type()
    {
        return pay_type;
    }
    /**
     * 设置 pay_type
     * @param 对pay_type进行赋值
     */
    public void setPay_type(String pay_type)
    {
        this.pay_type = pay_type;
    }
    /**
     * 获取 manualsettle
     * @return 返回 manualsettle
     */
    public String getManualsettle()
    {
        return manualsettle;
    }
    /**
     * 设置 manualsettle
     * @param 对manualsettle进行赋值
     */
    public void setManualsettle(String manualsettle)
    {
        this.manualsettle = manualsettle;
    }
    /**
     * 获取 orderInfo
     * @return 返回 orderInfo
     */
    public String getOrderInfo()
    {
        return orderInfo;
    }
    /**
     * 设置 orderInfo
     * @param 对orderInfo进行赋值
     */
    public void setOrderInfo(String orderInfo)
    {
        this.orderInfo = orderInfo;
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
