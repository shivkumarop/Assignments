package com.simplilearn.string;

public class StringBufferDemo {
	public static void main(String[] argd)
	{
		StringBuffer str=new StringBuffer("Hellow World");
		System.out.println("Character at Index 4: "+str.charAt(4));
		System.out.println("String lengh "+str.length());
		System.out.println("Replace "+str.replace(0,  5, "Welcome"));
		System.out.println("Reverse String "+str.reverse());
		
		
	}

}
