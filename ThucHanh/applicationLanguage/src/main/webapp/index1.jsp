<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 5/19/2022
  Time: 11:15 AM
  To change this template use File | Settings | File Templates.
--%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form method="post" action="/calculator">
    <label>Nhập mô tả sản phẩm</label><br>
    <input type="text" name="proDescription" placeholder="Enter your Product Description : "/><br/>
    <label>Nhập giá liêm yết sản phầm</label><br/>
    <input type="text" name="listPrice" placeholder="Enter list price : "/><br/>
    <label>Tỷ lệ chiết khẩu</label><br/>
    <input type="text" name="discountPercent" placeholder="Enter Discount Percent : "/><br/>
    <input type = "submit" id = "submit" value = "calculator"/>
</form>
</body>
</html>
