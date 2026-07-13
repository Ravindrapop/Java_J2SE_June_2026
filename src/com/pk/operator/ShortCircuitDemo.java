package com.pk.operator;

public class ShortCircuitDemo {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		System.out.println(a > 20 && ++a > 10); //false && true = false
		
		System.out.println(a);
	}

}
