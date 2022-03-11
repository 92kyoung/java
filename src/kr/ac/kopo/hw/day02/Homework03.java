package kr.ac.kopo.hw.day02;
//7번문제
public class Homework03 {
	public static void main(String[] args) {
		int upperCnt = 'Z' - 'A'+1;
		int lowerCnt = 'z' - 'a'+1;
		
		 char ch = 'B';
		 if(ch>='A'&&ch<='Z') {
			 ch = (char)(ch + ('a'-'A'));
			 
		 } else if (ch>='a' && ch<='z') {
			 ch = (char)(ch + ('a'-'A'));  // ch + ('a'-'A') // 문자형2바이트 + 인티저 4바이트 => 묵시적 형변환 인티저로 변경됨
			                               // 인티저를 다시 문자형으로 변경해야되기 때문에 명시적 형변환으로 문자형으로 바꾼다
		 }	
	}
	
	
}