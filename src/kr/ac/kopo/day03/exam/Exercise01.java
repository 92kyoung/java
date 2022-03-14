package kr.ac.kopo.day03.exam;

public class Exercise01 {
	public static void main(String[] args) {

		System.out.println("-----1번 문제-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("-----2번 문제-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("-----3번 문제-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + i);
			}
			System.out.println();
		}

		System.out.println("-----4번 문제-----");

		for (int i = 5; i >= 1; i--) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i + j);
			}
			System.out.println();
		}

		System.out.println("-----5번 문제-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----6번 문제-----");

		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----7번 문제-----");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----7번 문제---다른풀이방법---");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

		System.out.println("-----8번 문제-----");

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----9번 문제-----");

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 1; j <= 10 - i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

		System.out.println("-----10번 문제-----");

		for (int i = 1; i <= 10; i++) {
			if (i < 5) {
				for (int j = 5; j >= i; j--) {
					System.out.print("*");
				}
				System.out.println();
			} else
				for (int j = 1; j <= i - 4; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		
		
		
		System.out.println("-----11번 문제-----");

		for (int i = 1; i <10; i++) {
			
			if(i<=5) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
			} 
			
			else {
				
				for (i = 4; i >= 1; i--) {
					for (int j = 1; j < i; j++) {
						System.out.print(" ");
					}
					for (int k = 4; k >= i; k--) {
						System.out.print("*");
					}
					System.out.println();
				}
			
			
		}
		
			
	/*		
		for (int i = 5; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/
	
	
	
	
	
	
	
	}
	}
}

	

