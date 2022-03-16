package kr.ac.kopo.day05;
//실행 클래스
public class CarMain {
	public static void main(String[] args) {
		Car c = new Car();
		c.name="소나타";
		c.company="현대";
		
		Car c2 = new Car();
		c2.name="k9";
		c.company="기아";
		
		System.out.println("첫번째 자동차명: "+c.name);
		System.out.println("두번째 자동차명: "+c2.name);
	}

}
