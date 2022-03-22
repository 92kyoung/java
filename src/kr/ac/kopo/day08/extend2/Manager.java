package kr.ac.kopo.day08.extend2;

public class Manager extends Employee {
	Employee [] empList;

	public Manager() {
	}

	public Manager(String name, int salary, String grade, Employee[] empList) {
		super(name, salary, grade);
		this.empList = empList;
	}

	

	

}
