package oop._13Strategy;

public class Plus extends AbstractCalculator implements ICalculator {
	public int calculate(String exp) {  
        int arrayInt[] = split(exp,"\\+");  
        return arrayInt[0]+arrayInt[1];  
    }  
}
