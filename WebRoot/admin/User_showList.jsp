<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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

		<title>My JSP 'admin_showList_success.jsp' starting page</title>

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
		<script type="text/javascript" language="javascript">
		function delComit(){
		alert("确定删除吗？？？");
		}
		</script>
	</head>

	<body>
		<div class="span1">
			<div class="admin_index">
				<span class="span2">欢迎<s:property
						value="#session.loginInfo.name" />登陆</span>
				<span class="span2"><a
					href="<%=basePath%>admin/log_out!logout" target="_parent">安全退出</a>
				</span>

			</div>
		</div>

		<div class="main1">
  
    	           
            <table width="80%" height="118" border="1" align="center"  cellpadding="1" cellspacing="1" bordercolor="#44AEDB" class="list_tab">

				  <tr>
				    <td height="31" colspan="3" align="center" bgcolor="#6A82DA"><span class="span3">普通用户列表</span></td>
			      </tr>
                  
               	<s:iterator value="#request.userList" var="user" status="s">
               <tr>
				    <td height="24" align="right" valign="middle" bgcolor="#F1F3F5">用户编号：</td>
				    <td width="53%" height="24" align="left" valign="top" bgcolor="#F1F3F5"><s:property value="#user.id" />;</td>
				    <td width="29%" height="24" align="left" valign="top" bgcolor="#F1F3F5"><a href="<%=basePath%>admin/User_updateInput.action?id=${user.id}" target="_self">【编辑】</a>
				    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="<%=basePath%>admin/User_delete.action?id=${user.id}" target="_self" onclick="delComit()">【删除】</a></td>
              </tr>
				  <tr>
				    <td width="18%" height="31" align="right" bgcolor="#E4EDF9">用户名称：</td>
				    <td colspan="2" align="left" bgcolor="#E4EDF9"><s:property value="#user.name" /></td>
		      </tr>
				  <tr>
				    <td height="24" align="right" valign="middle" bgcolor="#F1F3F5">用户密码：</td>
				    <td height="24" colspan="2" align="left" valign="top" bgcolor="#F1F3F5"><s:property value="#user.password" /></td>
    </tr>
      <tr>
				    <td align="right" bgcolor="#E4EDF9">性别：</td>
				    <td colspan="2" bgcolor="#E4EDF9"><s:property value="#user.sex" /></td>
    </tr>
				  <tr>
				    <td align="right" bgcolor="#F1F3F5">邮箱：</td>
				    <td colspan="2" bgcolor="#F1F3F5"><s:property value="#user.email" /></td>
			      </tr>
				  <tr>
				    <td height="23" colspan="3" align="right" bgcolor="#CAD7F7">&nbsp;</td>
			      </tr>
			      </s:iterator>
			      
  </table>	
  
  
  
  
  
  		
<center>

 
 <%
 
 int  pageCount =(Integer) request.getAttribute("pageCount");

 int pageNow=(Integer) request.getAttribute("pageNow");
  int  totalCount=(Integer) request.getAttribute("totalCount");
   System.out.println("int  pageCount =(Integer) request.getAttribute(s_pageCount);"+pageCount+pageNow+totalCount);
 %>
 

<c:if test="${pageNow == 1}">
   		  <p style="font-size:18px font-weight:bold;margin-left:240px;margin-bottom:80px;" align="left"> 当前页数:[1/${pageCount}]&nbsp; 
   		 <a href="<%=basePath%>admin/User_showList?s_pageNow=2">下一页&nbsp;&nbsp;</a> 
   		 <a href="<%=basePath%>admin/User_showList?s_pageNow=${pageCount}">末页</a> </p>
  </c:if>
      	<c:if test="${pageNow == pageCount}">
      		<p style="font-size:18px font-weight:bold;margin-left:240px;margin-bottom:80px;" align="left"> 当前页数:[${pageNow }/${pageCount }]&nbsp;
      		 <a href="<%=basePath%>admin/User_showList?s_pageNow=1">首页</a>
      			<a href="<%=basePath%>admin/User_showList?s_pageNow=${pageNow-1}">&nbsp;&nbsp;上一页</a></p>
      	</c:if>
      	<c:if test="${pageNow < pageCount && pageNow > 1}">
      		<p style="font-size:18px font-weight:bold;margin-left:240px;margin-bottom:80px;" align="left"> 当前页数:[${pageNow}/${pageCount }]&nbsp;&nbsp; 
      		<a href="<%=basePath%>admin/User_showList?s_pageNow=1">首页</a>
      			<a href="<%=basePath%>admin/User_showList?s_pageNow=${pageNow-1}">&nbsp;&nbsp;上一页</a>
      		<a href="<%=basePath%>admin/User_showList?s_pageNow=${pageNow+1}">&nbsp;&nbsp;下一页</a> 
      		<a href="<%=basePath%>admin/User_showList?s_pageNow=${pageCount}">&nbsp;&nbsp;末页</a></p>
      	</c:if>	

</center>
			
</div>
  </body>
</html>
