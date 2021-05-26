package com.cognizant.account.model;

public class AccountDetails {
	private String number;
	private String type;
	private double balance;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return "AccountDetails [number=" + number + ", type=" + type + ", balance=" + balance + "]";
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
