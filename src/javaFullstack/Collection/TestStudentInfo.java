package javaFullstack.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class StudentData
{
	int roll;
	String name;
	String dept;
	
	StudentData()
	{
		
	}
	
	StudentData(int roll, String name, String dept)
	{
		this.roll = roll;
		this.name = name;
		this.dept = dept;
	}
	
	public int hasCode()
	{
		return roll;
	}
	
	public boolean equals(Object ob)
	{
		StudentData sd2 = (StudentData) ob;
		return (roll == sd2.roll);
	}
	public String toString()
	{
		return "Roll no: " + roll +"  Name: " + name + " Department: " +dept;
		
	}
}
public class TestStudentInfo {
	public static void main(String[] args) {
		Set<StudentData> sd = new HashSet<StudentData>();
		
		sd.add(new StudentData(101, "Aniket","IT"));
		sd.add(new StudentData(102, "Amar","Mech"));
		sd.add(new StudentData(101,"Aniket","IT"));
		System.out.println("HashSet: "+sd);
		
		Iterator<StudentData> iterator = sd.iterator();
		while(iterator.hasNext())
		{
			StudentData sd3 = iterator.next();
			System.out.println(sd3);
		}
	}
}
