<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/21
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>黄俊博的第四个程序</title>
</head>
<body>
<h1 align="center">欢迎来到黄俊博程序的登录页面</h1>
<form action="dles_sc" method="post" name="form1">
    <table width="100%" border="0" align="center" bgcolor="#0099ff">
        <tr>
            <th colspan="3" scope="col">&nbsp;用户登录</th>
        </tr>
        <tr bgcolor="#ffffff">
            <th width="36%" rowspan="3" scope="row"><img src="img/logon.jpg" width="115" height="94"></th>
            <th width="18%" height="39" scope="row">用户名：</th>
            <td width="46%"><input name="NAME" type="text" id="NAME"></td>
        </tr>
        <tr bgcolor="#ffffff">
            <th height="39" scope="row">密码：</th>
            <td><input name="PWD" type="password" id="PWD"></td>
        </tr>
        <tr bgcolor="#ffffff">
            <th height="37" scope="row">&nbsp;</th>
            <td><input type="submit" name="Submit" value="提交">
                <input type="reset" name="Reset" value="重置"></td>
        </tr>
    </table>
</form>
<div align="center">
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <hr>
    <span class="style1">服务热线0411-66314524<br>
        Email: uuo00_n@outlook.com<br>
    Copyright&copy 大连电子学校2005-2022
    </span>
    <br>
</div>
</body>
</html>
