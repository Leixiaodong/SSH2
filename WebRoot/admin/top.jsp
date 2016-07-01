<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
<link rel="stylesheet" href="/SSH5/css/common.css" type="text/css"></link>
   <link rel="stylesheet" href="/SSH5/css/foot.css" type="text/css"></link>
     <link rel="stylesheet" href="/SSH5/css/head.css" type="text/css"></link>
     <link rel="stylesheet" href="/SSH5/css/index.css" type="text/css"></link>
  </head>
  
  <body>
    

    <div class="top">
         <div class="title w">
		<h2 class="w">科研信息发布平台<span>科研信息发布平台</span></h2>
		</div>
	</div>
	
  </body>
</html>
