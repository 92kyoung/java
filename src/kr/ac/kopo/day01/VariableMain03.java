package kr.ac.kopo.day01;

public class VariableMain03 {
	public static void main(String[] args) {
		int a;
		byte b = 10;
		
		//a = b;  int = byte ...?
		a= (int)b; //����ȯ
        a=b; // ������ ����ȯ(����ȯ �ڵ� ����0)	, ������ ���� ���������� ������ ���� ���������� �����ϴ� ��	
        b= (byte)a; //����� ����ȯ, ����ȯ �ڵ� ����x
		
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(10+(int)20.0); //30 int+(int)����ȯ
        
        double d = 10 +20.2;
        int e = (int)(10 + 20.2);
        
        final int NUM = 100;
        System.out.println("NUM:"+NUM);
        //  num=20; num�� ������  final�� ���� 100���� �����Ǿ����Ƿ� �ٽ� ���� ������ ������ �� ����
        
        char ch ='!'; //! ���
        char ch1= '\''; //   '���
        char ch2='\\'; //    \���
        
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(ch2);
        
        String path = "D:\\workspace\\JAVA"; // ��μ����� �� �� \�� �ΰ��� �־�� ����\�� �ν���
        
        String str1 = "\"ab\"";             // "ab"
        System.out.println(str1);
        
        
	}

}
