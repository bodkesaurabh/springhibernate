<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Product Forms</title>
<link rel="stylesheet" href="styles/productaddformstyle.css">
<script type="text/javascript" src="scripts/productaddvalidation.js"></script>
</head>
<body>
<%@ include file="header.html" %>
	<h2>${productadderror}</h2>
	<div class="productcontainer">
		<form name="addform" action="editProduct" method="post" onsubmit="return validateProductForm()">
			
			<label for="pid">Product Id:</label>
			<input type="number" name="productId" id="pid" value="${param.productId }" readonly>
			
			<label for="pnm">Product Name:</label>
			<input type="text" name="name" id="pnm" value="${param.name }">
			
			<label for="pbr">Product Brand:</label>
			<input type="text" name="brand" id="pbr" value="${param.brand }">
			
			<label for="ppr">Product Price:</label>
			<input type="text" name="price" id="ppr" value="${param.price }"">
			
			<input type="Submit" value="Edit" style="color: Blue; ">
			
		</form>
	</div>
<%@ include file="footer.html" %>
</body>
</html>