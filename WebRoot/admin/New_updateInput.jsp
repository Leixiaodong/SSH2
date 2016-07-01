<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'admin_add_success.jsp' starting page</title>
    
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
   <div class="span1">
			<div class="admin_index">
				<span class="span2">欢迎<s:property value="#session.loginInfo.name" />登陆</span>
				<span class="span2"><a href="<%=basePath%>admin/log_out!logout" target="_parent">安全退出</a>
				</span>

			</div>
		</div>
   <div class="main1">
     
   <form method="post" action="<%=basePath%>admin/New_update.action" target="_self">
 <table width="80%" border="1" align="center" cellpadding="1"
				cellspacing="1" bordercolor="#44AEDB">
				<tr>
					<td height="31" colspan="2" align="center" bgcolor="#6A82DA">
						<span class="span3">修改新闻信息</span>
					</td>
				</tr>
			
					<tr>
					  <td height="30" align="right" bgcolor="#E0E0E0">新闻编号：
						</td>
						<td height="30"  align="left" bgcolor="#F1F3F5">

						      <input name="news.id" readonly type="text"  id="textfield" size="40" value="${news.id}">
				       </td>
                   	</tr>

					<tr>

						<td width="22%" height="30" align="right" bgcolor="#E4EDF9">
							新闻标题：
						</td>
						<td align="left" bgcolor="#E4EDF9">
							
				        <input name="news.title" type="text" id="textfield2" size="40" value="${news.title}"></td>
					</tr>
					<tr>
					  <td height="30" align="right" bgcolor="#F1F3F5">新闻内容：
						</td>
						<td height="30" align="left" bgcolor="#F1F3F5">
							
                          <textarea name="news.content" cols="70" rows="10"  >${news.content}</textarea>  
                                    

                        </td>
                    </tr>
                    	<tr>

						<td width="22%" height="30" align="right" bgcolor="#E4EDF9">
							发布时间：
						</td>
						<td align="left" bgcolor="#E4EDF9">
							
				        <input name="news.time " type="text" id="textfield2" size="40" value="${news.time}"></td>
					</tr>
					
                   <tr>
				    <td height="33" align="right" bgcolor="#CAD7F7">
				    </td>
				    <td bgcolor="#CAD7F7"><p>
				      <input type="submit" name="button" id="button" value="修改" >&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; 
				        <input type="reset" name="button2" id="button2" value="重置">
			          </p></td>
			      </tr>

			</table>
    	</form>		
</div>
  </body>
</html>
