package kr.ac.kopo.hw.day04;

import java.util.Scanner;

//0314일자 숙제 2번문제
public class Homework01 {
	public static void main(String[] args) {
	int[] arr = new int[10];
	int[] sum = new int[2];
	//sum[0]:짝수 총합 sum[1]:홀수 총합
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<arr.length; i++) {
		System.out.print((i + 1) + "'s num: ");
		arr[i] = sc.nextInt();
		if(arr[i]<0) {
			i--;
	        //arr[i]%2는 0 (짝수 합) 또는 1 (홀수 합)
		}
		sum[arr[i]%2]+=arr[i]; //i값이 올바르게 입력되었을 때만 합을 구함
	}
	
	String [] title = {"짝수","홀수"};
	for( int mod =0; mod<=1; mod++) {
		System.out.println("<"+title[mod]+">");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==mod) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println(title[mod]+"의 총합: "+sum[mod]);
	}
	
	}
}
