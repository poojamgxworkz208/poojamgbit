package com.xworkz.bankapp;

import com.xworkz.bankapp.dto.AccountDTO;
public class Bank{
	
private AccountDTO[] account;
private int index;

public Bank(int size) {
	account = new AccountDTO[size];
}
public boolean createAccount(AccountDTO account){
boolean AccountAdded=false;
System.out.println("inside createAccount method");

if(account!=null){
	this.account[index++]=account;
	AccountAdded=true;
}
else {
	System.out.println("No account added");
	return AccountAdded=false;
}
return AccountAdded;
}

public boolean updateAccountNoByAccountId(int accountId,long accountNo){
	System.out.println("inside the updateAccountNoByAccountId");
	boolean update=false;
	if(accountId>0 && accountNo>0){
		for(int i=0;i<account.length;i++){
			if(account[i].getaccountId()== accountId){
				System.out.println("Account Id is found now update the contact"+accountId);
				account[i].setAccountNo(accountNo);
				update=true;
			}
			else
				System.out.println("Account Id is found now update the contact");
				update=false;
		}
	}
	return update;
}

public AccountDTO getAccountByName(String AccountName){
	AccountDTO dto = null;
		if(AccountName!=null){
			for(int i=0;i<account.length;i++){
				if(account[i].getAccountName().equals(AccountName)){
					System.out.println("Account name is:"+AccountName);
			   dto=account[i];
				}
				else
				System.out.println("Account Name not found");
			}
		}
	return dto;
	}
	
	public AccountDTO getAccountById(int accountId){
		AccountDTO dto = null;
		if(accountId!=0){
			for(int i=0;i<account.length;i++){
				if(account[i].getaccountId() == accountId){
					System.out.println("ElectronicGadgets Id is:"+accountId);
					dto=account[i];
				}
				else
				System.out.println("AccountId not found");
			}
		}
	return dto;
	}
	
	public AccountDTO getAccountByNo(long accountNo){
		AccountDTO dto = null;
			if(accountNo!=0){
				for(int i=0;i<account.length;i++){
					if(account[i].getAccountNo()== accountNo){
						System.out.println("Patient Id is:"+accountNo);
						dto=account[i];
					}
					else
					System.out.println("AccountNo not found");
				}
			}
		return dto;
		}
		
		public void getAllAccountDetails(){
			for(int i=0;i<account.length;i++){
				System.out.println(account[i]);
			}
		}
		
	}

	