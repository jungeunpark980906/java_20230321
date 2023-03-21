package day02;

public class For문2 {

	public static void main(String[] args) {
		
		// 구구단 2단 출력
		int num = 2;
		for (int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
		//이중 for문  
		//구구단
		for (int dan=2; dan<=9; dan++) {
			System.out.println(dan+"단");
			for (int times=1; times<=9; times++) {
				//System.out.println(dan + "*" + times + "=" + (dan*times));
				System.out.printf("%d * %d = %d\t", dan, times, (dan*times));
			}
			
		}

		//안과 밖이 순서가 바뀐 구구단
		for (int dan1=1; dan1<=9; dan1++) {
			
			for (int times1=2; times1<=9; times1++) {
			System.out.printf("%d * %d = %d\t ", times1, dan1, (times1*dan1));	
			}
			System.out.println( );
		}
		
		
		
		
		//1~10까지의 홀수의 값과 짝수의 합 출력
		int 홀수합 = 0;
		int 짝수합 = 0;
		
		for (int i=1; i<=10; i++) {
			if((i % 2) == 0) {
				짝수합 += i; 
			} else if ((i % 2) != 0){
				홀수합 += i;
			}
		}
		System.out.println("홀수의 합: "+홀수합);
		System.out.println("짝수의 합: "+짝수합);
		
			
	}

}
