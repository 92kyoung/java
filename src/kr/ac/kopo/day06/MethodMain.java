package kr.ac.kopo.day06;

import java.util.Random;

/*
 **********
 Hello
 **********
 Hi
 **********
 Bye
 */

public class MethodMain {
	
	
	static int printStar(char ch, int cnt){
		//int cnt=10; //이 메소드 안에서만 사용되는 변수
		for(int i=0; i<cnt; i++) {
		System.out.print(ch);
		}System.out.println();
		return ch+cnt;  //문자+int = int 
		}
	
	
	static void aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		
		if(bool) {
			return;
		}
		
		
		System.out.println("C");
		System.out.println("D");
		
	}
	
	
	public static void main(String[] args) {
		aaa();
		
		
		//int cnt=10; //printStar 내의 cnt와 이 cnt는 서로 완전 다른 독립적인 변수
		
		int code = printStar('A',10);
		//나는 별을 10개 찍고 싶어     // 피호출자이자 호출자
		
		System.out.println("Hello");
		printStar('B',20); // 같은 클래스 내의 메소드를 부르는 것임으로 그냥 클래스 명만 적어도된다.
		System.out.println("Hi");
		printStar('a',5);
		System.out.println("Bye");
		
		Random r = new Random();
		r.nextInt(10);

	}
}
