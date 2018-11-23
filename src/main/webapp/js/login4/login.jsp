<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="initial-scale=1.0, minimum-scale=1.0, maximum-scale=2.0, user-scalable=no, width=device-width" name="viewport">
<title>焦作市重点污染源调度管理平台</title>
 	<link rel="stylesheet" type="text/css" href="login4/css/style.css" />
 	<link rel="stylesheet" type="text/css" href="login4/css/font-awesome.css" />
    <script src="login4/js/jquery-1.11.1.min.js"></script>
    <script src="login4/js/Particleground.js"></script>
	<script type="text/javascript" src="js2/ent_cookie.js"></script>
	<script type="text/javascript" src="js2/layer/layer.js"></script>
	<script type="text/javascript" src="js2/ent_util.js"></script>
	<script type="text/javascript" src="js2/ent_browserDetect.js"></script>
	<script type="text/javascript" src="login4/login.js"></script>

<script>
	apppath =<%="'"+path+"'" %>;
</script>

</head>

<body>
	<div class="container">
		<div class="upper-part">
			 <div class="building-img"></div>
		</div>
		<div class="center-part">
			<h3 class="rail-title">
			   <img class="railLogo" src="login4/img/logo.png" alt="图片"/> 
			 	焦作市重点污染源调度管理平台
			 </h3>
			 <div class="login-dialog">
			 	<div class="dialog-left">
			 	     <img src="login4/img/login-banner.png" alt="图片">
			 	</div>
			 	<div class="dialog-right">
				 	<form id="login_form" method="post" action="user/login">
				 		<ul class="admin-login">
				 			<li>
				 				<h3 class="admin-title">用户登录</h3>
				 			</li>
				 			<li>
				 				<p class="error-msg"><span>请输入用户名或密码</span></p>
				 			</li>
				 			<li class="user_icon">
				 				<input type="text" name="loginname" id="username"  placeholder="请输入用户账号" class="login_txtbx" />
				 			</li>
				 			<li class="pwd_icon">
				 				<input type="password" name="password" id="password" placeholder="请输入登录密码" class="login_txtbx" />
				 			</li>
				 			<li class="rember-pwd">
								<input type="checkbox" id="rememberMe" onclick="return rePassConfirm()">
								<span>下次自动登录</span> 
								<span class="forgot-pwd">忘记密码?</span>
							</li>
							<li>
								<input class="submit_btn" accesskey="l" value="登录" tabindex="5" type="button" onclick="login();">
							</li>
				 		</ul>
				 	</form>
			 	</div>
		 		<div class="Irregular-pattern">
			 		<img src="login4/img/shape.png" alt="图片">
			 	</div>
			 </div>
		</div>
		
	</div>
</body>
</html>
