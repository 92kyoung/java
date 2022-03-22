package kr.ac.kopo.day09.abs02;

public class HPPrinter extends Printer {

	public void hpPrint() {
		System.out.println("HP프린터에서 출력중...");
	}

	@Override
	public void print() {
	System.out.println("hp 프린터 사용");	
	}
}
