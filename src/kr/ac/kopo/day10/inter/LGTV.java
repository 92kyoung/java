package kr.ac.kopo.day10.inter;

public class LGTV implements TV{
    //멤버 변수
	private boolean power;
	private int volumeSize;
	private int channelNo;
	protected static final int MAX_CHANNEL_SIZE = 100;	 // 0 ~ 99 
	
	
	
	//기본 생성자 생성 (source > generate ..superclass)
	public LGTV() {
		super();
		System.out.println("LGTV를 구매했습니다");
		power=false;
		volumeSize=10;
		channelNo=3;
	}
	
	
	
	
	@Override
	public void powerOn() {
		power =true;
		System.out.println("전원을 켭니다");
		
	}

	@Override
	public void powerOff() {
		power =false;
		System.out.println("전원을 끕니다");
		
	}
	
	@Override
	public void channelUp() {
		channelNo = ++channelNo % LGTV.MAX_CHANNEL_SIZE;
		System.out.println("채널을 올립니다");
		info();
	}

	@Override
	public void channelDown() {
		if(channelNo == 0)
			channelNo = LGTV.MAX_CHANNEL_SIZE;
		channelNo--;
		System.out.println("채널을 내립니다");
		info();
	}

	@Override
	public void volumeUp() {
		if(volumeSize<TV.MAX_VOLUME_SIZE)//TV라는 인터페이스에서 최대볼륨크기를 알고 있음
			volumeSize++;
		System.out.println("음량을 높입니다");
		
	}

	@Override
	public void volumeDown() {
		if(volumeSize>TV.MIN_VOLUME_SIZE)//TV라는 인터페이스에서 최대볼륨크기를 알고 있음
			volumeSize--;
		System.out.println("음량을 낮춥니다");
		
	
		
	}

	@Override
	public void mute() {
		volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거 중입니다");
		
	}
	
	public void info() {
		System.out.println("채널번호 : "+ channelNo+" , 음량크기: "+volumeSize);
		
	}

}
