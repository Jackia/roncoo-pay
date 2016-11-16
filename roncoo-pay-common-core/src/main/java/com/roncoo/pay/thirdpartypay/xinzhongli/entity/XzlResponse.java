/*
 * 类文件名:  XzlRespone.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.entity;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 第三方响应的结果
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class XzlResponse implements Serializable
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1201935090609773070L;
    
    /**
     * 返回码
     */
    private String response_code;
    
//    /**
//     * 商户编码
//     */
//    private String merchantid;
//    
//    /**
//     * 信息描述
//     */
//    private String msg;
//    
//    /**
//     * 商户信息是否完整
//     */
//    private String complete;
    
    /**
     * 交易流水
     */
    private String transaction_id;
    
//    /**
//     * 实际打款金额
//     */
//    private String actualamt;
    
    /**
     * 微信地址
     */
    private String qrcode_url;
    
    /**
     * 订单号
     */
    private String orderId;
    /**
     * 交易金额
     */
    private String tradeamt;
    
    private String message;

    /**
     * 获取 response_code
     * @return 返回 response_code
     */
    public String getResponse_code()
    {
        return response_code;
    }

    /**
     * 设置 response_code
     * @param 对response_code进行赋值
     */
    public void setResponse_code(String response_code)
    {
        this.response_code = response_code;
    }

    /**
     * 获取 transaction_id
     * @return 返回 transaction_id
     */
    public String getTransaction_id()
    {
        return transaction_id;
    }

    /**
     * 设置 transaction_id
     * @param 对transaction_id进行赋值
     */
    public void setTransaction_id(String transaction_id)
    {
        this.transaction_id = transaction_id;
    }

    /**
     * 获取 qrcode_url
     * @return 返回 qrcode_url
     */
    public String getQrcode_url()
    {
        return qrcode_url;
    }

    /**
     * 设置 qrcode_url
     * @param 对qrcode_url进行赋值
     */
    public void setQrcode_url(String qrcode_url)
    {
        this.qrcode_url = qrcode_url;
    }

    /**
     * 获取 orderId
     * @return 返回 orderId
     */
    public String getOrderId()
    {
        return orderId;
    }

    /**
     * 设置 orderId
     * @param 对orderId进行赋值
     */
    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
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
     * 获取 message
     * @return 返回 message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * 设置 message
     * @param 对message进行赋值
     */
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    
    
    
}
