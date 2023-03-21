package day03;

public class 소수구하기연습 {

	public static void main(String[] args) {
		
		//2~100까지의 수 중 소수만 출력
		
		
		// int number = 1;
		int count= 0;
		int number = 2;
		
		for ( number=1; number<=100; number++) {
			for (int i=1; i<=number; i++) {
				if( (number % i) == 0 ) {
					System.out.print(number + " ");
					count += 1;
					
				}
				
				}	
		}
		
		
		if (count == 2) {
			System.out.println(number);
		} else if (count != 2) {
			System.out.println(" ");
		}
		
			
		}

}