package oop._2AbstractFactory;

import oop._1FactoryMethod.Sender;
import oop._1FactoryMethod.SmsSender;

public class SendSmsFactory implements Provider {
	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
