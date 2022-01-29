package com.simplilearn.methods;

import java.util.Scanner;

public class Sample {
	public void display()
	{
		System.out.println("welcom to java");
		
	}
	
	public int add(int a,int b)
	{
		int num1=a+b;
		int num2=a*b;
		return num1+num2;
	}
	public boolean valid(int age)
	{
		if(age>18)
			return true;
			else 
				return false;
		
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int input=sc.nextInt();
		if(s.valid(input))
			System.out.println("valid for vote");
		else
			System.out.println("not valid");
	}
}
			
	
