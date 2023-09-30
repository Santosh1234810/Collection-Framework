package collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Ajay");
		map.put(102, "Akshay");
		map.put(103, "Jayesh");
		map.put(104, "Kiran");
		
		System.out.println(map);
		
		System.out.println("*****************EntrySet*******************");
		for (Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.print("Keys : "+m.getKey() +" ");
			System.out.println("Values : "+m.getValue());
		}
		
		System.out.println("*****************KeySet*********************");
		for (Integer key:map.keySet())
		{
			System.out.println("Keyset: "+key);
		}

		System.out.println("*****************KeySet*********************");
		for (String value:map.values())
		{
			System.out.println("Values: "+value);
		}
		

		System.out.println("***************Iterator*******************");
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> m = iterator.next();
			
			System.out.print(m.getKey() +" ");
			System.out.println(m.getValue());
		}
		

		System.out.println("***************Lambda Expression*********************");
		map.forEach((k,v)-> System.out.println(k+" "+v));
		
		System.out.println("Size: "+map.size());
		

		System.out.println("***************isEmpty method*********************");
		System.out.println(map.isEmpty());
		

		System.out.println("***************contains() method*********************");
		System.out.println(map.containsKey(103));
		
		if (map.containsKey(106))
		{
			System.out.println("Key is present");
		}
		else
		{
			System.out.println("Key not present");
		}
		
		System.out.println("get() method: "+map.get(101));
		
		System.out.println(map.remove(104));
		System.out.println(map);
		
		Map<Integer,String> map1 = new HashMap<Integer, String>();
		map1.putAll(map);
		System.out.println(map1);
		
		map1.clear();
		System.out.println(map1);
	}
}