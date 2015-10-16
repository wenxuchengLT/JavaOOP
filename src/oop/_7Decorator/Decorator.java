package oop._7Decorator;

/**
 * װ��ģʽ��Decorator��
 * @ClassName: Decorator 
 * @Description: ����˼�壬װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
 * @author wenxucheng@163.com
 * @date 2015��6��15�� ����10:59:30
 */
public class Decorator implements Sourceable {
	
	Sourceable sourceable;
	
	public Decorator(Sourceable sourceable) {
		super();
		this.sourceable = sourceable;
	}

	@Override
	public void method() {
		System.out.println("Decorator�����䷽�����֮ǰ");
		sourceable.method();
		System.out.println("Decorator�����䷽�����֮��");
	}
}
