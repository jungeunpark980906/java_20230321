package day03;

public class 이중For문1 {

	public static void main(String[] args) {
		/* for(1초기화; 3 14조건식; 13증감식) { //1
		 * 		4 15실행문;
		 * 		for(5 16초기화; 6 9 12 17조건식; 8 11증감식){ //1~끝까지 돌고 다시 상위for문
		 * 			7 10실행문;
		 * 		}
		 * }
		 * 1 -> 1부터끝까지 -> 2 -> 1부터 끝까지
		 * */

		// 가로x세로 5개의 별 (행렬)
		// 1줄 (가로줄을 1로보는) -> i / (세로별을 세우는) -> j
		// ***** 1i,5j
		// ***** 2i,5j
		
		for(int i=1; i<=5; i++) {
			System.out.println( );
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
		}
		
		//오른쪽 반삼각형
		System.out.println( );
		System.out.println("-----------------------------------");
		
		for(int i=1; i<=5; i++) {
			System.out.println( );
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		}
		
		System.out.println( );
		System.out.println("-----------------------------------");
		
		//오른쪽아래 반삼각형
		for(int i=1; i<=5; i++) {
			System.out.println( );
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
		}
		
		
		System.out.println( );
		System.out.println("-----------------------------------");
		//트리모양 ----확인필요
		for(int i=1; i<=10; i--) {
			System.out.println( );
			for(int j=1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("@");
			}
			for(int j=1; j>=i; j--) {
				System.out.print(" ");
			}
				
		}
		
		//왼쪽 반삼각형
		System.out.println( );
		System.out.println("-----------------------------------");
		
		for(int i=1; i<=5; i++) {
			System.out.println( );
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		}
		
		//왼쪽 반삼각형
		System.out.println( );
		System.out.println("-----------------------------------");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		
		//if문 사용 방법
		for (int i=1; i<=5; i++) {
			for(int j=1; j>=5; j++) {
				if(j<5-i) { // 현재 i=1, j=1 -> i=1, j=2...
					System.out.println(" ");
				} else {
					System.out.println("*");
				}
			}
			System.out.println( );
		}
		
		
		
		
		
		
		
		
		
	}

}
