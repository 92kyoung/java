package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    // 앞이 대문자로 시작하면 참조 변수형이고 참조 변수형은 String제외 다 new를 써야함
		
		System.out.print("정수를 하나 입력하세요: ");
		int a = sc.nextInt();
		System.out.println("a:"+a);
		
		// next char string 은 없음 
		
		System.out.print("문자열을 입력:");
		String str =sc.nextLine();
		System.out.println("str: "+ str);
		
		//
		System.out.print("문자를 입력: ");
		char ch =sc.nextLine().charAt(0);
		System.out.println("ch: "+ ch);
		
		//
	}

}
