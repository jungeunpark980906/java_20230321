package day04;

public class 이중For문 {

	public static void main(String[] args) {
		/*
		 * 다음을 출력하시오 (이중For문사용) 1 2 3  4 5 6  7 8 9
		 */

		
		
		// 1. num++; 증감식으로 증가하고 num을 출력하는 방법
		int num = 0;

		for (int i = 1; i <= 9; i += 3) { // 3줄을 만드는 for문
			System.out.println();

			for (int j = 1; j <= 9; j += 3) { // 1줄에 3개가 들어간다는 for문
				num++;
				System.out.print(num + " ");
			}
		}

		
		
		// 2. 증감식이 없고, 출력시에 ++num을 이용하여 증감 출력하는 방법
		int num1 = 0;

		for (int i = 1; i <= 9; i += 3) {
			System.out.println();

			for (int j = 1; j <= 9; j += 3) {
				System.out.print((++num1) + " "); // ++num1을 넣어 증가한 0+1로 시작
			}
		}

		
		
		
		
		System.out.println( );
		// 3. if문 사용(이중For문사용x)
		  for (int i=1; i<=9; i++) { 
			  System.out.print(i+" "); 
			  //아래에 놓을 경우. i=3이되면 내려가 12 345가 되서 위로 올림
			  if((i%3)==0) { 
				  System.out.println( ); 
				  }    
		  }
		  
		  
		  
		  
		 

	}

}
