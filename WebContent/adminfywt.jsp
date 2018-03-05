<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>输入问题</title>
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<link rel="stylesheet" href="css/adminfywt.css" />
</head>
<body>
<form action="ad_updatewt?fy_id=${fy_id }" method="post">
<div class="form-group has-feedback" id="form-div4">
	<label>房源问题：</label>
	<textarea class="form-control" name="reason" rows="5"></textarea>
	<br /><br />
	<input type="submit" class="btn btn-info button" value="提交">
	
</div>
</form>
</body>
</html>