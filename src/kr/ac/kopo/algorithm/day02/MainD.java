package kr.ac.kopo.algorithm.day02;

import java.util.Scanner;

public class MainD {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = Integer.parseInt(sc.next());
		sc.nextLine();
		
		String [] str = new String [num];
		
		//char [] reverseC;
		for(int k=0; k<num; k++) {
			str[k] = sc.nextLine();
			char [][] c = new char [num][str[k].length()];
			char [][] reverseC=new char [num][str[k].length()];
		for (int i = 0; i < str[k].length(); i++) {
			c[k][i]=str.charAt(i);
		}
        
		for (int i = 0; i < str.length(); i++) {
			int j = str.length()-(i+1);
				reverseC[j]=c[i];
		    }
        
		String reverseStr=String.valueOf(reverseC);

		if(String.valueOf(c).equals(String.valueOf(reverseC))) {
			System.out.println(str+" & "+reverseStr+" are anagrams.");
		} else if(!String.valueOf(c).equals(String.valueOf(reverseC))) {
			System.out.println(str+" & "+reverseStr+" are NOT anagrams.");
		}
		
		}
	}
}
