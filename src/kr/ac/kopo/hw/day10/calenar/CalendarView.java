package kr.ac.kopo.hw.day10.calenar;

import java.util.Scanner;

public class CalendarView {
	private Scanner sc = new Scanner(System.in);
	
	private int  getInt(String msg) { //이 클래스 안에서만 돌아가니까 접근제한자를 프라이빗으로 지정함
		System.out.println(msg);
		return Integer.parseInt(sc.nextLine()); //문자열 받은걸 정수로 변환
		
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		int year=0, month=0;
		while (true){
		int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
		switch(type) {
		case 1 : 
			year = getInt("년도를 입력하세요: ");
			util.showByYear(year);
			break;
		case 2 : 
			year = getInt("년도를 입력하세요: ");
			month = getInt("월을 입력하세요: ");
			util.showByMonth(year, month);
			break;
		case 3 : 
			System.out.println("종료 선택");
			System.exit(0);
		}
		}
	}

}
