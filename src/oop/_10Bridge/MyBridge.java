package oop._10Bridge;

public class MyBridge extends Bridge {
	public void method(){  
        getSource().method();  
    }  
}
