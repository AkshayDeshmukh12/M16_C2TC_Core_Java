package com.tns.framework;


public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private Float accBal;
	public BankAcc(int accNo, String accNm, Float accBAl) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	abstract public void withdraw(float accBal);
	public void deposit(float accBal)
	{
		System.out.println(accBal);
	}
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public Float getAccBal() {
		return accBal;
	}
	public void setAccBal(Float accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}
	
}




