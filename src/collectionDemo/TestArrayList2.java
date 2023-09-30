package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList2 {
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		ArrayList list2 = new ArrayList();
		list2.addAll(list1);
		System.out.println(list2);
		
		list2.removeAll(list1);
		System.out.println("After removing: "+list2);
		
//		sort --- Collections.sort()
		System.out.println("Elements in array list: "+list1);
		Collections.sort(list1);
		System.out.println("After Sorting: "+list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("Sort the elements in reverse order: "+list1);
		
//		Shuffling--- Collections.shuffle
		Collections.shuffle(list1);
		System.out.println("Elements after shuffling: "+list1);
	}
}
