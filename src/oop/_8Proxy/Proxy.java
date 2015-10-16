package oop._8Proxy;

/**
 * ����ģʽ��Proxy��
 * @ClassName: Proxy 
 * @Description: ����ģʽ���Ƕ�һ���������������ԭ�������һЩ�����������������ⷿ�ӵ�ʱ���ȥ���н飬Ϊʲô�أ�
 * ��Ϊ��Ըõ������ݵ���Ϣ���յĲ���ȫ�棬ϣ����һ������Ϥ����ȥ���������˴��Ĵ�����������˼��
 * ���������е�ʱ����˾��������Ҫ����ʦ����Ϊ��ʦ�ڷ��ɷ�����ר�������������ǽ��в�����������ǵ��뷨��
 * @author wenxucheng@163.com
 * @date 2015��6��15�� ����1:40:58
 */
public class Proxy implements Sourceable {

	private Source source;
	public Proxy() {
		this.source = new Source();
	}
	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}
	private void atfer() {
		System.out.println("after proxy!");
	}
	private void before() {
		System.out.println("before proxy!");
	}

}
