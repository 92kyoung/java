package kr.ac.kopo.project;
import java.util.Scanner;

public class LibraryMenu {
	private Scanner sc = new Scanner(System.in);
	LibrarySearch search = new LibrarySearch();
	
	public int menuStart(){
	System.out.println("안녕하세요 구이도서관입니다:D 원하시는 메뉴를 선택하세요.");
	System.out.println();
	System.out.println("---------------------------------------------");
	System.out.println();
	System.out.println("1.로그인\t 2.회원가입\t 3.도서 검색\t 4.관리자 모드");
	System.out.println();
	System.out.print("메뉴 선택:");
	int menu=sc.nextInt();
	return menu;
	}
	
	
	
	public void personalMenu(String id) {
		System.out.println("---------------------------------------------");
		System.out.println("Welcome");
		System.out.println("---------------------------------------------");
		System.out.println(id+"님의 개인 페이지");
		System.out.println("---------------------------------------------");
		System.out.println("원하는 메뉴를 선택하세요");
		System.out.println("---------------------------------------------");
		System.out.println("1.도서 검색  2.대여  3.반납  ");
		System.out.println("---------------------------------------------");
		System.out.println("메뉴 선택: ");
		
		int personalmenu = sc.nextInt();
		switch(personalmenu){
		case 1://도서검색
			search.bookSearch();
		    break;
		
		
		case 2: //대여
			
			break;
		
		case 3: //반납
			
			break;
		default:
			System.out.println("잘못된 값을 입력하였습니다.");
			break;
		
		}
	}

}
