package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 set (중복x, 순서x)
    -HashSet
    -TreeSet
 */
public class SetMain {
	public static void main(String[] args) {
	Set<String> set = new HashSet<>();
	
	System.out.println("one 입력 성공여부: " + set.add("one"));	
	set.add("two");
	set.add("three");
	set.add("four");
	set.add("five");
	System.out.println("one 입력 성공여부: " + set.add("one"));	
	
	
	System.out.println("전체 원소의 개수: "+set.size());

	/*
	 * 전체데이터 접근방식
	 * 1. 1.5버전의 for문사용
	 * 2.toArray() 메소드 이용
	 * 3.Iterartor 객체 이용
	 */
	
	System.out.println("<1.5 for문을 이용한 출력>");
	
	for(String str : set) {
		System.out.println(str);
	}
	
	System.out.println("<toArray() 이용한 출력>");
	Object [] arr = set.toArray();
	 //투 어래이는 오브젝트 배열을 리턴값으로 가짐
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		
		//System.out.println(arr[i].length()); 사용불가
		
		/*
		 arr 배열은 내부적으로 스트링을 가지고 있음. 오브젝트는  스트링을 가르키고 있음. 부모가 자식의 인스턴스 객체 가르킴. 
         이런 경우 부모는 부모의 메소드만 사용 가능. length()는 스트링이 가지고 있는 메소드라서 사용할 수 없음.
         사용하게 하려면 명시적 형변환을 사용해야 함.
		 */
	}
	
	/*
	 Iterator(순환객체) 주요 메소드  --->데이터에 하나하나씩 접근하는 것이 목적
	   -hasNext() : 다음에 접근할 공간에 데이터가 있는지 존재여부를 판단
	   -next() : 데이터 접근
	 */
	
	System.out.println("<Iterator 이용한 출력>");
	
	Iterator <String> ite = set.iterator(); //자바.유틸.이터레이터를 임포트해야함
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	
}
}
