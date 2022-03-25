package kr.ac.kopo.day12;

public class Car {
	private String name;
	private String carNumber;

	public Car() {
		super();

	}

	public Car(String name, String carNumber) {
		super();
		this.name = name;
		this.carNumber = carNumber;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", carNumber=" + carNumber + "]";
	}
}
