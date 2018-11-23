var isIE = !!window.ActiveXObject;
var isIE6 = isIE && !window.XMLHttpRequest;
var loginingContent = "正在登录...";
var loginContent = "登录";
if (isIE) {
	if (isIE6) {
		// alert("您的浏览器版本太旧了，是十几年前的版本了，这个界面比较新，需要升级浏览器才能访问。");
		window.location.href = "static/BrowserTips.html";
	}
}
var $user = null;
var $password = null;
var $login = null;
var $form = null;
var $mess = null;
var $mess_txt = null;
$(document).ready(function() {
	onResizeFun();
	window.onresize = onResizeFun;

	$user = $("#username");
	$password = $('#password');
	$login = $('.logging');
	$form = $('#fm1');
	$mess = $('.error-mess');
	$mess_txt = $mess.find('#error-message');

    $user.val('xtcs');
    $password.val('123456');
	// $user.val('');
	// $password.val('');
	if (hasCookie()) {
		var name = getCookie("EnterNet_name");
		// var pwd = getCookie("EnterNet_pwd");
		autoLogin(name, "");
	}
	$("#username").focus();
});

function addCookie(nameValue, pwdValue) {
	// cookie保存一周
	SetCookie("EnterNet_name", nameValue, "7");
	// SetCookie("EnterNet_pwd", pwdValue, "7");
}

function hasCookie() {
	var name = getCookie("EnterNet_name");
	// var pwd = getCookie("EnterNet_pwd");
	if (name != null && name != "") {
		return true;
	}
	return false;
}

/*
 * function rePassConfirm() { var rePass =
 * document.getElementById("rememberMe"); if (rePass.checked == true) { return
 * confirm('为了您的安全，请不要在公共场合使用此功能，您确认记住用户名、密码吗？'); } return true; }
 */

function login() {
	var msg = "";
	// 封装表单为json参数
	var params = getParamsJson("login_form");
	var account = $('input[name="loginname"]').val();
	var password = $('input[name="password"]').val();

	var str = '';
	if (account.length == 0) {
		str = "请输入用户账号";
		$('input[name="loginname"]').focus();
		appebdStr(str);
		return;
	} else if (password.length == 0) {
		str = "请输入登录密码";
		$('input[name="password"]').focus();
		appebdStr(str);
		return;
	} else {
		$(".error-msg").css('opacity', 0);
	}

	$login.attr("value", loginingContent);
	$login.attr("disabled", true);
	$.ajax({
		url : "vworkerC/login",
		type : "POST",
		dataType : "text",
		data : params,
		async : false,
		success : function(msg) {
			loginCallBack(params, msg);
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			$mess.show();
			$mess_txt.html("登录失败,系统错误,请刷新页面再试。");
		}
	});
}

function loginCallBack(params, data) {
//	getProjectName();
	if (data == "true") {
		// 保存cookie
		// if (autoState)
		// addCookie(params.loginname, params.password);
		// 跳转到主页面
		var thisBrowser = BrowserDetect.browser.toLowerCase();
		if (thisBrowser.indexOf("internet") > -1) {
			window.location.href = apppath + "/main";

		} else {
			window.location.href = "main";
		}
		return;
	} else if (data == "false") {
		str = "登录失败。";
		appebdStr(str);
	} else if (data == "-1") {
		str = "用户不存在。";
		$('input[name="loginname"]').focus();
		appebdStr(str);
	} else if (data == "-2") {
		str = "用户名和密码不匹配。";
		$('input[name="password"]').focus();
		appebdStr(str);
	} else if (data == "-3") {
		str = "该用户已被锁定，请联系管理员!";
		appebdStr(str);
	} else if (data == "-4") {
		str = "登录异常。";
		appebdStr(str);
	} else if (data == "-5") {
		str = "认证异常。";
		appebdStr(str);
	} else if (data == "-6") {
		str = "系统异常。";
		appebdStr(str);
	}
	$login.attr("value", loginContent);
	$login.attr("disabled", false);

}

function autoLogin(name, pwd) {
	$user.val(name);
	// $password.val(pwd);
	$("#rememberMe").attr("checked", true);
}

// 错误提示信息
function appebdStr(str) {
	$(".submit_btn").addClass('lanren');
	setTimeout(function() {
		$(".submit_btn").removeClass('lanren');
	}, 820);
	$('.error-msg span').html(str);
	$(".error-msg").css('opacity', 1);
}
$(".submit_btn").click(function() {
	var account = $('input[name="loginname"]').val();
	var password = $('input[name="password"]').val();

	var str = '';
	if (account.length == 0) {
		str = "请输入用户账号";
		$('input[name="loginname"]').focus();
		appebdStr(str);
	} else if (password.length == 0) {
		str = "请输入登录密码";
		$('input[name="password"]').focus();
		appebdStr(str);
	} else {
		$(".error-msg").css('opacity', 0);
	}
});

var winWidth = 100;
var winHeight = 100;
function getWindowSize()// 函数：获取尺寸
{
	// 获取窗口宽度
	if (window.innerWidth)
		winWidth = window.innerWidth;
	else if ((document.body) && (document.body.clientWidth))
		winWidth = document.body.clientWidth;
	// 获取窗口高度
	if (window.innerHeight)
		winHeight = window.innerHeight;
	else if ((document.body) && (document.body.clientHeight))
		winHeight = document.body.clientHeight;
	// 通过深入Document内部对body进行检测，获取窗口大小
	if (document.documentElement && document.documentElement.clientHeight
			&& document.documentElement.clientWidth) {
		winHeight = document.documentElement.clientHeight;
		winWidth = document.documentElement.clientWidth;
	}
}

function onResizeFun() {
	getWindowSize();
	if (winHeight < 500) {
		winHeight = 500;
	}
	$('#main').height(winHeight);
	var main_login_height = $('#main_login').height();
	var main_top = (winHeight - main_login_height) / 3;
	$('#main').css("padding-top", main_top + "px");
}
// 回车登录
$(document).keyup(function(event) {
	if (event.keyCode == 13) {
		$('.submit_btn').trigger("click");
	}
});
