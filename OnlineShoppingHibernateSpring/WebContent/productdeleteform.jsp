<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Product Forms</title>
<link rel="stylesheet" href="styles/productaddformstyle.css">

</head>
<body>
<%@ include file="header.html" %>
	<h2>${productdeleteerror}</h2>
	<div class="productcontainer">
		<form name="addform" action="deleteProduct" method="post">
			
			<label for="pid">Product Id:</label>
			<input type="number" name="productId" id="pid" value="${param.productId }" readonly>
			
			<label for="pnm">Product Name:</label>
			<input type="text" name="name" id="pnm" value="${param.name }" readonly>
			
			<label for="pbr">Product Brand:</label>
			<input type="text" name="brand" id="pbr" value="${param.brand }"readonly>
			
			<label for="ppr">Product Price:</label>
			<input type="text" name="price" id="ppr" value="${param.price }"readonly>
			
			<input type="Submit" value="Are you Sure To Delete?" style="color: Blue;" >
			
		</form>
	</div>
<%@ include file="footer.html" %>
</body>
</html>