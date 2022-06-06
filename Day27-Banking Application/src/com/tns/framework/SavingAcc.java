package com.tns.framework;


public abstract class SavingAcc extends BankAcc {
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	
	public SavingAcc(int accNo, String accNm, Float accBal) {
		super(accNo, accNm, accBal);
		this.isPrime=isPrime;
	}
	public void bookProduct(float accBal)
	{
			System.out.println("Account no is"+this.getAccNo()+"Account name is:"
					+this.getAccNm()+" "+"charges is :"+accBal);
	}
	

	@Override
	public String toString() {
		return String.format("SavingAcc [isPrime=%s]", isPrime,super.toString());
		
	
	}
	

	}





