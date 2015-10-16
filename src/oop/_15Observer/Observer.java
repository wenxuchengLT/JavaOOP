package oop._15Observer;

/**
 * 观察者模式（Observer）
 * @ClassName: Observer 
 * @Description: 包括这个模式在内的接下来的四个模式，都是类和类之间的关系，不涉及到继承，学的时候应该 记得归纳。
 * 观察者模式很好理解，类似于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，经常会看到RSS图标，就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。
 * 其实，简单来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系。
 * @author wenxucheng@163.com
 * @date 2015年6月16日 上午11:01:26
 */
public interface Observer {
	public void update();  
}
