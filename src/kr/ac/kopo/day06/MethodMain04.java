package kr.ac.kopo.day06;

import java.util.Scanner;

public class MethodMain04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2-9단 사이의 단을 입력: ");
		int dan=sc.nextInt();
		
		Gugudan gu = new Gugudan();
		
		gu.print(dan);
		gu.print();
		
	}
}
