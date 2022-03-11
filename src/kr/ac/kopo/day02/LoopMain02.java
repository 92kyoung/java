package kr.ac.kopo.day02;

/*
 *do-while문
 
 init;
 do{
 statement;
 incre/decre;
 }while(expr);
 */
public class LoopMain02 {
	public static void main(String[] args) {
		int cnt = 1;

		do {
			System.out.println("Hello");
			cnt++;
		} while (cnt <= 5);

		while (true) {
			System.out.println("hello");

			cnt++;

			if (cnt > 5) {
				break;
			}

		}
	}
}
