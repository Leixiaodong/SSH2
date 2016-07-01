<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="/SSH5/css/head.css" type="text/css"></link>
<link rel="stylesheet" href="/SSH5/css/index.css" type="text/css"></link>
<link rel="stylesheet" href="/SSH5/css/foot.css" type="text/css"></link>
<link rel="stylesheet" href="/SSH5/css/common.css" type="text/css"></link>
     <SCRIPT type="text/JavaScript">
        function validate(){
            var usernameValue=document.getElementById("id").value;
            var passwordValue=document.getElementById("password").value;
            var repasswordValue=document.getElementById("repassword").value;
            if(usernameValue.length==0){
                alert("账号不能为空!");
                return false;
            }else if(usernameValue.length<0 || usernameValue.length>3){
                alert("账号在0到3之间!");
                return false;
            }else if(passwordValue!=passwordValue ){
            	alert("俩次密码不相同!");
                return false;
                }
            return true;
        }
    </SCRIPT>
  </head>
  
  <body>
<div class="top">
         <div class="title w">
		<h2 class="w">科研信息发布平台</h2>
		<span class="font6">欢迎注册</span>
		</div>
	</div>
  
  <center>
   <div>
				<div>
					<dl>
						<dt class="font7">
							新用户注册
						</dt>
						<dd class="font8">
							填写个人信息
						</dd>
					
						
					</dl>
				<center><p class="font9">${message}</p></center>
				
						<form action="regis" method="post"  >
  <table class="reg_table1" border="1">
						 <tr> <td width="180" align="right"> 姓         名：</td><td width="280"><input type="text" name="username"></td></tr>        
                         <tr> <td align="right"> 密         码：</td><td><input type="password" name="password"><br></td></tr>
                      	 <tr> <td align="right"> 确认密码：</td><td><input type="password" name="password2"><br></td></tr>
                      	 <tr> <td align="right"> 性         别：</td><td>
                      	 <input type="radio" name="gender" value="男" checked="checked"/>男<input type="radio" name="gender" value="女" />女
                      	 
                      	 <br></td></tr>
<%--                      	 <tr> <td align="right"> 职         称：</td><td><input type="text" name="teacher.zhicheng"><br></td></tr>      --%>
<%--                      	 <tr> <td align="right"> 部         门：</td><td><input type="text" name="teacher.department"><br></td></tr> --%>
                      	 <tr> <td align="right"> 邮         箱：</td><td><input type="text" name="email"><br></td></tr>
    	                 <tr align="right"> <td><input type="submit"  value="注册"/></td><td align="left"><input type="reset" value="重置"/></td></tr>
							
				  </table>
</form>
				</div>
				</div>
     </center>
     <div class="foot">
          <span>北京创新信息公司 @ 2008</span>
          <ul class="navi2">
              <li><a class="font" href="#">关于</a>  |&nbsp;&nbsp;</li>
              <li><a class="font" href="#">开放平台</a>  |&nbsp;&nbsp;</li>
              <li><a class="font" href="#">客服</a>  |&nbsp;&nbsp;</li>
              <li><a class="font" href="#">帮助</a>  |&nbsp;&nbsp;</li>
              <li><a class="font" href="#">隐私申明</a></li>            
          </ul>
      
     <div style="clear:right;">
          <img src="/SSH5/images/foot/biaoshi.gif" style="height:50px;width:50px; float:left;"></img>
          <img src="/SSH5/images/foot/gangting_ico.gif" style="height:50px;width:50px;float:left;"></img>
          </div>
           </div>
 
  </body>
</html>
