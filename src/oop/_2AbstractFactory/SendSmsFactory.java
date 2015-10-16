package oop.AbstractFactory;

import oop.FactoryMethod.Sender;
import oop.FactoryMethod.SmsSender;

public class SendSmsFactory implements Provider {
	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
