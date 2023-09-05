<%--
  Created by IntelliJ IDEA.
  User: 16907
  Date: 2023/9/5
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="tag.jsp">
    <input type="text" name="user" value="${param.user}">
    <input type="submit" name="login">
</form>

<%-- 判断登陆的人的权限--%>
<c:if test="${param.user=='admin'}" var="isAdmin">
    <c:out value="欢迎管理员"></c:out>
</c:if>
<c:out value="${isAdmin}"></c:out>
</body>
</html>
