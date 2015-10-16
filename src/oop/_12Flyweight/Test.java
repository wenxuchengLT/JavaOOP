package oop._12Flyweight;

public class Test {
	public static void main(String[] args) {
		CarFlyWeightFactory carFlyWeightFactory = new CarFlyWeightFactory();
		Car carf1 = carFlyWeightFactory.getCar("Ford");
		carf1.showCarName();
		Car carf2 = carFlyWeightFactory.getCar("Ford");
		carf2.showCarName();
		if (carf1 == carf2) {
			System.out.println("ͬһ��������");
		} else {
			System.out.println("��ͬһ��������");
		}
		System.out.println("����������:" + carFlyWeightFactory.getNumber());
		
		/*��Ҫ���ڴ�������ʱ�����ù����������ٶ�����ڴ��ռ��.һ����߳���Ч�ʺ����ܵ�ģʽ,����ӿ�������
			���ٶ�.
			����˵��һ��ϵͳ������ж����ͬ�Ķ�����ôֻ����һ�ݾͿ����ˣ�����ÿ����ȥʵ����һ������
			Flyweight(��Ԫ)ģʽ�г�����Factoryģʽ��Flyweight���ڲ�״̬�����������,Flyweight factory����ά��һ����
			��洢�أ�Flyweight Pool��������ڲ�״̬�Ķ���
			Flyweight�Ĺؼ�˼·,����:
			�½�����ʱ:
			�ȵ�hashtable�н��л�ȡ-->�ж�ȡ�ö����Ƿ�Ϊ��-->����,���½��˶���,�ҷŻ�hashtable -->������,����ԭ��
			�Ķ���.*/
		
		
	}
}
