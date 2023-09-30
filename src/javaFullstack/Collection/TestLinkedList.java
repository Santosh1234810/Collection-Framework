package javaFullstack.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student
{
	private int rollno;
	private String name;
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	
	Student()
	{
		
	}
	
	Student(int rollno, String name, int sub1, int sub2, int sub3, int sub4, int sub5)
	{
		this.rollno = rollno;
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2; 
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}

	public int getSub4() {
		return sub4;
	}

	public void setSub4(int sub4) {
		this.sub4 = sub4;
	}

	public int getSub5() {
		return sub5;
	}

	public void setSub5(int sub5) {
		this.sub5 = sub5;
	}
	
}
public class TestLinkedList {
	public static void main(String[] args) {
		List<Student> slist= new LinkedList<Student>();
		slist.add(new Student(101, "Akshay",40,50,76,67,76));
		slist.add(new Student(102, "Aniket", 56,54,63,43,67));
		
		Iterator<Student> itr= slist.iterator();
		while(itr.hasNext())
		{
			Student s1 = itr.next();
			int total = s1.getSub1() + s1.getSub2() + s1.getSub3() + s1.getSub4() + s1.getSub5();
			int avg = total/5;
			
			System.out.println("Roll no."+s1.getRollno()+"\t\t\t"+"Name: "+s1.getName()+ "\t\t\t"+"Total Marks: "+total+ "\t\t\t"+"Average: "+avg);
		}
	}
}
