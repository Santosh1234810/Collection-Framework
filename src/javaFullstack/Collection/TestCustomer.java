package javaFullstack.Collection;

import java.util.HashSet;
import java.util.Set;

class CustomerDetails
{
	private int id;
	private String name;
	private String address;
	private int bill;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	CustomerDetails()
	{
		
	}
	
	CustomerDetails(int id, String name, String address, int bill)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.bill = bill;
	}
	
	public String toString()
	{
		return "Id: " + id + " Name: "+name +" Address: "+ address +" Bill: " +bill;
	}
}

// List iterator: we cannot use in set, queue
// (but if you use linkedlist ten ListInterator is use) and dequeue
public class TestCustomer {
	public static void main(String[] args) {
		Set <CustomerDetails> cd = new HashSet<CustomerDetails>();
		cd.add(new CustomerDetails(101, "Ram", "Pune", 5000));
		System.out.println(cd);
	}
}
