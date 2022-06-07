package com.tns.framework;


public abstract class CurrentAcc extends BankAcc{
	private final float creditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit ) {
		super(accNo, accNm, accBal);
		float creditLimits = 0.0f;
		this.creditLimit=creditLimits;
		
	}
	public void withdraw(float accBal)
	{
		System.out.println("Account no is"+this.getAccNo()+"Account name is:"
				+this.getAccNm()+" "+"accBal is :"+(accBal+creditLimit));
	

	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]",creditLimit,super.toString());
	}

}


