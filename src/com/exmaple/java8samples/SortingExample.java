package com.exmaple.java8samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExample {
	
	public static void main(String args[]) {
		List<String> names = new ArrayList<String>();
		names.add("Apple");
		names.add("Orange");
		names.add("Banana");
		names.add("Pineapple");
		
		List<String> names2 = new ArrayList<String>();
		names2.add("Apple");
		names2.add("Orange");
		names2.add("Banana");
		names2.add("Pineapple");
		
		SortingExample se = new SortingExample();
		System.out.println(".....Java 7 Systax....");
		
		se.sortUsingJava7(names);
		System.out.println(names);
		
		
		
	}
	
	public void sortUsingJava7(List<String> names){
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
	}

}
