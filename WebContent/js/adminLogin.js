$(document).ready(function(){
		flagus=false;
		flagps=false;
		$("#username").focusout(function(){
					var username=$("#username").val().trim();
					if(username==""){
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: red;'>用户名不能为空</span>");
					}else if(username.length<3){
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: red;'>用户名长度不得小于3</span>");
					}else if(username.length>10){
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: red;'>用户名长度不得大于10</span>");
					}else{
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: green;'>用户名可用</span>");
						flagus=true;
					}
				});
				$("#ps").focusout(function(){
					var passcode=$("#ps").val().trim();
					if(passcode==""){
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: red;'>密码不能为空</span>");
					}else if(passcode.length<6){
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: red;'>密码不能小于6位</span>");
					}else if(passcode.length>12){
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: red;'>密码不能大于12位</span>");
					}else{
						$(this).nextAll("span").remove();
						$(this).after("<span style='color: green;'>密码可用</span>");
						flagps=true;
					}
				});
				$("#login").click(function(){
					if(flagus=true&&flagps==true){
						return true;
					}else{
						return false;
					}
				});
				a=$("#error").val();
				if(a=="error"){
					alert("用户名或密码错误！");
				}
});