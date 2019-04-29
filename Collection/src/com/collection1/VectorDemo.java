package com.collection1;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		System.out.println(v.capacity());
		for(int i=1; i<=10; i++) {
			v.addElement(i);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v);
		System.out.println(v.capacity());
		
		v.remove("A");
		System.out.println("remove: "+v);
		
		v.add("A");
		System.out.println("add: "+v);
		
		//get firstElement
		System.out.println("get FirstElement: "+v.firstElement());
		
		//get lastElement
		System.out.println("get lastElement: "+v.lastElement());
		
		v.removeAllElements();
		System.out.println("removeall: "+v);
		
		
	}

}
