package javaFullstack.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinkedListMethods {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Pune");
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Varanasi");
		
		System.out.println(list);
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext())
		{
			String str1 = itr.next();
			System.out.println(str1);
		}
		
		while(itr.hasPrevious())
		{
			String str2 = itr.previous();
			System.out.println(str2);
		}
	}
}
