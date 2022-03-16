package kr.ac.kopo.day06;

public class Gugudan {
	void print(int dan) {
		System.out.println("***"+dan+"단 ***");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d",dan,i,(dan*i));
			System.out.println();
		}
	}
	
	void print() {
		for(int dan=2; dan<=9; dan++) {
		print(dan);
	}
}
}
