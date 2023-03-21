package day03;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		// 소수: 약수가 1과 자기자신만 가지는 수. 예) 3, 5, 7, 11...
		// 소수 = 약수가 2개인 수 (1, 자신)
		
		
		//num를 입력받아 입력받은 num가 소수인지 아닌지 판별
		Scanner number = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요: ");
		int num = number.nextInt();
		int count = 0; //0으로 시작해야함
		
		for (int i=1; i<=num; i++) {
			if ((num % i) == 0 ) {
				//System.out.print(i + " ");
				count  += 1;	
			} 
		}
		
		
		
		if(count == 2) { //if(count == num+1 ) 1과 받은 수를 더한 합 -> 이걸이용하려면 count = count + i 
			System.out.println("약수의 수가 " + count + "개 이므로 소수입니다.");
		} else if (count >= 3) {
			System.out.println("약수의 수가 " + count + "개 이므로 소수가 아닙니다.");
		} else if (count == 1) {
			System.out.println("1 입니다.");
		}
		
		//break문 사용시
		// for(int i=2; i<num; i++) {
		//	if((num % 2) == 0 ) {
		//		System.out.println( num + ": 소수아님" )
		//	} else {
		//		System.out.println( num + ": 소수" ) }
		
		
		System.out.println( );
		
		//2~100까지의 수 중 소수만 출력
		int cnt=0;
		for(int num1=2; num1<100; num1++) {
			cnt=0; // 한번 루틴을 돌고나서 카운트가 0에서 시작할 수 있도록 해야함.
			for (int i=1; i<=num1; i++) {
				if( (num1 % i) == 0 ) {
				//System.out.print(number + " ");
				cnt += 1;
				}
			}
			if (cnt == 2) {
				System.out.print(num1+ " ");
			}
		}
		
		
		
		number.close();
		
		
		
		
		
		
		
		
	}

}
