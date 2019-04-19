package com.fujitsu.daos;

import java.util.List;

import com.fujitsu.beans.Product;
/*
 * Author:Divya Sharma
 * Creation date:19/03/2019
 * Modification date:02/03/2019
 * Version:3.0
 * Copyright:Fujitsu Consulting India Pvt. 
 * Description: It represent database entity.
 * It is java bean class.It Contains CRUD operation methods
 */
//DAO Interface - DAO Design Pattern

public interface ProductDAO {
	
	
	
	
	List<Product> getAllProducts();
	Product getProductById(int productId);
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	
	
	
	
}
