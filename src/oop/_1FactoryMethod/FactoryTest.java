package oop._1FactoryMethod;

/**
 * 静态工厂方法模式测试
 * 原文地址：http://www.cnblogs.com/maowang1991/archive/2013/04/15/3023236.html
 * @ClassName: FactoryTest 
 * @Description: TODO
 * @author wenxucheng@163.com
 * @date 2015-6-11 下午4:21:23
 */
public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();  
        sender.Send(); 
	}
}
