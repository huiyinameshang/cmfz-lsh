<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<!-- 使用easyUI，需要引入jQuery脚本库和easyUI脚本库 
		这两个脚本库一定是先引入jQuery，再引入easyUI
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.easyui.min.js"></script>
	
	<!-- 需要引入两个css文件：图标样式文件，easyUI样式文件 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/themes/default/easyui.css">
	
	<script type="text/javascript">
	/*jQuery的初始化 */
	$(document).ready(function(){
	});
	
	/* 缩写 */
	$(function(){
		
	});
	</script>
	
  </head>
  
  <body>
  	<div class="easyui-accordion" data-options="width:500,height:600,selected:1">
  		<div data-options="title:'first'">第一一个</div>
  		<div data-options="title:'第二个'">第second个</div>
  		<div data-options="title:'第san个'">第3个</div>
  	</div>
  </body>
</html>
