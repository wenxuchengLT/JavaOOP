package oop._1FactoryMethod;

/**
 * ��̬��������ģʽ����
 * @ClassName: FactoryTest 
 * @Description: TODO
 * @author wenxucheng@163.com
 * @date 2015-6-11 ����4:21:23
 */
public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();  
        sender.Send(); 
	}
}
