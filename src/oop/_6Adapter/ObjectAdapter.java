package oop._6Adapter;

/**
 * �����������ģʽ
 * @ClassName: ObjectAdapter 
 * @Description: 
 * @author wenxucheng@163.com
 * @date 2015��6��12�� ����5:38:47
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
		System.out.println("����ObjectAdapterʵ��Targetable��method2�����ӿ������");
	}
	
}
