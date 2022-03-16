package kr.ac.kopo.day06;
class ExamMethod{
	int /*리턴 타입 int */ getSum(int a, int b) {
		return a+b;
	}
	int getTotal(int a, int b) {
		int s=0;
		while(a<=b) {
			s+=a++;
			}
		return s;
	}
}
public class MethodMain03 {
	public static void main(String[] args) {
		//같은 패키지 내에서는 동명의 class가 존재할 수 없다
		
		ExamMethod exam = new ExamMethod(); //'이그잼메소드' 클래스의 메소드를 사용하기 위해서 인스턴스 객체 생성
		int sum=exam.getSum(10, 20);
		System.out.println("10+20="+sum);
		
		System.out.println("1~10까지 총합: "+exam.getTotal(1, 10));
		
	}
}
