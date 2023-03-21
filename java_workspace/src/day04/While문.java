package day04;

public class While문 {

	public static void main(String[] args) {
		// While문 (조건식) {
		//	실행문; // 조건식의 false가 될 수 있는 구문을 꼭 포함!
		// 	증감식;
		// }
		
		// 초기화
		// while (조건식) {
		// 	실행문;
		// 	증감식;
		// }

		
		//1~10까지 출력하시오.
		//1. For문 사용
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		
		System.out.println( );
		//2. While문 사용
		int i =1; //초기값
		while (i<=10) { //조건식
			System.out.print(i+ " "); //실행문
			i++; //증감식
		}	
		
		
		
//--------------------------------------------------------------------------
		 // While문을 이용하여 짝수만 출력
		
		
		System.out.println( );
		// 1-if문을 넣는 경우
		int j = 1;
		while (j<=10) {
			if((j % 2)==0) {
				System.out.print(j+ " ");
			}
			j++;		
		}
		
		
		System.out.println( );
		// 2-증감식을 +=2로 넣는 경우
		int k = 2;
		while (k<=10) {
			System.out.print(k+ " ");
			k += 2;		
		}
		
		System.out.println( );
		// 3-Continue문을 넣는 경우 (1)
		int t = 0;
		while (t<=10) {
			t++; //증감식을 실행문(continue문)보다 위쪽에 배치
			if((t % 2) == 0) {
				System.out.print(t+ " ");
			} if ((t % 2) == 1) {
				continue;
			}	
		}
		
		System.out.println( );
		// 4-Continue문을 넣는 경우 (2)
		int h = 0;
		while (h<=10) {
			h++;	
			if ((h % 2) == 1) {
				continue;
			}	
			System.out.print(h+ " "); // 홀수일 경우, while의 처음으로 돌아가므로 출력x
		}
		
		
	
		
		
		
		
		
	}

}
