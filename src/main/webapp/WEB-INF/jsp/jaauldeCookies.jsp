<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jaaulde-cookies测试</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="js/jaaulde-cookies.js"></script>

<script type="text/javascript">
	$(function() {
		$("#username").val(cookies.get('cusername'));
		$("#password").val(cookies.get('cpassword'));
	});

	function rememberAccount() {
		cookies.set('cusername', $("#username").val());
		cookies.set('cpassword', $("#password").val());
	}
</script>
</head>
<body>
	<form action="">
		username：
		<input type="text" id="username" value="" />
		password：
		<input type="text" id="password" value="" />
		<input type="button" value="记住账号和密码" onclick="rememberAccount()">
	</form>
</body>
</html>