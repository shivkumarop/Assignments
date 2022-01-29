package com.simplilearn.annoyinner;

public class AnnonymousTest {
	 public static void main(String[] args) {
	        
	        Car c=new Car() {
	            
	            @Override
	            public void stop() {
	                System.out.println("car started from annonymous class");
	                
	            }
	            
	            @Override
	            public void start() {
	                System.out.println("Car stopped from annonymous class");
	                
	            }
	        };
	        
	        c.start();
	        c.stop();
	    }

}
