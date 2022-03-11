package kr.ac.kopo.hw.day02;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("초를 입력하시오:");
	int time = sc.nextInt();
	int sec = time % 60 ; //나머지
	int min = time / 60 ;
	int hour = min / 60 ;
	int minute = min % 60 ;
			/*
			if (sec == 0 ) {
			System.out.printf(""%d시간 %d분",hour,minute);
			}
			if(minute == 0) {
				System.out.printf("%d초",sec);
			}
			
			else if (hour == 0) {
				System.out.printf("%d분 %d초",minute,sec);
			} else {
			System.out.printf("%d시간 %d분 %d초",hour,minute,sec);	
			
			}
			*/
	System.out.printf("%d시간 %d분 %d초",hour,minute,sec);	
	
	
		}
	}

	/*
		이경씨 만일 3660초가 나오면 어떻게 출력이 될까요?
		또는 3601초는요??? 한번 생각을 다시해보세요~~~
	*/

