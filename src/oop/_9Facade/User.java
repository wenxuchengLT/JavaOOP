package oop._9Facade;

/**
 * ���ģʽ��Facade��
 * @ClassName: User 
 * @Description: ���ģʽ��Ϊ�˽��������֮�ҵ�������ϵ�ģ���springһ�������Խ������֮��Ĺ�ϵ���õ������ļ��У������ģʽ���ǽ����ǵĹ�ϵ����һ��Facade���У�
 * ����������֮�����϶ȣ���ģʽ��û���漰���ӿڣ���������һ�����������������Ϊ����
 * @author wenxucheng@163.com
 * @date 2015��6��15�� ����1:56:45
 */
public class User {
	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
		/*�������û��Computer�࣬��ô��CPU��Memory��Disk����֮�佫���໥����ʵ����������ϵ��������������ص��������޸�һ���࣬���ܻ������������޸ģ�
		 * �ⲻ��������Ҫ�����ģ�����Computer�࣬����֮��Ĺ�ϵ��������Computer������������˽�������ã��⣬�������ģʽ��*/
	}
}
