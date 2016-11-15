<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="plugns/jqGrid_5.1.1/js/jquery-1.11.0.min.js"></script>
<script src="plugns/jqGrid_5.1.1/js/i18n/grid.locale-cn.js"></script>
<script src="plugns/jqGrid_5.1.1/js/jquery.jqGrid.min.js"></script>
<link rel="stylesheet" href="plugns/jquery-ui-1.12.1/jquery-ui.min.css">
<link rel="stylesheet" href="plugns/jqGrid_5.1.1/css/ui.jqgrid.css">
</head>

<script>
	jQuery(document).ready(function() {
		jQuery("#jqGrid").jqGrid('jqPivot', "data2.json", {
			xDimension : [ {
				dataName : "CategoryName"
			}, {
				dataName : "ProductName"
			} ],
			groupSummaryPos : "footer",
			aggregates : [ {
				formatter : "number",
				label : "Sum Price",
				width : 80,
				align : "right",
				aggregator : "sum",
				summaryType : "sum",
				member : "Price"
			}, {
				formatter : "number",
				label : "Sum Qty",
				width : 80,
				align : "right",
				aggregator : "sum",
				summaryType : "sum",
				member : "Quantity"
			} ],
			yDimension : [ {
				"dataName" : "Country"
			} ]
		}, {
			width : 780,
			height : "400",
			rowNum : 10,
			rowList : [ "10:10", "20:20", "30:30", "1000:All" ],
			pager : "#jqGridPager",
			caption : "Multiple aggregates"
		});
	});

	/* jQuery(document).ready(function($) {
		jQuery('#tree').jqGrid({
			"url" : "data.json",
			"colModel" : [ {
				"name" : "category_id",
				"index" : "accounts.account_id",
				"sorttype" : "int",
				"key" : true,
				"hidden" : true,
				"width" : 50
			}, {
				"name" : "name",
				"index" : "name",
				"sorttype" : "string",
				"label" : "Name",
				"width" : 170
			}, {
				"name" : "price",
				"index" : "price",
				"sorttype" : "numeric",
				"label" : "Price",
				"width" : 90,
				"align" : "right"
			}, {
				"name" : "qty_onhand",
				"index" : "qty_onhand",
				"sorttype" : "int",
				"label" : "Qty",
				"width" : 90,
				"align" : "right"
			}, {
				"name" : "color",
				"index" : "color",
				"sorttype" : "string",
				"label" : "Color",
				"width" : 100
			}, {
				"name" : "lft",
				"hidden" : true
			}, {
				"name" : "rgt",
				"hidden" : true
			}, {
				"name" : "level",
				"hidden" : true
			}, {
				"name" : "uiicon",
				"hidden" : true
			} ],
			"width" : "780",
			"hoverrows" : false,
			"viewrecords" : false,
			"gridview" : true,
			"height" : "auto",
			"sortname" : "lft",
			"loadonce" : true,
			"rowNum" : 100,
			"scrollrows" : true,
			// enable tree grid
			"treeGrid" : true,
			// which column is expandable
			"ExpandColumn" : "name",
			// datatype
			"treedatatype" : "json",
			// the model used
			"treeGridModel" : "nested",
			// configuration of the data comming from server
			"treeReader" : {
				"left_field" : "lft",
				"right_field" : "rgt",
				"level_field" : "level",
				"leaf_field" : "isLeaf",
				"expanded_field" : "expanded",
				"loaded" : "loaded",
				"icon_field" : "icon"
			},
			"sortorder" : "asc",
			"datatype" : "json",
			"pager" : "#pager"
		});
	}); */

	/* jQuery(document).ready(function($) {
		jQuery('#tree').jqGrid({
			"url" : "data.json",
			"datatype" : "json",
			"colModel" : [ {
				"name" : "emp_id",
				"index" : "emp_id",
				"sorttype" : "int",
				"key" : true,
				"hidden" : true
			}, {
				"name" : "name",
				"index" : "name",
				"sorttype" : "string",
				"label" : "Employee",
				"width" : 170
			}, {
				"name" : "salary",
				"index" : "salary",
				"sorttype" : "numeric",
				"label" : "Salary",
				"align" : "right",
				"width" : 90
			}, {
				"name" : "boss_id",
				"hidden" : true
			} ],
			"width" : "780",
			"hoverrows" : false,
			"viewrecords" : false,
			"gridview" : true,
			"height" : "auto",
			"sortname" : "emp_id",
			"scrollrows" : true,
			"treeGrid" : true,
			"ExpandColumn" : "name",
			"treedatatype" : "json",
			"treeGridModel" : "adjacency",
			"loadonce" : true,
			"rowNum" : 100,
			"treeReader" : {
				"parent_id_field" : "boss_id",
				"level_field" : "level",
				"leaf_field" : "isLeaf",
				"expanded_field" : "expanded",
				"loaded" : "loaded",
				"icon_field" : "icon"
			},
			"pager" : "#pager"
		});
	}); */

	/* jQuery(document).ready(function($) {
		jQuery('#tree').jqGrid({
			"url" : "data.json",
			"colModel" : [ {
				"name" : "category_id",
				"index" : "accounts.account_id",
				"sorttype" : "int",
				"key" : true,
				"hidden" : true,
				"width" : 50
			}, {
				"name" : "name",
				"index" : "name",
				"sorttype" : "string",
				"label" : "Name",
				"width" : 170
			}, {
				"name" : "price",
				"index" : "price",
				"sorttype" : "numeric",
				"label" : "Price",
				"width" : 90,
				"align" : "right"
			}, {
				"name" : "qty_onhand",
				"index" : "qty_onhand",
				"sorttype" : "int",
				"label" : "Qty",
				"width" : 90,
				"align" : "right"
			}, {
				"name" : "color",
				"index" : "color",
				"sorttype" : "string",
				"label" : "Color",
				"width" : 100
			}, {
				"name" : "lft",
				"hidden" : true
			}, {
				"name" : "rgt",
				"hidden" : true
			}, {
				"name" : "level",
				"hidden" : true
			}, {
				"name" : "uiicon",
				"hidden" : true
			} ],
			"width" : "780",
			"hoverrows" : false,
			"viewrecords" : false,
			"gridview" : true,
			"height" : "auto",
			"sortname" : "lft",
			"loadonce" : true,
			"rowNum" : 100,
			"scrollrows" : true,
			// enable tree grid
			"treeGrid" : true,
			// which column is expandable
			"ExpandColumn" : "name",
			// datatype
			"treedatatype" : "json",
			// the model used
			"treeGridModel" : "nested",//adjacency、nested
			// configuration of the data comming from server
			"treeReader" : {
				"left_field" : "lft",
				"right_field" : "rgt",
				"level_field" : "level",
				"leaf_field" : "isLeaf",
				"expanded_field" : "expanded",
				"loaded" : "loaded",
				"icon_field" : "icon"
			},
			"sortorder" : "asc",
			"datatype" : "json",
			"pager" : "#pager"
		});
	}); */
</script>

<body>
	<center>
		<table id="tree"></table>
		<div id="pager"></div>
	</center>

	<br />

	<center>
		<table id="jqGrid"></table>
		<div id="jqGridPager"></div>
	</center>

</body>
</html>
