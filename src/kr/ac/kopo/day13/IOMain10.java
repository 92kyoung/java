package kr.ac.kopo.day13;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class IOMain10 {

	public static void main(String[] args) {
		
		try {
			URL urlObj = new URL("https://www.naver.com");
			
			FileWriter fw = new FileWriter("iotest/naver.html");
			PrintWriter pw = new PrintWriter(fw);
			
			
			InputStream is = urlObj.openStream();
			InputStreamReader isr = new InputStreamReader (is,"utf-8");
			
			while(true) {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
				pw.print((char)c);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
