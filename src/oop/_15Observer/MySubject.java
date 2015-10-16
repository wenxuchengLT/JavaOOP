package oop._15Observer;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");  
        notifyObservers();  
	}

}
