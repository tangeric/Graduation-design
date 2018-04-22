$(function () {  
    $('#datetimepicker1').datetimepicker({
    	format: 'yyyy', 
        weekStart: 1,  
        autoclose: true,  
        startView: 4,  
        minView: 4,  
        forceParse: false, 
        locale: moment.locale('zh-CN') 
        
    }); 
    $("#fileupload").change(function() {  
        var $file = $(this);  
        var objUrl = $file[0].files[0];  
        //获得一个http格式的url路径:mozilla(firefox)||webkit or chrome  
        var windowURL = window.URL || window.webkitURL;  
        //createObjectURL创建一个指向该参数对象(图片)的URL  
        var dataURL;  
        dataURL = windowURL.createObjectURL(objUrl);  
        $("#imageview").attr("src",dataURL);  
    });
    $("#fileupload1").change(function() {  
        var $file = $(this);  
        var objUrl = $file[0].files[0];  
        //获得一个http格式的url路径:mozilla(firefox)||webkit or chrome  
        var windowURL = window.URL || window.webkitURL;  
        //createObjectURL创建一个指向该参数对象(图片)的URL  
        var dataURL;  
        dataURL = windowURL.createObjectURL(objUrl);  
        $("#imageview1").attr("src",dataURL);  
    });
    $("#fileupload2").change(function() {  
        var $file = $(this);  
        var objUrl = $file[0].files[0];  
        //获得一个http格式的url路径:mozilla(firefox)||webkit or chrome  
        var windowURL = window.URL || window.webkitURL;  
        //createObjectURL创建一个指向该参数对象(图片)的URL  
        var dataURL;  
        dataURL = windowURL.createObjectURL(objUrl);  
        $("#imageview2").attr("src",dataURL);  
    });
    $("#fileupload3").change(function() {  
        var $file = $(this);  
        var objUrl = $file[0].files[0];  
        //获得一个http格式的url路径:mozilla(firefox)||webkit or chrome  
        var windowURL = window.URL || window.webkitURL;  
        //createObjectURL创建一个指向该参数对象(图片)的URL  
        var dataURL;  
        dataURL = windowURL.createObjectURL(objUrl);  
        $("#imageview3").attr("src",dataURL);  
    });
    $("#fileupload4").change(function() {  
        var $file = $(this);  
        var objUrl = $file[0].files[0];  
        //获得一个http格式的url路径:mozilla(firefox)||webkit or chrome  
        var windowURL = window.URL || window.webkitURL;  
        //createObjectURL创建一个指向该参数对象(图片)的URL  
        var dataURL;  
        dataURL = windowURL.createObjectURL(objUrl);  
        $("#imageview4").attr("src",dataURL);  
    });
    $("#fileupload5").change(function() {  
        var $file = $(this);  
        var objUrl = $file[0].files[0];  
        //获得一个http格式的url路径:mozilla(firefox)||webkit or chrome  
        var windowURL = window.URL || window.webkitURL;  
        //createObjectURL创建一个指向该参数对象(图片)的URL  
        var dataURL;  
        dataURL = windowURL.createObjectURL(objUrl);  
        $("#imageview5").attr("src",dataURL);  
    });
    $("#fileupload6").change(function() {  
        var $file = $(this);  
        var objUrl = $file[0].files[0];  
        //获得一个http格式的url路径:mozilla(firefox)||webkit or chrome  
        var windowURL = window.URL || window.webkitURL;  
        //createObjectURL创建一个指向该参数对象(图片)的URL  
        var dataURL;  
        dataURL = windowURL.createObjectURL(objUrl);  
        $("#imageview6").attr("src",dataURL);  
    });
    $("#login").click(function(){
    	 var count = 0;
    	    var checkArry = document.getElementsByName("fypz");
    	            for (var i = 0; i < checkArry.length; i++) { 
    	                if(checkArry[i].checked == true){
    	                    //选中的操作
    	                    count++; 
    	                }
    	            }
    	    if( count == 0 ){
    	        alert("至少选择一个房源配置");
    	        return false;
    	    }
    	 if($("#place").val()==""){
    		 alert("请填写房源所在地名！！");
 	        return false;
    	 }
    	 if($("#floor").val()==""){
    		 alert("请填写楼层！！");
 	        return false;
    	 }
    	 if($("#price").val()==""){
    		 alert("请填写楼层！！");
 	        return false;
    	 }
    	 if($(".fczpic").val()==""){
    		 alert("请上传房产证照片！！");
 	        return false;
    	 }
    	 if($(".fypic").val()==""){
    		 alert("请上传房源照片！！");
 	        return false;
    	 }
    	 if($("#title").val()==""){
    		 alert("请输入标题！！");
 	        return false;
    	 }
    	 if($("#village").val()==""){
    		 alert("请输入小区名称！！");
 	        return false;
    	 }
    	 if($("#notice").val()==""){
    		 alert("请输入内容！！");
 	        return false;
    	 }
    });
});  