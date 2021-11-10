<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/11/9
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="RegisterServlet" method="post">
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
        <!--第三行:性别-->
        <tr>
            <td class="td_left">性别</td>
            <td class="td_right">
                <input type="radio" name="sex" value="女">女
                <input type="radio" name="sex" value="男">男
            </td>
        </tr>
        <!--第四行:手机号-->
        <tr>
            <td class="td_left"><label for="phone">手机号</label></td>
            <td class="td_right"><input type="text" name="phone" id="phone"></td>
        </tr>
        <!--第五行:邮箱-->
        <tr>
            <td class="td_left"><label for="email">E-mail</label></td>
            <td class="td_right"><input type="text" name="email" id="email"></td>
        </tr>
        <!--第六行:注册-->
        <tr>
            <td class="td_left"><input type="submit" value="注册"></td>
            <td class="td_right"><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
