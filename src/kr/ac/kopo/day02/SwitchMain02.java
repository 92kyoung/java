package kr.ac.kopo.day02;

public class SwitchMain02 {
	public static void main(String[] args) {
		String a = new String("HELLO");
		
		//System.out.println(a == HELLO); //a는 헬로우의 주소값을 저장하고 있기 때문에 false가 나옴
		                                 //문자는 동등비교 연산이 안됨 //switch 활용!!
		
		
		
		switch(a) {
		case "HELLO" :
			System.out.println("TRUE");
			break;
		default :
			System.out.println("FALSE");
		
		}
	
	
	
	
	
	}                                   

}
