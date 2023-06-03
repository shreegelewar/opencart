package demo;

import java.util.Scanner;

public class InterfaceImplement implements client {
	
	String name;
	double sal;

	@Override
	public void input() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		 name=sc.nextLine();
		System.out.println("Enter Salary");
		 sal=sc.nextDouble();
		
		
	}

	@Override
	public void output() {
		System.out.println(name+" "+sal);
	//	System.out.println("Salary is >>>" + sal);
			
	}
	
	public static void main(String[] args) {
		
		client c=new InterfaceImplement();
		c.input();
		c.output();
	}

}
