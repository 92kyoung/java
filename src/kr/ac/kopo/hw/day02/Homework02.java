package kr.ac.kopo.hw.day02;
//11번문제
public class Homework02 {
	public static void main(String[] args) {
		//int num1=((int)Math.random()*10); //0~9사이의 숫자 출력 
		
		int num1=(int)(Math.random()*30)+1;
		int num2=(int)(Math.random()*30)+1;
		int num3=(int)(Math.random()*30)+1;
		int num4=(int)(Math.random()*30)+1;
	
		System.out.println("첫번째:"+num1+"\n두번째:"+num2+"\n세번째:"+num3+"\n네번째:"+num4);
		
		int max=num1>num2 ? num1 : num2;
		if(max<num3) {
			max=num3;
		}
		if(max<num4) {
			max=num4;
		}
		System.out.println("가장큰수:"+max);
	}

}
