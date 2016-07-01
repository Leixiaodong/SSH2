<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
  </head>
  
  <body>
  <div class="top">
         <div class="title w">
		<h2 class="w">科研信息发布平台</h2>
		<span class="font6">欢迎注册</span>
		</div>
	</div>
	<div style="width:900px;height:200px;margin:0 auto;">
	 <p class="font9">  <a href="index.jsp" target="_self">《《-- 恭喜您 ，登录成功！！</a></p>
	 </div>
   <br>
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
