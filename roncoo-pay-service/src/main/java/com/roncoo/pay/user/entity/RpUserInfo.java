/*
 * Copyright 2015-2102 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.roncoo.pay.user.entity;

import java.io.Serializable;

import com.roncoo.pay.common.core.entity.BaseEntity;
import com.roncoo.pay.common.core.enums.PublicStatusEnum;

/**
 * 用户信息 龙果学院：www.roncoo.com
 * 
 * @author：zenghao
 */
public class RpUserInfo extends BaseEntity implements Serializable
{
    
    private String userNo;
    
    private String userName;
    
    private String accountNo;
    
    private static final long serialVersionUID = 1L;
    
    private String mobile;
    
    private String password;
    
    private String idCardFrontPath;
    
    private String idCardBackPath;
    
    private String bankCardFrontPath;
    
    private String personPhotoPath;
    
    /**
     * 鑫中利 商户号
     */
    private String jimi_merchantid;
    
    public String getMobile()
    {
        return mobile;
    }
    
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getUserNo()
    {
        return userNo;
    }
    
    public void setUserNo(String userNo)
    {
        this.userNo = userNo == null ? null : userNo.trim();
    }
    
    public String getUserName()
    {
        return userName;
    }
    
    public void setUserName(String userName)
    {
        this.userName = userName == null ? null : userName.trim();
    }
    
    public String getAccountNo()
    {
        return accountNo;
    }
    
    public void setAccountNo(String accountNo)
    {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }
    
    public String getStatusDesc()
    {
        return PublicStatusEnum.getEnum(this.getStatus()).getDesc();
    }
    
    /**
     * 获取 idCardFrontPath
     * 
     * @return 返回 idCardFrontPath
     */
    public String getIdCardFrontPath()
    {
        return idCardFrontPath;
    }
    
    /**
     * 设置 idCardFrontPath
     * 
     * @param 对idCardFrontPath进行赋值
     */
    public void setIdCardFrontPath(String idCardFrontPath)
    {
        this.idCardFrontPath = idCardFrontPath;
    }
    
    /**
     * 获取 idCardBackPath
     * 
     * @return 返回 idCardBackPath
     */
    public String getIdCardBackPath()
    {
        return idCardBackPath;
    }
    
    /**
     * 设置 idCardBackPath
     * 
     * @param 对idCardBackPath进行赋值
     */
    public void setIdCardBackPath(String idCardBackPath)
    {
        this.idCardBackPath = idCardBackPath;
    }
    
    /**
     * 获取 bankCardFrontPath
     * 
     * @return 返回 bankCardFrontPath
     */
    public String getBankCardFrontPath()
    {
        return bankCardFrontPath;
    }
    
    /**
     * 设置 bankCardFrontPath
     * 
     * @param 对bankCardFrontPath进行赋值
     */
    public void setBankCardFrontPath(String bankCardFrontPath)
    {
        this.bankCardFrontPath = bankCardFrontPath;
    }
    
    /**
     * 获取 personPhotoPath
     * 
     * @return 返回 personPhotoPath
     */
    public String getPersonPhotoPath()
    {
        return personPhotoPath;
    }
    
    /**
     * 设置 personPhotoPath
     * 
     * @param 对personPhotoPath进行赋值
     */
    public void setPersonPhotoPath(String personPhotoPath)
    {
        this.personPhotoPath = personPhotoPath;
    }

    /**
     * 获取 jimi_merchantid
     * @return 返回 jimi_merchantid
     */
    public String getJimi_merchantid()
    {
        return jimi_merchantid;
    }

    /**
     * 设置 jimi_merchantid
     * @param 对jimi_merchantid进行赋值
     */
    public void setJimi_merchantid(String jimi_merchantid)
    {
        this.jimi_merchantid = jimi_merchantid;
    }
}