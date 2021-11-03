package com.xworkz.atmapp;

public class AtmFactory {
public static ICard getAtm(String type) {
	if(type.equals ("canaraBank")) {
		return new CanaraBankImpl();
	}
	else if (type.equals("AxisBank")) {
		return new AxisBankImpl();
	}
	else {
		System.out.println("Bank does not exist...");
	}
	return null;
}
}
