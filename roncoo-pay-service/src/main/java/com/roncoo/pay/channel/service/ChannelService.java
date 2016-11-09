/*
 * 类文件名:  ChannelService.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.channel.service;

import java.util.List;

import com.roncoo.pay.channel.entity.ChannelInfo;
import com.roncoo.pay.common.core.page.PageBean;
import com.roncoo.pay.common.core.page.PageParam;

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
public interface ChannelService
{
    /**
     * 保存
     */
    void saveData(ChannelInfo channelInfo);

    /**
     * 更新
     */
    void updateData(ChannelInfo channelInfo);

    /**
     * 根据id获取数据
     * 
     * @param id
     * @return
     */
    ChannelInfo getDataById(String id);

    /**
     * 获取分页数据
     * 
     * @param pageParam
     * @return
     */
    PageBean listPage(PageParam pageParam, ChannelInfo channelInfo);
    
    /**
     * 根据支付产品获取支付方式
     * @param payProductCode
     */
    ChannelInfo listByChannelNo(String channelNo);
    
    /**
     * 获取所有支付方式
     */
    List<ChannelInfo> listAll();
}
