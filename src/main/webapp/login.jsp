<%@ page language="java"  pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/login.css">
	<style>

	</style>
  </head>
  <body>
  	
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <div><a class="navbar-brand" href="index.html" style="font-size:32px;">平台</a></div>
        </div>
      </div>
    </nav>

    <div class="container">
		
      <form class="form-signin" role="form" id="form1" action="login" method="post">
        <h2 class="form-signin-heading"><i class="glyphicon glyphicon-user"></i>${message } 用户登录</h2>
		  <div class="form-group has-success has-feedback">
			<input type="text" class="form-control" id="uname" name="uname" placeholder="请输入登录账号" autofocus>
			<span class="glyphicon glyphicon-user form-control-feedback"></span>
		  </div>
		  <div class="form-group has-success has-feedback">
			<input type="text" class="form-control" id="upwd" name="upwd" placeholder="请输入登录密码" style="margin-top:10px;">
			<span class="glyphicon glyphicon-lock form-control-feedback"></span>
		  </div>
		  
        <a class="btn btn-lg btn-success btn-block" onclick="dologin()" > 登录</a>
          <a class="btn btn-lg btn-success btn-block" onclick="doReg()" > 注册</a>
      </form>
    </div>
    <script src="jquery/jquery-2.1.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="layer/layer.js"></script>
    <script>
        function doReg() {
            window.location.href='${APPPATH }/patient/reg.jsp';
        }
    function dologin() {
        //window.location.href = "main.html";
        //先判断用户名密码不为空
        //先从表单获得控件的值，判断值是否为null，表单提交数据，如果没有填写，则为空串""
        var unameVal = $("#uname").val();
        if(unameVal==""){
        	layer.msg("用户名不能为空!", {time:1000, icon:0, shift:5}, function(){});
        	return;
        }
        var upwdVal = $("#upwd").val();
        if(upwdVal==""){
        	layer.msg("密码不能为空!", {time:1000, icon:0, shift:5}, function(){});
        	return;
        }
        
        
        //表单提交submit()
        //$("#form1").submit();
        //使用Ajax操作
        $.ajax({
        	url:"loginAjax",
        	type:"post",
        	data:{"uname":$("#uname").val(),"upwd":$("#upwd").val()},
        	success:function(result){
        		if(result.flag){
        			window.location.href="main";  //在这里就不要直接跳转到jsp页面，先跳转到Controller
        		}else{
        			layer.msg("用户名密码错误!", {time:1000, icon:0, shift:5}, function(){});
        		}
        	}
        });
    }
    </script>
  </body>
</html>