package kr.ac.kopo.algorithm.day01;

import java.util.Scanner;

public class ProblemG {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.printf("%d%d%d ",(num1%10),(num1/10%10),(num1/100));
		System.out.printf("%d%d%d",(num2%10),(num2/10%10),(num2/100));
		System.out.println();
		int revNum1=((num1%10*100)+(num1/10%10*10)+(num1/100));
		int revNum2=((num2%10*100)+(num2/10%10*10)+(num2/100));
		int result=(revNum1>revNum2)?revNum1:revNum2;
		System.out.println(result);
		
			
		//System.out.println((num1%10)+(num1/10%10)+(num1/100));
		
		
	
	}
}
