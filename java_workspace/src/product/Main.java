package product;

import java.util.Scanner;

import day15.ProgramManager;

public class Main {

	public static void main(String[] args) {
		ProductManager1 pm1 = new ProductManager1();
		 
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println();
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 메뉴추가");
			System.out.println("2. 메뉴(리스트)");
			System.out.println("3. 메뉴주문");
			System.out.println("4. 주문내역");
			System.out.println("5. 메뉴삭제");
			System.out.println("6. 가격수정");		
			System.out.println("7. 종료");
			System.out.println();

			menu = scan.nextInt();
		
			switch(menu) {
			case 1: pm1.addMenu(); break;
			case 2: pm1.printMenuList(); break;
			case 3: pm1.order(); break;
			case 4: pm1.printOrder(); break;
			case 5: pm1.delete(); break;
			case 6: pm1.update(); break;
			case 7: System.out.println("종료합니다"); break;
			default: System.out.println("잘못된 값을 입력하셨습니다"); break;
			
			}
			

		}while(menu!=7);


	}

}
