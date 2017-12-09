<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%--
  Created by IntelliJ IDEA.
  User: lampstudio
  Date: 12/9/2017
  Time: 6:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Xin Chào</h1>
    ten A la ${a}<br>
    ten B la ${b}<br>
<h3> Thong tin san Pham</h3>
    ma san pham ${sp.maSP}<br>
    ten san pham ${sp.tenSP}<br>
    gia san pham ${sp.giaSP}<br>
<h3> Danh sach san pham</h3>
<c:forEach var="sp1" items="${dsSanPham}">
    ma san pham ${sp1.maSP}<br>
    ten san pham ${sp1.tenSP}<br>
    gia san pham ${sp1.giaSP}<br>
    ===========================<br>
</c:forEach>
</body>
</html>
