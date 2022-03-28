package kr.ac.kopo.day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

/*
 문자 스트림
 
 iotest/IOMain05.java를 IOMain05.java.txt에 복사
 */
public class IOMain07 {
	public static void main(String[] args) {
		FileReader fr= null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fr=new FileReader("iotest/IOMain05.java");
			br=new BufferedReader(fr);
			
			fw=new FileWriter("iotest/IOMain05.java.txt");
			bw=new BufferedWriter(fw);
			
			pw= new PrintWriter(bw); //버퍼에 필터하나 더 끼움
			
			
			
			
			while(true) {
				String data= br.readLine();
				if(data == null) break; //파일의 끝이 아닐 때까지 동작
				pw.println(data);  // bw.write(data);+bw.newLine();  
			}                       //필터 하나 더 끼워서 엔터 효과를 냄
			bw.flush();
			System.out.println("파일 복사를 완료하였습니다");
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(br);   //kr.ac.kopo.util 패키지, FileClose 클래스의 close 메소드
			FileClose.close(fr);
			FileClose.close(bw);
			FileClose.close(fw);
			FileClose.close(pw);
		}
		
	}

}
