package day03;

import java.util.Scanner;

public class For문3 {

	public static void main(String[] args) {
		// 1~100까지의 합계구하기 (복습)
		
		int sum = 0;
		
		for (int num=1; num<=100; num++) {
			sum += num; // sum = sum + num; (누적 => 내변수 + 내변수 + sum의 대상)
		}
		System.out.println("1~100까지의 합계는 " + sum + "입니다." );
		System.out.printf("1~100까지의 합계는 %d 입니다.", sum);
		// num의 변수를 for문이 아닌 밖에서 선언한 경우,
		// num의 값은 100+1인 101로 추출됨
		
		
		
		/* int num = 0;
		for ( ; num<=100; ) { //두가지를 생략하는 경우
			sum += num; 
			num += 1;
		}
		System.out.println("1~100까지의 합계는 " + sum + "입니다." );
		System.out.printf("1~100까지의 합계는 %d 입니다.", sum); 
		*/
		
		System.out.println( );
		
		/* 약수구하기
		 * 약수 : 나누어서 떨어지는 수들의 모임. 예)12의 약수: 1, 2, 3, 4, 6, 12
		 * 초기값 : 1부터, 조건식: num까지, 증감식: 1씩 증가, 실행문: 나머지가 0이 되는 수를 출력 
		 * */
		
		//콘솔에서 입력받은 수로 약수를 구해보세요.
		Scanner number1 = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.: ");
		int num = number1.nextInt();
		
		
		for (int i=1; i <= num; i++) {
			if ((num % i) == 0 ) {
				//System.out.print(i + ", ");
				if ((num / i) == 1 ) {
					System.out.println(i +"입니다.");
				} else if ((num / i) == num) {
					System.out.print(num + "의 약수는 1, " );
				} else {
					System.out.print(i + ", ");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		number1.close();
		} // 메인 메소드

	} // class
