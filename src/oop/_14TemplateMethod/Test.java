package oop._14TemplateMethod;

public class Test {

	public static void main(String[] args) {
		String exp = "8+8";  
        AbstractCalculator cal = new Plus();  
        int result = cal.calculate(exp, "\\+");  
        System.out.println(result);  
        /*�Ҹ��������С�����ִ�й��̣����Ƚ�exp��"\\+"������������AbstractCalculator�����calculate(String,String)������
         * ��calculate(String,String)�����ͬ���split()��֮���ٵ���calculate(int ,int)������������������뵽�����У�
         * ִ����return num1 + num2�󣬽�ֵ���ص�AbstractCalculator�࣬����result����ӡ������������֤�����ǿ�ͷ��˼·��*/
	}

}
