package com.te.capgimini;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Ticket {

public ArrayList<Bus> busList=new ArrayList<Bus>();
   
public void addTicket(String source,String destination,int charge) {
	
	Bus bus=new Bus(source,destination,charge);
	busList.add(bus);
	
	
	
}
public List<String> getAllCity(){
	
	List<String> list=new ArrayList<String>();
	list.add(busList.get(0).getSourcePlcae());
	list.add(busList.get(0).getDestinationplace());
	list.add(busList.get(1).getSourcePlcae());
	list.add(busList.get(1).getDestinationplace());
   	
	Collections.sort(list);
	return list;
	
	
}





}
