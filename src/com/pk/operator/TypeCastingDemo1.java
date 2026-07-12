package com.pk.operator;

public class TypeCastingDemo1 {
	
	public static void main(String[] args) {
		
		int x = 'a';
		System.out.println(x);
		
		double a = 13;
		System.out.println(a);
		
		byte b = (byte)130;
		System.out.println(b);
		
		int c = (int)130.456;
		System.out.println(c);
		
		int s = 10;
		double z = s;   
		System.out.println(z);
		
		double f = 10.5;
		int g = (int)f;
		System.out.println(g);
	}

}
