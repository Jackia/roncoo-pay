/*
 * 类文件名:  ChannelInfo.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.channel.entity;

import com.roncoo.pay.common.core.entity.BaseEntity;

/**
 * 交易渠道管理
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class ChannelInfo extends BaseEntity
{
    /**
     * 渠道编号
     */
    private String channelNo;
    
    /**
     * 渠道名称
     */
    private String channelName;
    
    /**
     * 渠道联系电话
     */
    private String mobile;
    
    /**
     * 渠道联系人
     */
    private String  linkman;
    
    /**
     * 返回地址
     */
    private String backurl;
    
    /**
     * 商户审核 结果返回地址
     */
    private String callbackurl;
    
    /**
     * 平台码
     */
    private String platform_code;
    
    /**
     * 商户密钥
     */
    private String channel_key;

    /**
     * 获取 channelNo
     * @return 返回 channelNo
     */
    public String getChannelNo()
    {
        return channelNo;
    }

    /**
     * 设置 channelNo
     * @param 对channelNo进行赋值
     */
    public void setChannelNo(String channelNo)
    {
        this.channelNo = channelNo;
    }

    /**
     * 获取 channelName
     * @return 返回 channelName
     */
    public String getChannelName()
    {
        return channelName;
    }

    /**
     * 设置 channelName
     * @param 对channelName进行赋值
     */
    public void setChannelName(String channelName)
    {
        this.channelName = channelName;
    }

    /**
     * 获取 mobile
     * @return 返回 mobile
     */
    public String getMobile()
    {
        return mobile;
    }

    /**
     * 设置 mobile
     * @param 对mobile进行赋值
     */
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    /**
     * 获取 linkman
     * @return 返回 linkman
     */
    public String getLinkman()
    {
        return linkman;
    }

    /**
     * 设置 linkman
     * @param 对linkman进行赋值
     */
    public void setLinkman(String linkman)
    {
        this.linkman = linkman;
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
     * 获取 channel_key
     * @return 返回 channel_key
     */
    public String getChannel_key()
    {
        return channel_key;
    }

    /**
     * 设置 channel_key
     * @param 对channel_key进行赋值
     */
    public void setChannel_key(String channel_key)
    {
        this.channel_key = channel_key;
    }

}
