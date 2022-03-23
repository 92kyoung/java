package kr.ac.kopo.day10;

import java.util.Random;

/*final*/ class Super {
	private final double PI =3.14; //상수명은 대문자로 쓴다

    Super(){
    	//PI=123; //상수는 수정 불가
    }
    /*final*/ void call() { //final이 붙으면 자식 클래스에서 재정의안됨
    	System.out.println("super:::call()");
    	
    }

}

class Sub extends Super {
	//override
	void call() {
		System.out.println("SUB::call()");
	}
}

class MyRandom extends Random{  //기존 클래스 상속해서 그 클래스의 메소드를 자식 클래스에서 재정의해서 내 맘에 들게 활용
     //source -> override ...Methods 해서 재정의함
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) +1;
	}

	public int nextInt (int start, int end) {
		return super.nextInt(end-start)+start+1; //start부터 end까지의 숫자 
	}
	
	
	//class MyString extends String{} //String은 final 클래스여서 상속 못함
	
}



public class FinalMain {
	public static void main(String[] args) {
		
		MyRandom r  = new MyRandom ();
		int random = r.nextInt(2);
		System.out.println(random);
		
		/*
	    Random r = new Random();
		int random = r.nextInt(90)+1; //1~90까지의 랜덤한 수 
		int random = r.nextInt(90)+10; //1~90까지의 랜덤한 수 
		int random1 = r.nextInt(10)+1; //1~10까지의 랜덤한 수 
		*/
	}
}
