package com.ArrayOfArrayList;

import com.Comparable.Employee;

public class TestComprable {
	public static void main(String[] args) {
		Employee emp[] = new Employee[3];
		
		for (int i=0; i<emp.length; i++)
		{
			emp[i] = new Employee();
			emp[i].input();
		}
	}
}
