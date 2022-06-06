package com.tns.framework;


public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private Float accBal;
	public BankAcc(int accNo, String accNm, Float charges) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	abstract public void bookproduct(float charges);
	public void items(float charges)
	{
		System.out.println(charges);
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
	public Float getCharges() {
		return accBal;
	}
	public void setCharges(Float charges) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return String.format("BankAcc [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, accBal);
	}
	
}




