package oop._13Strategy;

public class Test {
	public static void main(String[] args) {
		String exp = "2+8";  
        ICalculator cal = new Plus();  
        int result = cal.calculate(exp);  
        System.out.println(result);  
        //����ģʽ�ľ���Ȩ���û���ϵͳ�����ṩ��ͬ�㷨��ʵ�֣���������ɾ���㷨���Ը����㷨����װ����ˣ�����ģʽ�������㷨����ϵͳ�У��ⲿ�û�ֻ��Ҫ�������ĸ��㷨���ɡ�
	}
}
