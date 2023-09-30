package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList3 {
	public static void main(String[] args) {
		
		String arr[] = {"Java","Python","C","C++"};
		
//		convert the array to array list
		ArrayList al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}
}
