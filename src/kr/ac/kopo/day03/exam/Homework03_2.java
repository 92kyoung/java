package kr.ac.kopo.day03.exam;

import java.util.Scanner;

public class Homework03_2 {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("1-100 사이의 정수를 입력:");
	int num1 = sc.nextInt();
	System.out.print("2-10 사이의 정수를 입력:");
	int num2 = sc.nextInt();
	System.out.println();
	System.out.println("1에서 " + num1 + " 사이의 " + num2 + " 의 배수를 제외한 정수 출력");

	for (int i = 1; i <= num1; i++) {
		if (i % num2 != 0) {
			System.out.printf("%3d", i);
		}
	}System.out.println();

	System.out.println("1에서 " + num1 + " 사이의 " + num2 + " 의 배수를 제외한 정수 5개씩 출력");
	int cnt = 0;
	for (int i = 1; i <= num1; i++) {
		if (i % num2 != 0) {
			System.out.printf("%3d",i);
			cnt++;
		}
		if(cnt%5==0) {
			System.out.println(); 
		}
	} //Q.중간에 공백ㅜ..?

}

}