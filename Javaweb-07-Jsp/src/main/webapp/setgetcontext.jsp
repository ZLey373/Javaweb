<%--
  Created by IntelliJ IDEA.
  User: 16907
  Date: 2023/9/4
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("name1","赵磊1");    // 保存的数据只在一个页面中有效
    request.setAttribute("name2","赵磊2");  // 保存的数据只在一次请求中有效，请求转发会携带这个数据
    session.setAttribute("name3","赵磊3");  // 保存的数据只在一次会话中有效，从打开浏览器到关闭浏览器
    application.setAttribute("name4","赵磊4"); //  保存的数据只在服务器中有效，从打开服务器到关闭服务器
%>
<%
    String attribute1 = (String)pageContext.findAttribute("name1");
    String attribute2 = (String)pageContext.findAttribute("name2");
    String attribute3 = (String)pageContext.findAttribute("name3");
    String attribute4 = (String)pageContext.findAttribute("name4");

    out.println(attribute1);
    out.println(attribute2);
    out.println(attribute3);
    out.println(attribute4);

%>
</body>
</html>
