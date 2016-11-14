<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="plugns/jqGrid_5.1.1/js/jquery-1.11.0.min.js"></script>
<script src="plugns/jqGrid_5.1.1/js/i18n/grid.locale-cn.js"></script>
<script src="plugns/jqGrid_5.1.1/js/jquery.jqGrid.min.js"></script>
<link rel="stylesheet" href="plugns/jquery-ui-1.12.1/jquery-ui.min.css">
<!-- <link rel="stylesheet" href="plugns/jquery-ui-1.12.1/jquery-ui.theme.min.css"> -->
<link rel="stylesheet" href="plugns/jqGrid_5.1.1/css/ui.jqgrid.css">
</head>

<script>
	$(document).ready(function() {
		$("#jqGrid").jqGrid({
			url : 'data.xml',
			datatype : "xml",
			colModel : [ {
				label : 'Inv No',
				name : 'id',
				width : 75,
				key : true
			}, {
				label : 'Date',
				name : 'invdate',
				width : 90
			}, {
				label : 'Client',
				name : 'name',
				width : 100
			}, {
				label : 'Amount',
				name : 'amount',
				width : 80
			}, {
				label : 'Tax',
				name : 'tax',
				width : 80
			}, {
				label : 'Total',
				name : 'total',
				width : 80
			}, {
				label : 'Notes',
				name : 'note',
				width : 150
			} ],
			width : 780,
			loadonce : true,
			rowNum : 10,
			rowList : [ 10, 20, 30 ],
			pager : '#jqGridPager',
			sortname : 'id',
			viewrecords : true,
			sortorder : "desc",
			caption : "Load Data - XML"
		}).navGrid('#jqGridPager', {
			edit : false,
			add : false,
			del : false
		});
	});
</script>

<body>
	<center>
		<table id="jqGrid"></table>
		<div id="jqGridPager"></div>
	</center>
</body>
</html>
