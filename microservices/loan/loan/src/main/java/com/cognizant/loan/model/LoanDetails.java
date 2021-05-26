package com.cognizant.loan.model;

public class LoanDetails {
	private String number;
	private String type;
	private double loan;
	private double emi;
	private float tenure;
	@Override
	public String toString() {
		return "LoanDetails [number=" + number + ", type=" + type + ", loan=" + loan + ", emi=" + emi + ", tenure="
				+ tenure + "]";
	}
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
	public double getLoan() {
		return loan;
	}
	public void setLoan(double loan) {
		this.loan = loan;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public float getTenure() {
		return tenure;
	}
	public void setTenure(float tenure) {
		this.tenure = tenure;
	}
}
