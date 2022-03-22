package kr.ac.kopo.day09.abs01;

import java.util.Scanner;

public class Menu {
	
	private Scanner sc= new Scanner(System.in);
	
	//프린터 타입 선택 메소드
	public String select() {
		System.out.print("프린터를 선택하세요(1번 LG 2번 SAMSUNG): ");
		String type = sc.next();
		return type;
	}
	
	public void print(String type) {
		switch(type) {
		case "1":
			LgPrinter lg = new LgPrinter();
		    lg.lgPrint();
			break;
		case "2":
			SamsungPrinter sg = new SamsungPrinter();
		    sg.samsungPrint();
			break;
		}
		
	}
	
	public void process() {
		
		String type = select();   //타입 선택 메소드 (위의 메소드로 올라감)
		//select 메소드의 리턴 타입인 string을 string type에 저장
		 
		print(type);
	}

}
