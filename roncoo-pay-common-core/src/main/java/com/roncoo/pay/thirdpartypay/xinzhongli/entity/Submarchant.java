/*
 * 类文件名:  Submarchant.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.entity;

import java.io.Serializable;

/**
 * 子商户注册
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class Submarchant implements Serializable
{

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -4747074629167758465L;
    
    /**
     * 商户注册请求号
     */
    private String requestid = "";
    
    /**
     * 银行卡 bankaccountnumber 对应的开户名
     */
    private String accountname = "";
    
    /**
     * PrivateCash：对私
     */
    private String bankaccounttype = "";
    private String bankaccountnumber = "";
    private String bankarea = "";
    private String bankcity = "";
    private String bankheadofficename = "";
    private String bankname = "";
    private String bankprovince = "";
    private String bindmobile = "";
    private String callbackurl = "";
    
    /**
     * PERSON ：个人
     */
    private String customertype = "";
    private String deposit = "";
    private String idcard = "";
    private String linkman = "";
    
    /**
     * 商户起始结算金额，大于0的整数，单位：分。
     */
    private String minsettleamount = "";
    private String platform_code = "";
    private String signedname = "";
    
    
    /**
     * 营业执照号
     */
    private String businesslicence;
    
    /**
     * 法人名称
     */
    private String legalperson;
    
    /**
     * 法人身份证号
     */
    private String legalpersonidcard;
    
    /**
     * 签名密钥
     */
    private String key="";

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
     * 获取 bankaccounttype
     * @return 返回 bankaccounttype
     */
    public String getBankaccounttype()
    {
        return bankaccounttype;
    }

    /**
     * 设置 bankaccounttype
     * @param 对bankaccounttype进行赋值
     */
    public void setBankaccounttype(String bankaccounttype)
    {
        this.bankaccounttype = bankaccounttype;
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
     * 获取 customertype
     * @return 返回 customertype
     */
    public String getCustomertype()
    {
        return customertype;
    }

    /**
     * 设置 customertype
     * @param 对customertype进行赋值
     */
    public void setCustomertype(String customertype)
    {
        this.customertype = customertype;
    }

    /**
     * 获取 deposit
     * @return 返回 deposit
     */
    public String getDeposit()
    {
        return deposit;
    }

    /**
     * 设置 deposit
     * @param 对deposit进行赋值
     */
    public void setDeposit(String deposit)
    {
        this.deposit = deposit;
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
     * 获取 minsettleamount
     * @return 返回 minsettleamount
     */
    public String getMinsettleamount()
    {
        return minsettleamount;
    }

    /**
     * 设置 minsettleamount
     * @param 对minsettleamount进行赋值
     */
    public void setMinsettleamount(String minsettleamount)
    {
        this.minsettleamount = minsettleamount;
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
     * 获取 signedname
     * @return 返回 signedname
     */
    public String getSignedname()
    {
        return signedname;
    }

    /**
     * 设置 signedname
     * @param 对signedname进行赋值
     */
    public void setSignedname(String signedname)
    {
        this.signedname = signedname;
    }

    /**
     * 获取 businesslicence
     * @return 返回 businesslicence
     */
    public String getBusinesslicence()
    {
        return businesslicence;
    }

    /**
     * 设置 businesslicence
     * @param 对businesslicence进行赋值
     */
    public void setBusinesslicence(String businesslicence)
    {
        this.businesslicence = businesslicence;
    }

    /**
     * 获取 legalperson
     * @return 返回 legalperson
     */
    public String getLegalperson()
    {
        return legalperson;
    }

    /**
     * 设置 legalperson
     * @param 对legalperson进行赋值
     */
    public void setLegalperson(String legalperson)
    {
        this.legalperson = legalperson;
    }

    /**
     * 获取 legalpersonidcard
     * @return 返回 legalpersonidcard
     */
    public String getLegalpersonidcard()
    {
        return legalpersonidcard;
    }

    /**
     * 设置 legalpersonidcard
     * @param 对legalpersonidcard进行赋值
     */
    public void setLegalpersonidcard(String legalpersonidcard)
    {
        this.legalpersonidcard = legalpersonidcard;
    }

    /**
     * 获取 key
     * @return 返回 key
     */
    public String getKey()
    {
        return key;
    }

    /**
     * 设置 key
     * @param 对key进行赋值
     */
    public void setKey(String key)
    {
        this.key = key;
    }
    
}
