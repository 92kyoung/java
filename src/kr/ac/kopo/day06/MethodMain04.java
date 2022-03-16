package kr.ac.kopo.day06;

import java.util.Scanner;

public class MethodMain04 {
	public static void main(String[] args) {
		Gugudan gu = new Gugudan();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("2-9단 사이의 단을 입력: ");
		int dan=gu.getDan();
		
		
		gu.print(dan);
		gu.print();
		
		
		System.out.print("시작단을 입력하시오:");
		int startDan= gu.getDan();
		System.out.print("끝단을 입력하시오:");
		int endDan= gu.getDan();
		
		System.out.println(startDan+":"+endDan);
	}
}
