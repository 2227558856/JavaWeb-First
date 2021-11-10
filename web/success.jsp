<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/9
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>成功</title>
</head>
<body>
${message}<br>
<a href="GetAllServlet">查看所有用户数据</a>
</body>
</html>
