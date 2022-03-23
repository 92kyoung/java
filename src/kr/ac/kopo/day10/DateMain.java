package kr.ac.kopo.day10;

import java.util.Calendar;
import java.util.Date;

public class DateMain {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		//System.out.println(c);
		
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;   //MONTH는 0~11사이의 값이 나옴
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK); //1(일)~7(토)
		String [] week = {"","일","월","화","수","목","금","토"};
		System.out.println(year +"년 " + month + "월 " + date +"일 "+ week[day]+ "요일 입니다 ");
		
		
		//2020년 5월 20일 무슨요일??
		c.set(2020, 5-1, 20);
		day=c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020.05.20 "+week[day]);
	
		
		int lastday = c.getActualMaximum(Calendar.DATE);
		System.out.println(lastday);
		
		
		
		Date d = c.getTime();
		System.out.println(d);
		
		
		
		/*Icecream ice = new Icecream();
		System.out.println(ice.toString()); //Icecream 주소 출력
		
		
		Date d = new Date();
		System.out.println(d.toString());
		//System.out.println(d); 랑 같은뜻
		
		//오늘은 2022년 3월 23일 (수) 입니다.
		
		System.out.println();
		
		int year = d.getYear()+1900;
		int month = d.getMonth()+1;
		int date= d.getDate();
		int day = d.getDay();
		
		String [] week = {"일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 : "+year+"년 "+month+"월 "+date+"일 "+week[day]+"요"
				+ "일 ");
		
		
		*/
	}
}
