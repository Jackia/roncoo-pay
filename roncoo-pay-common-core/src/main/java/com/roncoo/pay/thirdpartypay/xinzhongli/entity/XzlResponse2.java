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
public class XzlResponse2 implements Serializable
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1201935090609773070L;
    
    /**
     * 返回码
     */
    private String code;
    
    /**
     * 商户编码
     */
    private String merchantid;
    
    /**
     * 信息描述
     */
    private String msg;
    
    /**
     * 商户信息是否完整
     */
    private String complete;
    
    /**
     * 交易流水
     */
    private String transaction_id;
    
    /**
     * 实际打款金额
     */
    private String actualamt;
    
    /**
     * 微信地址
     */
    private String code_url;
    
    /**
     * 订单号
     */
    private String out_trade_no;
    /**
     * 交易金额
     */
    private String tradeamt;
    

    /**
     * 获取 code
     * @return 返回 code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * 设置 code
     * @param 对code进行赋值
     */
    public void setCode(String code)
    {
        this.code = code;
    }

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
     * 获取 msg
     * @return 返回 msg
     */
    public String getMsg()
    {
        return msg;
    }

    /**
     * 设置 msg
     * @param 对msg进行赋值
     */
    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    /**
     * 获取 complete
     * @return 返回 complete
     */
    public String getComplete()
    {
        return complete;
    }

    /**
     * 设置 complete
     * @param 对complete进行赋值
     */
    public void setComplete(String complete)
    {
        this.complete = complete;
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
     * 获取 actualamt
     * @return 返回 actualamt
     */
    public String getActualamt()
    {
        return actualamt;
    }

    /**
     * 设置 actualamt
     * @param 对actualamt进行赋值
     */
    public void setActualamt(String actualamt)
    {
        this.actualamt = actualamt;
    }

    /**
     * 获取 code_url
     * @return 返回 code_url
     */
    public String getCode_url()
    {
        return code_url;
    }

    /**
     * 设置 code_url
     * @param 对code_url进行赋值
     */
    public void setCode_url(String code_url)
    {
        this.code_url = code_url;
    }

    /**
     * 获取 out_trade_no
     * @return 返回 out_trade_no
     */
    public String getOut_trade_no()
    {
        return out_trade_no;
    }

    /**
     * 设置 out_trade_no
     * @param 对out_trade_no进行赋值
     */
    public void setOut_trade_no(String out_trade_no)
    {
        this.out_trade_no = out_trade_no;
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
}
