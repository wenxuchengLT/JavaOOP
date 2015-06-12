package oop.AbstractFactory;

import oop.FactoryMethod.MailSender;
import oop.FactoryMethod.Sender;

public class SendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new MailSender(); 
	}

}
