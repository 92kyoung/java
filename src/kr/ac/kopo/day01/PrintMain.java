package kr.ac.kopo.day01;
public class PrintMain {
	public static void main(String args[]) {
		
		/*
		1. ��� ����
            -������ ���
            -�Ǽ��� ���
            -������ ���('a') : �빮��, �ҹ���, ���ڹ���, Ư������, 
                             ���鹮��(' '[�����̽�], '\n' [����], '\t' [��]). �ѱ�('��', '��')
            -���ڿ� ���("abc")
            -���� ���( true, false)


		 
		2. ��¸޼ҵ�
		
		 1. println : ���๮�� ����( �� �ٲ� �ȴ�)
		 2. print: ���๮�� ������
		 3. printf(): jdk 1.5 ���� �߰�, ���๮�� ����x, ��¹��� ����
		        %d: ����
		        %f: �Ǽ�
		        %c: ����
		        %s: ���ڿ�
		        %b: ����
		 */
		
		System.out.println(10);
		System.out.println('A');
		System.out.println(true);
		System.out.println("tk"+1+5);
		
		
		
		/*
		 printf�� �� �ٱ��� �ȵǴϱ� \n�� �߰��Ѵ� (enter�� �ǹ�)
		 */
		System.out.printf("%d��\n",10+3);
		//System.out.println();
		System.out.printf("%d+%d=%d\n",1,2,1+2);
		
		
		
		System.out.printf("[%7d]\n",1200);  //������ 7�ڸ� ����
		System.out.printf("[%-7d]\n",1200); //-�� �ާF ����
		System.out.printf("[%07d]\n",1200); // ���ڸ� 0 ���
		System.out.printf("[%.2f]\n",12.345); // �Ҽ��� ����, �ڵ������� �ݿø� ��
		
		
		
		
		
	}

}
