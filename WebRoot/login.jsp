<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登陆</title>
    
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
		<span class="font6">欢迎登陆</span>
		</div>
	</div>
  <center>

	<p class="font9">${message}</p>
						
    <form name="form" method="post" action="login">
     <table class="reg_table" border="1">
  <tr>
    <td height="44" colspan="2">欢迎来到科研管理系统</td>
    
  </tr>
  
  <tr>
    <td width="33%" align="right">账号：</td>
    <td width="67%">
      <input type="text" name="id" />
    </td>
  </tr>
  <tr>
    <td align="right">密码：</td>
    <td><input type="password" name="password" /></td>
  </tr>
  <tr>
    <td align="right">身份：</td>
    <td>
     <select name="role">       
        <option value="1">学生</option>    
        <option value="2">教师</option>    
        <option value="3">管理员</option>  
        <option value="4">普通用户</option>
                
     </select>

    </td>
  </tr>
  <tr>
    <td align="right">
      <input type="submit"  id="button"  value="登陆" />
   </td>
    <td><input type="reset" name="button2" id="button2" value="重置" /></td>
  </tr>
</table>
 </form>
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
