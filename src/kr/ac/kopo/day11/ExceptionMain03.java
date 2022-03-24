package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);
			
			String str = "hello";
			System.out.println(str.charAt(10));
		} catch(ArithmeticException ae) {  //ArithmeticException 예외에 대해서만 처리 // 즉 10/num에 대해서만 처리를 한다
			System.out.println("예외발생 : " + ae.getMessage());
//			ae.printStackTrace();
		} 
		
		  catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException : "
							+ se.getMessage());
		}
		
		
		System.out.println("main end...");
		
	}
}