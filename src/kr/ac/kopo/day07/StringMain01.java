package kr.ac.kopo.day07;
import java.util.Arrays;

public class StringMain01 {
	public static void main(String[] args) {
		String str = new String("hello");
		char [] chars= {'h','e','l','l','o'};
		String str2 = new String(chars);
		
		byte[] bytes = {65,67,98,120};
		String str3 = new String(bytes);
		
		System.out.println("str: "+str);
		System.out.println("str2: "+str2);
		System.out.println("str2: "+str3);
		str = new String ("Hello world!!!");
		System.out.println("str: "+str+", 길이: "+str.length());
		
		int loc =0;
		char[]words = new char [5];
		str.getChars(6,111,words,0); //6부터 11번지 전까지 문자들을 words배열의 0번째 부터 저장해라
		for(int i=6; i<=10; i++) {
			words[loc++]=str.charAt(i);
		}
	
		words=new char[str.length()];
		str.getChars(0, str.length(), words, 0);
		
		//System.out.println("words: "+words); //배열의 시작 주소 나옴
		System.out.println("words: "+Arrays.toString(words)); //배열의 시작 주소 나옴
	
	}
}
