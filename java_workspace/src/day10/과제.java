package day10;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* Product class : 상품을 등록하는 클래스
		 * 상품명, 가격
		 * 상품등록 메서드: insertProduct 로 상품을 입력하면 등록이되는 메서드
		 * 출력 메서드 
		 * 
		 * ProductMain class
		 * 배열로 객체 생성 : product 배열 [10]개
		 * 
		 * 상품등록 + 리스트 출력
		 * (등록시 배열에 하나씩 생성)
		 * 
		 * 상품등록은 Scanner이용 => 상품을 등록하사겠습니까? (y/n) =>n이 나오기 전까지 반복
		 * y = 상품등록 반복 (상품이름,가격) / n = 반복 멈춤 + 등록된 제품 리스트 출력
		 * while?
		 * 
		 * */
		과제_Product[] std = new 과제_Product[10];
		
		Scanner scan = new Scanner(System.in);
		
	
		
		
		char ch;
		int cnt = 0; //std객체의 index 핸들링하기 위한 변수
		String name;
		int price;
		int sum = 0;
		
		
		while (true) {
				
				System.out.println("상품을 등록하시겠습니까? (y/n): ");
				ch = scan.next().charAt(0);
				if(ch == 'Y' || ch == 'y') {
					과제_Product p =new 과제_Product();
					System.out.println("상품명을 입력해 주세요.: ");
					name = scan.next();
					System.out.println("상품가격을 입력해 주세요.: ");
					price = scan.nextInt();
				
					p.insertProduct(name, price);
					//입력받은 값을 바로 더하는 방법
					//sum += price;
					std[cnt]=p;
					cnt++;
			
				} else if (ch == 'n' || ch == 'N') {
					System.out.println("상품등록을 종료하였습니다.");
					break;			
				}
				
				
		}
		
		for(int i=0; i<cnt; i++) {
			std[i].print();	
			sum += std[i].getProductPrice();
			
		}
		System.out.println("총 상품의 합계: "+ sum);		
		
		
		scan.close();
		
//		while (y != 'n') {
//			System.out.println("상품을 등록하시겠습니까? (y/n)");
//			y = scan.next().charAt(0);
//			
//			if(y == 'y') {
//				System.out.println("상품명: ");
//				String productName = scan.next();
//				System.out.println("가격: ");
//				String productPrice = scan.next();
//			
//				과제_Product tmp = new 과제_Product(productName,productPrice);
//				std[cnt] = tmp;
//			
//				//또는
//			
//				std[cnt] = new 과제_Product();
//				std[cnt].insertProduct(productName, productPrice);
//			
//				cnt++;
//			} else {
//				if(y == 'n'){
//					System.out.println("상품등록 종료");
//				} else {
//					System.out.println("y,n만 가능합니다.");
//				}
//
//			}
//		System.out.println("---동록된 제품 리스트---");
//		//향상된 for문 사용시, null까지 모두 출력
//		for(int i=0; i<cnt; i++) {
//			//toString 사용경우
//			System.out.println((i+1)"번째 상품: " + std[i]);
//			//출력메서드 사용경우
//			std[i].print();
//		}

	}
}
	
	
	
	
	
	
	
	
	
	
