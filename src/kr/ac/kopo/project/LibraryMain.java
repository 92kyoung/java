package kr.ac.kopo.project;

public class LibraryMain {
	public static void main(String[] args) {
		//첫화면
		LibraryMenu menu = new LibraryMenu();
		int menuResult = menu.menuStart();
		LibraryLogin login = new LibraryLogin ();
		LibraryManager manager = new LibraryManager();
		
		switch(menuResult){
		case 1://로그인
		    login.libLogin();
		break;
		
		
		case 2: //회원가입
			login.libJoin();
			break;
			
			
		case 3: //관리자모드
			manager.managerLogin();
		    break;
		
		}
		
	}
}
