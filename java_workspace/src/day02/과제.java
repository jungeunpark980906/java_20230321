package day02;

public class 과제 {

	public static void main(String[] args) {
		/* 1~100까지 2의 배수(짝수)를 출력하세요.
		 * 2 4 6 8 10
		 * 12 14 16 18 20..
		 * */
		
		//if문 2개 이용하는 경우1 + 제출
		for (int num=1; num<=100; num++) {
			if ((num % 2) == 0) {
				System.out.print(num + " ");
				if ((num % 10) == 0) { //10에서 줄바꿈
					System.out.println( );
				}
			}
			
		}
		
		// if문을 2개 이용하는 경우2 / System.out.printf();이용
		for (int num=1; num<=100; num++) {
			if ((num % 2) == 0) {
				System.out.printf("%d\t", num);
				if ((num % 10) == 0) {
					System.out.printf("\n");
				}
			}
		}
		
		//if~else문 이용하는 경우,
		for(int i=1;i<=100;i++) {

			if(i%10==0) {

				System.out.print(i+"\n");
			}
			else if(i%2==0)
				System.out.print(i+" ");

		}
		
	}

}
