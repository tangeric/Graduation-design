<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的房源</title>

<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<link rel="stylesheet" href="css/pagination.css" />
<link rel="stylesheet" href="css/fwxx.css" />
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="js/jquery.pagination.js"></script>
<script type="text/javascript" src="js/fwxx.js" ></script>
<script type="text/javascript">
$(document).ready(function(){  
	$("#News-Pagination").pagination(${page.totalRecord},{
		items_per_page:${page.pageSize},
		current_page:${page.currentPage}-1,
		num_display_entries:8,
		next_text:"下一页",
		prev_text:"上一页",
		num_edge_entries:2,
		callback:handlePaginationClick
	});
});
function handlePaginationClick(new_page_index,pagination_container){
	$("#stuForm").attr("action","queryfdfy?pageNum="+(new_page_index+1));
	$("#stuForm").submit();
	return false;
}

</script>
</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
	    <div class="navbar-header">
	        <a class="navbar-brand" href="#">房地产租赁信息系统</a>
		</div>
		<div>
	        <ul class="nav navbar-nav">
	            <li class="active"><a href="#">我的房源</a></li>
	            <li><a href="queryfdfy">待审核房源</a></li>
	            <li><a href="fyzc.jsp">房源上传</a></li>
	            <li><a href="fd_queryfd">个人信息修改</a></li>
	            <li><a href="fdmmUpdate.jsp">密码修改</a></li>
	        </ul>
	        <ul class="nav navbar-nav navbar-right"> 
	            <li><a href="#"><span class="glyphicon glyphicon-user"></span>${sessionScope.username}</a></li> 
	            <li><a href="fdLogin.jsp"><span class="glyphicon glyphicon-log-in"></span>&nbsp;退出</a></li> 
	        </ul>
	    </div>
    </div>
</div>
<div  id="middle">
	<h2 align="center">我的房源</h2>
	<form method="post" id="stuForm" action="#">
	</form>
	<div id="fynr">
		<ul class="content">
		<s:iterator value="#request.list" var="fy">
			<li>
				<div class="tp">
					<a href="queryxx?fy_id=${fy[15] }"><img class="img-rounded" id="img" src=${fy[14] } alt="银城西堤国际六区" /></a>
				</div>
				<div class="fyxx">
					<table class="fytable" width="400px">
						<tr>
							<td colspan="3" class="title"><a href="queryxx?fy_id=${fy[15] }" class="info">${fy[0] }</a></td>
						</tr>
						<tr>
							<td>${fy[6] }</td>
							<td>${fy[8] }室${fy[9] }厅${fy[10] }卫</td>
							<td>${fy[7] }平米</td>
						</tr>
						<tr>
							<td>${fy[4] }</td>
							<td>${fy[12] }楼</td>
							<td>${fy[11] }年</td>
						</tr>
						<tr>
							<td>${fy[5] }</td>
							<td>${fy[13] }</td>
							<td>${fy[2] }</td>
						</tr>
					</table>
				</div>
				<div class="jgsj">
					<font class="jg" color="deeppink">${fy[1] }</font>元/月
					<p class="sj">${fy[3] }发布</p>
					<a href="updatefy?fy_id=${fy[15] }">修改</a>
					<a href="delete?fy_id=${fy[15] }" class="delete">删除</a>
				</div>
			</li>
		</s:iterator>
		<div style="clear:both;"></div>
		</ul>
	</div>
</div>
		<div class="pageline">
			<div id="News-Pagination">
			</div>
		</div>
</body>
</html>