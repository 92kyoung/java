package kr.ac.kopo.day05;

public class ArrayMain07 {
	public static void main(String[] args) {
		int [][] ar = new int [3][];
		for(int i=0; i<ar.length; i++) {
			ar[i]= new int [3+i];
		}
		
		
		for (int i=0; i<ar.length; i++) { //ar.length =3
			for(int j=0; j>ar[i].length; j++) { //ar[0].length =3, ar[1].length=4
				ar[i][j] =i*10 + (j+1);
			}System.out.println();
		} 
		
		for(int[]arr : ar) {
			for(int num : arr) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		
		/*
		for(int [] arr : ar) {
			System.out.println(arr);	
		}
		*/
		
	}
}
