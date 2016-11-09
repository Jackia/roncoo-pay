/*
 * 类文件名:  SubMerchantQuery.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.entity;

/**
 * 子商户信息查询
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class SubMerchantQuery
{
    private String merchantid;  //商户id
    private String bindmobile;  //绑定手机号码
    private String time;    //时间戳
    private String platform_code;   //平台号
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
     * 获取 bindmobile
     * @return 返回 bindmobile
     */
    public String getBindmobile()
    {
        return bindmobile;
    }
    /**
     * 设置 bindmobile
     * @param 对bindmobile进行赋值
     */
    public void setBindmobile(String bindmobile)
    {
        this.bindmobile = bindmobile;
    }
    /**
     * 获取 time
     * @return 返回 time
     */
    public String getTime()
    {
        return time;
    }
    /**
     * 设置 time
     * @param 对time进行赋值
     */
    public void setTime(String time)
    {
        this.time = time;
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
    
}
