package com.pk.operator;

public class FindGreaterFromThree {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		int c = 20;
		
		if(a > b) {
			
			 if(a > c) {
				 
				 System.out.println("A is greater number.");
				 
			 }else {
				 System.out.println("C is greater number.");
			 }
			
		}else {
			
			if(b > c) {
				
				System.out.println("B is greater number.");
			}else {
				
				System.out.println("C is greater number.");
			}
		}
 		
	}

}
