package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer, Employee> hashmap = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee(101, "Akshay");
		Employee e2 = new Employee(102, "Amar");
		Employee e3 = new Employee(103, "Ganesh");
		
		hashmap.put(e1.getId(), e1);
		hashmap.put(e2.getId(), e2);
		hashmap.put(e3.getId(), e3);
		
		for (Map.Entry<Integer, Employee> e:hashmap.entrySet())
		{
			System.out.println(e.getKey());
//			System.out.println(e.getValue());
			Employee emp = e.getValue();
			System.out.println(emp);
		}
	}
}
