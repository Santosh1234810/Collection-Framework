package com.Comparator;

import java.util.Scanner;

public class Employee {

	int id;
	String name;
	int age; 
	int salary;
	
	Scanner sc = new Scanner(System.in);
	
	
	Employee(int id, String name, int age, int salary)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void input()
	{
		System.out.println("Enter the id,name,age,salary");
		id = sc.nextInt();
		name = sc.next();
		age = sc.nextInt();
		salary = sc.nextInt();
	}
	public static void main(String[] args) {
		
	}

}
