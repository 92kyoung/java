package kr.ac.kopo.day12;
/*
	기본자료형			Wrapper Class
	boolean			Boolean
	char			Character
	byte			Byte
	short			Short
	int 			Integer
	long			Long
	float			Float
	double			Double
	

class Boolean {
	private boolean value;
	
*/
public class WrapperMain {
	public static void main(String[] args) {
		int i = 100;
		Integer i2 = new Integer(100);
		Integer i5 = Integer.valueOf(100);
		
		Integer i3 = 100; //auto boxing (원랜 이런 형태 안됨)
		int i4 = new Integer(100); //auto unboxing (원랜 이런 형태 안됨)
		

		System.out.println(Integer.parseInt("123") + 100);
		System.out.println(Integer.valueOf("123") + 100);
	
	
	}

}
