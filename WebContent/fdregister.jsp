<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房东注册</title>
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="js/fdregister.js" ></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/adminLogin.css" />

</head>
<body>
	<h3 align="center">房东注册</h3>
		<form class="form-horizontal" action="register" method="post" enctype="multipart/form-data">
			<div class="form-group has-feedback" id="form-div">
			   <label class="control-label">用户名：</label>
			   <input type="text" name="loginName" class="form-control" id="username"/>
			   <br />
			   <label>密码：</label>
			   <input type="password" name="password" class="form-control" id="ps"/>
			   <br />
			   <label>再次输入密码：</label>
			   <input type="password" name="password1" class="form-control" id="ps1"/>
			   <br />
			   <label>真实姓名：</label>
			   <input type="text" id="realName" name="realName" class="form-control"/>
			   <br />
			   <label>联系电话：</label>
			   <input type="text" name="phoneNumber" id="phoneNumber" class="form-control"/>
			   <br />
			   <label>身份证正面照片：</label>
			   <input type="file" name="file1" id="exampleInputFile">
			   <br /><br />
			    <button type="submit" id="submit" class="btn btn-info button">注册</button>
			    <button type="reset" class="btn btn-default">重置</button>
			   
			</div>
		</form>
</body>
</html>