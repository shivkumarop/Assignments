package com.simplilearn.methods;

public class MethodOverload {
public int add(int a,int b)
{
	return a+b;
	
}
public int add(int a,int b,int c)
{
	return a+b+c;
	
}
public float add(float a,float b)
{
	return a+b;
}
public float add(float a,float b,float c)
{
	return a+b+c;
	
}
public double add(double a,double b)
{
	return a+b;
}
public static void main(String[] args) {
	MethodOverload m=new MethodOverload();
	System.out.println("Add 2 int "+m.add(3,  6));
	System.out.println("Add 3 int "+m.add(3,  6, 8));
	System.out.println("Add 2 float "+m.add(3.0f,  6.6f));
	System.out.println("Add 2 double "+m.add(3.5,  6.8));
	
}
}
