<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>管理员页面</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
	</head>
	<frameset rows="15%,*" frameborder="1" framespacing="5"
		bordercolor="#44AEDB">
		<frame src="admin/top.jsp" noresize scrolling="no" />
		<frameset cols="18%,*">
			<frame src="admin/left.jsp" noresize scrolling="auto" />
			<frame src="admin/right.jsp" name="right" scrolling="yes" />
		</frameset>
	</frameset>
</html>
