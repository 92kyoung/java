package kr.ac.kopo.algorithm.day01;

import java.util.Scanner;

public class MainA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [][] arr= new String[5][15]; 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=sc.nextLine();
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf(arr[j][i]);
			}
		}
	}
}
