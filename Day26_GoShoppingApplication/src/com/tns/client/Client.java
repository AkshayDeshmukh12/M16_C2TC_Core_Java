package com.tns.client;
import com.tns.application.GSNormalAcc;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;
public class Client {

	public static void main(String[] args) {
		ShopFactory s=new ShopFactory();
		PrimeAcc p=new PrimeAcc(123,"Akshay",456,true);
		NormalAcc n=new GSNormalAcc(124,"Ankita",458,20);
		System.out.println("Prime account");
		p.bookProduct(p.getcharge());
		System.out.println("Normal account");
		n.bookProduct(n.getcharges());
		System.out.println(p);
		System.out.println(n);
		
		
		
		
	}

}
