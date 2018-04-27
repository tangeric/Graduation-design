<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房东信息修改</title>
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="js/fdxxupdate.js" ></script>
<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<link rel="stylesheet" href="css/adminUpdate.css" />
</head>
<body>
	<h3 align="center">房东信息修改</h3>
		<form class="form-horizontal" action="fd_adminUpdatefd" method="post" enctype="multipart/form-data">
			<div class="form-group has-feedback" id="form-div">
			   <label class="control-label fontcolor">用户名：</label>
			   <input type="text" name="loginName" class="form-control" value="${fd.loginName }" id="username"/>
			   <br />
			   <label  class="fontcolor">真实姓名：</label>
			   <input type="text" id="realName" name="realName" value="${fd.realName }" class="form-control"/>
			   <br />
			   <label  class="fontcolor">联系电话：</label>
			   <input type="text" name="phoneNumber" id="phoneNumber" value="${fd.phoneNumber }" class="form-control"/>
			   <br />
			   <label  class="fontcolor">身份证正面照片：</label>
			   <input type="file" name="file1" id="exampleInputFile">
			   <img alt="222" src="${fd.idetityPic }" class="img-rounded tpimg">
			   <br /><br />
			    <button type="submit" id="submit" class="btn btn-info button">修改</button>
			    <button type="reset" class="btn btn-default">重置</button>
			   
			</div>
		</form>
</body>
</html>