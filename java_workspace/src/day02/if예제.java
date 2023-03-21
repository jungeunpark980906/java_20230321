package day02;

import java.util.Scanner;

public class if예제 {

	public static void main(String[] args) {
		/* 정수를 입력받아 정수가 짝수인지 홀수인지 판단하여 출력 */
		
		Scanner scan = new Scanner(System.in); //import 단축키는 ctrl+shift+o
		
		System.out.println("정수를 입력해주세요.: ");
		int num = scan.nextInt();
		
		if (num == 0 ) {
			System.out.println("입력하신 정수 " + num + "는 짝수입니다.");
		} else if ((num % 2) == 0 ){
			System.out.println("입력하신 정수 " + num + "는 0입니다.");
		} else {
			System.out.println("입력하신 정수 " + num + "는 홀수입니다.");
		}

		scan.close();
	
	}

}
