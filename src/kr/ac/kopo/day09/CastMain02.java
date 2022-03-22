package kr.ac.kopo.day09;

public class CastMain02 {
	public static void main(String[] args) {
	//	Child01 c = (Child01) new Parent(); //실행오류
		
		Parent p = new Child01();
		Child01 c2 = (Child01)p;
		
		c2.sleep();
		c2.study();
	}
}
