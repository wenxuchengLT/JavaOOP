package oop._12Flyweight;

import java.util.Hashtable;

public class CarFlyWeightFactory {
	public Car car;
	private Hashtable<String, Car> carPool = new Hashtable<String, Car>();

	public Car getCar(String name) {
		if ("BMW".equals(name)) {
			car = carPool.get(name);
			if (car == null) {
				car = new BMWCar();
				carPool.put(name, car);
			}
		}

		if ("Ford".equals(name)) {
			car = carPool.get(name);
			if (car == null) {
				car = new FordCar();
				carPool.put(name, car);
			}
		}
		return car;
	}

	public int getNumber() {
		return carPool.size();
	}
}
