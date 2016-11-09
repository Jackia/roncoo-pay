/*
 * 类文件名:  Fee.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.entity;

/**
 * 设置汇率
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Fee
{
    private String merchantid;  //商户id     N  Max(9)  merchantid
    private String productType; //产品类型     N  Max(5)  T0传T0Fee
    private String rate;       //费率值   N      设置的费率值    小数类型,比如费率为0.5%,传入0.005
    private String platform_code;      //平台码   N      鑫中利下发平台码
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
     * 获取 productType
     * @return 返回 productType
     */
    public String getProductType()
    {
        return productType;
    }
    /**
     * 设置 productType
     * @param 对productType进行赋值
     */
    public void setProductType(String productType)
    {
        this.productType = productType;
    }
    /**
     * 获取 rate
     * @return 返回 rate
     */
    public String getRate()
    {
        return rate;
    }
    /**
     * 设置 rate
     * @param 对rate进行赋值
     */
    public void setRate(String rate)
    {
        this.rate = rate;
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
