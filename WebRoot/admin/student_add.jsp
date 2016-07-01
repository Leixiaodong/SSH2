<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
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

		<title>My JSP 'student_add_success.jsp' starting page</title>

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
					<span class="span2">欢迎<s:property
							value="#session.loginInfo.name" />登陆</span>
					<span class="span2"><a
						href="<%=basePath%>admin/log_out!logout" target="_parent">安全退出</a>
					</span>

				</div>
			</div>
		<div class="main1">
			
			<form method="post" action="<%=basePath%>admin/Student_add.action"
				target="_self">

				<table class="list_tab" align="center" width="80%" cellspacing="1"
					bordercolor="#44AEDB" cellpadding="1" border="1">

					<tr>
						<td colspan="2" align="center" bgcolor="#6A82DA">
							<span class="span3">添加学生</span>
						</td>
					</tr>
					<tr>
						<td width="28%" align="right" bgcolor="#E4EDF9">
							学生姓名：
						</td>
						<td width="72%" bgcolor="#E4EDF9">
							<input name="student.name" type="text" id="textfield6" value=""
								size="38">
						</td>
					</tr>
					<tr>
						<td width="28%" align="right" bgcolor="#F1F3F5">
							学生密码：
						</td>
						<td width="72%" bgcolor="#F1F3F5">
							<input name="student.password" type="text" id="textfield6"
								value="" size="38">
						</td>
					</tr>
					<tr>
						<td align="right" bgcolor="#E4EDF9">
							性别：
						</td>
						<td bgcolor="#E4EDF9">
							<input name="student.sex" type="radio" id="radio" value="男"
								checked>
							男
							<input type="radio" name="student.sex" id="radio2" value="女">
							女
						</td>
					</tr>
					<tr>
						<td align="right" bgcolor="#F1F3F5">
							年级：
						</td>
						<td bgcolor="#F1F3F5">
							<select name="student.grade.id">
								<option value="1">
									大一
								</option>
								<option value="2">
									大二
								</option>
								<option value="3">
									大三
								</option>
								<option value="4">
									大四
								</option>
								<option value="5">
									研一
								</option>
								<option value="6">
									研二
								</option>

							</select>
						</td>
					</tr>
					<tr>
						<td height="23" colspan="2" align="right" bgcolor="#E4EDF9">
							&nbsp;
						</td>
					</tr>
					<tr>
						<td height="33" align="right" bgcolor="#CAD7F7">
						</td>
						<td bgcolor="#CAD7F7">
							<p>
								<input type="submit" name="button" id="button" value="提交">
								&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
								<input type="reset" name="button2" id="button2" value="重置">
							</p>
						</td>
					</tr>

				</table>


				<p>
					&nbsp;
				</p>
			</form>

		</div>
	</body>
</html>
