package com.Comparator;

import java.util.ArrayList;
import java.util.Iterator;

public class TestComparator {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101,"Amar",24,34000));
		list.add(new Employee(102,"Akbar",23,33300));
		list.add(new Employee(103,"Anthony",21,43000));
		
		Iterator<Employee> iterator = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
