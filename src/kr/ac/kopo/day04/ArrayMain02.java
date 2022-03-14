package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {
	public static void main(String[] args) {
		//String[ ] strArr= {"데이터분석","자바","교육"};
		String[] strArr=new String[3];
		strArr[0]="데이터분석";
		strArr[1]="자바";
		strArr[2]="교육";
		
		int loc=0;
		strArr[loc++]="폴리텍";
//		strArr[loc++]="데이터분석";
		strArr[loc++]="자바";
		strArr[loc++]="교육";
		
		System.out.println("문자열의 총 개수: "+strArr.length+"개");
		//n번째 문자열 출력
		for(int i=0; i<3; i++) {
		System.out.println(i+"번째 문자열 : "+strArr[i]);
		}
		
		
		/*
		 * 배열의 전체 원소 출력 방식
		 1. 인텍스를 이용한 출력(원소접근:0~length-1)
		 2. 1.5 버전의 for문을 이용한 출력
		 3. Arrays.toString() 메소드 이용 출력
		 */
		//1. 방식
		System.out.println("<index를 이용한 출력>");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
			
		//2. 방식
		System.out.println("<for문 이용 출력>");
		for(String s : strArr) { //strArr 배열 값을 스트링 변수 s에 대입
			System.out.println(s);
		}
		
		//3. 방식
		System.out.println("Arrays.toString");
		String result=Arrays.toString(strArr);
		System.out.println(result);
		
		
	}
}
