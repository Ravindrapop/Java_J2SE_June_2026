package com.pk.operator;

public class LogicalAndDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a < b && b > 10); // true && true = true
		System.out.println(a > b && b > 10);  //false && true = false
	}
}
