package kr.ac.kopo.day09;

public class CastMain01 {

	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	*/
	public static void print(Parent p) {
		p.print();
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		} 
		
//		System.out.println("Child01 : " + (p instanceof Child01));
//		System.out.println("Child02 : " + (p instanceof Child02));
//		System.out.println("Parent : " + (p instanceof Parent));
	}
	
	
	public static void main(String[] args) {
		
		print(new Child02());
//		print(new Child01());
//		print(new Parent());
		
		/*
		Child01 c01 = new Child01();
		print(c01);
		
//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02);
//		c02.print();
		
		Parent p = new Parent();
		print(p);
//		p.print();
		
		Parent p2 = new Child01();
		*/
	}
}
