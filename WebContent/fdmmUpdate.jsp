<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="js/fdmmupdate.js"></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/adminLogin.css" />
</head>
<body>
<h3 align="center">修改密码</h3>
		<form class="form-horizontal" action="fd_updatepw" method="post">
			<div class="form-group has-feedback" id="form-div">
			   <label class="control-label">原密码：</label>
			   <input type="password" class="form-control" id="oldpw"/>
			   <br />
			   <label>密码：</label>
			   <input type="password" name="password" class="form-control" id="ps"/>
			   <br />
			   <label>再次输入密码：</label>
			   <input type="password" class="form-control" id="ps1"/>
			   <br /><br />
			    <button type="submit" id="submit" class="btn btn-info button">确认修改</button>
			    <button type="reset" class="btn btn-default">重置</button>
			   
			</div>
		</form>
</body>
</html>