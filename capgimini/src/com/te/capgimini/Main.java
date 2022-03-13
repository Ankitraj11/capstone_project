package com.te.capgimini;

public class Main {

	public static void main(String[] args) {
	   Ticket ticket=new Ticket();
	   
	   ticket.addTicket("Ranchi", "patna", 12000);
	   ticket.addTicket("Mumbai", "Kolkata", 12000);
	   ticket.addTicket("HYderabad", "Chennai", 12000);
	System.out.println(ticket.getAllCity());
	
		
	}
}
