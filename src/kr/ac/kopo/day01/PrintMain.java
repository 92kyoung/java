package kr.ac.kopo.day01;
public class PrintMain {
	public static void main(String args[]) {
		
		/*
		1. 상수 종류
            -정수형 상수
            -실수형 상수
            -문자형 상수('a') : 대문자, 소문자, 숫자문자, 특수문자, 
                             공백문자(' '[스페이스], '\n' [엔터], '\t' [탭]). 한글('가', '방')
            -문자열 상수("abc")
            -논리형 상수( true, false)


		 
		2. 출력메소드
		
		 1. println : 개행문자 포함( 줄 바꿈 된다)
		 2. print: 개행문자 불포함
		 3. printf(): jdk 1.5 부터 추가, 개행문자 포함x, 출력문자 형태
		        %d: 정수
		        %f: 실수
		        %c: 문자
		        %s: 문자열
		        %b: 논리값
		 */
		
		System.out.println(10);
		System.out.println('A');
		System.out.println(true);
		System.out.println("tk"+1+5);
		
		
		
		/*
		 printf는 줄 바굼이 안되니까 \n을 추가한다 (enter의 의미)
		 */
		System.out.printf("%d살\n",10+3);
		//System.out.println();
		System.out.printf("%d+%d=%d\n",1,2,1+2);
		
		
		
		System.out.printf("[%7d]\n",1200);  //오른쪽 7자리 정렬
		System.out.printf("[%-7d]\n",1200); //-는 왼쬑 정렬
		System.out.printf("[%07d]\n",1200); // 빈자리 0 출력
		System.out.printf("[%.2f]\n",12.345); // 소숫점 정렬, 자동적으로 반올림 됨
		
		
		
		
		
	}

}
