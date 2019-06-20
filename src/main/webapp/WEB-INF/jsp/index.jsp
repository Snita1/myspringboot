<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Index</title>
</head>
<body>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
 -->	
<%@include file="header.jsp"%>
Welcome ${objUser.name}
${objUser.id}
${objUser.dept}
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="/">ABC</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/Sales">Sales</a></li>
      <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="/Setup">Setup
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/Items">Items</a></li>
          <li><a href="#">Page 1-2</a></li>
        
        </ul>
      </li>
      <li><a href="/PurchaseOrder">PurchaseOrder</a></li>
      <li><a href="/Purchase">Purchase</a></li>
    </ul>
  </div>
</nav>
<form >
	<input type="submit" value="Sales" name="sale" onclick="form.action='/Sales';">
	<input type="submit" value="Purchases" name="Purchases" onclick="form.action='/Purchase';">
	<input type="submit" value="Purchase Order" name="PurchaseOrder" onclick="form.action='/PurchaseOrder';">
	<input type="submit" value="Set Up" name="Setup" onclick="form.action='/Setup';">
</form>
</body>
</html>