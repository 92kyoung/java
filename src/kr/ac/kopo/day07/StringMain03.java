package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain03 {
	public static void main(String[] args) {
		String str = "hello world!";

		// char search = 'r';
		// String search = "llo";
		String search = "l"; // 제일 처음에 나온 문자만 알려줌. 중복 된 문자 확인 불가능
		System.out.println(search + "위치: " + str.indexOf(search)); // 0번지 부터 검색
		System.out.println(search + "위치: " + str.indexOf(search, 5)); // 5번지 부터 검색해줘

		System.out.println(search + "위치 index 출력"); // 찾고자 하는 문자열이 없으면 -2 출력
		str = "hello world";
		search = "1";
		int index = str.indexOf(search);
		while (index != -1) {
			System.out.println("시작인덱스: " + index);
			index = str.indexOf(search, index + 1);
		}

		/*
		 * for(int i=0; i<str.length(); i++) { if(str.charAt(i)=='r') {
		 * System.out.println("r위치: "+i); } }
		 */

		
		str = "hello world!";

		String subStr = str.substring(3, 8); // [3] ~ [8-1] 문자열로 변환
		System.out.println("substring(3,8) : " + subStr);
		System.out.println("substring(6) : " + str.substring(6));

		str = "hello" + "!!!!";
		str = "hello".concat("!!!!");
		System.out.println("concat() : " + str);
		
		String result = str.replace("l", "rr");
		
		System.out.println(result);
		
			
		str = "    hello world     ";
		System.out.printf("[%s] 길이 : %d\n", str, str.length());
		result = str.trim();
		System.out.printf("[%s] 길이 : %d\n", result, result.length());
		
		str = "Hello world!!";
		System.out.println("str : " + str);
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
		
		String data = "홍길동전:허균:조선시대";
		String[] bookInfo = data.split(":");
		System.out.println("split() : " + Arrays.toString(bookInfo));
		
		
		int num=123;
		String strNum=String.valueOf(num); //num+""
		System.out.println(strNum+100);
		//System.out.println("123"+100);
		
		
		
	}
}
