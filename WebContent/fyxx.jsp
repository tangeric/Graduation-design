<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
<title>房地产租赁信息系统</title>

<link rel="stylesheet" href="css/bootstrap.css" />
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
	$("#stuForm").attr("action","queryfyxx?pageNum="+(new_page_index+1));
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
	            <li class="active"><a href="#">房源查询</a></li>
	            <li><a href="fdLogin.jsp">房东登录</a></li>
	            <li><a href="adminLogin.jsp">管理员登录</a></li>
	            <li><a href="fdregister.jsp">成为房东</a></li>
	        </ul>
	    </div>
    </div>
</div>
		<div id="middle">
			<h2 align="center">房地产租赁信息系统</h2>
			<div id="search">
				<form method="post" id="stuForm" action="#">
					<table id="searchtable">
						<tr>
							<td>&nbsp;&nbsp;按区域搜索：&nbsp;&nbsp;</td>
							<td>
								<select name="district" class="form-control" id="dis">
									<option value=""></option>
							    	<option <s:if test="#request.district=='鼓楼'">selected="selected"</s:if> value="鼓楼">鼓楼</option>
									<option <s:if test="#request.district=='玄武'">selected="selected"</s:if> value="玄武">玄武</option>
									<option <s:if test="#request.district=='栖霞'">selected="selected"</s:if> value="栖霞">栖霞</option>
									<option <s:if test="#request.district=='下关'">selected="selected"</s:if> value="下关">下关</option>
									<option <s:if test="#request.district=='建邺'">selected="selected"</s:if> value="建邺">建邺</option>
									<option <s:if test="#request.district=='秦淮'">selected="selected"</s:if> value="秦淮">秦淮</option>
									<option <s:if test="#request.district=='雨花台'">selected="selected"</s:if> value="雨花台">雨花台</option>
									<option <s:if test="#request.district=='江宁'">selected="selected"</s:if> value="江宁">江宁</option>
									<option <s:if test="#request.district=='浦口'">selected="selected"</s:if> value="浦口">浦口</option>
									<option <s:if test="#request.district=='六合'">selected="selected"</s:if> value="六合">六合</option>
									<option <s:if test="#request.district=='高淳'">selected="selected"</s:if> value="高淳">高淳</option>
									<option <s:if test="#request.district=='溧水'">selected="selected"</s:if> value="溧水">溧水</option>
						    	</select>
							</td>
							<td>&nbsp;&nbsp;按价格搜索：&nbsp;&nbsp;</td>
							<td><label class="control-label">房源信息：</label></td>
							<td>
								<select name="room" id="room" class="form-control">
									<option  value=""></option>
							    	<option <s:if test="#request.room==\"1\"">selected="selected"</s:if> value="1">1</option>
									<option <s:if test="#request.room==\"2\"">selected="selected"</s:if> value="2">2</option>
									<option <s:if test="#request.room==\"3\"">selected="selected"</s:if> value="3">3</option>
									<option <s:if test="#request.room==\"4\"">selected="selected"</s:if> value="4">4</option>
									<option <s:if test="#request.room==\"5\"">selected="selected"</s:if> value="5">5</option>
									<option <s:if test="#request.room==\"6\"">selected="selected"</s:if> value="6">6</option>
									<option <s:if test="#request.room==\"7\"">selected="selected"</s:if> value="7">7</option>
									<option <s:if test="#request.room==\"8\"">selected="selected"</s:if> value="8">8</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;室&nbsp;&nbsp;</td>
							<td>
								<select name="dinner" id="dinner" class="form-control">
									<option value=""></option>
							    	<option value="1" <s:if test="#request.dinner==\"1\"">selected="selected"</s:if>>1</option>
									<option value="2" <s:if test="#request.dinner==\"2\"">selected="selected"</s:if>>2</option>
									<option value="3" <s:if test="#request.dinner==\"3\"">selected="selected"</s:if>>3</option>
									<option value="4" <s:if test="#request.dinner==\"4\"">selected="selected"</s:if>>4</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;厅&nbsp;&nbsp;</td>
							<td>
								<select name="toliet" id="toliet" class="form-control">
									<option value=""></option>
							    	<option value="1" <s:if test="#request.toliet==\"1\"">selected="selected"</s:if>>1</option>
									<option value="2" <s:if test="#request.toliet==\"2\"">selected="selected"</s:if>>2</option>
									<option value="3" <s:if test="#request.toliet==\"3\"">selected="selected"</s:if>>3</option>
									<option value="4" <s:if test="#request.toliet==\"4\"">selected="selected"</s:if>>4</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;卫&nbsp;&nbsp;</td>
					    	<td>&nbsp;&nbsp;<input type="submit" class="btn btn-default" value="确定"></td>
						</tr>
					</table>
				</form>
			</div>
			<div id="fynr">
				<ul>
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