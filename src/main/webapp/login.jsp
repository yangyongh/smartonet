<!DOCTYPE html>
<html>
<head>
	<title>SmartoNet</title>
	<meta name="keywords" content="污水监控,污水排放,环境监测,水质监测" />
	<meta name="description" content="污水处理监测,污水处理排放达标监测" />
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
	<link href="//cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
	<link href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<link href="//cdn.bootcss.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" rel="stylesheet">
	<link href="//cdn.bootcss.com/bootstrap-social/5.0.0/bootstrap-social.min.css" rel="stylesheet">
	<link href="resources/css/login.css" rel="stylesheet" type="text/css">	

    <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
       <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
       <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body class="body-bg">
	<div class="container-fluid">
		<div class="sidebar col-md-12">			
			<form id="form" class="loginForm" role="form" action="#" method="post">
				<div class="row">
					<div class="col-md-12">
						<h1>SmartoNet Login Form</h1>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
				        <div class="form-group">
				          <div class="col-md-12">		          	
				            <label for="username" class="control-label">Username</label>
				            <div class="login-input-icon-container">
				            	<i class="fa fa-user"></i>
				            	<input type="text" class="form-control required" id="username" placeholder="">
				            </div>		            		            		            
				          </div>              
				        </div>
				        <div class="form-group">
				          <div class="col-md-12">
				            <label for="password" class="control-label">Password</label>
				            <div class="login-input-icon-container">
				            	<i class="fa fa-lock"></i>
				            	<input type="password" class="form-control required" id="password" placeholder="">
				            </div>
				          </div>
				        </div>
				        <div class="form-group">
				          <div class="col-md-12">
				            <div class="checkbox">
				                <label>
				                  <input type="checkbox"> Remember me
				                </label>
				            </div>
				          </div>
				        </div>
				        <div class="form-group">
				          <div class="col-md-12">
				            <input id="loginbtn" type="button" value="LOGIN" class="btn btn-warning">
				          </div>
				        </div>
				        <div class="form-group">
				          	<div class="col-md-12">
				        		<a href="forgotpwd.html" class="text-center">Cannot login?</a>
				       	 	</div>
				    	</div>
					</div>
				</div>				 	
		      </form>		      		      
		</div>
	</div>
</body>

<script src="//cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
<script src="//cdn.bootcss.com/jquery-validate/1.15.0/jquery.validate.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="//cdn.bootcss.com/blueimp-md5/2.3.0/js/md5.min.js"></script>
<script type="text/javascript" src="resources/script/login.js"></script>
<script type="text/javascript">
	$(function(){
		login.init();
	});
</script>
</html>