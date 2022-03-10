package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 
   if(조건1) {
   문장1;
   } else {
      if(조건2) {
           문장2;
      } else {
           문장3;
      }
   }
    
     출발한 시간을 입력하세요 (ex. 7시30분:730 ) => 807
     버스를 탑니다.
 */
public class IFMain02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("집에서 출발한 시간을 입력하세요: ");
		int time = sc.nextInt();
		
		
		/*
		 [다중 if]
		 
		 if(조건1){
		      문장1;
		 } else if(조건2) {
		      문장2;
		 } else {
		      문장3;
		 }
		 
		 */
		
		
		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else if (time < 815) {
				System.out.println("버스를 타고 학교에 간다");
		} else {
				System.out.println("택시를 타고 학교에 간다");
		}
			
		
		
	
		
	}

}
