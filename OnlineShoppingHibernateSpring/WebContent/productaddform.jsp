<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product Forms</title>
<link rel="stylesheet" href="styles/productaddformstyle.css">
<script type="text/javascript" src="scripts/productaddvalidation.js"></script>
</head>
<body>
	<h2>${productadderror}</h2>
	<div class="productcontainer">
		<form name="addform" action="editProduct" method="post" onsubmit="return validateProductForm()">
			
			<label for="pnm">Product Name:</label>
			<input type="text" name="name" id="pnm" placeholder="Enter Product Name">
			
			<label for="pbr">Product Brand:</label>
			<input type="text" name="brand" id="pbr" placeholder="Enter Product Brand">
			
			<label for="ppr">Product Price:</label>
			<input type="text" name="price" id="ppr" placeholder="Enter Product Price">
			
			<input type="Submit" value="Submit" style="color: Blue; ">
			<input type="reset">
		</form>
	</div>
</body>
</html>