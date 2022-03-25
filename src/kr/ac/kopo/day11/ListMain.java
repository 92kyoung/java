package kr.ac.kopo.day11;

import java.util.ArrayList;
import java.util.List;

/*
   List: 순서 0 , 중복 0 하는 데이터의 집합
    - ArrayList
    - LinkedList
    
    add()
    get()
    size()
    remove()
    isEmpty()
    contains()
    clear()
 */
public class ListMain {
	public static void main(String[] args) {
		
	//	List<int> list = new ArrayList <int>();  //제너릭에는 참조변수형만 가능
	//	List<Integer> list = new ArrayList <Integer>(); //int라는 기본자료형을 참조변수화 시켜주는 참조변수 = Integer
    //  List<String> list = new ArrayList <String>();
		
		
		List<String> list = new ArrayList <>();//NEW해서 객체 생성시에 뒤에있는 제너릭에서는 변수타입 생략 가능
		//string=list가 가지고 있는 데이터 집합들의 타입  ,, string 집합을 list 형태로 저장
		
		list.add("one"); //1번지에 one 저장 //list는 내가 순번을 지정해주지 않아도 add되는 순서대로 차곡차곡 저장된다
		list.add("two"); //2번지에 two 저장
		list.add("three");
		list.add("four");
		list.add("one");
		list.add(2,"five");  //2번지에 five 추가 // 그럼 원래 2번지에 있던 값이 사라지는 것이 아니라 뒤로 밀려남
		System.out.println("전체 원소의 개수: "+list.size()+"개");
		
        System.out.println("< PRINT >");
        
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i));  //list의 i번지의 값 알려줘
        }
		
        System.out.println("one삭제 : "+ (list.remove("one") ? "성공":"실패")) ; //return 타입 boolean
        System.out.println("one삭제 : "+ (list.remove("one") ? "성공":"실패")) ; //return 타입 boolean
        System.out.println("one삭제 : "+ (list.remove("one") ? "성공":"실패")) ; //return 타입 boolean
        
        System.out.println();
        
		System.out.println("<1.5 버전>");
		
		
		for(String str : list) {  //string 형으로 되어있는 list의 값들을 str로 출력
			System.out.println(str);
		}
		
	    System.out.println("0번지 문자열 : "+list.get(0));	
	    System.out.println("0번지 위치한 문자열 삭제 문자열 : "+list.remove(0)); //삭제된 0번지 문자열 값이 리턴됨	
	    System.out.println("0번지 문자열 : "+list.get(0));	
			
		/*
		List list = new ArrayList (); //제너릭이 없으면 int쓸 수 있음
		list.add(10);
		*/
		
		
		
	}
}





