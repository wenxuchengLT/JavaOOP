package oop._6Adapter;


public class Test {
	public static void main(String[] args) {
		System.out.println("----------���������ģʽ---------");
		Targetable t = new ClassAdapter();
		t.method1();
		t.method2();
		System.out.println("----------�����������ģʽ---------");
		Targetable t2 = new ObjectAdapter(new Source());
		t2.method1();
		t2.method2();
		System.out.println("----------�ӿڵ�������ģʽ---------");
		InterfaceAdapter source1 = new SourceSub1();  
		InterfaceAdapter source2 = new SourceSub2();  
          
        source1.method1();  
        source1.method2();  
        source2.method1();  
        source2.method2();  
        
        /*����������ģʽ��Ӧ�ó�����
		���������ģʽ����ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ������һ�����࣬�̳�ԭ�е��࣬ʵ���µĽӿڼ��ɡ�
		�����������ģʽ����ϣ����һ������ת����������һ���½ӿڵĶ���ʱ�����Դ���һ��Wrapper�࣬����ԭ���һ��ʵ������Wrapper��ķ����У�����ʵ���ķ������С�
		�ӿڵ�������ģʽ������ϣ��ʵ��һ���ӿ������еķ���ʱ�����Դ���һ��������Wrapper��ʵ�����з���������д������ʱ�򣬼̳г����༴�ɡ�*/
	}
}
