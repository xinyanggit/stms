<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="plugns/maxazan-jquery-treegrid/css/jquery.treegrid.css">
<link rel="stylesheet" href="plugns/maxazan-jquery-treegrid/css/styles.css">
<script src="plugns/jqGrid_5.1.1/js/jquery-1.11.0.min.js"></script>
<script src="plugns/maxazan-jquery-treegrid/js/jquery.treegrid.min.js"></script>
</head>

<script>
	$(document).ready(function() {
		$('.tree').treegrid({
			onChange : function() {
				//alert("Changed: " + $(this).attr("id"));
			},
			onCollapse : function() {
				//alert("Collapsed: " + $(this).attr("id"));
			},
			onExpand : function() {
				//alert("Expanded " + $(this).attr("id"));
			}
		});

		$('#tree').treegrid('expandAll');

		$('#node-1').on("change", function() {
			alert("Event from " + $(this).attr("id"));
		});

	});
</script>

<body>
	<center>
		<table class="tree">
			<tr>
				<td align="center">业务类别</td>
				<td align="center">操作</td>
			</tr>
			<tr class="treegrid-1111">
				<td>内贸流通发展资金</td>
				<td>&nbsp;</td>
			</tr>
			<tr class="treegrid-222 treegrid-parent-1111">
				<td>支持楼宇经济高端发展</td>
				<td>填写申请</td>
			</tr>
			<tr class="treegrid-33 treegrid-parent-1111">
				<td>支持电子商务发展</td>
				<td>&nbsp;</td>
			</tr>
			<tr class="treegrid-4 treegrid-parent-33">
				<td>支持电子商务创新创业项目</td>
				<td>填写申请</td>
			</tr>
			<tr class="treegrid-5 treegrid-parent-33">
				<td>支持电子商务龙头企业发展项目</td>
				<td>填写申请</td>
			</tr>
		</table>
	</center>
</body>
</html>
