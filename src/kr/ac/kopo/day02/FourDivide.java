package kr.ac.kopo.day02;
import java.util.Scanner;
/*
 //day02.hw
 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면
에 출력하시오
정수를 입력하세요 : 10
나눌 수를 입력하세요 : 7
몫 : 1
나머지 : 3
 */
public class FourDivide {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		System.out.print("나눌 수를 입력하세요: ");
		int div = sc.nextInt();
		
	    System.out.printf("몫:%d\n",num/div);
	    System.out.printf("나머지:%d\n",num%div);
		
		
		
	}
}
