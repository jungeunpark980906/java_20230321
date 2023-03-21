package day03;

public class Continue문 {

	public static void main(String[] args) {
		// Continue : pass! 해당하는 조건이 맞다면 패스해
		
		//1~10까지 출력하는데, 5를 제외하고 출력
		for(int i=1; i<=10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i+" ");
		}

		
		
		System.out.println( );
		//짝수만 출력(홀수면 패스)
		for (int i=1; i<=10; i++) {
			if((i % 2) == 1) {
				continue;
			}System.out.print(i+" ");
		}
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
