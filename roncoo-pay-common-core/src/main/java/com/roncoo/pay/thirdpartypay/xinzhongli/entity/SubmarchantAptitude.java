/*
 * 类文件名:  SubmarchantAptitude.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.entity;

import java.io.File;
import java.io.Serializable;

/**
 * 子商户资质
 * 注意：个人类型账户必上传资质：身份证正、反面，手持身份证照片，银行卡正面；
 * 注释：上传图片类型支持 jpg、jpeg、png，文件大小限制 512KB;
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class SubmarchantAptitude implements Serializable
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4859447660840151869L;
    
    private String requestid;
    private String merchantid;
    private String filetype;
    private File imgstr;
    private String platform_code;
    /**
     * 获取 requestid
     * @return 返回 requestid
     */
    public String getRequestid()
    {
        return requestid;
    }
    /**
     * 设置 requestid
     * @param 对requestid进行赋值
     */
    public void setRequestid(String requestid)
    {
        this.requestid = requestid;
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
     * 获取 filetype
     * @return 返回 filetype
     */
    public String getFiletype()
    {
        return filetype;
    }
    /**
     * 设置 filetype
     * @param 对filetype进行赋值
     */
    public void setFiletype(String filetype)
    {
        this.filetype = filetype;
    }
    /**
     * 获取 imgstr
     * @return 返回 imgstr
     */
    public File getImgstr()
    {
        return imgstr;
    }
    /**
     * 设置 imgstr
     * @param 对imgstr进行赋值
     */
    public void setImgstr(File imgstr)
    {
        this.imgstr = imgstr;
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
