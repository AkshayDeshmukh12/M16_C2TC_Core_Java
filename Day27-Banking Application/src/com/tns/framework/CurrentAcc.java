package com.tns.framework;


public abstract class CurrentAcc extends BankAcc{
	private final float deliveryCharges;
	public CurrentAcc(int accNo, String accNm, float accBal,float deliveryCharges ) {
		super(accNo, accNm, accBal);
		this.deliveryCharges=deliveryCharges;
		
	}
	public void bookProduct(float accBal)
	{
		System.out.println("Account no is"+this.getAccNo()+"Account name is:"
				+this.getAccNm()+" "+"accBal is :"+(accBal+deliveryCharges));
	

	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [deliveryCharges=%s]", deliveryCharges,super.toString());
	}

}


