package com.xworkz.atmapp;

public class CanaraBankImpl implements ICard {

	@Override
	public void insert() {
		System.out.println("insert the card");
		
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw the  amount");
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Check Balance");
	}

	@Override
	public void removeCard() {
		// TODO Auto-generated method stub
		System.out.println("Remove the card");
	}
}
	
				