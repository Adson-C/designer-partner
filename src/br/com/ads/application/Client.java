package br.com.ads.application;

import br.com.ads.factory.IPhoneSimpleFactory;
import br.com.ads.model.IPhone;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("## Encomendar um iPhone X");
		IPhone phone = IPhoneSimpleFactory.orderIPhone("X", "standard");
		System.out.println(phone);
		
		
		System.out.println("\n\n## Encomendar um iPhone 11 HighEnd");
		IPhone phone2 = IPhoneSimpleFactory.orderIPhone("11", "highEnd");
		System.out.println(phone2);
		
	}

}
