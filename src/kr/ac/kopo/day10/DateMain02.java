package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain02 {
	public static void main(String[] args) {
		//String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 HH시 mm분 ss초(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
	}
	
	
	
	
}
