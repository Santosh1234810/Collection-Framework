package com.Comparable;

import java.util.Scanner;

public class Employee implements Comparable<Employee>{
	int empid;
	String ename;
	int age;
	int salary;
	
	Scanner sc = new Scanner(System.in);
	
	public Employee()
	{
		
	}
	
	public Employee(int empid, String ename, int age, int salary)
	{
		this.empid = empid;
		this.ename = ename;
		this.age = age; 
		this.salary = salary;
	}
	
	public void input()
	{
		System.out.println("Enter the employee id: ");
		empid = sc.nextInt();
		
		System.out.println("Enter the Employee age: ");
		ename = sc.next();
		
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		
		System.out.println("Enter the salary: ");
		salary = sc.nextInt();
	}
	
	

	@Override
	public int compareTo(Employee e) {
		return (this.age - e.age);
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", age=" + age + ", salary=" + salary + "]";
	}
}

	

