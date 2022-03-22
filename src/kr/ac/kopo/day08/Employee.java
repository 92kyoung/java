package kr.ac.kopo.day08;

public class Employee {
	String name;
	int salary;
	String grade;
	static int employeeCnt; //총사원수 기억
	
	
	Employee (){//기본 생성자를 만든뒤 매개변수를 가지고 있는 생성자를 생성하는 것이 좋음
		employeeCnt++;
		
	}
	
	Employee (String name, int salary, String grade){ //생성자 생성
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		Employee.employeeCnt++; //객체가 생성될 때마다(=새로운 직원이 입사할때마다) 카운드
	}
	
	void info() {
		System.out.println("이름: "+name+" 연봉: "+salary+" 성적: "+grade);
	}
	static void employeeCntInfo() {
		System.out.println("총 입사한 사원 수: "+Employee.employeeCnt+"명");
	}
}
