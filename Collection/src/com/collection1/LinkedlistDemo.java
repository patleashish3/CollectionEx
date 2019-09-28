package com.collection1;

import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList<Object> l=new LinkedList<>();
		l.add("Ashish");
		l.add(30);
		l.add(null);
		l.add("Ashish");
		System.out.println("Array: "+l);
		//Replace Method
		l.set(0, "Rashmi");
		System.out.println("Replace Array: "+l);
		//Replace Method
		l.set(0, "Ashta");
		System.out.println("Replace Array: "+l);
		//Add Method
		l.addFirst("Roshan");
		System.out.println("Add Array: "+l);
		//Remove method
		l.removeFirst();
		System.out.println("Remove first Array: "+l);
		
		l.addLast("Kunal");
		System.out.println("AddLast Array: "+l);
		
		l.removeLast();
		System.out.println("RemoveLast Array: "+l);
		
		//Array size()
		System.out.println("Array Size: "+l.size());
		
		l.removeFirst();
		System.out.println("RemoveFirst Array: "+l);
		
		//getFirst();
		System.out.println("getFirst Array: "+l.getFirst());
		
		//getLast();
		System.out.println("getLast array: "+l.getLast());
		
		
		//isEmpty();
		System.out.println("Empty or not: "+l.isEmpty());
		
		//indexOf()
		System.out.println(l.indexOf(null));
		
		//l.lastIndexOf(l);
		//System.out.println("Last Index of array: "+l);
		
		//Get method
		System.out.println("get array: "+l.get(2));
		
		//clear
		l.clear();
		System.out.println("clear array: "+l);
	
		
		
	}

}
