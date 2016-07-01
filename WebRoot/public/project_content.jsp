<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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

		<title>科研项目内容</title>

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
	</head>

	<body>

		<jsp:include page="head.jsp"></jsp:include>
		<div class="content w clearfix">
			<div class="content-l fl">
				<div class="text">
					<h2>
						<s:property value="#request.project.proname"/>
					</h2>
					<p class="clearfix">
						<span class="fl"><s:property value="#request.project.time"/></span><span class="fr">作者barry</span>
					</p>
					<p class="one">
						<s:property value="#request.project.proinfo"/>
					</p>
					

					<p class="read">
						
						<a href="#">点击背景</a>
					</p>
				</div>

			</div>
		</div>
		<jsp:include page="foot.jsp"></jsp:include>
	</body>
</html>
