package kr.ac.kopo.day10.inter;

public class UserMain {

	public static void main(String[] args) {
		
		//TV tv = new SamsungTV();
		TV tv = new LGTV();  //묵시적 형변환이 일어남 // new 뒤에 있는 클래스 생성자를 고쳐도 tv라는 변수명을 일일이 안고쳐도 됨
		tv.powerOn();
		tv.channelDown();
		tv.volumeUp();
		tv.channelUp();
		tv.powerOff();
		
		
		/*
		LGTV tv = new LGTV();  
		tv.powerOn();
		tv.channelDown();
		tv.volumeUp();
		tv.channelUp();
		tv.powerOff();
		
		
		SamsungTV tv2 = new SamsungTV();  
		tv2.powerOn();
		tv2.channelDown();
		tv2.volumeUp();
		tv2.channelUp();
		tv2.powerOff();
		 */
	}

}
