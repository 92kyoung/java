package kr.ac.kopo.day02;

public class OperationMain01 {
	public static void main(String[] args) {
		int a=1, b=0, c=-1;
		
		//boolean bool = ++a>1 || ++b>1; //2>1(참) ==> 이미 앞 항이 참이므로 or은 뒷 항에 관계없이 참이 된다. 
		                                       //그래서 뒤에있는 ++b>1 를 실행하지 않는다. 
		                                       // 그래서 b는 1이 아니라 0을 유지한다.
		
		
		//boolean bool = --a > 1 && ++b>1 || ++c>0 ;
		
		boolean bool = a++>0 || b-->=0 && c++<=0;
		// boolean bool = a++>0 || (( b-->=0 && c++<=0; )) //  a가 참이니까  뒷 항과 상관없이 or은 참이됨
		// 그래서  a만 증가된고 b랑 c는  증감의 차이가 생기지 않는다.
		// 2, 0 , -1
		
		
		System.out.println("bool:" + bool);
		System.out.println("a:" + a + ",b:" + b + "c:" + c);
		
	}

}
