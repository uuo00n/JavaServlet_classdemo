<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/21
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>黄俊博的第三个程序</title>
</head>
<body>
<h1>欢迎使用黄俊博的code</h1>
Get请求：
<form action="myservlet" method="get">
    <input type="text" name="content">
    <input type="submit" value="提交">
</form>
Post请求：
<form action="myservlet" method="post">
    <input type="text" name="content">
    <input type="submit" value="提交">
</form>
</body>
</html>
