package com.johnw.oop2.exam;

public class Boat {
	private String boatName;
	private double boatLength;
	private boolean isSailBoat;
	
	public Boat(){
		this("Unknown",0,true);
	}
	
	public Boat(String boatName,double boatLength,boolean isSailBoat){
		setBoatName(boatName);
		setBoatLength(boatLength);
		setSailBoat(isSailBoat);
	}
	
	/** Accessor method for boat name
	 * 
	 * @return the name of the boat
	 */
	public String getBoatName() {
		return boatName;
	}
	
	/** Mutator method for boat name
	 * 
	 * @param boatName the name of the boat
	 */
	
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}
	public double getBoatLength() {
		return boatLength;
	}
	public void setBoatLength(double boatLength) {
		this.boatLength = boatLength;
	}
	public boolean isSailBoat() {
		return isSailBoat;
	}
	public void setSailBoat(boolean isSailBoat) {
		this.isSailBoat = isSailBoat;
	}
	
}
