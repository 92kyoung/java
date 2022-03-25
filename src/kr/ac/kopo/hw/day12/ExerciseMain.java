package kr.ac.kopo.hw.day12;

import java.util.HashSet;
import java.util.Set;

public class ExerciseMain {

	public static void main(String[] args) {
		int num = 6;
		int size=0;
		Set<String> set = new HashSet<>();
        
		for (int i = 0; i < num; i++) {
			String randomNum = (int) (Math.random() * 45 + 1);
			set.add(String.valueOf(randomNum));
			if (set.add(randomNum)==false)
		}
		
		
		
		
        
		System.out.println("전체 원소의 개수: " + set.size());

			
	  for (String str : set) { 
		  System.out.println(str); 
		  Integer.valueOf(str);
	
		  }
	
			 
	  
	  
	  
		}	
	}
		

