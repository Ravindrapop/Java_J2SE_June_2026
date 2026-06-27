package com.aa.variables;

public class MethodWith1to3Arguments {

	public static void main(String[] args) {

        m1(1);
        
        m1(1,2);
        
        m1(1,2,3);
        
    }
    
    public static void m1(int a) {
        System.out.println("m1 method with one argument");
    }
    
    public static void m1(int a, int b) {
        System.out.println("m1 method with two argument");
    }
    
    public static void m1(int a, int b, int c) {
        
        System.out.println("m1 method with three argument");
    }

}