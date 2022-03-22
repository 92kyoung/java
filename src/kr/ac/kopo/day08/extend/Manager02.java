package kr.ac.kopo.day08.extend;
//관리자는 사원의 한 형태다 == 조건 부합 == 상속관계 표현
public class Manager02 extends Employee{
	/*//이미 부모 클래스에 정의 되어있음으로 굳이 또 다시 정의 할 필요없음
	String name;
	int salary;
	String grade;
	*/
	Employee [] empList; //관리사원 목록
	
	Manager02(){  //기본 생성자를 항상 추가해주는 것이 좋다
		
	}
	Manager02(String name, int salary, String grade, Employee[] empList){
		this.name=name; //지금 내 자신에  name 변수가 없으니까 this.을 사용하면 나를 넘어서 부모 클래스까지 확인해서 사용함
		//만약 부모 자식에 같은 변수가 있다면 this.을 사용하면 현 클래스의 변수를 사용하는 것이고 super.을 사용하면 부모 클래스의변수를 사용한다는 뜻
		this.salary=salary;
		this.grade=grade;
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
