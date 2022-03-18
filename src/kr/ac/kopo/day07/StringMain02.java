package kr.ac.kopo.day07;

public class StringMain02 {
	public static void main(String[] args) {
//		String str = "Hello";
//		String str2 = "Hello";
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		if(str == str2) {//참조변수 끼리의 비교는 주소를 비교하는 것이다
			System.out.println("주소비교: 같다");
		} else {
			System.out.println("주소비교: 다르다");
		}
		
		
		if(str.equals(str2)==true) {
			System.out.println("문자열비교: 같다");
		}
		else {
			System.out.println("문자열비교: 다르다");
		}
		
		System.out.println("대소문 관계업시 문자열 비교: "+str.equalsIgnoreCase(str2));
		
	    String[] names= {"홍길동","홍길순","홍길동","박길동","홍가네","윤길동","한길홍"};
	    
	    System.out.println("<이름이 홍길동인 사람 출력>");
	    for(String name: names) {
	    	if(name.equals("홍길동")) {
	    		System.out.println(name);
	    	}	
	    }
	    
	    System.out.println("<성이 홍씨인 사람 출력>");
	    for(String name: names) {
	    	if(name.startsWith("홍")) {
	    		System.out.println(name);
	    	}
	    }
		
	    
	    System.out.println("<이름이 길동인 사람 출력>");
	    for(String name: names) {
	    	if(name.endsWith("길동")) {
	    		System.out.println(name);
	    	}
	    } 
	    
	    System.out.println("<이름에 홍이 포함된 사람 출력>");
	    for(String name: names) {
	    	if(name.contains("홍")) {
	    		System.out.println(name);
	    	}
	    }
	    
	    str="apple";
	    str2="banana";
	    int compare=str.compareTo(str2);
	    
	    if(compare==0){
	    	System.out.println(str+"=="+str2);	
	    } else if (compare>0){
	    	System.out.println(str+">"+str2);
	
	    } else 
	    	System.out.println(str+"<"+str2);
	    	
	}
}

