package com.learn.basics.methodreference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

//Reference to a constructor	ClassName::new
public class ReferenceToConstructor {
	
	public static void main(String[] args) {
		
		List<String> itemList = new ArrayList<>();
		itemList.add("item1");
		itemList.add("item2");
		itemList.add("item3");
		itemList.add("item4");
		itemList.add("item5");
		
		//Lambda way
		Function<List<String>, Set<String>> list2 = (itemLists) -> new HashSet<String>(itemLists);
		System.out.println(list2.apply(itemList));
		
		//
		Function<List<String>, Set<String>> list3 = HashSet::new;
		System.out.println(list3.apply(itemList));
		
	}
}
