<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>uploadify测试</title>
<script type="text/javascript" src="js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="plugns/uploadify/jquery.uploadify.js"></script>
<link rel="stylesheet" type="text/css" href="plugns/uploadify/uploadify.css" />

<script type="text/javascript">
$(function() {
    $('#file_upload').uploadify({
        'swf'      : 'plugns/uploadify/uploadify.swf',
        'uploader' : 'plugns/uploadify/uploadify.php',
        'method'   : 'post',
        'formData' : {
        	'someKey' : 'someValue' 
        },
        'onUploadSuccess' : function(file, data, response) {
            alert('The file was saved to: ' + data);
        }
    	
    });
});
</script>
</head>
<body>
	<input type="file" name="file_upload" id="file_upload" />
</body>
</html>