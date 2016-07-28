<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<link rel="stylesheet" href="plugns/jquery-powerFloat/css/common.css">
<link rel="stylesheet" href="plugns/jquery-powerFloat/css/powerFloat.css">

<script src="js/jquery-1.7.2.js"></script>
<script src="plugns/jquery-powerFloat/js/jquery-powerFloat.js"></script>

<style>
.shadow{-moz-box-shadow:1px 1px 3px rgba(0,0,0,.4); -webkit-box-shadow:1px 1px 3px rgba(0,0,0,.4); box-shadow:1px 1px 3px rgba(0,0,0,.4);}
.target_box{width:250px; padding:10px; border:1px solid #aaa; background-color:#fff;}
.target_list{padding:4px; border-bottom:1px dotted #ddd; overflow:hidden; _zoom:1;}
.target_list a{width:22px; line-height:20px; margin-right:5px; padding:1px; color:#333; font-size:12px; text-align:center; text-decoration:none; float:left;}
.target_list a:hover{padding:0; border:1px solid #ddd; color:#cd0000;}
.target_more{margin-top:-20px;}

.target_fixed{height:25px; padding:1px; position:fixed; _position:absolute; top:0; right:0;}
.custom_container{position:absolute; background-color:rgba(0, 0, 0, .5); background-color:#999\9;}
.custom_container img{padding:0; position:relative; top:-5px; left:-5px;}
</style>

<script type="text/javascript">
	$(function(){
		
		$("#trigger4").powerFloat({
		    targetMode: "ajax"
		});
		
		$("#trigger5").powerFloat({
		    target: "http://tp3.sinaimg.cn/2305056670/180/5608200132/0",
		    targetMode: "ajax"
		});
		
		$("#trigger6").powerFloat({
		    eventType: "click",
		    target: "/study/201009/html-load.html",
		    targetMode: "ajax"
		});
		
		$("#trigger8").powerFloat({
		    width: "inherit",
		    eventType: "click",
		    target: ["唐丽霞", "徐栋梁", "成霞", "王庆花", "王腊梅", "朱小丽", "束方娟", "吉回秀", "陈阳", "<a href='##'>更多 >></a>"],
		    targetMode: "list"	
		});
		
		$("#trigger9").powerFloat({
		    width: 250,
		    target: [
		        {
		            href: "##",
		            text: "这是文章1的说"	
		        },
		        {
		            href: "##",
		            text: "啊，看，文章2"	
		        },
		        {
		            href: "##",
		            text: "啊啦，不好，我把文章3忘家里了！"	
		        },
		        {
		            href: "##",
		            text: "马萨噶，这就是传说中的...文章4..."	
		        },
		        {
		            href: "##",
		            text: "什么嘛，就是文章5，害我白期待一场"	
		        }
		    ],
		    targetMode: "list"	
		});
		
		var fnPosTri = function() {
		    var oPosTri = $("#posTrigger1"), vPosTri = $.trim(oPosTri.val());
		    if (vPosTri === "") {
		        oPosTri.powerFloat({
		            eventType: null,
		            targetMode: "remind",
		            target: "输入内容不能为空！",
		            position: "1-4"
		        }).focus();
		    } else if (/\W/g.test(vPosTri)) {
		        oPosTri.powerFloat({
		            eventType: null,
		            targetMode: "remind",
		            target: "只能输入英文字符、数字和下划线",
		            position: "1-4"
		        }).focus();	
		    } else {
		        $.powerFloat.hide();
		    }
		};
		$("#trigger11").bind("click", fnPosTri);
		$("#posTrigger1").bind("blur", fnPosTri);
	});
</script>
</head>
<body>
	<a id="trigger4" href="javascript:;" rel="http://image.zhangxinxu.com/image/study/s/s256/mm1.jpg">rel属性显示图片</a>
	<a id="trigger5" href="javascript:;">target参数为图片地址</a>
	<button id="trigger6">点击切换显示</button>
	<button id="trigger8">点击显示姓名列表▼</button>
	<a id="trigger9" href="/wordpress/">更多文章▼</a>
	<input id="posTrigger1" type="text" /> <button id="trigger11">确定</button>
</body>
</html>