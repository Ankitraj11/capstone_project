package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(2,60);
	//	arrayList.remove(3);
		System.out.println(arrayList.get(2));
		System.out.println(arrayList);
		
		System.out.println("first wayy if iterating using for loop");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("second way of iterating using for each method");
		for(Integer object :arrayList) {
			System.out.println(object);
		}
		System.out.println(" 3rd way of iterating using iterator()");
		Iterator<Integer> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("4th way of iterating using listIterator() method");
		    ListIterator iterator2=arrayList.listIterator();
		    while(iterator2.hasNext()) {
		    	System.out.println(iterator2.next());
		   
		    }
		    System.out.println("5th way of iterating using listIteartor() method ");
		ListIterator iterator3=arrayList.listIterator(arrayList.size());
		   while(iterator3.hasPrevious()) {
			   System.out.println(iterator3.previous());
		   }
		
	}

}
