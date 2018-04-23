<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/fyxxxx.css" />
<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<link rel="stylesheet" href="css/bootstrap-3.3.7-dist/css/bootstrap-theme.css" />
<script type="text/javascript" src="js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="css/bootstrap-3.3.7-dist/js/bootstrap.js" ></script>
<style type="text/css">
			.box{
				width: 500px;
				height: 375px;
				float: left;
				margin-left: 150px;
				border: 5px solid #28A4C9;
			}
		</style>
</head>
<body>
	<div id="top" class="page-header">
			<p id="title">${list[0] }</p>
	</div>
		<div id="middle">
					<div id="myCarousel" class="carousel slide box">
		    <!-- 轮播（Carousel）指标 -->
		    <ol class="carousel-indicators">
		        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		        <li data-target="#myCarousel" data-slide-to="1"></li>
		        <li data-target="#myCarousel" data-slide-to="2"></li>
		        <li data-target="#myCarousel" data-slide-to="3"></li>
		        <li data-target="#myCarousel" data-slide-to="4"></li>
		        <li data-target="#myCarousel" data-slide-to="5"></li>
		    </ol>   
	    	<!-- 轮播（Carousel）项目 -->
		    <div class="carousel-inner">
		        <div class="item active">
		            <img src="${list[14] }" alt="First slide">
		        </div>
		        <div class="item">
		            <img src="${list[19] }" alt="Second slide">
		        </div>
		        <div class="item">
		            <img src="${list[20] }" alt="Third slide">
		        </div>
		        <div class="item">
		            <img src="${list[21] }" alt="forth slide">
		        </div>
		        <div class="item">
		            <img src="${list[22] }" alt="fifth slide">
		        </div>
		        <div class="item">
		            <img src="${list[23] }" alt="sixed slide">
		     </div>
	    </div>
	    <!-- 轮播（Carousel）导航 -->
	    <a class="carousel-control left" href="#myCarousel" 
	       data-slide="prev"> <span _ngcontent-c3="" aria-hidden="true" class="glyphicon glyphicon-chevron-left"></span></a>
	    <a class="carousel-control right" href="#myCarousel" 
	       data-slide="next"><span _ngcontent-c3="" aria-hidden="true" class="glyphicon glyphicon-chevron-right"></span></a>
	</div>
			<div id="fyxx">
				<table id="fytable">
					<tr>
					<td class="bigfont">附近地铁：</td>
					<td>${list[5] }</td>
					<td class="bigfont">联系电话：</td>
					<td>${list[25] }</td>
				</tr>
				<tr>
					<td class="bigfont">付款方式：</td>
					<td>${list[17] }</td>
					<td class="bigfont">租赁方式：</td>
					<td>${list[2] }</td>
				</tr>
				<tr>
					<td class="bigfont">面积：</td>
					<td>${list[7] }平米</td>
					<td class="bigfont">房屋配置：</td>
					<td>${list[8] }室${list[9] }厅${list[10] }卫</td>
				</tr>
				<tr>
					<td class="bigfont">区域：</td>
					<td>${list[18] }</td>
					<td class="bigfont">地名：</td>
					<td>${list[4] }</td>
				</tr>
				<tr>
					<td class="bigfont">小区名：</td>
					<td>${list[6] }</td>
					<td class="bigfont">房屋朝向：</td>
					<td>${list[13] }</td>
				</tr>
				<tr>
					<td class="bigfont">房屋年份：</td>
					<td>${list[11] }</td>
					<td class="bigfont">发布时间：</td>
					<td>${list[3] }</td>
				</tr>
				<tr>
					<td class="bigfont">价格：</td>
					<td colspan="3"><font size="5px" color="deeppink">${list[1] }</font>元/月</td>
				</tr>
				</table>
			</div>
		</div>
		<div id="detail">
			<div id="ul">
				<ul class="nav nav-pills">
				  <li class="active"><a href="#">房源详细信息</a></li>
				</ul>
			</div>
			<div id="iframe">
				<p><span class="bigfont">房源配置：</span>${list[15] }</p>
				<p><span class="bigfont">房源描述：</span>${list[16] }</p>
				<p><span class="bigfont">身份证：</span></p>
				<table>
					<tr>
						<td>
							<div>
								<img id="img" class="img-thumbnail" src="${list[26] }" alt="身份证" />
							</div>
						</td>
					</tr>
				</table>
				<p><span class="bigfont">房产证：</span></p>
				<table>
					<tr>
						<td>
							<div>
								<img id="img" class="img-thumbnail" src="${list[27] }" alt="房产证" />
							</div>
						</td>
					</tr>
				</table>
			</div>
		</div>
</body>
</html>