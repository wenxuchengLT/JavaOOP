package oop.AbstractFactory;

import oop.FactoryMethod.Sender;

/**
 * ���󹤳�ģʽ����
 * @ClassName: AbstractFactoryTest 
 * @Description: TODO
 * @author wenxucheng@163.com
 * @date 2015-6-11 ����4:33:15
 */
public class AbstractFactoryTest {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
	}
}
