package oop.Builder;

import java.util.ArrayList;
import java.util.List;

import oop.FactoryMethod.MailSender;
import oop.FactoryMethod.Sender;
import oop.FactoryMethod.SmsSender;
/**
 * ������ģʽ��Builder��
 * @ClassName: Builder 
 * @Description: TODO ������ģʽ�ṩ���Ǵ����������ģʽ����������ģʽ���ǽ����ֲ�Ʒ�����������й��������������϶���
 * ��ν���϶������ָĳ������в�ͬ�����ԣ���ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ���
 * @author wenxucheng@163.com
 * @date 2015-6-11 ����4:40:53
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();  
    
    public void produceMailSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new MailSender());  
        }  
    }  
      
    public void produceSmsSender(int count){  
        for(int i=0; i<count; i++){  
            list.add(new SmsSender());  
        }  
    }  
}
