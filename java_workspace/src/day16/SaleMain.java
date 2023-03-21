package day16;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		SaleManager sm = new SaleManager();
		Scanner sc = new Scanner(System.in);
		int menu = -1;
		do {
			sm.printMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				sm.add(sc);
				break;
			case 2:
				sm.printProduct();
				break;
			case 3:
				sm.orderPick(sc);
				break;
			case 4:
				sm.printOrder();
				break;
			case 5:
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}
			
		} while(menu != 5);
		System.out.println("종료");

	}

}
