package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		// 구구단 출력
		// 구구단 1단을 출력하는 메서드
		
		
	Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력하세요.: ");
	int num = scan.nextInt();
	
	dan(num);
		
		
		
		
	scan.close();
		

	}

	public static void dan(int num) {
		System.out.println(num+ "단");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d",num,i,(num*i));
			System.out.println( );
		}
	} 
	
	
	
	
	
	
	
	
}

