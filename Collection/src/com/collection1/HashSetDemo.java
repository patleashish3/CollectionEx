package com.collection1;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<>();
		h.add("ddasB");
		h.add("Csdx");
		h.add("tgrt");
		h.add("Z");
		h.add("yuih");
		h.add("");
		h.add(null);
		h.add(10);
		h.add(10);
		
		System.out.println(h.add("Z"));
		System.out.println(h);
	}

}
