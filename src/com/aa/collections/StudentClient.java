package com.aa.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Added Custom object

public class StudentClient {

	public static void main(String[] args) {
		  List<Student> list = new ArrayList<Student>();

	        list.add(new Student(101, "Aditya"));
	        list.add(new Student(102, "Yuvraj"));
	        list.add(new Student(103, "Abhishek"));
	        list.add(new Student(104, "Ramendra"));
	        list.add(new Student(105, "Shailendra"));

	        Iterator<Student> itr = list.iterator();

	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	        System.out.println("Iterate student objects from list using for each:");

	        for (Student student : list) {
	            System.out.println(student.getName());
	        }

	        System.out.println("Iterate student objects from list using advance for each:");

	        list.forEach((e) -> {
	            System.out.println(e);
	        });
	    }

	}

