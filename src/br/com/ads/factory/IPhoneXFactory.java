package br.com.ads.factory;

import br.com.ads.model.IPhone;
import br.com.ads.model.IPhoneX;
import br.com.ads.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		
		if (level.equals("standard")) {
			return new IPhoneX();
		} else if (level.equals("highend")) {
			return new IPhoneXSMax();
			
		} else {
			
			return null;
		}
	}

}
