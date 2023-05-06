package com.learn.basics.strems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
	
	public static void main(String[] args) {
		
		//new List 
		List<Product> list = new ArrayList<>();
		
		//Get Product List from Producr Class
		List<Product> productList = Product.getProfuctList();
		
		// filter in tradition way 
		for (Product p : productList) {
			if(p.getPrice()>=10)
				list.add(p);				
		}
		System.out.println(list);
		
		// Filter using stram way 
		// Convert list into stream  -- Product.getProfuctList().stream()
		// now use filter(predict) --filter((p)->p.getPrice()>=10)
		// now we have to collect it and convert it in list again  -- collect(Collectors.toList())
		List<Product> list2 = Product.getProfuctList().stream().filter((p)->p.getPrice()>=10).collect(Collectors.toList());
		System.out.println(list2);
		
		//sort using Stream API
		List<String> strList = new ArrayList<>();
		//strList.add("")
		List<Product> list3 = Product.getProfuctList().stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(list3);
		
		//List<Product> list3 = Product.getProfuctList().stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println(list3);
	}

}
