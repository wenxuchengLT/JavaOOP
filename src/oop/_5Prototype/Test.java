package oop._5Prototype;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, IOException, CloneNotSupportedException {
		
		Prototype p1 = new Prototype();
		p1.setString("复制前，赋值给p1");
		System.out.println("1--"+p1.getString());
		
//		Prototype p2 = (Prototype)p1.clone();
//		System.out.println("2--"+p2.getString());
		
		Prototype p3 = (Prototype)p1.deepClone();
		System.out.println("3--"+p3.getString());
		p3.setString("复制后，赋值给p3");
		System.out.println("-----------------------");
		System.out.println("4--"+p1.getString());
		System.out.println("5--"+p3.getString());
		p1.setString("复制后，赋值给p1");
		System.out.println("-----------------------");
		System.out.println("6--"+p1.getString());
		System.out.println("7--"+p3.getString());
		//得：深度复制，属性变量变动互不影响
		
	}

}
