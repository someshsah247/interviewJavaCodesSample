package com.learn.basics.strems;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int id;
	private String name;
	private int price;
	
	public static List<Product>  getProfuctList() {
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"some",5));
		list.add(new Product(2,"someone",10));
		list.add(new Product(3,"someday",6));
		list.add(new Product(4,"somewhere",11));
		list.add(new Product(5,"sometwo",7));
		list.add(new Product(6,"someones",12));
		list.add(new Product(7,"somedays",8));
		list.add(new Product(8,"somehow",15));
		return list;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
