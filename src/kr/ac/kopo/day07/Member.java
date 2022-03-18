package kr.ac.kopo.day07;

public class Member {
	String name;
	int age;
	String bloodtype;
	
	Member(){
		/*this.*/ name="알수없음"; // 변수를 구분할 필요가 없으면  this. 생략가능 (jvm이 자동으로 생성해줌)
		age=-1;
		bloodtype="알수없음";
	}
	Member(String name){
		this.name=name;
		age=-1;
		bloodtype="알수없음";
		
	}
	
	Member(String name, int age){
		this(name,age,"알수없음"); //this 생성자는 생성자에서 맨 첫번째 구문에 있어야한다
	}
	

	/*
	Member(String name, int age){
		this.name=name;
		this.age=age;
 		this.bloodtype="알수없음";	
	}
	*/
	//지역변수:갈색 멤버변수:파랑
	Member(String name, int age, String bloodtype){
		//name= name; 멤버변수=지역번수 이렇게 되야되는데 지역변수=지역변수가 되서
		// this.을 활용해서 지역변수를 멤버변수로 변경시켜줌
		this.name= name;
		this.age=age;
		this.bloodtype=bloodtype;
		
	}
	
	void info() {
		System.out.println("이름: "+name+", 나이: "+age+", 혈액형: "+bloodtype);
	}
}
