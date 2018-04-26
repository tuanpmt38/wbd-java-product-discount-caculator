<%--
  Created by IntelliJ IDEA.
  User: minhtuan
  Date: 4/26/18
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>wbd-java- product discount - calculator</title>
    <style type="text/css">
      .login {
        height:250px; width:270px;
        margin:0;
        padding:10px;
        border:1px #CCC solid;
      }
      .login input {
        padding:5px; margin:5px
      }
    </style>
  </head>
  <body>
  <form method="post" action="/discount">
    <div class="login">
      <h2>Product Discount Calculator</h2>
      <input type="text" name="product_des" size="30"  placeholder="Product Description" />
      <input type="text" name="price" size="30"  placeholder="List Price" />
      <input type="text" name="discount_percent" size="30" placeholder="Discount Percent" />
      <input type="submit" value="Calculator"/>
    </div>
  </form>
  </body>
</html>
