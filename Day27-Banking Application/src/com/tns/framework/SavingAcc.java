package com.tns.framework;


public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	static final private float creditLimit=0.0f;
	
	public SavingAcc(int accNo, String accNm, Float accBal) {
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
	}
	public void withdraw(float accBal)
	{
			System.out.println("Account no is"+this.getAccNo()+"Account name is:"
					+this.getAccNm()+" "+"accBal is :"+accBal);
	}
	

	@Override
	public String toString() {
		return String.format("SavingAcc [isSalary=%s]", isSalary,super.toString());
		
	
	}
	

	}





