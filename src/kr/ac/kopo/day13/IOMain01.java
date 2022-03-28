package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;

public class IOMain01 {
	public static void main(String[] args) {
		InputStream is = System.in;
		System.out.println(" ctrl+z 입력 시 프로그램 종료 ");
		
		while(true) {
		try {
			int c =is.read();
			if(c==-1) {
				break; //c에 -1값이 반환되면 나가라
			}
			System.out.print((char)c); //인티저 값을 char로 변환
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		
		
		
		
		
	}
}
