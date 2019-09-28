package com.collection2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListItreatorDemo {
	public static void main(String[] args) {
		LinkedList<Object> l = new LinkedList<>();
		l.add("Ashish");
		l.add("Kundan");
		l.add("kunal");
		l.add("Rakesh");
		System.out.println(l);
		ListIterator<Object> itr = l.listIterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			if(s.equals("kunal")) {
				System.out.println(s);
			}
			else {
				System.out.println(l);	
			}
		}
		//System.out.println(l);
	}

}
