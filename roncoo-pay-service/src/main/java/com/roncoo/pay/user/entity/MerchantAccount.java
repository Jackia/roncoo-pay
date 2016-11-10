/*
 * 类文件名:  MerchantAccount.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月10日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.user.entity;

import java.io.File;
import java.io.Serializable;

import com.roncoo.pay.account.entity.RpAccount;
import com.roncoo.pay.common.core.entity.BaseEntity;

/**
 * 商户注册
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月10日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class MerchantAccount  extends RpUserInfo
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5382373533108299309L;
    
    /**
     * 身份证号码
     */
    private String idcard; 
    
    /**
     * 银行卡 bankaccountnumber 对应的开户名
     */
    private String accountname;
    
    
    /**
     *  银行卡号    N   MAX(20) 银行卡号
     */
    private String bankaccountnumber = "";
    
    /**
     * 开户区/县   N   MAX(6)  银行卡开户区/县6位地区代码
     */
    private String bankarea = "";
    
    /**
     * 开户市 N   MAX(6)  银行卡开户市6位地区代码
     */
    private String bankcity = "";
    
    /**
     * 银行卡开户行，总行名称 N   MAX(20) 工商银行、农业银行、招商 银行、建设银行、
     * 交通银行、中信银行、光大银行、北京银行、深圳发展银行、中国 银行、兴业银行、
     * 民生银行、华夏银行等
     */
    private String bankheadofficename = "";
    
    /**
     *  银行卡开户所在支行   N   MAX(50) 银行卡开户的支行名称
     */
    private String bankname = "";
    
    /**
     * 开户省 N   MAX(6)  银行卡开户省6位地区代码
     */
    private String bankprovince = "";
    
    private File ID_CARD_FRONT; //身份证正面;
    private File ID_CARD_BACK; //身份证背面;
    private File BANK_CARD_FRONT; //银行卡正面;
    private File BANK_CARD_BACK; //银行卡背面;
    private File PERSON_PHOTO; //手持身份证照片;
    private File BUSSINESS_LICENSE; //营业执照;
    private File BUSSINESS_CERTIFICATES; //工商证;
    private File ORGANIZATION_CODE; //组织机构代码证;
    private File TAX_REGISTRATION;  //税务登记证;
    private File BANK_ACCOUNT_LICENCE; //银行开户许可证;
    private File LEGAL_PERSON_FRONT; //法人身份证正面;
    private File LEGAL_PERSON_BACK法人; //身份证背面;
    
    private String email;
    /**
     * 获取 accountname
     * @return 返回 accountname
     */
    public String getAccountname()
    {
        return accountname;
    }
    /**
     * 设置 accountname
     * @param 对accountname进行赋值
     */
    public void setAccountname(String accountname)
    {
        this.accountname = accountname;
    }
    /**
     * 获取 bankaccountnumber
     * @return 返回 bankaccountnumber
     */
    public String getBankaccountnumber()
    {
        return bankaccountnumber;
    }
    /**
     * 设置 bankaccountnumber
     * @param 对bankaccountnumber进行赋值
     */
    public void setBankaccountnumber(String bankaccountnumber)
    {
        this.bankaccountnumber = bankaccountnumber;
    }
    /**
     * 获取 bankarea
     * @return 返回 bankarea
     */
    public String getBankarea()
    {
        return bankarea;
    }
    /**
     * 设置 bankarea
     * @param 对bankarea进行赋值
     */
    public void setBankarea(String bankarea)
    {
        this.bankarea = bankarea;
    }
    /**
     * 获取 bankcity
     * @return 返回 bankcity
     */
    public String getBankcity()
    {
        return bankcity;
    }
    /**
     * 设置 bankcity
     * @param 对bankcity进行赋值
     */
    public void setBankcity(String bankcity)
    {
        this.bankcity = bankcity;
    }
    /**
     * 获取 bankheadofficename
     * @return 返回 bankheadofficename
     */
    public String getBankheadofficename()
    {
        return bankheadofficename;
    }
    /**
     * 设置 bankheadofficename
     * @param 对bankheadofficename进行赋值
     */
    public void setBankheadofficename(String bankheadofficename)
    {
        this.bankheadofficename = bankheadofficename;
    }
    /**
     * 获取 bankname
     * @return 返回 bankname
     */
    public String getBankname()
    {
        return bankname;
    }
    /**
     * 设置 bankname
     * @param 对bankname进行赋值
     */
    public void setBankname(String bankname)
    {
        this.bankname = bankname;
    }
    /**
     * 获取 bankprovince
     * @return 返回 bankprovince
     */
    public String getBankprovince()
    {
        return bankprovince;
    }
    /**
     * 设置 bankprovince
     * @param 对bankprovince进行赋值
     */
    public void setBankprovince(String bankprovince)
    {
        this.bankprovince = bankprovince;
    }
    /**
     * 获取 iD_CARD_FRONT
     * @return 返回 iD_CARD_FRONT
     */
    public File getID_CARD_FRONT()
    {
        return ID_CARD_FRONT;
    }
    /**
     * 设置 iD_CARD_FRONT
     * @param 对iD_CARD_FRONT进行赋值
     */
    public void setID_CARD_FRONT(File iD_CARD_FRONT)
    {
        ID_CARD_FRONT = iD_CARD_FRONT;
    }
    /**
     * 获取 iD_CARD_BACK
     * @return 返回 iD_CARD_BACK
     */
    public File getID_CARD_BACK()
    {
        return ID_CARD_BACK;
    }
    /**
     * 设置 iD_CARD_BACK
     * @param 对iD_CARD_BACK进行赋值
     */
    public void setID_CARD_BACK(File iD_CARD_BACK)
    {
        ID_CARD_BACK = iD_CARD_BACK;
    }
    /**
     * 获取 bANK_CARD_FRONT
     * @return 返回 bANK_CARD_FRONT
     */
    public File getBANK_CARD_FRONT()
    {
        return BANK_CARD_FRONT;
    }
    /**
     * 设置 bANK_CARD_FRONT
     * @param 对bANK_CARD_FRONT进行赋值
     */
    public void setBANK_CARD_FRONT(File bANK_CARD_FRONT)
    {
        BANK_CARD_FRONT = bANK_CARD_FRONT;
    }
    /**
     * 获取 bANK_CARD_BACK
     * @return 返回 bANK_CARD_BACK
     */
    public File getBANK_CARD_BACK()
    {
        return BANK_CARD_BACK;
    }
    /**
     * 设置 bANK_CARD_BACK
     * @param 对bANK_CARD_BACK进行赋值
     */
    public void setBANK_CARD_BACK(File bANK_CARD_BACK)
    {
        BANK_CARD_BACK = bANK_CARD_BACK;
    }
    /**
     * 获取 pERSON_PHOTO
     * @return 返回 pERSON_PHOTO
     */
    public File getPERSON_PHOTO()
    {
        return PERSON_PHOTO;
    }
    /**
     * 设置 pERSON_PHOTO
     * @param 对pERSON_PHOTO进行赋值
     */
    public void setPERSON_PHOTO(File pERSON_PHOTO)
    {
        PERSON_PHOTO = pERSON_PHOTO;
    }
    /**
     * 获取 bUSSINESS_LICENSE
     * @return 返回 bUSSINESS_LICENSE
     */
    public File getBUSSINESS_LICENSE()
    {
        return BUSSINESS_LICENSE;
    }
    /**
     * 设置 bUSSINESS_LICENSE
     * @param 对bUSSINESS_LICENSE进行赋值
     */
    public void setBUSSINESS_LICENSE(File bUSSINESS_LICENSE)
    {
        BUSSINESS_LICENSE = bUSSINESS_LICENSE;
    }
    /**
     * 获取 bUSSINESS_CERTIFICATES
     * @return 返回 bUSSINESS_CERTIFICATES
     */
    public File getBUSSINESS_CERTIFICATES()
    {
        return BUSSINESS_CERTIFICATES;
    }
    /**
     * 设置 bUSSINESS_CERTIFICATES
     * @param 对bUSSINESS_CERTIFICATES进行赋值
     */
    public void setBUSSINESS_CERTIFICATES(File bUSSINESS_CERTIFICATES)
    {
        BUSSINESS_CERTIFICATES = bUSSINESS_CERTIFICATES;
    }
    /**
     * 获取 oRGANIZATION_CODE
     * @return 返回 oRGANIZATION_CODE
     */
    public File getORGANIZATION_CODE()
    {
        return ORGANIZATION_CODE;
    }
    /**
     * 设置 oRGANIZATION_CODE
     * @param 对oRGANIZATION_CODE进行赋值
     */
    public void setORGANIZATION_CODE(File oRGANIZATION_CODE)
    {
        ORGANIZATION_CODE = oRGANIZATION_CODE;
    }
    /**
     * 获取 tAX_REGISTRATION
     * @return 返回 tAX_REGISTRATION
     */
    public File getTAX_REGISTRATION()
    {
        return TAX_REGISTRATION;
    }
    /**
     * 设置 tAX_REGISTRATION
     * @param 对tAX_REGISTRATION进行赋值
     */
    public void setTAX_REGISTRATION(File tAX_REGISTRATION)
    {
        TAX_REGISTRATION = tAX_REGISTRATION;
    }
    /**
     * 获取 bANK_ACCOUNT_LICENCE
     * @return 返回 bANK_ACCOUNT_LICENCE
     */
    public File getBANK_ACCOUNT_LICENCE()
    {
        return BANK_ACCOUNT_LICENCE;
    }
    /**
     * 设置 bANK_ACCOUNT_LICENCE
     * @param 对bANK_ACCOUNT_LICENCE进行赋值
     */
    public void setBANK_ACCOUNT_LICENCE(File bANK_ACCOUNT_LICENCE)
    {
        BANK_ACCOUNT_LICENCE = bANK_ACCOUNT_LICENCE;
    }
    /**
     * 获取 lEGAL_PERSON_FRONT
     * @return 返回 lEGAL_PERSON_FRONT
     */
    public File getLEGAL_PERSON_FRONT()
    {
        return LEGAL_PERSON_FRONT;
    }
    /**
     * 设置 lEGAL_PERSON_FRONT
     * @param 对lEGAL_PERSON_FRONT进行赋值
     */
    public void setLEGAL_PERSON_FRONT(File lEGAL_PERSON_FRONT)
    {
        LEGAL_PERSON_FRONT = lEGAL_PERSON_FRONT;
    }
    /**
     * 获取 lEGAL_PERSON_BACK法人
     * @return 返回 lEGAL_PERSON_BACK法人
     */
    public File getLEGAL_PERSON_BACK法人()
    {
        return LEGAL_PERSON_BACK法人;
    }
    /**
     * 设置 lEGAL_PERSON_BACK法人
     * @param 对lEGAL_PERSON_BACK法人进行赋值
     */
    public void setLEGAL_PERSON_BACK法人(File lEGAL_PERSON_BACK法人)
    {
        LEGAL_PERSON_BACK法人 = lEGAL_PERSON_BACK法人;
    }
    /**
     * 获取 email
     * @return 返回 email
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * 设置 email
     * @param 对email进行赋值
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /**
     * 获取 idcard
     * @return 返回 idcard
     */
    public String getIdcard()
    {
        return idcard;
    }
    /**
     * 设置 idcard
     * @param 对idcard进行赋值
     */
    public void setIdcard(String idcard)
    {
        this.idcard = idcard;
    }
    
    
}
