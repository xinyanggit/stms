<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script src="plugns/artDialog/jquery-1.10.2.js"></script>
<script src="plugns/artDialog/dialog-min.js"></script>
<link rel="stylesheet" href="plugns/artDialog/ui-dialog.css">

<script type="text/javascript">
	$(function() {
		/* var d = dialog({
			title : '欢迎',
			content : '欢迎使用 artDialog 对话框组件！'
		});
		d.show(); */
		
		/* var d = dialog({
		    title: 'message',
		    content: '<input autofocus />'
		});
		d.showModal(); */
		
		/* var d = dialog({
		    content: 'Hello World!',
		    quickClose: true// 点击空白处快速关闭
		});
		d.show(document.getElementById('quickref-bubble')); */
		
		/* var d = dialog({
		    title: '提示',
		    content: '按钮回调函数返回 false 则不许关闭',
		    okValue: '确定',
		    ok: function () {
		        this.title('提交中…');
		        return false;
		    },
		    cancelValue: '取消',
		    cancel: function () {
		    	
		    }
		});
		d.show(); */
		
		/* var d = dialog({
		    content: '对话框将在两秒内关闭'
		});
		d.show();
		setTimeout(function () {
		    d.close().remove();
		}, 2000); */
		
		/* var d = dialog({
		    title: '提示',
		    content: '欢迎使用 artDialog 对话框组件！',
		    ok: function () {},
		    statusbar: '<label><input type="checkbox">不再提醒</label>'
		});
		d.show(); */
		
		/* var d = dialog({
		    title: '欢迎',
		    content: '欢迎使用 artDialog 对话框组件！',
		    ok: function () {
		        var that = this;
		        this.title('正在提交..');
		        setTimeout(function () {
		            that.close().remove();
		        }, 2000);
		        return false;
		    },
		    cancel: function () {
		        alert('不许关闭');
		        return false;
		    }
		});
		d.show(); */
		
		
		var d = dialog({
		    title: '欢迎',
		    content: '欢迎使用 artDialog 对话框组件！',
		    cancel: false,
		    ok: function () {}
		});
		d.show();
		
		
	});
</script>
</head>
<body>

</body>
</html>