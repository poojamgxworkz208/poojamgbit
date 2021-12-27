package com.xworkz.tripapp;

public class Drone {
public static void main(String args[]) {
	String driverFQN="com.mysql.cj.jdbc.Driver";
	System.out.println("Driver jdbc");
	try {
		
		Class.forName(driverFQN);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
