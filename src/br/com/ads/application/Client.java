package br.com.ads.application;

import br.com.ads.factory.IPhone11Factory;
import br.com.ads.factory.IPhoneFactory;
import br.com.ads.factory.IPhoneXFactory;
import br.com.ads.model.IPhone;

public class Client {

	public static void main(String[] args) {
		
		IPhoneFactory genXFactory = new IPhoneXFactory();
		IPhoneFactory gen11Factory = new IPhone11Factory();

		
		
		  System.out.println("Encomendar um iPhone X"); 
		  IPhone phone = genXFactory.orderIPhone("standard"); 
		  System.out.println(phone);
		 
		 
		
		  System.out.println("\n\n ## Encomendar um iPhone 11 HighEnd"); 
		  IPhone phone2 = gen11Factory.orderIPhone("kkkkkkkk");
		  System.out.println(phone2);
	}

}
