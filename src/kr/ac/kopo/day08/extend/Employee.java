package kr.ac.kopo.day08.extend;

public class Employee {

	String name;
	int salary;
	String grade;

	Employee(){
		
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " 
						+ salary + "만원, 직급 : " + grade);
	}
}
