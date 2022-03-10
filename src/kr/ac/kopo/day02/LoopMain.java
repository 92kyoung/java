package kr.ac.kopo.day02;

/*
 * 반복문을 위한 기본요소 4가지
 * 1.반복 할 문장(statement)
 * 2.시작값(init)
 * 3.증가/감소(incre/decre)
 * 4.종료조건(expr)
 
 while(조건) -> 조건이 참일 때까지 진행
 
 한바퀴 뛸 차례다;
 while(!열바퀴 다 뜀?){
    운동장 한바퀴 뛴다;
    바퀴수 증가;
 }
 
 //while 형식
 1. init 초기화
 while(2.expr만기){
    3.statement
    4.incre/decre
 }
 
 
 //for문 형식
 for(1. init; 2. expr; 3. incre/decre){
      4. statement;
 }
 
 
 */
public class LoopMain {
	public static void main(String[] args) {

		// while
		int i = 1;
		while (i < 11) {
			System.out.printf("%2d Hello \n", i);
			i++;
		}
		System.out.println("수행을 종료합니다");

		
		// for문
		System.out.println("----for문 실행----");
		int j;
		for (j = 0; j < 10; j++) {
			System.out.printf("%2d Hello\n", j);
		}
		System.out.println("----for문 종료----");
	}
}
