package oop._6Adapter;

/**
 * ���������ģʽ
 * @ClassName: ClassAdapter 
 * @Description: 
 * @author wenxucheng@163.com
 * @date 2015��6��12�� ����5:37:37
 */
public class ClassAdapter extends Source implements Targetable {
	@Override
	public void method2() {
		System.out.println("����ClassAdapterʵ��Targetable��method2�����ӿ������");
	}
}
