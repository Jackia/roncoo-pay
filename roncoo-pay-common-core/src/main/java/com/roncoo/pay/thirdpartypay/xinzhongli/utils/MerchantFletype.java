/*
 * 类文件名:  MerchantFletype.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.utils;

/**
 * 自商户证件类型
 * 
 * @author   曾云龙
 * @version  V001Z0001
 * @date     2016年11月9日
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public enum MerchantFletype
{
    ID_CARD_FRONT("身份证正面"),
    ID_CARD_BACK("身份证背面"),
    BANK_CARD_FRONT("银行卡正面"),
    BANK_CARD_BACK("银行卡背面"),
    PERSON_PHOTO("手持身份证照片"),
    BUSSINESS_LICENSE("营业执照"),
    BUSSINESS_CERTIFICATES("工商证"),
    ORGANIZATION_CODE("组织机构代码证"),
    TAX_REGISTRATION("税务登记证"),
    BANK_ACCOUNT_LICENCE("银行开户许可证"),
    LEGAL_PERSON_FRONT("法人身份证正面"),
    LEGAL_PERSON_BACK("法人身份证背面");
    
    private String value;
    
    private MerchantFletype(String value)
    {
        this.value = value;
    }

    /**
     * 获取 value
     * @return 返回 value
     */
    public String getValue()
    {
        return value;
    }

    /**
     * 设置 value
     * @param 对value进行赋值
     */
    public void setValue(String value)
    {
        this.value = value;
    }
    
    public static void main(String[] args)
    {
        System.out.println(MerchantFletype.BANK_ACCOUNT_LICENCE.getValue());;
    }
}