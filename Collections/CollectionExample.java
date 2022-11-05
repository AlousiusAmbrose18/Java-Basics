package com.alo.Collections;

import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
	int Id;
	String Name;
	
	public Employee(int id, String name) {
		Id = id;
		Name = name;
	}

	@Override
	public String toString() {
		return " Id = " + Id + ", Name = " + Name;
	}
	
	
	
}


public class CollectionExample {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		while(true)
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println();
			System.out.println("Enter Employee Details: ");
			System.out.println();
			
			System.out.print("Enter Id   : ");
			int id = sc.nextInt();
			System.out.print("Enter Name : ");
			String name = sc.next();
			emp.add(new Employee(id, name));
			System.out.println();
			System.out.println();
			
		
			System.out.print("Do you want to Continue ? y/n : ");
			if((sc.next().charAt(0))=='n') break;
			System.out.println("*************************************************");	
		}
		
		System.out.println(emp);
		
		
		
	}

}
