package com.rsg.variables;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		
		
		String s1 = new String("Ravi");
		
		String s2 = "Ravi";
		
	//	s1 = s1.intern();
		
		System.out.println(s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(6,7,8,9);
		
		List<Integer> list3 = Stream.of(list1, list2).flatMap(Collection::stream).toList();
		
		System.out.println(list3);

	}

}
