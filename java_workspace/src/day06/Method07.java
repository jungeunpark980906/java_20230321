package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		// 숫자와 기호를 주고 기호를 숫자만큼 출력 (출력은 void)
		// ex) 3 * => *** / 5 o => ooooo / 7 ♥ => ♥♥♥♥♥♥♥
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("출력할 기호를 입력해주세요.(한글자): ");
		char mes1 = scan.next().charAt(0);
		System.out.println("출력할 수를 입력해주세요.: ");
		int num1 = scan.nextInt();
		
		gob(num1, mes1); //동일해도 달라도 관계x
		
		
		
		scan.close();

	}
	
	public static void gob(int num, char mes) {
		for(int i=1; i<=num; i++) {
		 System.out.print(mes);
		}
	}
	
	
	
	
	
}
