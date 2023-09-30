package com.concurrentCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSynchronizedList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		Collections.synchronizedList(list);
		
		
		synchronized(list)
		{
			Iterator<Integer> iterator = list.iterator();
			
			while (iterator.hasNext())
			{
				int s1 = iterator.next();
				System.out.println(s1);
			}
		}
	}
}
