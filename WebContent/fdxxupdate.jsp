<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房东信息修改</title>
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="js/fdxxupdate.js" ></script>
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
	            <li><a href="querytgfdfy">我的房源</a></li>
	            <li><a href="queryfdfy">待审核房源</a></li>
	            <li><a href="fyzc.jsp">房源上传</a></li>
	            <li class="active"><a href="#">个人信息修改</a></li>
	            <li><a href="fdmmUpdate.jsp">密码修改</a></li>
	        </ul>
	    </div>
    </div>
</div>
	<h3 align="center">房东信息修改</h3>
		<form class="form-horizontal" action="fd_updatefd" method="post" enctype="multipart/form-data">
			<div class="form-group has-feedback" id="form-div">
			   <label class="control-label">用户名：</label>
			   <input type="text" name="loginName" class="form-control" value="${fd.loginName }" id="username"/>
			   <br />
			   <label>真实姓名：</label>
			   <input type="text" id="realName" name="realName" value="${fd.realName }" class="form-control"/>
			   <br />
			   <label>联系电话：</label>
			   <input type="text" name="phoneNumber" id="phoneNumber" value="${fd.phoneNumber }" class="form-control"/>
			   <br />
			   <label>身份证正面照片：</label>
			   <input type="file" name="file1" id="exampleInputFile">
			   <img alt="222" src="${fd.idetityPic }" class="img-rounded tpimg">
			   <br /><br />
			    <button type="submit" id="submit" class="btn btn-info button">修改</button>
			    <button type="reset" class="btn btn-default">重置</button>
			   
			</div>
		</form>
</body>
</html>