package oop.Singleton;

/**
 * ����ģʽ2
 * @ClassName: SingletonTest 
 * @Description: TODO �������ܵĻ�����������ֻ�贴��һ��ʵ������������Ҳ������ʲôӰ�졣
 * @author wenxucheng@163.com
 * @date 2015-6-11 ����4:36:22
 */
public class SingletonTest {
	private static SingletonTest instance = null;  
    private SingletonTest() {  
    }  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new SingletonTest();  
        }  
    }  
    public static SingletonTest getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  
}
