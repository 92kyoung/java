package kr.ac.kopo.day04;

public class ArrayMain03 {
public static void main(String[] args) {
	//int[] arr = new int[5];
	System.out.println("<PRINT>");
	//2. 1.5버전 for문 이용해서 배열값 입력
	//정상적으로 작동되지 않음,  num값을 수정하는 거지 배열 값을 수정하지 않음
	//1.5버전 for문은 검색, 출력 용도로만 사용도ㅣ지 입력 수정 용도로는 사용x
	/*
	int data=1;
	for(int num : arr) { //arr의 0번지에 있는 값을 int num에 대입해라
		num=data++;
	}
	
	for(int num:arr) {
		System.out.print(num+"\t");
	}
	System.out.println();
	*/
	
	//정상적인 배열 입력 방식
	 int [] arr=new int[5];
	 for(int i=0; i<arr.length; i++) {
		 arr[i]=i+1;
		 
	 }
	
	
	//2. 방식
	System.out.println("-------------------------------");
	for(int num : arr) {
		System.out.print(num+"\t");
	} System.out.println();
	
	
	
	//1. 방식
	System.out.println("-------------------------------");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+"\t"); // /t 탭은 한칸 옆으로 띄어쓰기
	} System.out.println();
}
}
