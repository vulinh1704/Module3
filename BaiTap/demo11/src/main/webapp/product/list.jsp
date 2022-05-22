<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/22/2022
  Time: 12:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Danh Sách Sản Phẩm</h1>
<a href="/products?action=create"></a>
<c:forEach items="listProduct" var="p">
    <h3>${p.id} , ${p.name} , ${p.price} , <a href="/products?action=edit&id=${p.id}"></a></h3>
</c:forEach>
</body>
</html>
