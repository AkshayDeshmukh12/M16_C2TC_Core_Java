package com.tns.application;

import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;


public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, Float accBal) {
		
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

	

