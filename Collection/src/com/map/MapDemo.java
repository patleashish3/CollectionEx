package com.map;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<Object, Object> m=new HashMap<>();
		m.put("101", "Ashish");
		m.put("101", "Rashmi");
		m.put("102", "Ashta");
		m.put("103", "Kunal");
		m.put("104", "Ashish");
		m.put("105", "Yandra");
		m.put("104", "Sejal");
		System.out.println(m);
		
		//System.out.println(m.get("101"));
		//System.out.println(m.remove("102"));
		//System.out.println(m.remove("103", "Ashish"));
		//System.out.println(m.replace("103", "Kunal"));
		//System.out.println(m.containsKey("105"));
		System.out.println(m.containsValue("Kunal"));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		System.out.println(m.keySet());
		System.out.println(m.entrySet());
		System.out.println(m.values());
		//System.out.println(m);
		
		
	}

}
