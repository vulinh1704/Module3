<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/24/2022
  Time: 11:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<c:forEach var="i"  begin="0" end="${products.size()-1}">
    <h2>${products.get(i).id}, ${products.get(i).name} ,${products.get(i).price} ,${categories.get(i).getName()}</h2>
<%--    <h2>${pro.id} , ${pro.name} ,${pro.price} , ${pro.idCategory}</h2>--%>
</c:forEach>
</body>
</html>
