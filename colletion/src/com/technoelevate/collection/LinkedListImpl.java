package com.technoelevate.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImpl {

	public static void main(String[] args) {
		LinkedList<Integer> lst=new LinkedList<Integer>();
	    lst.add(20);
	    lst.add(30);
	    lst.add(10);
	    lst.add(70);
	    lst.add(50);
	    System.out.println("-------using for each loop---------");
	    for(Object object:lst) {
	    	System.out.println(object);
	    }
	    System.out.println("---using iterator--------------");
	    Iterator<Integer> lst2=lst.iterator();
	    while(lst2.hasNext()) {
	    	System.out.println(lst2.next());
	    }
	    System.out.println("---using list iterator-----------");
	    ListIterator<Integer> lst3=lst.listIterator();
	    while(lst3.hasNext()) {
	    	System.out.println(lst3.next());
	    }
	    
	    
	}
	
	
	
	
	
}
