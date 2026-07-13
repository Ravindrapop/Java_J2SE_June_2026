package com.asg.operators;

public class DobleEqualOpe {

	public static void main(String[] args) {
		    int a = 10;
	        
	        int b = 20;
	        
	        System.out.println(a==b);
	        
	        String s1 = new String("Durga");
	        
	        String s2 = new String("Durga");
	        
	        System.out.println(s1==s2);
	        
	        System.out.println(s1.equals(s2));
	        
	        DobleEqualOpe deo1 = new DobleEqualOpe();
	        
	        DobleEqualOpe deo2 = new DobleEqualOpe();
	        
	        System.out.println(deo1.hashCode());
	        
	        System.out.println(deo2.hashCode());
	        
	        System.out.println(deo1==deo2);
	        
	        Object obj = new Object();//object creation

	}

}
