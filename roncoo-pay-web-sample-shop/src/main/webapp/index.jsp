<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getScheme() + "://" + request.getServerName()
          + ":" + request.getServerPort() + request.getContextPath()
          + "/";
  session.setAttribute("path", path);
%>
<html>
<head>
	<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<meta name="keyword" content="快捷支付  ,融合支付, 聚合支付, 扫码,网关支付 ">

 <title>智闪付收银台--- 云智恒生商户版</title>
    
  <script type="text/javascript" src="${path}js/jquery-1.7.2.min.js"></script>
  <link href="${path}pay_files/pay.css" rel="stylesheet" type="text/css">
</head>
<body>


<div class="cashier_desk pay_ment">
  <div class="bd">
    <ul class="payment">
      <li><img src="${path}images/weixin.png" alt="微信支付" />
        <form action="${path}roncooPay/scanPay" method="post" onsubmit="return validate();">
          <input type="hidden" name="productName" value="微信支付产品测试" /><br />
          <!-- <input type="hidden" name="orderPrice" value="0.1" /><br /> -->
          输入金额：<input id="orderPrice_WEIXIN" type="text" name="orderPrice" value="" />&nbsp;元<br />
          <input type="hidden" name="payWayCode" value="WEIXIN">
          <input type="hidden" name="remark" value="微信支付备注信息" /><br />
          <p class="pay_btn">
            <input type="submit" value="微信扫码支付" onsubmit="return validate();"/>
          </p>
        </form>
      </li>
      <li><img src="${path}images/pay.png" alt="支付宝支付" />
        <form action="#" method="post">
          <input type="hidden" name="productName" value="支付宝支付产品测试" /><br />
          <input type="hidden" name="orderPrice" value="0.1" /><br />
          <input type="hidden" name="payWayCode" value="ALIPAY">
          <input type="hidden" name="remark" value="支付宝支付备注信息" /><br />
          <p class="pay_btn">
            <input type="submit" value="支付宝扫码支付" />
          </p>
        </form>
      </li>
      <li><img src="${path}images/wang.png" alt="网关支付" />
        <form action="#" method="post">
          <input type="hidden" name="productName" value="网关支付产品测试" /><br />
          <input type="hidden" name="orderPrice" value="0.1" /><br />
          <input type="hidden" name="payWayCode" value="">
          <input type="hidden" name="remark" value="网关支付备注信息" /><br />
          <p class="pay_btn">
            <input type="submit" value="网关支付" />
          </p>
        </form>
      </li>
    </ul>
  </div>
</div>

<div class="footer w100">
  
  <div class="copyright">Copyright © 2015-2016 深圳市云智恒生科技有限公司版权所有</div>
  <p class="yue"><a href="http://www.miitbeian.gov.cn/" target="_blank">粤ICP备16009964号</a></p>
</div>
</body>

<script type="text/javascript">
			function validate()
			{
				 var reg = new RegExp("^\\d+(\\.\\d+)?$");
				 var orderPrice = document.getElementById("orderPrice_WEIXIN").value();
				 alert(orderPrice)
				if(orderPrice == '' || !reg.test(orderPrice))
				{
					alert("请输入最多带两位小数点的数据");
					return false;
				}
				else
					{
					  return true;
					}
			}
		
	</script>

</html>
