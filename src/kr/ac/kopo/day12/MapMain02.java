package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;

/*
alt shift s 누른후 c 누르면 기본생성자 생성
alt shift s 누른후 o 누르면 매개변수를 가지는 생성자 생성
alt shift s 누른후 r 누르면 getter/setter 메소드 생성
alt shift s 누른후 v 누르면 ovveride/implement 메소드 생성
alt shift s 누른후 s 누르면 toSting() 메소드 생성
*/


public class MapMain02 {
	public static void main(String[] args) {
		
		
		Map<Member,Car> map = new HashMap<>();
		map.put(new Member("홍길동","010-1111-2222"), new Car("소나타","33가 3333"));
		map.put(new Member("윤길동","010-3333-4444"), new Car("K5","45나 1234"));
		
	  //홍길동 고객의 차량정보 변경
		map.put(new Member("홍길동", "010-1111-2222"), new Car("카니발", "82다8282"));
		
		//해쉬코드 다름
		System.out.println(new Member("홍길동","010-1111-2222").hashCode());
		System.out.println(new Member("홍길동","010-1111-2222").hashCode());
		
		System.out.println();
		
		/*
		//문자열은 해쉬코드 같음
		System.out.println("hello".hashCode());
		System.out.println(new String("hello").hashCode());
		System.out.println(new String("hello").hashCode());
		*/
		
		/*
		Set <Entry<Member,Car>> entrys =map.entrySet();  //키:멤버형 밸류:카형
		for(Entry<Member,Car> data : entrys) {
			Member member = data.getKey();
			Car car = data.getValue();
			
			System.out.println(member); //주소값이 찍힘
			System.out.println(car); //toString하면 주소값 말고 내가 원하는 데이터가 찍힘
		
		}
		*/
			System.out.println("총 개수 : "+map.size());
		
	}
}
