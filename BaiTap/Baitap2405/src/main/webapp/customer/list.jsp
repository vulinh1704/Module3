<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/24/2022
  Time: 5:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h1>Danh Sách Khách Hàng</h1>
<h1><a href="/customers?action=create">Tạo mới</a></h1>
<c:forEach var="cus" items="${listCustomer}">
    <h2>id : ${cus.id} // Tên khách hàng : ${cus.name} // Tuổi : ${cus.age} // <a href="/customers?action=edit&id=${cus.id}">Sửa</a> //
    <a href="/customers?action=delete&id=${cus.id}">Xóa</a></h2>
</c:forEach>
</body>
</html>
