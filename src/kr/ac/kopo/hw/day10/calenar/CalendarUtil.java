package kr.ac.kopo.hw.day10.calenar;

import java.util.Calendar;

public class CalendarUtil {
	private Calendar c;
	public CalendarUtil() {
		c = Calendar.getInstance();
	}
	
	public void showByYear ( int year) {  //만년달력 출력
		for (int month =1; month<=12; month++) {
			showByMonth(year,month);
		}
	}
	public void showByMonth ( int year, int month) {
		System.out.println("< "+year+"년"+month+"월 >");  // < 2022년 02 월 >
		//Calendar c = Calendar.getInstance(); //위에 기본 생성자 사용했음
		//year , month 의 1일로 설정되야함
		c.set(year,month-1,1); //month는 0(1월)~11(12월)방식
		
		int week = c.get(Calendar.DAY_OF_WEEK); //(1(일)~7(토))
		
		int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH); //그 달의 마지막 날 
		
		
	    showByDay(week,lastDay);
	}
	
private void showByDay(int week, int lastDay) {
		
		//System.out.println("week : " + week);
		System.out.println("----------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------------------------");
		int cnt=0;
		
		for(int i = 1; i < week; i++) {  //1일에 해당하는 요일 찍기
			System.out.print("\t");
			cnt++;
		}
		
		
		for(int date = 1; date <= lastDay; date++) {
			System.out.print(date + "\t");
			if(date == lastDay || ++cnt % 7 == 0) {
				System.out.println();
			}
		}
	
		System.out.println("----------------------------------------------------");
	}
}
