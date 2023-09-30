package arrayList;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		
		if (list.contains(1))
		{
			System.out.println("Number is present");
		}
		else
		{
			System.out.println("Number is not present");
		}
		
		if (list.isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
		
		System.out.println(list.get(2));
		System.out.println(list.indexOf(1));
		
		System.out.println(list);
		List<Integer> sub = list.subList(1, 3);
		System.out.println("Sublist: "+list);
		
		Object[] ob= list.toArray();
		for (Object i:ob)
		{
			System.out.print(i+" ");
		}
		
		list.add(5);
		System.out.println("\n"+list);
		
		Integer[] obj = new Integer[list.size()];
		obj = list.toArray(obj);
		for (Integer i: obj)
		{
			System.out.print(i+" ");          
		}
		
	}
}
