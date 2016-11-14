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

<title>商户注册---云智恒生商家后台</title>
<!-- Bootstrap core CSS -->
<link href="${baseURL}/statics/css/bootstrap.min.css" rel="stylesheet">
<link href="${baseURL}/statics/css/bootstrap-reset.css" rel="stylesheet">
<!--external css-->
<link href="${baseURL}/statics/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<!--right slidebar-->
<link href="${baseURL}/statics/css/slidebars.css" rel="stylesheet" />

<!--Form Wizard-->
<link rel="stylesheet" type="text/css"
	href="${baseURL}/statics/css/jquery.steps.css" />

<!-- Custom styles for this template -->
<link href="${baseURL}/statics/css/style.css" rel="stylesheet">
<link href="${baseURL}/statics/css/style-responsive.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="${baseURL}/statics/assets/bootstrap-fileupload/bootstrap-fileupload.css" />


<!-- HTML5 shim and Respond.js IE8 support of HTML5 tooltipss and media queries -->
<!--[if lt IE 9]>
      <script src="${baseURL}/statics/js/html5shiv.js"></script>
      <script src="${baseURL}/statics/js/respond.min.js"></script>
    <![endif]-->
</head>

<body>
	<!--main content start-->
	<section>
		<section class="wrapper ">
			<!-- page start-->
			<div class="row">
				<div class="col-lg-12">
					<!--progress bar start-->
					<section class="panel">
						<header class="panel-heading">
							<a href="${baseURL}/login">返回<span>商户登录页面</span></a>
						</header>
						<div class="panel-body">
							<form id="wizard-validation-form"
								action="${baseURL}/register.html" method="POST"
								enctype="multipart/form-data">
								<div>
									<h3>用户基本信息</h3>
									<section>
										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="userName">用户名<font
												color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="userName" name="userName" type="text"
													placeholder="用户名" class="required form-control">

											</div>
										</div>

										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="mobile">手机号<font
												color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="mobile" name="mobile" type="text"
													placeholder="手机号" class="required form-control">

											</div>
										</div>

										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="email">电子邮件
												<font color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="email" name="email" type="text"
													class="required email form-control">
											</div>
										</div>

										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="password">
												登录密码 <font color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="password" name="password" type="password"
													class="required form-control" placeholder="登录密码">

											</div>
										</div>

										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="confirm">确认密码
												<font color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="confirm" name="confirm" type="password"
													class="required form-control" placeholder="确认密码">
											</div>
										</div>
									</section>
									<h3>身份验证</h3>
									<section>
										<div class="form-group clearfix">
											<label class="col-lg-2 control-label" for="name">
												真实姓名 <font color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="accountname" name="accountname" type="text"
													class="required form-control">
											</div>
										</div>
										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="surname">
												身份证号 <font color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="idcard" name="idcard" type="text"
													class="required form-control">

											</div>
										</div>


										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="address">开户行<font
												color="red">*</font>
											</label>
											<div class="col-lg-10">
											    <select name="bankheadofficename" id="bankheadofficename" class="required form-control">
		                            <c:forEach var="item" items="${BankCodeEnums}">
		                                <option value="${item.name }">${item.desc }</option>
		                            </c:forEach>
	                        	</select>
											</div>
										</div>

										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="address">开户地址<font
												color="red">*</font>
											</label>
											<div class="col-lg-10">
												<select id="province" name="province"
													class="required "></select> <select id="city"
													name="city" class="required "></select> <select
													id="areas" name="areas" class="required "></select>
											</div>


										</div>

										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="address">银行卡开户所在支行<font
												color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="bankname" name="bankname" type="text"
													class="required form-control">
											</div>
										</div>

										<div class="form-group clearfix">
											<label class="col-lg-2 control-label " for="address">银行卡号<font
												color="red">*</font>
											</label>
											<div class="col-lg-10">
												<input id="bankaccountnumber" name="bankaccountnumber"
													type="text" class="required form-control">
											</div>
										</div>


									</section>
									<h3>上传资质</h3>
									<section>
										<!--main content start-->

										<div class="form-group">
											<label class="control-label col-md-3">身份证正面<font
												color="red">*</font></label>
											<div class="controls col-md-9">
												<div class="fileupload fileupload-new"
													data-provides="fileupload">
													<span class="btn btn-white btn-file"> <span
														class="fileupload-new"><i class="fa fa-paper-clip"></i>
															选择图片</span> <span class="fileupload-exists"><i
															class="fa fa-undo"></i> 重选图片</span> <input type="file"
														name="idCardFront" class="required form-control default" />
													</span> <span class="fileupload-preview" style="margin-left: 5px;"></span>
													<a href="#" class="close fileupload-exists"
														data-dismiss="fileupload"
														style="float: none; margin-left: 5px;"></a>
												</div>
											</div>

											<div class="form-group">
												<label class="control-label col-md-3">身份证反面<font
													color="red">*</font></label>
												<div class="controls col-md-9">
													<div class="fileupload fileupload-new"
														data-provides="fileupload">
														<span class="btn btn-white btn-file"> <span
															class="fileupload-new"><i class="fa fa-paper-clip"></i>
																选择图片</span> <span class="fileupload-exists"><i
																class="fa fa-undo"></i> 重选图片</span> <input type="file"
															name="idCardBack" class="required form-control default" />
														</span> <span class="fileupload-preview"
															style="margin-left: 5px;"></span> <a href="#"
															class="close fileupload-exists" data-dismiss="fileupload"
															style="float: none; margin-left: 5px;"></a>
													</div>
												</div>

											</div>

											<div class="form-group">
												<label class="control-label col-md-3">银行卡正面<font
													color="red">*</font></label>
												<div class="controls col-md-9">
													<div class="fileupload fileupload-new"
														data-provides="fileupload">
														<span class="btn btn-white btn-file"> <span
															class="fileupload-new"><i class="fa fa-paper-clip"></i>
																选择图片</span> <span class="fileupload-exists"><i
																class="fa fa-undo"></i> 重选图片</span> <input type="file"
															name="bankCardFront"
															class="required form-control default" />
														</span> <span class="fileupload-preview"
															style="margin-left: 5px;"></span> <a href="#"
															class="close fileupload-exists" data-dismiss="fileupload"
															style="float: none; margin-left: 5px;"></a>
													</div>
												</div>

												<div class="form-group">
													<label class="control-label col-md-3">手持身份证照片<font
														color="red">*</font></label>
													<div class="controls col-md-9">
														<div class="fileupload fileupload-new"
															data-provides="fileupload">
															<span class="btn btn-white btn-file"> <span
																class="fileupload-new"><i
																	class="fa fa-paper-clip"></i> 选择图片</span> <span
																class="fileupload-exists"><i class="fa fa-undo"></i>
																	重选图片</span> <input type="file" name="personPhoto"
																class="required form-control default" />
															</span> <span class="fileupload-preview"
																style="margin-left: 5px;"></span> <a href="#"
																class="close fileupload-exists"
																data-dismiss="fileupload"
																style="float: none; margin-left: 5px;"></a>
														</div>
													</div>
									</section>
									<h3>完成</h3>
									<section>
										<div class="form-group clearfix">
											<div class="col-lg-12">
												<input id="acceptTerms" name="acceptTerms" type="checkbox"
													class="required"> <label for="acceptTerms">我已阅读并同意《服务协议》和《隐私权协议》</label>
											</div>
										</div>

									</section>
								</div>
							</form>
						</div>
					</section>


				</div>


			</div>
			<!-- page end-->
			
		</section>
	</section>
	<!--main content end-->
	<!-- Right Slidebar end -->
	<!--footer start-->
	<footer class="site-footer">
		<div class="text-center">
			2016 &copy; 深圳市云智恒生科技有限公司 <a href="#" class="go-top"> <i
				class="fa fa-angle-up"></i>
			</a>
		</div>
	</footer>
	<!--footer end-->
	</section>

	<!-- js placed at the end of the document so the pages load faster -->
	<script src="${baseURL}/statics/js/jquery.js"></script>
	<script src="${baseURL}/statics/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="${baseURL}/statics/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="${baseURL}/statics/js/jquery.scrollTo.min.js"></script>
	<script src="${baseURL}/statics/js/jquery.nicescroll.js"
		type="text/javascript"></script>
	<script src="${baseURL}/statics/js/respond.min.js"></script>

	<!--right slidebar-->
	<script src="${baseURL}/statics/js/slidebars.min.js"></script>
	<script type="text/javascript" src="${baseURL}/statics/js/jsAddress.js"></script>


	<!--Form Validation-->
	<!-- <script src="${baseURL}/statics/js/bootstrap-validator.min.js" type="text/javascript"></script> -->

	<!--Form Wizard-->
	<script src="${baseURL}/statics/js/jquery.steps.min.js"
		type="text/javascript"></script>
	<script src="${baseURL}/statics/js/jquery.validate.js"
		type="text/javascript"></script>


	<!--common script for all pages-->
	<script src="${baseURL}/statics/js/common-scripts.js"></script>

	<!--script for this page-->
	<script src="${baseURL}/statics/js/jquery.stepy.js"></script>
	<script type="text/javascript"
		src="${baseURL}/statics/assets/bootstrap-fileupload/bootstrap-fileupload.js"></script>
	<script type="text/javascript"
		src="${baseURL}/statics/assets/fuelux/js/spinner.min.js"></script>

	<script>
		//step wizard

		$(function() {
			$('#default').stepy({
				backLabel : '上一步',
				block : true,
				nextLabel : '下一步',
				titleClick : true,
				titleTarget : '.stepy-tab',
				finish : "完成"
			});
		});
	</script>

	<script type="text/javascript">
		$(document).ready(function() {
			var form = $("#wizard-validation-form");
			form.validate({
				errorPlacement : function errorPlacement(error, element) {
					element.after(error);
				}
			});
			form.children("div").steps({
				headerTag : "h3",
				bodyTag : "section",
				transitionEffect : "slideLeft",
				onStepChanging : function(event, currentIndex, newIndex) {
					form.validate().settings.ignore = ":disabled,:hidden";
					return form.valid();
				},
				onFinishing : function(event, currentIndex) {
					form.validate().settings.ignore = ":disabled";
					return form.valid();
				},
				onFinished : function(event, currentIndex) {
					form.submit();
				}
			});
			
			addressInit('province', 'city', 'areas'); 

		});
		
		 
	</script>
</body>
</html>
