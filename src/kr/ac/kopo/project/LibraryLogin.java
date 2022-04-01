package kr.ac.kopo.project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryLogin {
	private Scanner sc = new Scanner(System.in);
	private Map<String,String> mapLogin = new HashMap<>();
	
	//메뉴 객체
	LibraryMenu menu = new LibraryMenu();
	
	
	LibraryLogin(){
		
	}
    
	public void libJoin() { //회원가입
		System.out.print("가입하실 아이디를 입력해주세요: ");
		String id=sc.nextLine();
		System.out.print("가입하실 비밀번호를 입력해주세요: ");
		String password = sc.nextLine();
		String password1 ="";
       
		// 비밀번호 확인했을 때 일치 하지 않으면 다시 계속 입력받음
		do {
    	System.out.print("비밀번호 확인: ");
		password1 = sc.nextLine();
		if(!password.equals(password1)) {
			System.out.println("비밀번호가 일치하지 않습니다.");
       }
		} while(!password.equals(password1));
		
			
		
		mapLogin.put(id, password);
		System.out.println("회원가입이 완료되었습니다.");
		System.out.println("메인 화면으로 돌아갑니다.");
		System.out.println();
	
		menu.personalMenu(id);

    }	
	
	
	public void libLogin() {
		mapLogin.put("user1","user1");
		mapLogin.put("user2","user2");
		mapLogin.put("user3","user3");
		mapLogin.put("user4","user4");
		
		System.out.print("아이디를 입력하세요: ");
		String id=sc.nextLine();
		if(!mapLogin.containsKey(id)) {
			System.out.println("입력하신 아이디는 존재하지 않습니다.");
			System.out.println("시스템을 종료합니다");
			System.exit(0);
		}
		
		System.out.print("비밀번호를 입력하세요: ");
		String password = sc.nextLine();
		// mapLogin.get(id) = value 값
		if(!mapLogin.get(id).equals(password)) {
			System.out.println("입력하신 비밀번호는 존재하지 않습니다.");
			System.out.println("시스템을 종료합니다");
			System.exit(0);	
		}
		//로그인에 성공했으면 개인 화면으로 접속
		menu.personalMenu(id);
		
	} 
}