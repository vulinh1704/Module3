<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/20/2022
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/students?sort=age">Sort</a>
<c:forEach var="st" items="${list}">
    <h2>${st.age} , ${st.name} , ${st.id}</h2>
</c:forEach>
</body>
</html>
