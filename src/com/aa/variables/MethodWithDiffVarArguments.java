package com.aa.variables;

public class MethodWithDiffVarArguments {

	  public static void main(String[] args) {
	        System.out.println("main method has been started....");
	        
	        MethodWithDiffVarArguments car = new MethodWithDiffVarArguments();
	        
	        car.move();
	        
	        car.sum(10,20);
	        
	        car.wish("Hi good morning all");
	        int number = car.sumOfThreeNum(10,20,30);
	        
	        System.out.println(number);
	    }
	    
	    public void move() {
	        
	        System.out.println("car has been moving....");
	    }
	    
	    public void sum(int a, int b) {
	        
	        System.out.println(a+b);
	        
	    }
	    
	    public void wish(String message) {
	        System.out.println(message);
	    }
	    
	    public int sumOfThreeNum(int a, int b, int c) {
	        
	        return a+b+c;
	    }

	}