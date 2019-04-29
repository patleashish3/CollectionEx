package com.collection1;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {
		LinkedList<Object> l=new LinkedList<>();
		l.add("Ashish");
		l.add("Rashmi");
		l.add("Kunal");
		l.add("Roshan");
		l.add("Ashta");
		System.out.println(l);
		ListIterator<Object> litr=l.listIterator();
		while(litr.hasNext()) {
			String s=(String)litr.next();
			if(s.equals("Rashmi")) {
				litr.set("Sejal");
				System.out.println(l);
			}
			if(s.equals("Roshan")) {
				litr.remove();
				System.out.println(l);
			}
			if(s.equals("Ashish")) {
				litr.add("Rashmi");
				System.out.println(l);
			}
			
		}
		
		
	}

}
