package com.collection1;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);
		
	    System.out.println(s.pop());
		//System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.search("A"));
		
		System.out.println(s.search("Ashish"));
		
		System.out.println(s.isEmpty());
	}

}
