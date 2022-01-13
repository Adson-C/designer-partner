package br.com.ads.factory;

import br.com.ads.model.IPhone;
import br.com.ads.model.IPhone11;
import br.com.ads.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone createIPhone(String level) {
		
		if (level.equals("standard")) {
			return new IPhone11();
		} else if (level.equals("highend")) {
			return new IPhone11Pro();
			
		} else 
			
			return null;
	}
}
