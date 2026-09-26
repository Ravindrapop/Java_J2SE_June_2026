package com.aa.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerArrayList {

	public static void main(String[] args) {
    
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		
		Iterator<Integer> itr = arrayList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
