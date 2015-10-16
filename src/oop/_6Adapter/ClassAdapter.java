package oop._6Adapter;

/**
 * 类的适配器模式
 * @ClassName: ClassAdapter 
 * @Description: 
 * @author wenxucheng@163.com
 * @date 2015年6月12日 下午5:37:37
 */
public class ClassAdapter extends Source implements Targetable {
	@Override
	public void method2() {
		System.out.println("这是ClassAdapter实现Targetable的method2方法接口输出的");
	}
}
