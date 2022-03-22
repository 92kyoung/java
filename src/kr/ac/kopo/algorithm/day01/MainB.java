package kr.ac.kopo.algorithm.day01;

import java.util.Scanner;

public class MainB {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String str = sc.next();
	char [] arr = new char[str.length()];
	for(int i=0; i<str.length(); i++) {
		arr[i] = str.charAt(i);
	}
	
	char [] arr2 = new char[str.length()];
	
	for(int i=str.length()-1; i>=0; i--) {
		arr2[i]=arr[str.length()-(i+1)];  
	}
	//System.out.println(arr);
	//System.out.println(Arrays.toString(arr2));
	
    
	//if(arr==arr2)
	
	if(String.valueOf(arr).equals(String.valueOf(arr2))) {
		System.out.println(1);
	} else
		System.out.println(0);
	
	System.out.println(arr);
	System.out.println(arr2);
	}
	
}
