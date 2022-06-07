package com.tns.framework;


public abstract class BankFactory {

	abstract public SavingAcc getNewSavingAcc(int accNo, String accNm, Float accBal);
	abstract public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimit);

	}


