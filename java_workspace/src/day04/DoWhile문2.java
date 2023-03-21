package day04;

import java.util.Scanner;

public class DoWhile문2 {

	public static void main(String[] args) {
	
		//--------menu---------
		// 1.저장 | 2.출력 | 3.종료
		//---------------------
		// 입력 : 1
		// 저장되었습니다.
		
		//--------menu---------
		// 1.저장 | 2.출력 | 3.종료
		//---------------------
		// 입력 : 2
		// 출력되었습니다.
		
		//--------menu---------
		// 1.저장 | 2.출력 | 3.종료
		//---------------------
		// 입력 : 3 
		// 종료되었습니다. 반복문종료
		
		//(3이 입력되기전까지 1,2번은 계속 가능하도록)
	
		//do~while과 switch이용
		Scanner scan = new Scanner(System.in);
		
		int cho;//char로 받아도 괸계x
		do {
			System.out.println("--------menu---------");
			System.out.println(" 1.저장 | 2.출력 | 3.종료");
			System.out.println("---------------------");
			System.out.println("메뉴를 선택해주세요.: ");
			cho = scan.nextInt( );
			
			switch(cho) {
			case 1 : System.out.println("저장되었습니다.");
				break;
			case 2 : System.out.println("출력되었습니다." );
				break;
			case 3 : System.out.println("종료되었습니다.");
				//break;
			default:
				System.out.println("잘못입력되었습니다.");
				break;
			}
		
		} while (cho != 3);
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		scan.close(); //이걸 적어주면 자동으로 import
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
