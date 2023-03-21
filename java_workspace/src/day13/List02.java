package day13;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

public class List02 {

	public static void main(String[] args) {
		/* ==메뉴판==
		 * 1.햄버거 7000
		 * 2.피자 15000
		 * 3.음료 2000
		 * 4.과자 2000
		 * 5.사탕 500
		 * 6. 프로그램 종료
		 * 
		 * > 메뉴를 선택해주세요.
		 * 1
		 * > 수량을 선택해주세요.
		 * 2
		 * 주문을 끝내시려면 0을 눌러주세요
		 * > 메뉴를 선택해주세요.
		 * 3
		 * > 수량을 선택해주세요.
		 * 주문을 끝내시려면 0을 눌러주세요
		 * 0
		 * 
		 * ==선택한 메뉴==
		 * 햄버거2개, 음료 2개 선택 => 총 지불금액: 
		 * 
		 * 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		FoodManager f =new FoodManager();
		ArrayList<String> order = new ArrayList<>();
		ArrayList<Integer> cnt = new ArrayList<>();
		
		int sum = 0;
		int total = 0;
		
		
		f.addMenu();
		
		int orderMenu = 0;
		int count = 0;
		char ch='a';
		
		while(true) {

			if(ch == 'n') {
				break;
			}

				f.printMenu();
				orderMenu = scan.nextInt();
				System.out.println("수량을 선택해주세요 > ");
				count = scan.nextInt();
				
				f.sale(orderMenu, count);
				
				
				order.add(f.getMenu().get(orderMenu-1));
				cnt.add(count);
				
				System.out.println("주문을 끝내시려면 'n'을 눌러주세요");
				ch = scan.next().charAt(0);	

		} 
		
		
		
		System.out.println("====주문 확인====");
		for(int i=0; i<order.size(); i++) {
			System.out.print(order.get(i) + " ");
			System.out.print(cnt.get(i)+"개 ");
			System.out.println();

		}
		System.out.println();
		System.out.println("총 합계: " + f.total);
		
	}

}
interface Food{
	void printMenu();
	void sale(int menu, int count);
	void addMenu();

	
	
}


class FoodManager implements Food{
	//멤버변수 ArrayList  메뉴, ArrayList 가격 - 그외는 알아서 선언
	ArrayList<String> Menu = new ArrayList<>();
	ArrayList<Integer> Price = new ArrayList<>();
	
	
	
	int sum = 0;
	int total = 0;
	
	
	
	//메서드 정의
	//1.void printmenu()
	//2.추가메서드 void menu (리스트에 메뉴를 추가)
	//3.sale (int menu, int count) => 입력한 주문개수, 금액 출력
	
	
	public ArrayList<String> getMenu() {
		return Menu;
	}


	public void setMenu(ArrayList<String> menu) {
		Menu = menu;
	}


	public ArrayList<Integer> getPrice() {
		return Price;
	}


	public void setPrice(ArrayList<Integer> price) {
		Price = price;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	@Override
	public void printMenu() {
		
		System.out.println("======메뉴판======");
		System.out.println("1.햄버거 7000원");
		System.out.println("2.피자 15000");
		System.out.println("3.음료 2000원");
		System.out.println("4.과자 2000원");
		System.out.println("5.사탕 500원");
		System.out.println("================");
		System.out.println("메뉴를 선택해주세요 > ");
	}
	
	
	@Override
	public void addMenu() {
//		Scanner scan = new Scanner(System.in);
		
		Menu.add("1.햄버거 ");
		Menu.add("2.피자 ");
		Menu.add("3.음료 ");
		Menu.add("4.과자 ");
		Menu.add("5.사탕 ");
		Price.add(7000);
		Price.add(15000);
		Price.add(2000);
		Price.add(2000);
		Price.add(500);
		
//		
//		System.out.println("등록할 메뉴를 입력해주세요.(6.부터): ");
//		Menu.add(scan.next());
//		System.out.println("등록할 메뉴의 가격을 입력해주세요.: ");
//		Price.add(scan.nextInt());
//		
//		
//		scan.close();
	}


	@Override
	public void sale(int menu, int count) {
		sum = Price.get(menu-1)  * count;
		total += sum;
	
		System.out.println("==============");
		System.out.println("주문한 메뉴는 " +  Menu.get(menu-1) + count + "개 입니다.");
		System.out.println("금액은 " + sum + "입니다.");
	}


}