package javaFullstack.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestLinkedListMethods2 {
	public static void main(String[] args) {
//		LinkedList Methods
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println("add() method:");
		list.add(1,40); //This method insert the specified element at the specified position in the list
		System.out.println(list);
		list.add(50); //This element adds the element at the last position
		System.out.println(list);
		
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Google");
		list2.add("Micro");
		list2.add("Soft");
		list2.add("10");
		list2.add("20");
		Collection<String> collect = new ArrayList<String>();
		
		System.out.println("The list is: "+list2);
		
		collect.add("Java");
		collect.add("Python");
		collect.add("C++");
		collect.add("HTML");
		
//		System.out.println("Ths list is:"+list);
		
		list2.addAll(collect); //This method appends all of the elements in the specified collection to the end of the list
							//in the order that they are return by the specified collection iterator.
		System.out.println("The new list is: "+list2);
		
		list2.addFirst("First"); //This method adds the element at the beginning of the list
		System.out.println(list2);
		
		list2.addLast("Last"); // This method appends the specified element at the end of the list
		System.out.println(list2);
		
		list.clear(); //This method removes all of the elements from the list
		System.out.println("A List after clear: "+list);
		
		LinkedList sec_list = new LinkedList();
		sec_list = (LinkedList) list2.clone(); //This method return shallow copy of this list
		System.out.println("\nSecond List: "+sec_list);
		
		System.out.println(list2.contains("Java")); // This method return true if this list contains the specified elements.
		
		Iterator x = (Iterator) list2.descendingIterator();
		                                                                                        
		System.out.println(list2.descendingIterator());
		
		
	}
}
