package com.te.capgimini;

public class Bus {

	private String sourcePlcae;
	private  String destinationplace;
	private int charge;
	public Bus(String sourcePlcae, String destinationplace, int charge) {
		super();
		this.sourcePlcae = sourcePlcae;
		this.destinationplace = destinationplace;
		this.charge = charge;
	}
	public String getSourcePlcae() {
		return sourcePlcae;
	}
	public void setSourcePlcae(String sourcePlcae) {
		this.sourcePlcae = sourcePlcae;
	}
	public String getDestinationplace() {
		return destinationplace;
	}
	public void setDestinationplace(String destinationplace) {
		this.destinationplace = destinationplace;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	
	
}
