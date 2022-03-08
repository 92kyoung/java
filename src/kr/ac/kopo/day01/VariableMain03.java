package kr.ac.kopo.day01;

public class VariableMain03 {
	public static void main(String[] args) {
		int a;
		byte b = 10;
		
		//a = b;  int = byte ...?
		a= (int)b; //형변환
        a=b; // 묵시적 형변환(형변환 코드 생략0)	, 범위가 넓은 데이터형에 범위가 좁은 데이터형을 대입하는 것	
        b= (byte)a; //명시적 형변환, 형변환 코드 생략x
		
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(10+(int)20.0); //30 int+(int)형변환
        
        double d = 10 +20.2;
        int e = (int)(10 + 20.2);
        
        final int NUM = 100;
        System.out.println("NUM:"+NUM);
        //  num=20; num은 위에서  final로 값이 100으로 고정되었으므로 다시 값을 새로이 지정할 수 없음
        
        char ch ='!'; //! 출력
        char ch1= '\''; //   '출력
        char ch2='\\'; //    \출력
        
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        
        String path = "D:\\workspace\\JAVA"; // 경로설정할 때 꼭 \가 두개씩 있어야 문자\을 인식함
        
        String str1 = "\"ab\"";             // "ab"
        System.out.println(str1);
        
        
	}

}
