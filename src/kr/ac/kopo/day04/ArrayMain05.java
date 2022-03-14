package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
	public static void main(String[] args) {
		int[]arr= {10,20,50,70,30};
        
		//shallow copy 얕은 복사 방식
		//int []copy=arr; 
		//copy 값만 수정했을 뿐인데 arr 값도 같이 변경됨
		//arr과 copy는 똑같이 똑같은 배열의 시작 주소를 가리키기 때문. 즉 같은 배열을 가르키고 있기 때문이다.
		
		/*
		//deep copy 깊은 복사
		int [] copy= new int [arr.length];  //arr배열의 크기(개수)만큼 copy 배열의 크기 설정
		for(int i=0; i<arr.length; i++) {
			copy[i]=arr[i];
		}
		//얕은 복사 방식과 다르게 copy배열의 값만 바뀜
		// 같은 배열의 크기과 같은 배열의 값을 가지고 있는 서로 다른 주소를 가진 배열을 새로이
		//생성했기 때문.
		*/
		
		//copy method
		int[]copy=new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);
		
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("copy: "+Arrays.toString(copy));
		
		copy[2]=100;
		
		System.out.println("arr: "+Arrays.toString(arr));
		System.out.println("copy: "+Arrays.toString(copy));
		
		
	}
}
