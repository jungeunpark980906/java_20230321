package day03;

public class 최소공배수 {

	public static void main(String[] args) {
		// 최소공배수 : 두 정수에서 공통적으로 있는 배수 중 가장 작은 수
		// 공배수 : 두 정수에서 공통적으로 있는 배수
		// 배수 : 곱해서 나타나는 수 
		
		int num1=30, num2=25;
//		int i=1;
		
		
//		for (i=num1; ; i+=num1 ) {
//			if ((i % num1) == 0 && (i % num2) == 0) {
//				System.out.println("최소공베수: " + i);
//				break;
//			} 
//		}
		
		
		// 두 수를 곱해서 최대공약수를 구하는 방법
		// 두 수를 곱한 수 / 최대 공약수
		int gcd=0;
		
		for (int i=num1; ; i--) {
			if ((num1 % i) == 0 && (num2 % i) == 0) {
				System.out.println(num1+ ", " + num2 + " 의 최소공약수: " + i);
				System.out.println("최소공배수: " + num1*num2/i);
				System.out.printf("최소공배수: %d", (num1*num2)/i );
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
