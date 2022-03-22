package kr.ac.kopo.day07;

public class ConstructorMain02 {
	public static void main(String[] args) {
		Member m = new Member();
		Member m2 = new Member("홍길동");
		/*
		 Member m2 = new Member();
		 m2.name="홍길동";
		 */
		Member m3 = new Member("윤길동",22);
		Member m4 = new Member("윤길동",22,"RH+ A");
		m.info();
		m2.info();
		m3.info();
		m4.info();
	}
}
