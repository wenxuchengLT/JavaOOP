package oop._5Prototype;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, IOException, CloneNotSupportedException {
		
		Prototype p1 = new Prototype();
		p1.setString("����ǰ����ֵ��p1");
		System.out.println("1--"+p1.getString());
		
//		Prototype p2 = (Prototype)p1.clone();
//		System.out.println("2--"+p2.getString());
		
		Prototype p3 = (Prototype)p1.deepClone();
		System.out.println("3--"+p3.getString());
		p3.setString("���ƺ󣬸�ֵ��p3");
		System.out.println("-----------------------");
		System.out.println("4--"+p1.getString());
		System.out.println("5--"+p3.getString());
		p1.setString("���ƺ󣬸�ֵ��p1");
		System.out.println("-----------------------");
		System.out.println("6--"+p1.getString());
		System.out.println("7--"+p3.getString());
		//�ã���ȸ��ƣ����Ա����䶯����Ӱ��
		
	}

}
