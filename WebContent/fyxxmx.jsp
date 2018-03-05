<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${list[0] }</title>
<link rel="stylesheet" href="css/fyxxxx.css" />
<link rel="stylesheet" href="css/bootstrap.css" />
</head>
<body>
<div id="top" class="page-header">
			<p id="title">${list[0] }</p>
		</div>
		<div id="middle">
			<div id="tp">
				<img id="img" class="img-thumbnail" src="${list[14] }" alt="34323" />
			</div>
			<div id="fyxx">
				<table id="fytable">
					<tr>
						<td class="bigfont">面积：</td>
						<td>${list[7] }平米</td>
						<td class="bigfont">房屋配置：</td>
						<td>${list[8] }室${list[9] }厅${list[10] }卫</td>
					</tr>
					<tr>
						<td class="bigfont">地区：</td>
						<td>${list[4] }</td>
						<td class="bigfont">小区名：</td>
						<td>${list[6] }</td>
					</tr>
					<tr>
						<td class="bigfont">房屋朝向：</td>
						<td>${list[13] }</td>
						<td class="bigfont">发布时间：</td>
						<td>${list[3] }</td>
					</tr>
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
				</table>
			</div>
		</div>
		<div id="detail">
			<hr  />
			<div id="ul">
				<ul class="nav nav-pills">
				  <li class="active"><a href="#">房源详细信息</a></li>
				</ul>
			</div>
			<div id="iframe">
				<p><span class="bigfont">房源配置：</span>${list[15] }</p>
				<p><span class="bigfont">房源描述：</span>${list[16] }</p>
				<p><span class="bigfont">房源图片：</span></p>
				<table>
					<tr>
						<td>
							<div class="imgxx">
								<img id="img" class="img-thumbnail" src="${list[14] }" alt="34323" />
							</div>
						</td>
						<td>
							<div class="imgxx">
								<img id="img" class="img-thumbnail" src="${list[19] }" alt="34323" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="imgxx">
								<img id="img" class="img-thumbnail" src="${list[20] }" alt="34323" />
							</div>
						</td>
						<td>
							<div class="imgxx">
								<img id="img" class="img-thumbnail" src="${list[21] }" alt="34323" />
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<div class="imgxx">
								<img id="img" class="img-thumbnail" src="${list[22] }" alt="34323" />
							</div>
						</td>
						<td>
							<div class="imgxx">
								<img id="img" class="img-thumbnail" src="${list[23] }" alt="34323" />
							</div>
						</td>
					</tr>
				</table>
			</div>
		</div>
</body>
</html>