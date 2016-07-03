//登录交互逻辑JS代码
var login = {
	init : function(){
	   // 国际化，获取当前浏览器设置语言  
	   //TODO
	   
		//验证用户名和密码不能为空	
		$('#form').validate({
            errorElement : 'span',  	
            errorClass : 'help-block',  
            focusInvalid : false,  
            rules : {  
                username : {  
                    required : true  
                },  
                password : {  
                    required : true  
                }
            },  
            messages : {  
            	username : {  
                    required : "Username is required."  
                },  
                password : {  
                    required : "Password is required."  
                }  
            }
        });  
        
	   //绑定login按钮点击事件
	   $("#loginbtn").click(function(){
		   //加密输入密码
		   var pwd = $('#password').val();
		   var params = {
				   name : $('username').val(),
				   password : md5(pwd)
		   };
		   //验证密码和用户名是否已经输入
		   $.post("login",params,function(result){
			   	console.debug(result);
		   });
	   });
   }
};