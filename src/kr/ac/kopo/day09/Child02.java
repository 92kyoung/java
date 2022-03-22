package kr.ac.kopo.day09;

public class Child02 extends Parent{
	String name = "자식";
	
	@Override
	public void print() {
		System.out.println("Child02::print() 호출...");
	}
	public void play() {
		System.out.println("나는 노는 중");
	}
	public void sing() {
		System.out.println("나는 노래부르는 중");
	}
}
