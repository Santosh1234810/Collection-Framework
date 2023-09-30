package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		
//		ArrayList<Integer> list = new ArrayList<Integer>(); //Stored only homogeneous data i.e. Integer
//		ArrayList<String> list1 = new ArrayList<String>(); ////Stored only homogeneous data i.e. String
//		List list2 = new ArrayList();
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("Java");
		al.add('P');
		al.add(true);
		
		System.out.println(al);
		
//		methods
//		size() // this method tells the how many elements are present in array list
		System.out.println("Number of elements present in array list: "+al.size());
		
//		remove()
		al.remove(2); //here 2 is index
//		al.remove('P'); //here P is element
		System.out.println("After removing: "+al);
		
//		insert a element
//		add(index, object);
		al.add(2,"Python");
		System.out.println(al);
		
//		retrieve the specific elements using the get() method
		System.out.println(al.get(2)); //Python, here 2 is index of object/element
		
//		replace old value with the new value
		al.set(3, "C#");
		System.out.println("After replace:"+al);
		
//		search - contains() returns true / false
		System.out.println(al.contains("C#")); //true
		System.out.println(al.contains("C++")); //false
		
//		isEmpty
		System.out.println(al.isEmpty()); //false
		
//		there are 3 ways we can read the data
//		1) for loop
		
		
		System.out.println("========================================");
		System.out.println("Reading elements Using for loop");
		for (int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("==========================================");
		
//		2) forEach loop
		System.out.println("Reading elements using forEach loop");
		for (Object e:al)
		{
			System.out.println(e);
		}
		
//		3) Iterator()
		System.out.println("==========================================");
		System.out.println("Reading elements using iterator");
		
		Iterator iterator = al.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
}
