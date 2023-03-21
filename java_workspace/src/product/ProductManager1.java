package product;

import java.util.ArrayList;
import java.util.Scanner;
public class ProductManager1 {



		Scanner scan = new Scanner(System.in);
		private ArrayList<Product> pList = new ArrayList<>();
		private ArrayList<Product> oList = new ArrayList<>();
		private int total;

		
		//메소드
		//메뉴추가
		public void addMenu() {
			System.out.println("추가할 메뉴: ");
			String menu = scan.next();
			System.out.println("메뉴의 가격: ");
			int price = scan.nextInt();
			
			Product p = new Product(menu, price);
			pList.add(p);
			
		}
		//메뉴 전체 출력
		public void printMenuList() {
			System.out.println("--전체메뉴--");
			for(Product tmp : pList) {
				System.out.println(tmp.getMenu()+":"+tmp.getPrice());
			}
		}
		//메뉴 주문
		public void order() {
			boolean b = true;
			System.out.println("추가할 메뉴: ");
			String order = scan.next();
			System.out.println("메뉴 수량: ");
			int orderCnt = scan.nextInt();
			
			for(int i=0; i<pList.size(); i++) {
				if(order.equals(pList.get(i).getMenu())) {
					Product p = new Product(order,orderCnt);
					oList.add(p);
					total = pList.get(i).getPrice()*orderCnt;
					b = false;
				} 
			}
			if(b==true) {
				System.out.println("메뉴에 없습니다");
			}
			
		}
		//메뉴주문내역
		public void printOrder() {
			System.out.println("--전체 주문내역--");
			for(Product tmp : oList) {
				System.out.println(tmp.getMenu()+"/"+tmp.getOrderCnt()+"개");
			}
			System.out.println("총 합계: "+total);
		}
		//메뉴삭제(향상된 for문 ver)
//		public void delete() {
//			System.out.println("삭제하실 메뉴를 입력해주세요: ");
//			String del = scan.next();
//			for(Product tmp : pList) {
//				if(tmp.getMenu().equals(del)) {
//					pList.remove(tmp);
//					break;
//				}		
//			}
//		}
		//메뉴삭제
		public void delete() {
			System.out.println("삭제하실 메뉴를 입력하세요: ");
			String del = scan.next();
			for(int i = 0; i < pList.size(); i++) {
				if(pList.get(i).getMenu().equals(del)) {
					pList.remove(i);
				} 		
			}
		}
		
		//메뉴 가격수정(향상된 for문 ver)
//		public void update() {
//			System.out.println("수정하실 메뉴를 입력해주세요: ");
//			String update = scan.next();
//			System.out.println("메뉴의 수정하실 가격을 입력하세요: ");
//			int update2 = scan.nextInt();
//			for(Product tmp : pList) {
//				if(tmp.getMenu().equals(update)) {
//					tmp.setPrice(update2);
//				}
//			}
//		}
		public void update() {
			System.out.println("수정하실 메뉴를 입력해주세요: ");
			String update = scan.next();
			System.out.println("메뉴의 수정하실 가격을 입력하세요: ");
			int update2 = scan.nextInt();
			boolean b = false;
			for(int i = 0; i < pList.size(); i++) {
				if(pList.get(i).getMenu().equals(update)) {
					pList.get(i).setPrice(update2);
					b = true;
				}
			}
			if(b == false) {
				System.out.println("찾으시는 메뉴가 없습니다.");
			}
		}
	}


