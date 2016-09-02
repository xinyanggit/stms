<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="plugns/jquery-loadmask-0.4/jquery.loadmask.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.7.2.js"></script>
<script src="plugns/jquery-loadmask-0.4/jquery.loadmask.js"></script>

<script type="text/javascript">
	$(function() {
		$("#submit").bind("click", function() {
			$("#frm").mask("正在提交...");
		});

		$("#cancel").bind("click", function() {
			$("#frm").unmask();
		});
	});
</script>
</head>
<body>
	<center>
		<form action="" id="frm" style="margin: 10px;">
			username:
			<input type="text" id="username" value="" />
			<br />
			password:
			<input type="password" id="password" value="" />
		</form>
		<input type=button id="submit" value="提交" />
		<input type=button id="cancel" value="取消提交" />
	</center>
</body>
</html>

