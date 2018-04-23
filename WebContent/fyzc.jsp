<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<link rel="stylesheet" href="css/bootstrap-datetimepicker.css" />
<script type="text/javascript" src="js/bootstrap-datetimepicker.js" ></script>
<script type="text/javascript" src="js/moment-with-locales.js" ></script>
<script type="text/javascript" src="js/bootstrap.js" ></script>
<script type="text/javascript" src="js/fyzc.js" ></script>
<link rel="stylesheet" href="css/fyzc.css" />
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
	            <li class="active"><a href="#">房源上传</a></li>
	            <li><a href="fd_queryfd">个人信息修改</a></li>
	            <li><a href="fdmmUpdate.jsp">密码修改</a></li>
	        </ul>
	    </div>
    </div>
</div>
	<h3 align="center">房源信息注册</h3>
		<form class="form-horizontal" action="save" method="post" enctype="multipart/form-data">
			<div class="form-group has-feedback" id="form-div1">
				<label class="control-label">租赁方式：</label>
  					<input type="radio" name="zlfs"  value="整租"> 整租
				  &nbsp;&nbsp;  <input type="radio" name="zlfs"  value="单间"> 单间
				  <br />
				<label class="control-label">房源配置：</label>
					<input type="checkbox" name="fypz" value="洗衣机"> &nbsp;洗衣机 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" value="空调"> &nbsp;空调 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" value="电视"> &nbsp;电视 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" value="床"> &nbsp;床&nbsp;&nbsp;
					<input type="checkbox" name="fypz" value="Wifi"> &nbsp;Wifi &nbsp;&nbsp;
					<input type="checkbox" name="fypz" value="厨房"> &nbsp; 厨房 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" value="冰箱"> &nbsp; 冰箱 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" value="阳台"> &nbsp; 阳台  &nbsp;&nbsp;
					<br /><br />
					<table>
						<tr>
							<td><label class="control-label">房源所在区：</label></td>
							<td><select name="district" class="form-control width">
							    	<option value="鼓楼">鼓楼</option>
									<option value="玄武">玄武</option>
									<option value="栖霞">栖霞</option>
									<option value="下关">下关</option>
									<option value="建邺">建邺</option>
									<option value="秦淮">秦淮</option>
									<option value="雨花台">雨花台</option>
									<option value="江宁">江宁</option>
									<option value="浦口">浦口</option>
									<option value="六合">六合</option>
									<option value="高淳">高淳</option>
									<option value="溧水">溧水</option>
								</select>
							</td>
						</tr>
					</table>
					<br>
					<table>
						<tr>
							<td><label class="control-label">房源所在地地名：</label></td>
							<td><input name="position" id="place" type="text" class="form-control width">
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">房源信息：</label></td>
							<td>
								<select name="room" class="form-control">
							    	<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
									<option value="5">5</option>
									<option value="6">6</option>
									<option value="7">7</option>
									<option value="8">8</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;室&nbsp;&nbsp;</td>
							<td>
								<select name="dinner" class="form-control">
							    	<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;厅&nbsp;&nbsp;</td>
							<td>
								<select name="toliet" class="form-control">
							    	<option value="1">1</option>
									<option value="2">2</option>
									<option value="3">3</option>
									<option value="4">4</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;卫&nbsp;&nbsp;</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">房源楼层：</label></td>
							<td><input name="floor" type="text" id="floor" class="form-control width"></td>
							<td>&nbsp;&nbsp;楼</td>
							<td><label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;房源面积：</label></td>
							<td><input name="area" type="text" id="area" class="form-control width"></td>
							<td>&nbsp;&nbsp;平方米</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">房源朝向：</label></td>
							<td><select name="direction" class="form-control width">
							    	<option value="南">南</option>
									<option value="北">北</option>
									<option value="东">东</option>
									<option value="西">西</option>
								</select>
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">附近地铁线：</label></td>
							<td><select name="metro" class="form-control width">
							    	<option value="一号线">一号线</option>
									<option value="二号线">二号线</option>
									<option value="三号线">三号线</option>
									<option value="四号线">四号线</option>
									<option value="十号线">十号线</option>
									<option value="S1号线">S1号线</option>
									<option value="S3号线">S3号线</option>
									<option value="S8号线">S8号线</option>
									<option value="S9号线">S9号线</option>
								</select>
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">付款方式：</label></td>
							<td><select name="paymethod" class="form-control width">
							    	<option value="押一付一">押一付一</option>
									<option value="押一付二">押一付二</option>
									<option value="押一付三">押一付三</option>
									<option value="押一付四">押一付四</option>
									<option value="押一付五">押一付五</option>
									<option value="押一付六">押一付六</option>
									<option value="押一付十二">押一付十二</option>
								</select>
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">价格：</label></td>
							<td><input name="price" type="text" id="price" class="form-control width"></td>
							<td>&nbsp;&nbsp;元/月</td>
						</tr>
					</table>
			</div>
			<div class="row" id="form-div2">  
			    <div class='col-sm-6'>  
			        <div class="form-group">
			        	<table>
			        		<tr>
			        			<td><label>房源建造年份：</label></td>
			        			<td>
			        				<div class='input-group date' id='datetimepicker1'>  
						                <input type='text' name="year" class="form-control"/>  
						                <span class="input-group-addon">  
						                    <span class="glyphicon glyphicon-calendar"></span>  
						                </span>  
			            			</div>
			        			</td>
			        			<td>&nbsp;&nbsp;年</td>
			        		</tr>
			        	</table>  
			        </div>  
				</div>
			</div>
			<div class="form-group has-feedback" id="form-div3">
				<table>
					<tr>
						<td><label>房产证照片：</label></td>
						<td><input type="file" name="fczpic" class="fczpic"></td>
					</tr>
				</table>
				<br />
				<table>
					<tr>
						<td><label>房源图片1：</label></td>
						<td><input type="file" name="fypic" class="fypic"></td>
					</tr>
				</table>
				<br>
				 <table>
					<tr>
						<td><label>房源图片2：</label></td>
						<td><input type="file" name="fypic" class="fypic"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片3：</label></td>
						<td><input type="file" name="fypic" class="fypic"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片4：</label></td>
						<td><input type="file" name="fypic" class="fypic"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片5：</label></td>
						<td><input type="file" name="fypic" class="fypic"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片6：</label></td>
						<td><input type="file" name="fypic" class="fypic"></td>
					</tr>
				</table>
			</div>
			<div class="form-group has-feedback" id="form-div4">
			   <label class="control-label">房源标题：</label>
			   <input type="text" class="form-control"  name="title" id="title" />
			   <label>小区名：</label>
			  <input type="text" class="form-control" name="village" id="village" />
			  <label>房源描述：</label>
			  <textarea class="form-control" name="notice" id="notice" rows="5"></textarea>   
			</div>
			<br />
			<div class="form-group has-feedback" id="form-div">
			    <button type="submit" class="btn btn-info button" id="login">上传房源</button>
			</div>
		</form>
</body>
</html>