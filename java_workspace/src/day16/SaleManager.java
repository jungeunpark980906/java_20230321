package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	//제네릭으로 미뤘던 처리를 해줘야 한다.
	private ArrayList<Sale<String, Integer>> products = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> orders = new ArrayList<>();
	
	public void add(Scanner sc) {
		System.out.println("제품명: ");
		String menu = sc.next();
		System.out.println("가격: ");
		int price = sc.nextInt();
		Sale s = new Sale(menu, price);
		products.add(s);
	}
	
	public void printProduct() {
		System.out.println("--menu--");
		for(int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
		System.out.println("------------");
	}
	
	public void orderPick(Scanner sc) {
		int index = -1;
		System.out.println("주문 메뉴: ");
		String orderMenu = sc.next();
		System.out.println("주문 수량: ");
		int orderCount = sc.nextInt();
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getMenu().equals(orderMenu)) {
				index = i;
				int price = products.get(i).getPrice();
				Sale s = new Sale(orderMenu, orderCount*price);
				orders.add(s);
			}
		}
		if(index == -1) {
			System.out.println("찾는 메뉴가 없습니다.");
		}
	}
	
	public void printOrder() {
		int sum = 0;
		for(Sale s : orders) {
			sum = sum+(Integer)s.getPrice();
		}
	}
	
	public void printMenu() {
		System.out.println();
		System.out.println("메뉴를 입력해주세요.");
		System.out.println("1. 제품추가");
		System.out.println("2. 제품(리스트)");
		System.out.println("3. 메뉴주문");
		System.out.println("4. 주문내역");
		System.out.println("5. 종료");
		System.out.println();
	}
}
