package oop._6Adapter;

/**
 * 对象的适配器模式
 * @ClassName: ObjectAdapter 
 * @Description: 
 * @author wenxucheng@163.com
 * @date 2015年6月12日 下午5:38:47
 */
public class ObjectAdapter implements Targetable {

	private Source source;
	
	public ObjectAdapter(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("这是ObjectAdapter实现Targetable的method2方法接口输出的");
	}
	
}
