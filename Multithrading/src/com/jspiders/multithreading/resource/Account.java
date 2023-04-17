package com.jspiders.multithreading.resource;

public class Account {
	int accountBalance;
	public Account(int accountBalance) {
		super();
		this.accountBalance=accountBalance;
	}
	public void checkBalance() {
		System.out.println("Current balance " + accountBalance);
	}
	public synchronized void depositAmount(int Amount) {
		System.out.println("Depositing " + Amount + " rs in account");
	}
	public synchronized void withdrawAmount(int Amount) {
		System.out.println("Withdrawing " + Amount + " rs is account");
		if(Amount>accountBalance) {
			System.out.println("Insufficient Balance");
		}else {
			accountBalance -= Amount;
			checkBalance();
		}
	}
}
