$(document).ready(function(){
	$(".delete").click(function(){
		if(confirm("确定删除该房源?")){
			return true;
		}else{
			return false;
		}
	});
	$(".pass").click(function(){
		if(confirm("确定通过该房源?")){
			return true;
		}else{
			return false;
		}
	});
});
