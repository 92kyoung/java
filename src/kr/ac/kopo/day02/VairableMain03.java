package kr.ac.kopo.day02;

public class VairableMain03 {
	public static void main(String[] args) {
		int a = 10, b=5;
		int max = a>b?  a:( a<b?b:0);
		max= a == b ? 0 : ( a>b?a:b);
		
		System.out.println("max:"+ max);
	}

}
