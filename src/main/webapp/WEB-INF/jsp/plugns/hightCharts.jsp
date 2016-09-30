<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="js/jquery-1.7.2.js"></script>
<script src="plugns/highcharts-5.0.2/code/highcharts.js"></script>
</head>
<script>
	$(function() {
		$('#container').highcharts({
			title : {
				text : '平均月温度',
				x : -20
			//center
			},
			subtitle : {
				text : 'htt://www.irissz.com',
				x : -20
			},
			xAxis : {
				categories : [ '一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月' ]
			},
			yAxis : {
				title : {
					text : '温度 (°C)'
				},
				plotLines : [ {
					value : 0,
					width : 1,
					color : '#009100'
				} ]
			},
			tooltip : {
				valueSuffix : '°C'
			},
			legend : {
				layout : 'horizontal',//horizontal、vertical
				align : 'center',//图例容器（中的图例）水平对齐在图表区，合法值有"left", "center" 和 "right". 默认是： center. 默认值：center.
				verticalAlign : 'bottom',//垂直对齐。能取"top", "middle" or "bottom"之一。垂直对齐的位置可通过Y设置进一步调整它的位置。 默认值：bottom
				borderWidth : 1,
				borderColor : '#007500'
			},
			colors : [ '#EA0000', '#0000C6' ],
			plotOptions : {
				line : {
					dataLabels : {
						enabled : false
					},
					enableMouseTracking : true
				}
			},
			series : [ {
				name : '上海',
				data : [ 7.0, 6.9, 9.5, 14.5, 18.2, 21.5, 25.2, 26.5, 23.3, 18.3, 13.9, 9.6 ]
			}, {
				name : '北京',
				data : [ -0.2, 0.8, 5.7, 11.3, 17.0, 22.0, 24.8, 24.1, 20.1, 14.1, 8.6, 2.5 ]
			} ]
		});
	});
</script>
<body>
	<div id="container" style="min-width: 400px; height: 400px"></div>

	<br />


</body>
</html>