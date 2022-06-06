package com.tns.application;


import com.tns.framework.SavingAcc;


public class MMSavingAcc extends SavingAcc
{

	public MMSavingAcc(int accNo, String accNm, Float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}

	@Override
	public void bookproduct(float charges) {
		// TODO Auto-generated method stub
		
	}

}


	

	 
		

	



