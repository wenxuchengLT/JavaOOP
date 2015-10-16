package oop._7Decorator;

/**
 * 装饰模式（Decorator）
 * @ClassName: Decorator 
 * @Description: 顾名思义，装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * @author wenxucheng@163.com
 * @date 2015年6月15日 上午10:59:30
 */
public class Decorator implements Sourceable {
	
	Sourceable sourceable;
	
	public Decorator(Sourceable sourceable) {
		super();
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		System.out.println("Decorator类扩充方法输出之前");
		sourceable.method();
		System.out.println("Decorator类扩充方法输出之后");
	}
}
