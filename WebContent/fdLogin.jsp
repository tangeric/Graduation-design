<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="js/adminLogin.js" ></script>
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/adminLogin.css" />
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
	    <div class="navbar-header">
	        <a class="navbar-brand" href="#">房地产租赁信息系统</a>
		</div>
		<div>
	        <ul class="nav navbar-nav">
	            <li><a href="queryfyxx">房源查询</a></li>
	            <li class="active"><a href="#">房东登录</a></li>
	            <li><a href="adminLogin.jsp">管理员登录</a></li>
	            <li><a href="fdregister.jsp">成为房东</a></li>
	        </ul>
	    </div>
    </div>
</div>
<input type="hidden" value="${error}" id="error">
		<h3 align="center" class="fontcolor">房东登录</h3>
		<form class="form-horizontal" action="admin_fdLogin" method="post"><br><br><br>
			<div class="form-group has-feedback" id="form-div">
			   <label class="control-label fontcolor">用户名：</label>
			   <input type="text" name="username" class="form-control" id="username"/>
			   <br />
			   <label class="fontcolor">密码：</label>
			   <input type="password" name="password" class="form-control" id="ps"/>
			   <br /><br />
			    <button type="submit" class="btn btn-info button" id="login">登录</button>
			    <a href="fdregister.jsp" class="btn btn-default">注册</a>
			</div>
			<br><br>
			
		</form>
</body>
</html>