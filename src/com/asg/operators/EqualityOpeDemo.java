package com.asg.operators;

public class EqualityOpeDemo {

	public static void main(String[] args) {
		
		System.out.println(10==10.0);
        
		System.out.println('a'==97);
        
		System.out.println(true==false);
        
		System.out.println(10.5==12.5);
        
        Thread t1 = new Thread();
        
        Thread t2 = new Thread();
        
        System.out.println(t1==t2);
        
        Thread t3 = t1;
        
        System.out.println(t3==t1);

	}

}
