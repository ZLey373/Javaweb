<%@page contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>

<form action="${pageContext.request.contextPath}/login" method="post">
    账户：<input type="text" name="username">  <br>
    密码：<input type="password" name="password"> <br>
    专业：
         <input type="checkbox" name="tages" value="计科">计科
        <input type="checkbox" name="tags" value="物联网">物联网
        <input type="checkbox" name="tags" value="软件工程">软件工程
    <br>
    <input type="submit">
</form>
</body>
</html>
