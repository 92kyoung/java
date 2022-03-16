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
	
	void print() {
		for(int dan=2; dan<=9; dan++) {
		print(dan);
	}
}
}
