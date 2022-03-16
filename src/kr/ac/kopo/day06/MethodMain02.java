package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	}
	
	void 냐용거린다 () {
		System.out.println("고양이가 냐용합니다");
	}
}



class Method {
	// 자바는 '메소드 오버로딩' 지원 (overloading)
	// 같은 클래스 내에서 메소드 명이 같으면서 매개변수의 개수나 타입이 서로 다른 것
	
	void call() {
	
		System.out.println("call() 메소드 호출 ///");
	}
	void call(int i) {
		System.out.println("call(int) 메소드 호출 ///");	
	}
//변수명이 같아도 매개변수의 자료형이 다르면 다른 메소드로 인식됨
	
	void call (String str, int n) {
		System.out.println("call(String,int) 메소드 출력");
	}
}



public class MethodMain02 {
	public static void main(String[] args) {
		//고양이 인스턴스 객체 생성 //new 고양이();
		// 참조 변수 생성 //고양이 나비
		고양이 나비 = new 고양이();
		
		//나비라는 고양이가 냐용거린다
		나비.냐용거린다(); //다른 클래스의 메소드를 불러야함으로 앞에  "객체명. "을 꼭 붙여야한다.
		
		// 다른 클래스의 메소드를 사용하기 위해서는 꼭 인스턴스 객체 부터 생성한다
		Method m = new Method();
		m.call();
		m.call(10);
		m.call("hello",5);
	}
}
