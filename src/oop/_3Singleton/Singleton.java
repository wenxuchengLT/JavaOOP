package oop.Singleton;

/**
 * ����ģʽ
 * @ClassName: Singleton 
 * @Description: TODO
 * @author wenxucheng@163.com
 * @date 2015-6-11 ����4:34:26
 */
public class Singleton {
	/* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
    /* �˴�ʹ��һ���ڲ�����ά������ */  
    private static class SingletonFactory {  
        private static Singleton instance = new Singleton();  
    }  
    /* ��ȡʵ�� */  
    public static Singleton getInstance() {  
        return SingletonFactory.instance;
    }  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return getInstance();  
    }  
}
