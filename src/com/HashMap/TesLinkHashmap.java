package com.HashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TesLinkHashmap {
	public static void main(String[] args) {
		
		Map<Integer, String> hashmap = new LinkedHashMap<Integer, String>();
		
		hashmap.put(101, "Amar");
		hashmap.put(102, "Akshay");
		hashmap.put(103, "Aniket");
		
//		System.out.println(hashmap);
		
		System.out.println("Through forEach Loop");
		for (Map.Entry<Integer, String> e1:hashmap.entrySet())
		{
			System.out.println(e1.getKey());
			String s1 = e1.getValue();
			System.out.println(s1);
		}
		
		System.out.println("\nThrough Iterator");
		
		Iterator<Map.Entry<Integer, String>> iterator = hashmap.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Integer, String> s1 = iterator.next();
			System.out.println(s1);
		}
		
	}
}
