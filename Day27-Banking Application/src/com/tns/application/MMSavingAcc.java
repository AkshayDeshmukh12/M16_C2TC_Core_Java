package com.tns.application;
import com.tns.framework.BankAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.MMSavingAcc;


public class MMBankFactory extends BankFactory
{

	@Override
	public <MMSavingAcc> MMSavingAcc getNewSavingAcc(int accNo, String accNm, Float accBal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

	


	

	 
		

	



