package kr.ac.kopo.day01;
/*
아스키 코드(0~256): 1BYTE
    대문자, 소문자, 숫자 문자, 특수문자, 공백 문자를 숫자로 일대일 매칭시킨 숫자표
유니코드(0~65500): 2BYTE
    다국어 지원 숫자표, 자바의 문자인식
    
'A' : 65       0x41          0x: 16진수라는 뚯~ 
'a' : 97       0x61
문자0 '0' : 48   0x30
  **자바는 유니코드 기반 , C는 아스키 코드 기반임
    
*/


public class PrintMain02 {
	
	
	public static void main(String[] args) {
		System.out.println('A'+"BCD"); //ABCD
		System.out.println('A'+'B');  //131
		System.out.println('A'+10);  //65+10
}
}
