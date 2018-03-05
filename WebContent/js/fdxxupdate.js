	var usflag=false;
	var rnflag=false;
	var pnflag=false;

$(document).ready(function(){

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
		var val=$(this).val().trim();
		 if(val !=""){
			 $(this).nextAll("span").remove();
			   usflag=true;
		 }else{
			 $(this).after("<span style='color: red;'>用户名不能为空</span>");
		 }
	});
	$("#submit").click(function(){
		if($("#realName").val().trim()==""||$("#phoneNumber").val().trim()==""||$("#username").val().trim()==""){
			return false;
		}else{
			alert("修改成功");
			return true;
		}
	});
});
