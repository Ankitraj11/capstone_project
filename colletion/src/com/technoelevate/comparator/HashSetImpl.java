package com.technoelevate.comparator;

import java.util.TreeSet;

public class HashSetImpl {

	public static void main(String[] args) {
		TreeSet hashSet=new TreeSet();
		hashSet.add(20);
		hashSet.add(10);
		hashSet.add(40);
		hashSet.add(30);
		hashSet.add(30);
		hashSet.add(30);
		
	System.out.println(hashSet);	
		for(Object object: hashSet) {
			System.out.println(object);
		}
	}
}
