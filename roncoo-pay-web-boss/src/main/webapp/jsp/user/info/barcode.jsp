<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../../../common/taglib/taglib.jsp"%>
	 <script type="text/javascript" src="${baseURL }/common/js/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="${baseURL }/common/js/jquery.qrcode.min.js"></script>

	<script type="text/javascript">
      $(function(){
          $("#qrcode").qrcode({
              //render: "table",
              render: "canvas",
              width: 190,
              height:190,
              text: "http://192.168.3.11:8080/merchant-api/roncooPay/scanPay/?" + "${codeurl}"
          });
      })
  </script>
<div class="pageContent">
	<div id="qrcode" />
</div>
