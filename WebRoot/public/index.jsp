<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>科研信息管理首页</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="/SSH5/css/common.css" type="text/css"></link>
    <link rel="stylesheet" href="/SSH5/css/index.css" type="text/css"></link>
   <link rel="stylesheet" href="/SSH5/css/foot.css" type="text/css"></link>
     <link rel="stylesheet" href="/SSH5/css/head.css" type="text/css"></link>
 <SCRIPT type="text/JavaScript">
        function validate(){
            var usernameValue=document.getElementById("id").value;
            var passwordValue=document.getElementById("password").value;
         
            if(usernameValue.length==0){
                alert("账号不能为空!");
                return false;
            }else if(usernameValue.length<0 || usernameValue.length>3){
                alert("账号在0到3之间!");
                return false;
            }
            return true;
        }
    </SCRIPT>
  </head>
  
  <body>

     <jsp:include page="head.jsp"></jsp:include>

		<div class="main">
			<div class="reg_login">
				<div class="loginForm">
				${message}
				 <form name="form"  action="<%=basePath%>login?role=4" method="post" >
					<span class="font3"> 用户登录:</span>
					<input type="text" name="id">
					<br />
					<span class="font3">密&nbsp;&nbsp;码：</span><br />
					<input type="password" class="text" name="password" />
					<br />
					<input type="checkbox">
					<span class="font3">自动登录</span>
					<br />
					<input type="submit" value="登录  ">
					&nbsp; &nbsp; &nbsp;
					<a href="#"><span class="font3">找回密码</span></a>
					</form>
				</div>
				
				<div class="reg">
					<a href="<%=basePath%>register.jsp"><span class="font4">注册</span></a>
					<a href="<%=basePath%>login.jsp"><span class="font5">其它登录</span></a>
					
				</div>
				
				
				
				
			</div>
			<div class="right">

			<div class="new">
			     <div class="span1"><span class="font1"> 新闻</span><a href="<%=basePath%>news!showList"><span class="span2"> 更多</span></a></div>
				
				<ul class="new_list ">
				<s:iterator value="#request.newsList" var="news" status="s">			
					<li class="one-1">
						<a class="font2" href="news!showContent?id=${news.id}" target="_blank">
						<s:property value="#news.title"/>					
						</a>
						<span class="font10"><s:property value="#news.time"/></span>
					</li>
				
				</s:iterator>
				</ul>
	
			</div>

			<div class="project">
				<div class="span1"><span class="font1">项目</span><a href="<%=basePath%>project!showList"><span class="span2"> 更多</span></a></div>
				
				<ul class="project_list">
				<s:iterator value="#request.projectList" var="project" status="s">
					<li class="one-2">
						<a class="font2" href="project!showContent?id=${project.id}" target="_blank">
						<s:property value="#project.proname"/>
						
						</a><span class="font10"><s:property value="#project.time"/></span>
					</li>
					
					</s:iterator>
				</ul>

			</div>
			
		</div>
</div>
        <jsp:include page="foot.jsp"></jsp:include>
  </body>
</html>
