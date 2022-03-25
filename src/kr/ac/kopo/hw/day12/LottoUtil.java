package kr.ac.kopo.hw.day12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoUtil {
	private int num=6;
	public void start() {
		Scanner sc = new Scanner (System.in);
		System.out.println("게임 횟수를 입력하세요");
		int cnt = sc.nextInt();
	        for(int i = 0; i < cnt; i++) {
	          Arrays.toString(getNumbers());
		     //System.out.println(gameArr);
		          //Arrays.toString() //배열 안 내용 출력하기
	        }

	    }

	    private int[] getNumbers() {
		// 1 ~ 45 사이의 로또번호 6개 추출
	    
	    //1번방법
	    	Set<String> set = new HashSet<>();

			for (int i = 0; i < num; i++) {
				int randomNum = (int) (Math.random() * 45 + 1);
				set.add(String.valueOf(randomNum));
			}
			System.out.println("전체 원소의 개수: " + set.size());

				
		  for (String str : set) { 
			  System.out.println(str); 
			  Integer.valueOf(str);
		       
			  }
	    	return ;
	    }
}
