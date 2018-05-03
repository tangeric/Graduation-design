<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<style type="text/css">
	.pan{
		width:80%;
		margin: 0 auto;
		
	}
</style>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
	    <div class="container-fluid">
		    <div class="navbar-header">
		        <a class="navbar-brand" href="#">房地产租赁信息系统</a>
			</div>
			<div>
		        <ul class="nav navbar-nav">
		            <li><a href="ad_querydshfy">房源审核</a></li>
		            <li><a href="fdxx_adminfy">房源管理</a></li>
		            <li  class="active"><a href="#">删除房源恢复</a></li>
		            <li><a href="fdxx_fdxxQuery">房东管理</a></li>
		            <li><a href="fdxx_delfdxxQuery">房东删除恢复</a></li> 
		        </ul>
		        <ul class="nav navbar-nav navbar-right"> 
		            <li><a href="#"><span class="glyphicon glyphicon-user"></span>${sessionScope.adminname}</a></li> 
		            <li><a href="adminLogin.jsp"><span class="glyphicon glyphicon-log-in"></span>&nbsp;退出</a></li> 
	       		</ul>
		    </div>
	    </div>
	</div>
	<br><br><br>
	<div class="panel panel-warning pan">
    <div class="panel-heading">
        <h3 class="panel-title">已删除房源</h3>
    </div>
    <table class="table">
    	<tr><th>房源标题</th><th>租赁方式</th><th>区域</th><th>价格</th><th>上传时间</th><th>上传人</th><th>状态</th><th>操作</th></tr>
        <s:iterator value="#request.relist" var="list">
        	<tr>
	        	<td><a href="ad_queryxx?fy_id=${list[7] }">${list[0] }</a></td>
	        	<td>${list[2] }</td>
	        	<td>${list[5] }</td>
	        	<td>${list[1] }</td>
	        	<td>${list[3] }</td>
	        	<td>${list[8] }</td>
	        	<td> <s:if test="#request.list[4]==\"1\"">通过</s:if><s:else>未通过</s:else></td>
	        	<td><a href="recoverfy?fy_id=${list[7] }" class="btn btn-info button">恢复</a></td>
        	</tr>
        </s:iterator>
    </table>
</div>
</body>
</html>