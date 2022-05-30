package com.tns.framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private Float charges;
	public ShopAcc(int accNo, String accNm, Float charges) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
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
		return charges;
	}
	public void setCharges(Float charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return String.format("ShopAcc [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, charges);
	}
	
}
