<%--
  Created by IntelliJ IDEA.
  User: 84946
  Date: 9/18/2019
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="calculate" method="post">
  <h2>Số lượng</h2>
  <input type="number" name="amount" placeholder="Nhập số lượng"><br/>
  <h2>Giá sản phẩm</h2>
  <input type="number" name="price" placeholder="Nhập giá sản phẩm"><br/>
  <h2>Chiết khấu(%)</h2>
  <input type="number" name="discount" placeholder="% chiết khấu"><br/>
  <br/>
  <input type="submit" name="calculate" value="calculate">

</form>
</body>
</html>

