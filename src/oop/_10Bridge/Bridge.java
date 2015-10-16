package oop._10Bridge;

/**
 * �Ž�ģʽ��Bridge��
 * @ClassName: Bridge 
 * @Description: �Ž�ģʽ���ǰ�����������ʵ�ַֿ���ʹ���ǿ��Ը��Զ����ı仯���Žӵ������ǣ���������ʵ�ֻ����
 * ʹ�ö��߿��Զ����仯�������ǳ��õ�JDBC��DriverManagerһ����JDBC�����������ݿ��ʱ���ڸ������ݿ�֮������л���
 * ��������Ҫ��̫��Ĵ��룬����˿�����ö���ԭ�����JDBC�ṩͳһ�ӿڣ�ÿ�����ݿ��ṩ���Ե�ʵ�֣���һ���������ݿ������ĳ������ŽӾ����ˡ�
 * @author wenxucheng@163.com
 * @date 2015��6��15�� ����2:14:41
 */
public abstract class Bridge {
	private Sourceable source;
	public void method(){
		source.method();  
	}
	public Sourceable getSource() {
		return source;
	}
	public void setSource(Sourceable source) {
		this.source = source;
	}
}
