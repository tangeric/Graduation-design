$(document).ready(function(){
	psflag=false;
	pwflag=false;
	usflag=false;
	$("#oldpw").blur(function(){
		 var val=$(this).val();
		   val=$.trim(val);
		   var $text=$(this);
		   if(val !=""){
			   $text.nextAll("span").remove();
			var url="fd_checkpw";
			var args={"password":val,"time":new Date()};
		$.post(url,args,function(data){
				
				if(data=="1"){
					$text.after("<span style='color: red;'>密码错误</span>");
					usflag=true;
				}else if(data=="0"){
					$text.after("<span style='color: green;'>密码正确</span>");
				}else{
					alert("服务器错误");
				}
			});
		   }else{
			   $text.after("<span style='color: red;'>密码不能为空</span>");
			   $(this).val("");
		   }	
	});
	
	$("ps").blur(function(){
		var val=$(this).val().trim();
		 if(val !=""){
			   $text.nextAll("span").remove();
			   psflag=true;
		 }else{
			 $text.after("<span style='color: red;'>密码不能为空</span>");
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
		if(usflag==false&&pwflag==false&&psflag==false){
			return false;
		}else{
			alert("修改成功");
			return true;
		}
	});
});