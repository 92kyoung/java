package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
  Map: key, value 쌍의 집합, key에 대한 중복(x)
   -HashMap
   -TreeMap
   
 */
public class MapMain01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> map =new HashMap<>();  // HashMap 객체 생성
		
		map.put("aaa","1111");
		map.put("bbb","2222");
		map.put("ccc","3333");
		map.put("ddd","4444");
		
		
		System.out.println("<패스워드 변경 서비스>");
		System.out.print("변경할 아이디를 입력하세요: ");
		String id =sc.nextLine();
		//id가 키에 존재하는 지 확인 =containsKey
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			//return; //main 메소드에서 리턴하면 서비스 종료됨
			System.exit(0); //위에 리턴 써도됨
		}
		
	    System.out.print("기존의 패스워드를 입력하세요: ");
	    String password=sc.nextLine();
	    if(!map.get(id).equals(password)) { //password 불일치
	    	System.out.println("패스워드가 일치 하지 않습니다.");
	    	System.out.println("서비스를 종료합니다");
	    	return;
	    }
	   
	    System.out.print("변경할 패스워드를 입력하세요: ");
	    String newPassword=sc.nextLine();
	    map.put(id, newPassword);  //put(key값,value값)
	    System.out.println("<패스워드 변경이 완료되었습니다>");
	    
	    
	    System.out.println("---------------------------------------------------");
	    
	    System.out.println("<회원정보 출력>");
	    System.out.println("---------------------------------------------------");
	    System.out.println("아이디\t패스워드 ");
	    
	    //Map에 있는 값들 출력
	    // 키는 중복을 허용하지 않고 순서도 없다 = 키를 set으로 변환하여 출력
	  
	    
	   //방식1 //map.keySet(); //맵의 키를 set형으로 변환
	   
	    Set<String>keys=map.keySet();
	    for(String key:keys) {
	    	System.out.println(key + "\t" + map.get(key));
	    }
	    
	    
	    /* 
	     *방식2
	   Set <Entry <String,String>> set = map.entrySet();  //import java.util.Map.Entry;
	   //맵에있는 정보를 set형의 객체로 생성하고 싶다.
	   //map안에 있는 entry 클래스의 객체들을 set형으로 추출하고 싶다 
	    
	   for(Entry <String,String> e : set) {
		   System.out.println(e.getKey()+"\t"+e.getValue());
		   //멤버변수가 private인데 이 멤버변수를 외부에 보여주고 싶을 때는 get멤버변수의 이름 앞글자 대문자로 해서 부른다
	   }
	   */ 
	   
	    
	    System.out.println("---------------------------------------------------");
	}
}

