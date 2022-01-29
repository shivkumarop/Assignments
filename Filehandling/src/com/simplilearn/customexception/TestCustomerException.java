package com.simplilearn.customexception;

public class TestCustomerException {
	
	
	void check(int age) throws NotValidAgeException
	{
		if(age<18)
			throw new NotValidAgeException("Age is less than 18");
		else
			System.out.println("Valid");
	}

	public static void main(String[] args) throws NotValidAgeException {

		TestCustomerException t=new TestCustomerException();

		t.check(67);
	}

}
