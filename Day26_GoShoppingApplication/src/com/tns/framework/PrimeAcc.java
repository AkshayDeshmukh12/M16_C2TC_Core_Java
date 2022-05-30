package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	
	public PrimeAcc(int accNo, String accNm, Float charges) {
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
	}
	public void bookProduct(float charges)
	{
			System.out.println("Account no is"+this.getAccNo()+"Account name is:"
					+this.getAccNm()+" "+"charges is :"+charges);
	}
	

	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s]", isPrime,super.toString());
		
	
	}
	
	
	

	}


