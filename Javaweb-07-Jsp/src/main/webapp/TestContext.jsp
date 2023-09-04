<%--
  Created by IntelliJ IDEA.
  User: 16907
  Date: 2023/9/4
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
String attribute1 = (String)pageContext.findAttribute("name1");
String attribute2 = (String)pageContext.findAttribute("name2");
String attribute3 = (String)pageContext.findAttribute("name3");
String attribute4 = (String)pageContext.findAttribute("name4");
%>
<%=attribute1%>
<%=attribute2%>
<%=attribute3%>
<%=attribute4%>




</body>
</html>
