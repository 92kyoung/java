package kr.ac.kopo.day05;

public class ArrayMain08 {
	public static void main(String[] args) {
		String [] strArr = new String [3];
				
		strArr[0]= "hello";
		strArr[1]=new String("GOOD");
		strArr[2]= "BYEBYE~~";
		
		for(String str : strArr) {
			System.out.println(str);
		}
	}
}
