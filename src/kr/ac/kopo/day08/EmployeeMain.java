package kr.ac.kopo.day08;

public class EmployeeMain {
	public static void main(String[] args) {
        	
	
		Employee.employeeCntInfo();
		
		Employee e = new Employee ("홍길동",3300,"사원");
	
		Employee e2 = new Employee ("강길동",3800,"대리");

		e.info();
		Employee.employeeCntInfo();
		e2.info();
		Employee.employeeCntInfo();
		
		
	}
}
