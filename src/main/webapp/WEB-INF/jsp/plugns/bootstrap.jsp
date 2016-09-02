<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link href="plugns/bootstrap-3.3.7/css/bootstrap.css" rel="stylesheet" type="text/css" />
<script src="js/jquery-1.7.2.js"></script>
<script src="plugns/bootstrap-3.3.7/js/bootstrap.js"></script>

<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="container" style="padding: 100px 50px 10px;">
		<button type="button" class="btn btn-default" title="Popover title" data-container="body" data-toggle="popover" data-placement="left" data-content="左侧的 Popover 中的一些内容">左侧的 Popover</button>
		<button type="button" class="btn btn-primary" title="Popover title" data-container="body" data-toggle="popover" data-placement="top" data-content="顶部的 Popover 中的一些内容">顶部的 Popover</button>
		<button type="button" class="btn btn-success" title="Popover title" data-container="body" data-toggle="popover" data-placement="bottom" data-content="底部的 Popover 中的一些内容">底部的 Popover</button>
		<button type="button" class="btn btn-warning" title="Popover title" data-container="body" data-toggle="popover" data-placement="right" data-content="右侧的 Popover 中的一些内容">右侧的 Popover</button>
	</div>

	<script>
		$(function() {
			$("[data-toggle='popover']").popover();
		});
	</script>
	</div>
</body>
</html>

