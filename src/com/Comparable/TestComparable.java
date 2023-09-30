package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestComparable {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("Before sort:"+list);
		Collections.sort(list);
		
		Iterator<String> iterator = list.iterator();
		
		System.out.println("After sort:");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		Collections.sort(list);
		
		Iterator<String> iterator1 = list.iterator();
		while(iterator.hasNext())
		{
			System.out.println("Iterator2: "+iterator1.next());
		}
		

class Employee implements Comparable<Employee>{
	int empid;
	String ename;
	int age;
	int salary;
	
	Employee()
	{
		
	}
	
	Employee(int empid, String ename, int age, int salary)
	{
		this.empid = empid;
		this.ename = ename;
		this.age = age; 
		this.salary = salary;
	}
//	@Override
//	public int compareTo(Employee e) {
//		return (this.age - e.age);
//	}
	
	public int compareTo(Employee e)
	{
		return (this.ename.compareTo(ename));
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
}
}
