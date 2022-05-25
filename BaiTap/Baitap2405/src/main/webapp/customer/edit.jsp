<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/24/2022
  Time: 6:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form method="post">
    Nhập tên cần sửa <br/>
    <input type="text" name="name" value="${CustomerEdit.name}"><br/>
    Nhập tuổi cần sửa <br/>
    <input type="text" name="age" value="${CustomerEdit.age}"><br/>
    <button>Sửa</button>
</form>
</body>
</html>
