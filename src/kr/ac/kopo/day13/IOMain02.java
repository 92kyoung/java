package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain02 {
	public static void main(String[] args) {
		//자바 1.5 가 들어오기전(스캐너가 생기기 전)에는 이렇게 문자를 입력받았음
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is); //문자 스트림
		
		
		System.out.println(" ctrl+z 입력 시 프로그램 종료 ");
		
		
		
		
		while(true) {
			//int c = is.read();  // 한글은 1바이트가 아니라 2바이트라 1바이트 씩 읽는 바이트 스트림을 사용하면 한글을 제대로 읽지 못함
			try {
				int c = isr.read();
				if(c == -1) break; //ctrl+z가 들어오면 -1이 반환됨
				System.out.println((char)c);  //if이면(ctrl+z가 입력되면) 브레이크하고 아니면 (int)c를 char로 변환해서 출력
			} catch (IOException e) {
				e.printStackTrace();
			}  //바이트 스트림이 아닌 문자 스트림으로 읽어야 한글을 읽을 수 있음
		}
		
		
	}
}
