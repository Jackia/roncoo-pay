/*
 * 类文件名:  ChannelServiceImpl.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.channel.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roncoo.pay.channel.dao.ChannelInfoDAO;
import com.roncoo.pay.channel.entity.ChannelInfo;
import com.roncoo.pay.channel.service.ChannelService;
import com.roncoo.pay.common.core.enums.PublicStatusEnum;
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
@Service("channelService")
public class ChannelServiceImpl implements ChannelService
{
    @Autowired
    private ChannelInfoDAO channelInfoDAO;
    
    /**
     * 重载方法
     * @param ChannelInfo
     */
    @Override
    public void saveData(ChannelInfo channelInfo)
    {
        channelInfoDAO.insert(channelInfo);
    }

    /**
     * 重载方法
     * @param ChannelInfo
     */
    @Override
    public void updateData(ChannelInfo channelInfo)
    {
       channelInfoDAO.update(channelInfo);
    }

    /**
     * 重载方法
     * @param id
     * @return
     */
    @Override
    public ChannelInfo getDataById(String id)
    {
        return channelInfoDAO.getById(id);
    }

    /**
     * 重载方法
     * @param pageParam
     * @param ChannelInfo
     * @return
     */
    @Override
    public PageBean listPage(PageParam pageParam, ChannelInfo channelInfo)
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("channelNo", channelInfo.getChannelNo());
        return channelInfoDAO.listPage(pageParam, paramMap);
    }

    /**
     * 重载方法
     * @param channelNo
     * @return
     */
    @Override
    public ChannelInfo listByChannelNo(String channelNo)
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("channelNo", channelNo);
        return channelInfoDAO.getBy(paramMap);
    }

    /**
     * 重载方法
     * @return
     */
    @Override
    public List<ChannelInfo> listAll()
    {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        return channelInfoDAO.listBy(paramMap);
    }
    
}
