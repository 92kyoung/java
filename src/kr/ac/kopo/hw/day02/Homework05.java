package kr.ac.kopo.hw.day02;
import java.util.Scanner;
public class Homework05 {


		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("몇 초 인지 입력하세요 : ");
			int time = scanner.nextInt();
			
			int hours = time/3600;
			int minutes = time%3600/60;
			int seconds = time%3600%60;
			
			if(hours > 0) {
				System.out.printf("%d시간 ", hours);
			}
			if(minutes > 0) {
				System.out.printf("%d분 ", minutes);
			}
			if(seconds > 0) {
				System.out.printf("%d초 ", seconds);
			}
		}
	}

	
	
	
	


