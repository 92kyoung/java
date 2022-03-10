package kr.ac.kopo.day01;
/*
�ƽ�Ű �ڵ�(0~256): 1BYTE
    �빮��, �ҹ���, ���� ����, Ư������, ���� ���ڸ� ���ڷ� �ϴ��� ��Ī��Ų ����ǥ
�����ڵ�(0~65500): 2BYTE
    �ٱ��� ���� ����ǥ, �ڹ��� �����ν�
    
'A' : 65       0x41          0x: 16������� ��~ 
'a' : 97       0x61
����0 '0' : 48   0x30
  **�ڹٴ� �����ڵ� ��� , C�� �ƽ�Ű �ڵ� �����
    
*/


public class PrintMain02 {
	
	
	public static void main(String[] args) {
		System.out.println('A'+"BCD"); //ABCD
		System.out.println('A'+'B');  //131
		System.out.println('A'+10);  //65+10
}
}
