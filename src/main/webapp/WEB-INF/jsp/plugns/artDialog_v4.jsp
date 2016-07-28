<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>

<script src="js/jquery-1.7.2.js"></script>
<script src="plugns/artDialog_v4.1.7/jquery.artDialog.js?skin=default"></script>
<script src="plugns/artDialog_v4.1.7/plugins/iframeTools.js"></script>

<script type="text/javascript">
	(function(config) {
		config['lock'] = true;
		config['fixed'] = true;
		config['okVal'] = 'Ok';
		config['cancelVal'] = 'Cancel';
		// [more..]
	})(art.dialog.defaults);

	
	$(function() {

		art.dialog({
		    lock: false,
		    background: '#600', // 背景色
		    opacity: 0.87,	// 透明度
		    content: '中断用户在对话框以外的交互，展示重要操作与消息',
		    icon: 'error',
		    ok: function () {
		        //art.dialog({content: '再来一个锁屏', lock: true});
		        return false;
		    },
		    cancel: true
		});

	});
</script>
</head>
<body>

</body>
</html>