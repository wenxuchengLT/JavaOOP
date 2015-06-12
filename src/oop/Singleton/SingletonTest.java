package oop.Singleton;

/**
 * 单例模式2
 * @ClassName: SingletonTest 
 * @Description: TODO 考虑性能的话，整个程序只需创建一次实例，所以性能也不会有什么影响。
 * @author wenxucheng@163.com
 * @date 2015-6-11 下午4:36:22
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
