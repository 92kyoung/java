package kr.ac.kopo.day02;
import java.util.Scanner;

public class SwitchMain01 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.print("1~3 사이의 정수 입력: ");
	int num = sc.nextInt();
	
	switch(num) {
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	default : //else의 의미 
		System.out.println("error");
	}
	
	
	
	
	
	
}
}
