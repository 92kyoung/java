package kr.ac.kopo.day12;

public class MapMain03 {
	public static void main(String[] args) {
		
		
		Member m = new Member("홍길동","010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");		
		
		if(m.equals(m2)) {  //object에서 equals는 오버라이딩 안하면 객체 끼리 주소 비교를 함 
			System.out.println("same");
		} else {
			System.out.println("differnt");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		String s01=new String("Hello");
		String s02=new String("Hello");
		
		if(s01.equals(s02)) { //s01==s02는 주소비교
			System.out.println("same");
		} else {
			System.out.println("differnt");
		}
		*/
	}
}
