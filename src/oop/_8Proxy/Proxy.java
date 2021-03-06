package oop._8Proxy;

/**
 * 代理模式（Proxy）
 * @ClassName: Proxy 
 * @Description: 代理模式就是多一个代理类出来，替原对象进行一些操作，比如我们在租房子的时候回去找中介，为什么呢？
 * 因为你对该地区房屋的信息掌握的不够全面，希望找一个更熟悉的人去帮你做，此处的代理就是这个意思。
 * 再如我们有的时候打官司，我们需要请律师，因为律师在法律方面有专长，可以替我们进行操作，表达我们的想法。
 * @author wenxucheng@163.com
 * @date 2015年6月15日 下午1:40:58
 */
public class Proxy implements Sourceable {

	private Source source;
	public Proxy() {
		this.source = new Source();
	}
	@Override
	public void method() {
		before();
		source.method();
		atfer();
	}
	private void atfer() {
		System.out.println("after proxy!");
	}
	private void before() {
		System.out.println("before proxy!");
	}

}
