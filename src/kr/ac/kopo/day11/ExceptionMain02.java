package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		try {
		System.out.println("main start...");
		Random r = new Random();
		int num = r.nextInt(3);	// 0, 1, 2
		System.out.println("num : " + num);
		System.out.println(10 / num);
		} catch(ArithmeticException ae) {
			System.out.println("예외 발생: " + ae.getMessage()); //어떤 에러가 나왔는지 알려줌
			ae.printStackTrace(); //어느 위치에서 어떤 에러가 나는 지 알려줌
		}
		System.out.println("main end...");
		
	}
}



