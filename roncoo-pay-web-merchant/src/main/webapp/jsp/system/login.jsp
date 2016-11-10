<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="zh">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<meta name="keyword" content="快捷支付  ,融合支付, 聚合支付, 扫码,网关支付 ">
<link rel="shortcut icon" href="img/favicon.png">
<%@include file="../../common/taglib.jsp"%>

<title>智闪付 --- 云智恒生商户版</title>

<!-- Bootstrap core CSS -->
<link href="${baseURL}/statics/css/bootstrap.min.css" rel="stylesheet">
<link href="${baseURL}/statics/css/bootstrap-reset.css" rel="stylesheet">
<!--external css-->
<link href="${baseURL}/statics/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<!-- Custom styles for this template -->
<link href="${baseURL}/statics/css/style.css" rel="stylesheet">
<link href="${baseURL}/statics/css/style-responsive.css"
	rel="stylesheet" />

<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
    <script src="${baseURL}/statics/js/html5shiv.js"></script>
    <script src="${baseURL}/statics/js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="login-body">

	<div class="container">

		<form class="form-signin" action="${baseURL }/index" method="post">
			<h2 class="form-signin-heading">商户后台登录</h2>
			<div class="login-wrap">
				<input type="text" class="form-control" placeholder="手机号"
					name="mobile" value="${mobile }" autofocus> <input
					type="password" class="form-control" placeholder="密 码"
					name="password" value="${password }">

				<div class="form-group has-feedback" style="display: none;"
					id="login_msg">
					<span style="color: red;" id="msg">${msg }</span>
				</div>
				
				<div >&nbsp;
				
				</div>

				<!-- <label class="checkbox"> <input type="checkbox"
					value="remember-me"> Remember me <span class="pull-right">
						<a data-toggle="modal" href="#myModal"> Forgot Password?</a>

				</span>
				</label> -->
				<button class="btn btn-lg btn-login btn-block" type="submit">登录</button>
				<div class="registration">
					您还没有账号? <a class="" href="registration.html"> 创建帐号 </a>
				</div>

			</div>
		</form>

	</div>
	<!-- js placed at the end of the document so the pages load faster -->
	<script src="${baseURL }/statics/js/jquery.js"></script>
	<script src="${baseURL }/statics/js/bootstrap.min.js"></script>
	<script>
var msg = '${msg}';
if(msg != ''){
	$("#login_msg").show();
}else{
	$("#login_msg").hide();
}
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
    
    
  });
</script>

</body>
</html>