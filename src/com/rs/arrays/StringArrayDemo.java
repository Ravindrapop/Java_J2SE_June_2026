package com.rs.arrays;

public class StringArrayDemo {
	
	public static void main(String[]args) {
		
		String[] names = new String[5];
		
		names[0]="Ram";
		names[1]="Hari";
		names[2]="Durga";
		names[3]="Anuj";
		names[4]="Sandhya";
		
		System.out.println(names[2]);
		System.out.println(names[1]);
		System.out.println(names[4]);
		System.out.println(names[3]);
		System.out.println(names[0]);
		
		System.out.println("Second way to creating array:");
		
			String[]companyNames= {"TCS","Infosys","HCL","Wipro","Coforge"};
			
			for(int i=0;i<companyNames.length;i++) {//5<=5
				
				System.out.println(companyNames[i]);//companyNames[1]
			}
			}
}