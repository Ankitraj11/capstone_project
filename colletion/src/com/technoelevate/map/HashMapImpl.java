package com.technoelevate.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImpl {
public static void main(String[] args) {
	Map<Integer,String> map=new LinkedHashMap<Integer,String>();
	map.put(100, "Roy");
	map.put(200, "Roy");
	map.put(300, "Sam");
	map.put(400, "Sam");
	System.out.println(map);
	System.out.println("==========get()============= ");
	System.out.println(map.get(100));
	System.out.println(map.values());
	
	Set integers =map.keySet();
	System.out.println(integers);
	System.out.println("--------entryset---------");
	Set set =map.entrySet();
	System.out.println(set);
	Collection<String> collection=map.values();
	System.out.println(collection);
	Set<Map.Entry<Integer, String>> set3=map.entrySet();
	System.out.println(set3);
	for(Map.Entry<Integer, String> entry:set3) {
		if(entry.getKey()==200) {
			entry.setValue("john");
		}
	}
	
}
}
