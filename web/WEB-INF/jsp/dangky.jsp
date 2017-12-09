<%--
  Created by IntelliJ IDEA.
  User: lampstudio
  Date: 12/9/2017
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" commandName="taikhoan" action="xulidangki" >
    UserName<form:input path="userNam"></form:input>
    Password<form:input path="password"></form:input>
    <input type="submit" value="Save">
</form:form>
</body>
</html>
