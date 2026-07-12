package com.aa.variables;

public class StaticVarDemo {
    int x = 5 ;
    static int y = 10;
	public static void main(String[] args) {
		
		StaticVarDemo svd = new StaticVarDemo();
		 svd.x = 100;
         svd.y = 200;
         StaticVarDemo svd2 = new StaticVarDemo();
         System.out.println(svd2.x+" "+svd2.y);
	}

}
