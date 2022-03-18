package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {
	
	int getDan(){ //키보드 입력받을거여서 매개변수 없음
		Scanner sc = new Scanner(System.in);
		int dan =sc.nextInt();
		return dan;
	}
	
	
	void print(int dan) {
		System.out.println("***"+dan+"단 ***");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d",dan,i,(dan*i));
			System.out.println();
		}
	}
	
	/**도큐메이션 추석
	 * 파라미터로 날라온 시작단~종료단 사이의 구구단 출력 
	 * @param start 시작단
	 * @param end 종료단
	 * 
	 */
	void print(int start, int end) {
		for(int dan=start; dan<=end; dan++) {
		print(dan);
	}
		
}
	
//메소드 오버로딩 (같은 이름의 메소드지만 다른 파라미터를 가지고 있음)
}
