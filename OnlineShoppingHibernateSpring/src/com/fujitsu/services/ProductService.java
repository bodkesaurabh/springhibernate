package com.fujitsu.services;

import java.util.List;

import com.fujitsu.beans.Product;
import com.fujitsu.exceptions.ServiceException;
/*
 * Author: Divya Sharma
 * Creation Date:27/03/2019(DD/MM/YYYY)
 * Modification Date:02/04/219(DD/MM/YYYY)
 * Version: 1.0
 * Copyright: Fujitsu Consulting India. All rights reserved.
 * Description: Service Component Interface of Business Layer
 * */
public interface ProductService {
	
	List<Product> findAllProducts() throws ServiceException;
	Product findById(int productId)throws ServiceException;
	void add(Product product)throws ServiceException;
	void update(Product product)throws ServiceException;
	void remove(Product product)throws ServiceException;
	
	List<Product> sortProductsById() throws ServiceException;
	List<Product> sortProductsByName() throws ServiceException;
	List<Product> findProductsByPriceRange(float minPrice,float maxPrice)
			throws ServiceException;
	List<Product> findProductsByBrand(String brand) throws ServiceException;
	
}
