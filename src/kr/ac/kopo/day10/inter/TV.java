package kr.ac.kopo.day10.inter;

public interface TV {
	int MIN_VOLUME_SIZE = 0; //인터페이스에서 필드는 다 상수 변수
	/*public static final */int MAX_VOLUME_SIZE = 50; // public static final이 앞에 생략되어있음 
	
	
	/**
	 * 전원을 켜는 기능 //도큐멘테이션(문서화 주석, 주로 public에 많이 주석을 단다)
	 * 파랑은 문서화 주석 / 초록은 코드 주석
	 */
	/*public abstract */void powerOn(); // 인터페이스 메소드는 다 추상 메소드
	void powerOff(); ///*public abstract */이 앞에 다 생략되어잇음
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
}
