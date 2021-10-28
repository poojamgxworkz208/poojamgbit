package com.xworkz.bankapp;

import java.util.*;

import com.xworkz.bankapp.dto.AccountDTO;

public class BankTester{

		private static Scanner sc;

		public static void main(String ar[]){
			System.out.println("Enter no of Account");
			sc = new Scanner(System.in);
			int size = sc.nextInt();
		Bank bank = new Bank(1);
			if(size>0)
			{
			for(int i=0; i<size; i++)
			{
		AccountDTO dto = new AccountDTO();
			
			    System.out.println("Enter the Account Details");
			    
				System.out.println("Enter the AccountID");
					int AccountId = sc.nextInt();
					dto.setAccountId(AccountId);
					
				System.out.println("Enter the AccountName");
					String AccountName = sc.next();
					dto.accountName(AccountName);
				
					
				System.out.println("Enter the accountNo");
					long accountNo = sc.nextLong();
					dto.setAccountNo(accountNo);
				
				
					
					
			boolean isadded = bank.createAccount(dto);
			System.out.println(isadded);
			
			}
			
			bank.getAccountByName("Fridge");
			bank.getAccountById(1);
			bank.getAccountByNo(8147);
			
			
			bank.getAllAccountDetails();
			
			bank.updateAccountNoByAccountId(1,29008762); 
			bank.getAllAccountDetails();
			
			}
		}
}
			
			
