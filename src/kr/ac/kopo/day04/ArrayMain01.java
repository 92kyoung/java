package kr.ac.kopo.day04;

public class ArrayMain01 {
	public static void main(String[] args) {
		int [] arr;
		
		//정수 5개를 가지는 배열 생성
		arr=new int [5];
		System.out.println("{배열의 첫번째 주소값}arr:"+arr);
		
		//배열의 크기를 바꾸면 아예 새로운 배열이 생성되어서 주소값이 변경됨
		arr=new int [5];
		System.out.println("{배열의 첫번째 주소값}arr: "+arr);
		
		//배열 원소의 총 개수
		System.out.println("배열의 원소 총 개수: "+arr.length+"개");
		
		
		//n번째 원소 //따로 초기화안해주면 int는 0으로 자동 초기화됨
		System.out.println("1번째 원소: "+arr[0]);
		System.out.println("2번째 원소: "+arr[1]);
		System.out.println("3번째 원소: "+arr[2]);
		System.out.println("4번째 원소: "+arr[3]);
		System.out.println("5번째 원소: "+arr[4]);
		
		System.out.println("------------------------------");
		
		for(int i=0; i<5; i++) {
			System.out.println(i+"번째 원소: "+arr[i]);
		}
		
		System.out.println("------------------------------");
		
		// 각 원소 값에 10,20,30,40,50 대입
		for(int i=0; i<5; i++) {
			arr[i]=(i+1)*10;
			System.out.println(i+"번째 원소: "+arr[i]);
		}
	}
}
