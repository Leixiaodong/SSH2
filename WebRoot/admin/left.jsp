 <%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <link rel="stylesheet" href="/SSH5/css/common.css" type="text/css"></link>
   <link rel="stylesheet" href="/SSH5/css/foot.css" type="text/css"></link>
     <link rel="stylesheet" href="/SSH5/css/head.css" type="text/css"></link>
     <link rel="stylesheet" href="/SSH5/css/index.css" type="text/css"></link>
  </head>
  
  <body style="background:#799AE1;">
      <div class="admin_left">
          <div class="admin_navi">
                <span class="span4">功能菜单</span>
                <ul >
                
                     <li><a href="<%=basePath%>admin/admin.jsp" target="_parent">管理员首页</a>  | <a href="<%=basePath%>/admin/log_out!logout" target="_parent">安全退出</a></li>
                      <li><a href="<%=basePath%>admin/Admin_showList" target="right">查看管理员</a>  | 
                      <a href="<%=basePath%>/admin/admin_add.jsp" target="right">添加管理员</a></li>
                </ul>
      
      </div>
         <div class="admin_navi">
                <span class="span4"> 新闻管理</span>
         <ul>
           <li><a href="<%=basePath%>admin/New_showList" target="right">查看所有新闻</a>  | <a href="<%=basePath%>admin/new_add.jsp" target="right">添加新闻</a></li>
         </ul>
      </div>
          <div class="admin_navi">
                <span class="span4"> 科研项目管理</span>
         <ul>
           <li><a href="<%=basePath%>admin/Project_showList" target="right">查看项目</a>  | <a href="<%=basePath%>admin/project_add.jsp" target="right">添加项目</a></li>
         </ul>
      </div>
       <div class="admin_navi">
                <span class="span4">团队管理</span>
         <ul>
           <li><a href="<%=basePath%>admin/Teacher_showList" target="right">查看教师</a>  | <a href="<%=basePath%>admin/teacher_add.jsp" target="right">添加教师</a></li>
           <li><a href="<%=basePath%>admin/Student_showList" target="right">查看学生</a> | <a href="<%=basePath%>admin/student_add.jsp" target="right">添加学生</a></li>
           <li><a href="<%=basePath%>admin/User_showList" target="right">查看用户</a> | <a href="<%=basePath%>admin/user_add.jsp" target="right">添加用户</a></li>
         </ul>
      </div>
      
       </div>
  </body>
</html>
