package day04;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// for, While문은 조건식이 한번도 실행되지 않을 수 있음
		// Do~While문 : 
		// do{
		// 	실행문;
		// 	}while(조건문); //조건식이 필수

		//1~10까지 출력하는 구문
		int i=1;
		do {
			System.out.print(i + " ");
			i++;
		}while (i<=10);
		
		
		
		
		
		// 값을 입력하면 그대로 출력하는 구문 (단 y/Y가 입력되는 경우 종료)
		
		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		do {
			System.out.println("문자를 입력해주세요.: ");
			ch = scan.next().charAt(0);

			if(ch == 'y' || ch =='Y') {
				System.out.println("y/Y를 입력하셨습니다. 종료합니다.");	
				break;
			} else {
				System.out.println("첫문자는 " + ch + "입니다." );
			}	
		}
		while (true); //if문을 사용하지 않는 방법 : while(!(ch !='y' || ch != 'Y')) 
		

		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
