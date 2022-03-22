package kr.ac.kopo.day08.extend;
//관리자는 사원의 한 형태다 == 조건 부합 == 상속관계 표현
public class Manager03 extends Employee{
	/*//이미 부모 클래스에 정의 되어있음으로 굳이 또 다시 정의 할 필요없음
	String name;
	int salary;
	String grade;
	*/
	Employee [] empList; //관리사원 목록
	
	Manager03(){  //기본 생성자를 항상 추가해주는 것이 좋다
	//super(); //기본 생성자는 슈퍼생성자 생략 가능
	//but 매개변수가 있는 생성자는 슈퍼생성자 생략하면 안됨
	}
	Manager03(String name, int salary, String grade, Employee[] empList){
		super(name,salary,grade); // 매개변수가 있는 생성자는 슈퍼생성자 생략x
		this.empList=empList;
		}
	//@어노테이션
	@Override
	void info() {
		//info(); //this.info();의 의미를 가짐(자기 자신 메소드를 계속 호출)
		super.info(); //부모 클래스의 info메소드 호출
		
		System.out.println("---------------------------------------------------");
		System.out.println("\t 관리사원 목록");
		System.out.println("---------------------------------------------------");
		for(Employee e:empList) {
			e.info();
		}
		System.out.println("---------------------------------------------------");
	}



}
