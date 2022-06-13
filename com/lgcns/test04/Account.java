package com.lgcns.test04;

public class Account {

	private String account;
	private int balance;
	private double interestRate;
	
	//»ý¼ºÀÚ
	
	public Account() {
		account = "000-0000-0000";
		balance = 0;
		interestRate = 0.0;
	}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	// Getter / Setter
	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	
	public double calculateInterest(){
		double interestMoney = balance * interestRate/100.0;
		return interestMoney;
	}
	
	public void deposit (int money) {
		balance += money;
	}
	public void withdraw(int money) {
		balance -= money;
	}
	
}
//public class AccountTest{
//	public static void main(String[] args) {
		
//	}
//}
