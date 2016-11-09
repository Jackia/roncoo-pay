/*
 * 类文件名:  HttpUtils.java
 * 著作版权:  深圳市云智恒生科技有限公司 Copyright 2012-2022, E-mail: 283912449@qq.com, All rights reserved
 * 功能描述:  <描述>
 * 类创建人:  曾云龙
 * 创建时间:  2016年11月9日
 * 功能版本:  V001Z0001
 */
package com.roncoo.pay.thirdpartypay.xinzhongli.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

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
public class HttpUtils
{
    private static Logger logger = Logger.getLogger(HttpUtils.class);
    /**
     * 发送服务器
     * 
     * @param url
     *            请求地址
     * @param params
     *            请求参数
     * @return
     * @throws Exception
     */
    public static String sendToServer(String url, Map<String , Object> params,String charset)
            throws Exception {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(url);
        List<NameValuePair> formParams = new ArrayList<NameValuePair>();
        // 设置参数
        for (String key : params.keySet()) {
            BasicNameValuePair param = new BasicNameValuePair(key,
                     params.get(key)+"");
            formParams.add(param);
        }
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formParams,
                "UTF-8");
        post.setEntity(entity);
        HttpResponse response = client.execute(post);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            InputStream instream = response.getEntity().getContent();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    instream, charset));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            return buffer.toString();
        } else {
            throw new Exception("地址(" + url + ")不能访问.返回HTTP-" + statusCode
                    + "错误请求");
        }
    }
    public static String sendToServer(String url, Map<String, Object> params) 
            throws Exception {
        return sendToServer(url, params,"GBK");
    }

    public static String sendToServerGet(String url, Map<String, Object> params)
            throws Exception {
        HttpClient client = new DefaultHttpClient();
        String requestUrl = url;
        // 设置参数
        for (String key : params.keySet()) {
            if(requestUrl.equals(url)){
                requestUrl =  requestUrl + "?" + key + "=" + (String)params.get(key);
            }else{
                requestUrl = requestUrl + "&" + key + "=" + (String)params.get(key);
            }
        }
        logger.info("requestUrl=" + requestUrl);
        HttpGet get = new HttpGet(requestUrl);
        HttpResponse response = client.execute(get);
        int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode == 200) {
            InputStream instream = response.getEntity().getContent();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    instream, "UTF8"));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            return buffer.toString();
        } else {
            throw new Exception("地址(" + url + ")不能访问.返回HTTP-" + statusCode
                    + "错误请求");
        }
    }
}
