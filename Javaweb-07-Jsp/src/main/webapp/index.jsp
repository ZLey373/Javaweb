        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>


<%--JSP表达式
  作用：把变量或表达式输出到前端页面上
 <%= 变量或表达式%>
--%>
<%=new java.util.Date()%>
<hr>

<%--
作用：实现java逻辑功能
     <% java代码片段 %>
--%>
<%
    int sum = 0;
    for (int i = 0; i < 100; i++) {
        sum = sum + i * 10;
    }
    out.println(sum);
%>
<%--
作用：jsp声明，声明的函数或者变量为全局变量，而不是_jspService函数里的局部变量
<%！ java全局函数或变量 %>
--%>
<%!
    public void zl() {
        System.out.println("hello");
    }
%>
<hr>
    <jsp:include page="common/head.jsp"></jsp:include>
    <h1>页面body</h1>
    <jsp:include page="common/foot.jsp"></jsp:include>
<hr>
    <%@include file="common/head.jsp" %>
    <h1>页面body</h1>
    <%@include file="common/foot.jsp"%>
</body>
</html>
