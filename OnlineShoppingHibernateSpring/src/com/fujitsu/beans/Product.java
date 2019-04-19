package com.fujitsu.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
/*
 * 
 * Author:Divya Sharma
 * Creation date:19/03/2019
 * Modification date:02/04/2019
 * Version:7.0
 * Copyright:Fujitsu Consulting India Pvt. 
 * Description: It represent database entity.
 * it is java bean class.
 * */
@Component
@Entity
@Table(name="product_1")
public class Product implements Serializable,Comparable<Product> {
	
	@Id
	@GeneratedValue(generator="increment")
	@Column(name="product_id")
	private int productId;
	
	@Column(length=30,nullable=false)
	private String name;
	
	@Column(length=20,nullable=false)
	private String brand;
	private float price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return this.productId>productId?1:-1;
	}
	
	
	
	
}
