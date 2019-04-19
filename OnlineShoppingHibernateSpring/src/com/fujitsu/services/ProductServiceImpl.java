package com.fujitsu.services;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fujitsu.beans.Product;
import com.fujitsu.daos.ProductDAO;
import com.fujitsu.exceptions.ServiceException;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDao;
	
	
	@Override
	public List<Product> findAllProducts() throws ServiceException {
		return productDao.getAllProducts();
	}

	@Override
	public Product findById(int productId) throws ServiceException {
		return productDao.getProductById(productId);
	}

	@Override
	public void add(Product product) throws ServiceException {
		productDao.insert(product);
	}

	@Override
	public void update(Product product) throws ServiceException {
		productDao.update(product);
	}

	@Override
	public void remove(Product product) throws ServiceException {
		productDao.delete(product);
	}

	@Override
	public List<Product> sortProductsById() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllProducts().stream().sorted().
				collect(Collectors.toList());
	}

	@Override
	public List<Product> sortProductsByName() throws ServiceException {
		// TODO Auto-generated method stub
		return findAllProducts().stream().
				sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Product> findProductsByPriceRange(float minPrice, float maxPrice) throws ServiceException {
		// TODO Auto-generated method stub
		return findAllProducts().stream().
				filter(p->p.getPrice()>minPrice && p.getPrice()<maxPrice)
				.collect(Collectors.toList());
	}

	@Override
	public List<Product> findProductsByBrand(String brand) throws ServiceException {
		// TODO Auto-generated method stub
		return findAllProducts().stream().filter(p->p.getBrand().equals(brand))
						.collect(Collectors.toList());
	}

}
