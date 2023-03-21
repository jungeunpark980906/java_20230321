package day03;

public class 최대공약수 {

	public static void main(String[] args) {
		/* 최대공약수
		 * 공약수 : 두 수의 공통된 약수
		 * 최대공약수 : 두 수의 공통된 약수 중 가장 큰값
		 * 예) 8과 12의 공약수: 1 2 4, 최대공약수: 4
		 * */

		int num1 = 6, num2 = 12;
		int i=1, j=1;
		int gcd = 0; //최대공약수를 담을 변수
		for ( i=1; i<=num1; i++ ) {
			if ((num1 % i) == 0 && (num2 % i) == 0) {
				//System.out.print(i);
				gcd = i; //순서대로 담겨서 마지막 수가 담겨있을 것임
			
			}
		}
		System.out.println("두 수의 최대공약수: "+gcd);	
		
		
		
		//최대공약수를 큰수부터 찾고, 찾으면 Break문으로 멈추기
		
		for ( i=num1 ; i>=1 ; i-- ) { //어짜피 하나의 숫자에서 나오는 공약수 중에 찾는 거라 i=num1.num2 상관없이 사용가능
			if ( (num1 % i) == 0 && (num2 % i) == 0 ) {
				//System.out.println("최대공약수: "+ i);
				//break;
				gcd = i;
				break;
				
			}	
		}
		System.out.println("두 수의 최대공약수: "+gcd);
		
		
		
		
		
		
		
		
	}

}
