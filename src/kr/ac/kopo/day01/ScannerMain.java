package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    // ���� �빮�ڷ� �����ϸ� ���� �������̰� ���� �������� String���� �� new�� �����
		
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int a = sc.nextInt();
		System.out.println("a:"+a);
		
		// next char string �� ���� 
		
		System.out.print("���ڿ��� �Է�:");
		String str =sc.nextLine();
		System.out.println("str: "+ str);
		
		//
		System.out.print("���ڸ� �Է�: ");
		char ch =sc.nextLine().charAt(0);
		System.out.println("ch: "+ ch);
		
		//
	}

}
