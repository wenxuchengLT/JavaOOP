package oop._17ChainOfResponsibility;

/**
 * ������ģʽ��Chain of Responsibility��
���������ǽ�Ҫ̸̸������ģʽ���ж������ÿ��������ж���һ����������ã������ͻ��γ�һ������
�������������ϴ��ݣ�ֱ��ĳһ���������������󡣵��Ƿ����߲���������������Ǹ�����ᴦ�������
���ԣ�������ģʽ����ʵ�֣��������ͻ��˵�����£���ϵͳ���ж�̬�ĵ�����
 * @ClassName: Test 
 * @Description: 
 * @author wenxucheng@163.com
 * @date 2015��10��21�� ����5:56:35
 */
public class Test {
	public static void main(String[] args) {  
        MyHandler h1 = new MyHandler("h1");  
        MyHandler h2 = new MyHandler("h2");  
        MyHandler h3 = new MyHandler("h3");  
  
        h1.setHandler(h2);  
        h2.setHandler(h3);  
  
        h1.operator();  
        //�˴�ǿ��һ����ǣ������ϵ����������һ������������һ��������������һ������
        //ģʽ����Լ���������Ҫ�����Լ�ȥʵ�֣�ͬʱ����һ��ʱ�̣�����ֻ������һ�����󴫸���һ�����󣬶����������������
    }  
}
