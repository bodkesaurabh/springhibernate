function validateProductForm(){
	
	var pName = document.getElementById("pnm").value;
	var pBrand = document.getElementById("pbr").value;
	var pPrice = document.getElementById("ppr").value;

	if(pName == null || pName== ""){
		window.alert("Product name cannot be empty");
		return false;
	}
	if(pBrand == null || pBrand== "")
	{
		window.alert("Product brand cannot be empty");
		return false;
	}
	
	if(pPrice == null || pPrice== "")
	{
		window.alert("Product price cannot be empty");
		return false;
	}
	
	return true;

}