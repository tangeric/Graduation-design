$(document).ready(function(){
	pwflag=false;
	psflag=false;
	usflag=false;
	rnflag=false;
	pnflag=false;
	$("#ps").blur(function(){
		var val=$(this).val().trim();
		 if(val !=""){
			 $(this).nextAll("span").remove();
			   psflag=true;
		 }else{
			 $(this).after("<span style='color: red;'>密码不能为空</span>");
		 } 
	});
	
	$("#realName").blur(function(){
		var val=$(this).val().trim();
		 if(val !=""){
			 $(this).nextAll("span").remove();
			   rnflag=true;
		 }else{
			 $(this).after("<span style='color: red;'>姓名不能为空</span>");
		 } 
	});
	
	$("#phoneNumber").blur(function(){
		var val=$(this).val().trim();
		 if(val !=""){
			 $(this).nextAll("span").remove();
			   pnflag=true;
		 }else{
			 $(this).after("<span style='color: red;'>电话号码不能为空</span>");
		 } 
	});
	
	$("#username").blur(function(){
		 var val=$(this).val();
		   val=$.trim(val);
		   var $text=$(this);
		   if(val !=""){
			   $text.nextAll("span").remove();
			var url="echeckName";
			var args={"loginName":val,"time":new Date()};
		$.post(url,args,function(data){
				
				if(data=="1"){
					$text.after("<span style='color: green;'>用户名可用</span>");
					usflag=true;
				}else if(data=="0"){
					$text.after("<span style='color: red;'>用户名已被注册</span>");
				}else{
					alert("服务器错误");
				}
			});
		   }else{
			   $text.nextAll("span").remove();
			   $text.after("<span style='color: red;'>用户名不能为空</span>");
			   $(this).val("");
		   }
		
	});
	$("#ps1").blur(function(){
		var a = $(this).val();
		var b= $("#ps").val();
		if(a!=b){
			$(this).nextAll("span").remove();
			$(this).after("<span style='color: red;'>两次输入的密码不一致！</span>");
		}else{
			$(this).nextAll("span").remove();
			pwflag=true;
		}
	});
	$("#submit").click(function(){
		if(usflag==false&&pwflag==false&&psflag==false&&rnflag==false&&pnflag==false){
			return false;
		}else{
			alert("注册成功");
			return true;
		}
		
	});
});