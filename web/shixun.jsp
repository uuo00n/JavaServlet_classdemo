<%--
  Created by IntelliJ IDEA.
  User: junbo
  Date: 2022/11/25
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<form action="shixun" name="form1" onsubmit="return check()" method="post">
    <table width="100%" border="0" align="center" bgcolor="#0099FF">
        <tr>
            <th colspan="3" scope="col">&nbsp;用户注册</th>
        </tr>
        <tr bgcolor="#FFFFFF">
            <th width="36%" rowspan="7" scope="row"><img alt="" src="img/logon.jpg" width="155" height="155"></th>
            <th width="18%" height="46" scope="row">
                <div align="left">
                    <span style="font-weight: 400"><font size="2">用户名:</font></span></div>
            </th>
            <td width="46%"><input name="姓名" type="text" id="NAME">
                <span class="style2">*</span></td>
        </tr>

        <tr bgcolor="#FFFFFF">
            <th height="39" scope="row">
                <div align="left">
                    <span style="font-weight: 400"><font size="2">密码</font></span></div>
            </th>
            <td><input name="密码" type="password" id="PWD">
                <span class="style2">*</span></td>
        </tr>

        <tr bgcolor="#FFFFFF">
            <th height="39" scope="row">
                <div align="left">
                    <span style="font-weight: 400"><font size="2">确认密码</font></span></div>
            </th>
            <td><input name="确认密码" type="password" id="PWD">
                <span class="style2">*</span></td>
        </tr>

        <tr bgcolor="#FFFFFF">
            <th height="39" scope="row">
                <div align="left">
                    <span style="font-weight: 400"><font size="2">电子邮箱:</font></span></div>
            </th>
            <td><input name="邮箱" type="text">
                <span class="style2">*</span></td>
        </tr>

        <tr bgcolor="#FFFFFF">
            <th height="39" scope="row">
                <div align="left">
                    <span style="font-weight: 400"><font size="2">性别:</font></span></div>
            </th>
            <td><input name="性别" type="radio" value="男" checked>男
                <input name="性别" type="radio" value="女" checked>女
                <span class="style2">*</span></td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <th height="39" scope="row">
                <div align="left">
                    <span style="font-weight: 400"><font size="2">教育程度:</font></span></div>
            </th>
            <td><select name="学历" size="1">
                <option value="">请选择</option>
                <option value="研究生">研究生</option>
                <option value="本科">本科</option>
                <option value="专科">专科</option>
                <option value="中专">中专</option>
                <option value="高中">高中</option>
                <option value="初中">初中</option>
            </select>
            </td>
        </tr>

        <tr bgcolor="#FFFFFF">
            <th height="37" scope="row"></th>
            <td><input type="submit" name="按钮" value="提交">
                <input type="reset" name="按钮" value="重填">
            </td>
        </tr>
    </table>
</form>
<div align="center">
    <p>
    <p>
    <hr>
    <span class="style1">服务热线：0411-888888888 E-mail:uuo00_n@outlook.com<br>Copyright&copy;大连电子学校</span>
    <br>
</div>
</body>
</html>
<script type="text/javascript">
    function check() {
        if (form1.NAME.value == "") {
            alert("请输入用户名！！！")
            form1.NAME.focus();
            return false;
        }
        if (form1.PWD.value == "") {
            alert("请输入密码！！！")
            form1.PWD.focus();
            return false;
        }
        if (form1.NAME.value != form1.PWD1.value) {
            alert("两次密码不一致，请重新输入！")
            form1.PWD.focus();
            return false;
        }
    }
</script>
