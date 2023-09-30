package javaFullstack.Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
		set.add("Pune");
		set.add("Mumbai");
		set.add("Delhi");
		set.add("Parbhani");
		set.add("Beed");
		System.out.println("Elements are: "+set);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Iterator: "+iterator.next());
		}
		System.out.println("*************************************");
	}
}
