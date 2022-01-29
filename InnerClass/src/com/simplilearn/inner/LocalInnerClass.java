package com.simplilearn.inner;

public class LocalInnerClass {
void validate(int age)
{
	if(age>=18)
	{
		class Inner{
			void test()
			{
				System.out.println("Now Authrnticate User Using Adhar");
				
			}
		}
		Inner inner= new Inner();
		inner.test();
	}
}
public static void main(String[] args)
{
	LocalInnerClass local=new LocalInnerClass();
	local.validate(45);
	}
	
}

