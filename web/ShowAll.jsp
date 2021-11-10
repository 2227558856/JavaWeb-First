<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/9
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path=request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>用户界面</title>
</head>
<body>
<h1>${message}</h1>
<table width="600" border="1" cellpadding="0">
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>性别</th>
        <th>手机号</th>
        <th>邮箱</th>
        <th>操作</th>
    </tr>
    <c:forEach var="U" items="${userAll}">
        <form action="UpdateServlet" method="post">
            <tr>
                <td><input type="text" value="${U.username}" name="username"></td>
                <td><input type="text" value="${U.password}" name="password"></td>
                <td><input type="text" value="${U.sex}" name="sex"></td>
                <td><input type="text" value="${U.phone}" name="phone"></td>
                <td><input type="text" value="${U.email}" name="email"></td>
                <td>
                    <a href="DeleteServlet?username=${U.username}">删除</a>
                    <input type="submit" value="更新">
                </td>
            </tr>
        </form>
    </c:forEach>
</table>
</body>
</html>
