package oop._2AbstractFactory;

import oop._1FactoryMethod.MailSender;
import oop._1FactoryMethod.Sender;

public class SendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new MailSender(); 
	}

}
