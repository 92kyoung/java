package kr.ac.kopo.day09.abs02;

public abstract class Printer {

	private String model;
	
	public Printer() {
		
	}
	public Printer(String model) {
		this.model = model;
	}
	
	public abstract void print();
	
}
