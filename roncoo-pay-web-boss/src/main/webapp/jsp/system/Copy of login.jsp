<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<jsp:include page="${baseURL }/common/taglib/taglib.jsp" />
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Mosaddek">
<meta name="keyword" content="快捷支付  ,融合支付, 聚合支付, 扫码,网关支付 ">

<title>智闪付 --- 云智恒生运营平台</title>
<link rel="stylesheet" type="text/css" href="${baseURL }/dwz/themes/css/login.css" />
<script type="text/javascript" language="javascript" src="${baseURL }/common/js/login/login.js"></script>
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


<body>
	<div id="login">
		<div id="login_header">
			<h1 class="login_logo">
				<a href="http://demo.dwzjs.com">
					<img src="${baseURL }/dwz/themes/default/images/login_logo.png" />
				</a>
			</h1>
			<div class="login_headerContent">
				<div class="navList">
					<ul>
						<li>
							<a href="#">设为首页</a>
						</li>
					</ul>
				</div>
				<h2 class="login_title">
					<img src="${baseURL }/dwz/themes/default/images/login_title.png" />
				</h2>
			</div>
		</div>
		<div id="login_content">
			<div class="loginForm">
				<form id="form1" action="${baseURL }/login" method="post">
					<div style="color: red; padding-left: 80px; padding-bottom: 10px;">${message}</div>
					<div class="login_user">
						<ul>
							<li>
								<label>帐&nbsp;&nbsp;&nbsp;&nbsp;号：</label>
							</li>
							<li>
								<input type="text" name="loginName" size="18" class="login_input" />
							</li>
						</ul>
						<ul>
							<li>
								<label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
							</li>
							<li>
								<input type="password" name="roncooPwd" size="18" class="login_input" />
							</li>
						</ul>
					</div>
					<c:if test="${captchaEbabled}">
						<div class="login_code">
							<ul>
								<li>
									<label>验证码：</label>
								</li>
								<li class="input_code">
									<input id="code" name="captchaCode" size="6" />
								</li>
								
								<li>
									<span> <img class="rcCaptcha-btn rcCaptcha-img" src="${baseURL}/rcCaptcha.jpg" alt="点击更换验证码" title="点击更换验证码" width="65" height="24" />
									</span>
								</li>
							</ul>
						</div>
					</c:if>
					<div class="login_bar">
						<input class="sub" type="submit" value=" " />
					</div>
				</form>


			</div>
			<div class="login_banner">
				<img src="${baseURL }/dwz/themes/default/images/login_banner.jpg" />
			</div>
			<div class="login_main">
				<ul class="helpList">
				</ul>
				<div class="login_inner"></div>
			</div>
		</div>
		<div id="login_footer">
			Copyright &copy; 2015-2016
			<a href="http://www.roncoo.com" target="_blank">龙果学院</a>
		</div>
	</div>

	<script>
		$(function() {
			$(".rcCaptcha-btn").click(
					function() {
						$(".rcCaptcha-img").attr(
								"src",
								'${baseURL}/rcCaptcha.jsp?'
										+ new Date().getTime());
					});
		});
	</script>
</body>
</html>