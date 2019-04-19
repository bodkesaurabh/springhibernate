<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
			<%@ include file="header.html" %>
			<table>
			<tr><th>ProductId</th><th>Name</th><th>Brand</th><th>Price</th></tr>
				
<c:forEach var="p" items="${sessionScope.productList }">	
				<tr>		
				<td>${p.productId}</td>
				<td>${p.name}</td>
				<td>${p.brand}</td>
				<td>${p.price}</td>
				<td><a href="edit?productId=${p.productId}&name=${p.name}&brand=${p.brand}&price=${p.price}">Edit</a></td>
				<td><a href="delete?productId=${p.productId}&name=${p.name}&brand=${p.brand}&price=${p.price}">Delete</a></td>
				</tr>
</c:forEach>
			</table>
		
	<%@ include file="footer.html" %>		
</body>
</html>