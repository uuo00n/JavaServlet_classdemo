<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/24
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<jsp:useBean id="cont" class="com.jqe.servlet.ServletDemo" scope="page"/>
<jsp:setProperty name="cont" property="*"/>
<html>
<head>
    <title>show</title>
</head>
<body>
<b>如果index.jsp页面提交的数据为JSP，那么Servlet就会转发得到此页面，所以可以通过request对象获取提交的数据 ，如果数据不是JSP，那么将获取不到提交的信息。</b>
<br>
<%
    String content = request.getParameter("content");
    if (content != null) {
%>
提交的数据是：<%=content%>
<%} else {%>
没有获取到提交的数据
<%}%>
</body>
</html>
