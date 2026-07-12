package com.pk.operator;

public class LogicalDemo2 {
	
	public static void main(String[] args) {
		
		int marks = 75;
		boolean sports = true;
		
		boolean result = (marks >= 60 && sports) || marks >= 90;//true || false
		
		System.out.println(result); //true
	}

}
