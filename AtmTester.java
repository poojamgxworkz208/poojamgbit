package com.xworkz.atmapp;

import java.util.Scanner;

public class AtmTester {
	public static void main(String a[]) {
		Scanner type=new Scanner(System.in);
		System.out.println("Enter the Bank Card");
		ICard icard =AtmFactory.getAtm(type.next());
		if(icard!=null) {
			icard.insert();
			icard.checkBalance();
			icard.withdraw();
			icard.removeCard();
		}
	}

}
