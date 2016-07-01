<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

   	<script type="text/javascript">
	  <!-- 
	function changeBG(o){
		o.style.backgroundColor="#0954BA";
	}
	function changeBG2(o){
		o.style.backgroundColor="";
	}
	-->
  </script>


  
 <!-- 顶部-->

     <div class="top">
         <div class="title w">
		<h2 class="w">科研信息发布平台<span>科研信息发布平台</span></h2>
		</div>
	</div>
<!-- 头部-->
<div class="head">
     <ul class="list clearfix w">
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="<%=basePath%>index!showList" target="_blank"><span style="font-weight:bold;font-size:18px;">首页</span></a>   </li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="<%=basePath%>news!showList" target="_blank"><span style="font-weight:bold;font-size:18px;">新闻</span></a>   </li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="<%=basePath%>project!showList" target="_blank"><span style="font-weight:bold;font-size:18px;">研究成果</span></a> </li>
        <li onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="<%=basePath%>teacher!showList" target="_blank"><span style="font-weight:bold;font-size:18px;">老师信息</span></a> </li>
        <li class="last" onmouseover="changeBG(this)" onmouseout="changeBG2(this)"><a class="anavi" href="<%=basePath%>student!showList"><span style="font-weight:bold;font-size:18px;">学生信息</span></a> </li>
     </ul>
 </div>

