<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房源信息修改</title>
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
	<h3 align="center">房源信息修改</h3>
		<form class="form-horizontal" action="fyupdate?fy_id=${list[24] }" method="post" enctype="multipart/form-data">
		<s:if test="list[2]=='整租'">33333</s:if>
			<div class="form-group has-feedback" id="form-div1">
				<label class="control-label">租赁方式：</label>
  					<input type="radio" name="zlfs" <s:if test="#request.list[2]=='整租'">checked="checked"</s:if>  value="整租"> 整租
				  &nbsp;&nbsp;  <input type="radio" name="zlfs"  <s:if test="#request.list[2]=='单间'">checked="checked"</s:if> value="单间"> 单间
				  <br />
				<label class="control-label">房源配置：</label>
					<input type="checkbox" name="fypz" <s:if test="#request.washer=='11'">checked="checked"</s:if> value="洗衣机"> &nbsp;洗衣机 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" <s:if test="#request.ac=='11'">checked="checked"</s:if> value="空调"> &nbsp;空调 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" <s:if test="#request.tv=='11'">checked="checked"</s:if> value="电视"> &nbsp;电视 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" <s:if test="#request.bed=='11'">checked="checked"</s:if> value="床"> &nbsp;床&nbsp;&nbsp;
					<input type="checkbox" name="fypz" <s:if test="#request.wifi=='11'">checked="checked"</s:if> value="Wifi"> &nbsp;Wifi &nbsp;&nbsp;
					<input type="checkbox" name="fypz" <s:if test="#request.kic=='11'">checked="checked"</s:if> value="厨房"> &nbsp; 厨房 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" <s:if test="#request.fridge=='11'">checked="checked"</s:if> value="冰箱"> &nbsp; 冰箱 &nbsp;&nbsp;
					<input type="checkbox" name="fypz" <s:if test="#request.balcony=='11'">checked="checked"</s:if> value="阳台"> &nbsp; 阳台  &nbsp;&nbsp;
					<br /><br />
					<table>
						<tr>
							<td><label class="control-label">房源所在区：</label></td>
							<td><select name="district" class="form-control width">
							    	<option <s:if test="#request.list[18]=='鼓楼'">selected="selected"</s:if> value="鼓楼">鼓楼</option>
									<option <s:if test="#request.list[18]=='玄武'">selected="selected"</s:if> value="玄武">玄武</option>
									<option <s:if test="#request.list[18]=='栖霞'">selected="selected"</s:if> value="栖霞">栖霞</option>
									<option <s:if test="#request.list[18]=='下关'">selected="selected"</s:if> value="下关">下关</option>
									<option <s:if test="#request.list[18]=='建邺'">selected="selected"</s:if> value="建邺">建邺</option>
									<option <s:if test="#request.list[18]=='秦淮'">selected="selected"</s:if> value="秦淮">秦淮</option>
									<option <s:if test="#request.list[18]=='雨花台'">selected="selected"</s:if> value="雨花台">雨花台</option>
									<option <s:if test="#request.list[18]=='江宁'">selected="selected"</s:if> value="江宁">江宁</option>
									<option <s:if test="#request.list[18]=='浦口'">selected="selected"</s:if> value="浦口">浦口</option>
									<option <s:if test="#request.list[18]=='六合'">selected="selected"</s:if> value="六合">六合</option>
									<option <s:if test="#request.list[18]=='高淳'">selected="selected"</s:if> value="高淳">高淳</option>
									<option <s:if test="#request.list[18]=='溧水'">selected="selected"</s:if> value="溧水">溧水</option>
								</select>
							</td>
						</tr>
					</table>
					<br>
					<table>
						<tr>
							<td><label class="control-label">房源所在地地名：</label></td>
							<td><input name="position" type="text" class="form-control width" value="${list[4] }">
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">房源信息：</label></td>
							<td>
								<select name="room" class="form-control">
							    	<option <s:if test="#request.list[8]==\"1\"">selected="selected"</s:if> value="1">1</option>
									<option <s:if test="#request.list[8]==\"2\"">selected="selected"</s:if> value="2">2</option>
									<option <s:if test="#request.list[8]==\"3\"">selected="selected"</s:if> value="3">3</option>
									<option <s:if test="#request.list[8]==\"4\"">selected="selected"</s:if> value="4">4</option>
									<option <s:if test="#request.list[8]==\"5\"">selected="selected"</s:if> value="5">5</option>
									<option <s:if test="#request.list[8]==\"6\"">selected="selected"</s:if> value="6">6</option>
									<option <s:if test="#request.list[8]==\"7\"">selected="selected"</s:if> value="7">7</option>
									<option <s:if test="#request.list[8]==\"8\"">selected="selected"</s:if> value="8">8</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;室&nbsp;&nbsp;</td>
							<td>
								<select name="dinner" class="form-control">
							    	<option value="1" <s:if test="#request.list[9]==\"1\"">selected="selected"</s:if>>1</option>
									<option value="2" <s:if test="#request.list[9]==\"2\"">selected="selected"</s:if>>2</option>
									<option value="3" <s:if test="#request.list[9]==\"3\"">selected="selected"</s:if>>3</option>
									<option value="4" <s:if test="#request.list[9]==\"4\"">selected="selected"</s:if>>4</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;厅&nbsp;&nbsp;</td>
							<td>
								<select name="toliet" class="form-control">
							    	<option value="1" <s:if test="#request.list[10]==\"1\"">selected="selected"</s:if>>1</option>
									<option value="2" <s:if test="#request.list[10]==\"2\"">selected="selected"</s:if>>2</option>
									<option value="3" <s:if test="#request.list[10]==\"3\"">selected="selected"</s:if>>3</option>
									<option value="4" <s:if test="#request.list[10]==\"4\"">selected="selected"</s:if>>4</option>
								</select>
							</td>
							<td>&nbsp;&nbsp;卫&nbsp;&nbsp;</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">房源楼层：</label></td>
							<td><input name="floor" type="text" class="form-control width" value="${list[12] }"></td>
							<td>&nbsp;&nbsp;楼</td>
							<td><label class="control-label">&nbsp;&nbsp;&nbsp;&nbsp;房源面积：</label></td>
							<td><input name="area" type="text" class="form-control width" value="${list[7] }"></td>
							<td>&nbsp;&nbsp;平方米</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">房源朝向：</label></td>
							<td><select name="direction" class="form-control width">
							    	<option value="南" <s:if test="#request.list[13]=='南'">selected="selected"</s:if>>南</option>
									<option value="北" <s:if test="#request.list[13]=='北'">selected="selected"</s:if>>北</option>
									<option value="东" <s:if test="#request.list[13]=='东'">selected="selected"</s:if>>东</option>
									<option value="西" <s:if test="#request.list[13]=='西'">selected="selected"</s:if>>西</option>
								</select>
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">附近地铁线：</label></td>
							<td><select name="metro" class="form-control width">
							    	<option <s:if test="#request.list[5]=='一号线'">selected="selected"</s:if> value="一号线">一号线</option>
									<option <s:if test="#request.list[5]=='二号线'">selected="selected"</s:if> value="二号线">二号线</option>
									<option <s:if test="#request.list[5]=='三号线'">selected="selected"</s:if> value="三号线">三号线</option>
									<option <s:if test="#request.list[5]=='四号线'">selected="selected"</s:if> value="四号线">四号线</option>
									<option <s:if test="#request.list[5]=='十号线'">selected="selected"</s:if> value="十号线">十号线</option>
									<option <s:if test="#request.list[5]=='S1号线'">selected="selected"</s:if> value="S1号线">S1号线</option>
									<option <s:if test="#request.list[5]=='S3号线'">selected="selected"</s:if> value="S3号线">S3号线</option>
									<option <s:if test="#request.list[5]=='S8号线'">selected="selected"</s:if> value="S8号线">S8号线</option>
									<option <s:if test="#request.list[5]=='S9号线'">selected="selected"</s:if> value="S9号线">S9号线</option>
								</select>
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">付款方式：</label></td>
							<td><select name="paymethod" class="form-control width">
							    	<option <s:if test="#request.list[17]=='押一付一'">selected="selected"</s:if> value="押一付一">押一付一</option>
									<option <s:if test="#request.list[17]=='押一付二'">selected="selected"</s:if> value="押一付二">押一付二</option>
									<option <s:if test="#request.list[17]=='押一付三'">selected="selected"</s:if> value="押一付三">押一付三</option>
									<option <s:if test="#request.list[17]=='押一付四'">selected="selected"</s:if> value="押一付四">押一付四</option>
									<option <s:if test="#request.list[17]=='押一付五'">selected="selected"</s:if> value="押一付五">押一付五</option>
									<option <s:if test="#request.list[17]=='押一付六'">selected="selected"</s:if> value="押一付六">押一付六</option>
									<option <s:if test="#request.list[17]=='押一付十二'">selected="selected"</s:if> value="押一付十二">押一付十二</option>
								</select>
							</td>
						</tr>
					</table>
					<br />
					<table>
						<tr>
							<td><label class="control-label">价格：</label></td>
							<td><input name="price" type="text" class="form-control width" value="${list[1] }"></td>
							<td>&nbsp;&nbsp;元/月</td>
						</tr>
					</table>
			</div>
			<div class="row" id="form-div2">  
			    <div class='col-sm-6'>  
			        <div class="form-group">
			        	<table>
			        		<tr>
			        			<td><label>房源年份：</label></td>
			        			<td>
			        				<div class='input-group date' id='datetimepicker1'>  
						                <input type='text' name="year" class="form-control" value="${list[11] }"/>  
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
						<td><input type="file" name="fczpic" id="fileupload"></td>
						<td>&nbsp;&nbsp;&nbsp;<img src="${list[26] }" id="imageview" class="img-rounded tpimg"></td>
					</tr>
				</table>
				<br />
				<table>
					<tr>
						<td><label>房源图片1：</label></td>
						<td><input type="file" name="fypic1" id="fileupload1"></td>
						<td>&nbsp;&nbsp;&nbsp;<img src="${list[14] }" id="imageview1" class="img-rounded tpimg"></td>
					</tr>
				</table>
				<br>
				 <table>
					<tr>
						<td><label>房源图片2：</label></td>
						<td><input type="file" name="fypic2"  id="fileupload2"></td>
						<td>&nbsp;&nbsp;&nbsp;<img src="${list[19] }" id="imageview2" class="img-rounded tpimg"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片3：</label></td>
						<td><input type="file" name="fypic3"  id="fileupload3"></td>
						<td>&nbsp;&nbsp;&nbsp;<img src="${list[20] }" id="imageview3" class="img-rounded tpimg imageview"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片4：</label></td>
						<td><input type="file" name="fypic4"  id="fileupload4"></td>
						<td>&nbsp;&nbsp;&nbsp;<img src="${list[21] }" id="imageview4" class="img-rounded tpimg imageview"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片5：</label></td>
						<td><input type="file" name="fypic5"  id="fileupload5"></td>
						<td>&nbsp;&nbsp;&nbsp;<img src="${list[22] }" id="imageview5" class="img-rounded tpimg imageview"></td>
					</tr>
				</table>
				<br>
			   <table>
					<tr>
						<td><label>房源图片6：</label></td>
						<td><input type="file" name="fypic6"  id="fileupload6"></td>
						<td>&nbsp;&nbsp;&nbsp;<img src="${list[23] }" id="imageview6" class="img-rounded tpimg imageview"></td>
					</tr>
				</table>
			</div>
			<div class="form-group has-feedback" id="form-div4">
			   <label class="control-label">房源标题：</label>
			   <input type="text" class="form-control"  name="title" id="username" value="${list[0] }"/>
			   <label>小区名：</label>
			  <input type="text" class="form-control" name="village" id="username" value="${list[6] }"/>
			  <label>房源描述：</label>
			  <textarea class="form-control" name="notice" rows="5">${list[16] }</textarea>   
			</div>
			<br />
			<div class="form-group has-feedback" id="form-div">
			    <button type="submit" class="btn btn-info button" id="login">上传房源</button>
			</div>
		</form>
</body>
</html>