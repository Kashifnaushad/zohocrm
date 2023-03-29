<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list bills</title>
</head>
<body>
<h1>List Bills</h1>
<table>
<tr>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Email</th>
	<th>Mobile</th>
	<th>Product</th>
	<th>Quantity</th>
	<th>Amount</th>
</tr>
<c:forEach var="bills" items = "${bills}">  
<tr>

		<td>${bills.firstName}</td>
		<td>${bills.lastName}</td>
		<td>${bills.email}</td>
		<td>${bills.mobile}</td>
		<td>${bills.product}</td>
		<td>${bills.quantity}</td>
		<td>${bills.amount}</td>
		
		
		
</tr>
   
</c:forEach> 
</table>
		
</body>
</html>