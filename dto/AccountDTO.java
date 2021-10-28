package com.xworkz.bankapp.dto;

public class AccountDTO {
	private int accountId;
	private String accountName;
	private long accountNo;
	
	public void accountDTO(){
	System.out.println(this.getClass().getSimpleName()+"object is created");
	}
	
	public void setAccountId(int accountId){
	this.accountId=accountId;
	}
	
	public void accountName(String accountName){
	this.accountName=accountName;
	}
	
	public String getAccountName(){
	return accountName;
	}
	
	public void setAccountNo(long accountNo){
	this.accountNo=accountNo;
	}
	
	public long getAccountNo(){
	return accountNo;
	}
	
	
	@Override
	public String toString(){
	return "AccountDto - [accountId= " +this.accountId+", accountName= " +accountName+", accountNo= " +this.accountNo+"]";
	}


public int getaccountId() {
	// TODO Auto-generated method stub
	return 0;
}

public void setaccountNo11(long accountNo) {
	// TODO Auto-generated method stub
	
}


}




