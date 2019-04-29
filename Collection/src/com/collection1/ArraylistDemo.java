package com.collection1;

import java.util.ArrayList;

public class ArraylistDemo {
	public static void main(String[] args) {
		ArrayList<Object> a =new ArrayList<>();
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a);
		
		a.remove(2);
		System.out.println(a);
		
		a.add(2, "m");
		a.add("n");
		System.out.println(a);
		
	}

}
