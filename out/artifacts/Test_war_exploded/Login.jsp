<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/8
  Time: 18:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="LoginServlet" method="post">
    <table>
        <!--第一行:用户名-->
        <tr>
            <td class="td_left"><label for="username">用户名</label></td>
            <td class="td_right"><input type="text" name="username" id="username"></td>
        </tr>
        <!--第二行:密码-->
        <tr>
            <td class="td_left"><label for="password">密码</label></td>
            <td class="td_right"><input type="password" name="password" id="password"></td>
        </tr>
        <!--第三行:登录键-->
        <tr>
            <td class="td_left"><input type="submit" value="登录" name="Login"></td>
            <td class="td_right"><input type="reset" value="重置" name="Reset"></td>
        </tr>
    </table>
</form>
    <a href="Register.jsp">新用户注册</a>
</body>
</html>
