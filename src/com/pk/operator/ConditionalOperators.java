package com.pk.operator;

class ConditionalOperators {  
	
	public static void main(String[] args) {
		 
		int a = 10, b = 20;
		
		int x = (a > b) ? 40:50;
		
		System.out.println(x);
		
		int y = (a > 50 ) ? 777 : ((a > 100) ? 888 : 999);
		
		System.out.println(y);
	}

}
