package kr.ac.kopo.day05;

import java.util.Scanner;

class Icecream{
	String name; 
	int price; 
}
public class Homework01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이스크림 몇 개 구입할꺼야?: ");
		int num=sc.nextInt();
		Icecream [] ice  = new Icecream[num];
		
		int sum=0;
		for(int i=0; i<num; i++) {
			ice[i] = new Icecream();
			
			System.out.println("***"+(i+1)+"번째 아이스크림 구매정보"+"***");
			System.out.print("아이스크림 명: ");
			ice[i].name=sc.next();
			
			System.out.print("아이스크림 가격: ");
			ice[i].price =sc.nextInt();
			sum+=ice[i].price;
		}
		
		System.out.println("<총"+num+"개의 아이스크림 구매정보 출력>");
		System.out.println("번호\t아이스크림명\t가격");
		for(int i=0; i<num; i++) {
			System.out.println(i+"\t"+ice[i].name+"\t"+ice[i].price);
		}System.out.println();
		
		System.out.println("총 판매액: "+sum);
		
		
		
		
		
	}
}
