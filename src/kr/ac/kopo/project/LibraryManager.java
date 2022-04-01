package kr.ac.kopo.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * LibraryManager class 작업
 - 관리자 로그인
 - 도서 추가
 - 도서 삭제
 */
public class LibraryManager {
	private Scanner sc = new Scanner(System.in);
	
	public void managerLogin () { //관리자 로그인
		//맵 생성 
		Map<String,String> manager = new HashMap<>();
		manager.put("0000","0000");
		System.out.println("(초기 아이디, 비밀번호 :0000)");
		System.out.print("관리자 아이디를 입력하시오:");
		String id=sc.nextLine();
		
		
		if(!manager.containsKey(id)) {
			System.out.println("입력하신 아이디는 존재하지 않습니다.");
			System.out.println("시스템을 종료합니다");
			System.exit(0);
		}
		
		System.out.print("관리자 비밀번호를 입력하세요: ");
		String password = sc.nextLine();
		// mapLogin.get(id) = value 값
		if(!manager.get(id).equals(password)) {
			System.out.println("입력하신 비밀번호는 존재하지 않습니다.");
			System.out.println("시스템을 종료합니다");
			System.exit(0);
			
		//로그인에 성공했으면 개인 화면으로 접속	
			
		}
	}
	
	
	public class bookAdd {
		//map 다중 values
		
		
		
	}
	
	public class bookDelete {
		//map 다중 values
		
		
		
	}

}
