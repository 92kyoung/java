package kr.ac.kopo.day02;
import java.util.Scanner; // ctrl +shift + o (알파벳) 누르면 자동으로 import 됨

/*
 a입력 : 10
 b입력 : 3
 10 이 3의 배수인가? :  false 가 나오는 프로그램
 
 */
public class OperationMain02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 키보드 입력 받을 수 있는 코드 // 잘 외우기
		
		System.out.print("정수 a를 입력하세요:");
		int a = sc.nextInt();
		
		System.out.print("정수 b를 입력하세요:");
		int b = sc.nextInt();
		
		//System.out.println(a+":"+b);
		
		boolean result = (b!=0 && a%b == 0); //b가 0이 아닐때 실행 //교환법칙 적용x
		
		System.out.printf("%d가 %d의 배수인가? : %b\n",a,b,result);
	}
}
