<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead info</title>
</head>
<body>
<h1>Lead Info</h1>
	First Name:${leads.firstName}<br/>
	Last Name:${leads.lastName}<br/>
	Email:${leads.email}<br/>
	Mobile:${leads.mobile}<br/>
	Source:${leads.source}<br/>
	
<form action = "composeEmail" method = "post">
	<input type = "hidden" name = "email" value = "${leads.email}">
	<input type = "submit" value = "Email">
</form>

<form action="convertLead" method = "post">
<input type = "hidden" name = "id" value = "${leads.id }">
<input type = "submit" value = "convert">

</form>
</body>
</html>