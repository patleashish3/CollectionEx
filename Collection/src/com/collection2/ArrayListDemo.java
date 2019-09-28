package com.collection2;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<>();

		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a);
		
		a.add(2, 30);
		System.out.println(a);
		
		//a.addAll(2, a);
		//System.out.println(a);
		
		/*a.addAll(a);
		System.out.println(a);*/
		
		//System.out.println(a.get(4));
		
		a.remove(2);
		System.out.println(a);

	}

}
