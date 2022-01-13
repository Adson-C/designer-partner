package br.com.ads.model;

public class IPhone11Pro extends IPhone {

	@Override
	public void getHardware() {

		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	
	}
}
