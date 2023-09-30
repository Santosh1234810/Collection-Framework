package com.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		
		Map<String, String> treemap = new TreeMap<String, String>();
		
		treemap.put("Aniket", "Pune");
		treemap.put("Rishabh", "Rishab");
		treemap.put("Chennai", "Amar");
		
//		System.out.println(treemap);
		System.out.println("Through forEach loop");
		for (Map.Entry<String, String> map:treemap.entrySet())
		{
			System.out.print(map.getKey() +": ");
			System.out.println(map.getValue());
		}
		
		System.out.println("Through Iterator");
		Iterator<Map.Entry<String, String>> iterator = treemap.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String, String> s1 = iterator.next();
			System.out.println(s1);
		}
	}
}
