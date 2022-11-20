<%--
  Created by IntelliJ IDEA.
  User: junbo
  Date: 2022/11/20
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>黄俊博的第一个程序</title>
</head>
<body>
<form action="formservlet" method="post">
    输入用户名：<br>
    <input type="text" name="name">
    <br>
    输入密码：<br>
    <input type="password" name="password">
    <br>
    输入性别：<br>
    <input type="text" name="sex">
    <br>
    输入年龄：<br>
    <input type="text" name="age">
    <br>
    <input type="submit" value="login">
</form>
</body>
</html>
