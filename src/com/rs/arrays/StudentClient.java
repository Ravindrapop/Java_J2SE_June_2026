package com.rs.arrays;

public class StudentClient {

	public static void main(String[]args) {
		
		Student s1 = new Student();
		
		s1.setId(101);
		s1.setName("hemant");
		
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		Student s2 = new Student();
		
		s2.setId(102);
		s2.setName("Poonam");
		
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		
		
		
		
	}
}
