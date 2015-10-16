package oop._16Iterator;

/**
 * ������ģʽ��Iterator��
 * @ClassName: Iterator 
 * @Description: ����˼�壬������ģʽ����˳����ʾۼ��еĶ���һ����˵�������зǳ�����������Լ�����Ƚ���Ϥ�Ļ�����Ȿģʽ��ʮ�����ɡ�
 * ��仰����������˼��һ����Ҫ�����Ķ��󣬼��ۼ����󣬶��ǵ������������ڶԾۼ�������б������ʡ�
 * @author wenxucheng@163.com
 * @date 2015��6��16�� ����11:35:05
 */
public interface Iterator {
	//ǰ��  
    public Object previous();  
      
    //����  
    public Object next();  
    public boolean hasNext();  
      
    //ȡ�õ�һ��Ԫ��  
    public Object first();  
}
