package day14;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02_1 { //1.멤버변수로 map이 있는 형태 (map=공용)
	Scanner scan = new Scanner(System.in);
	HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		//map에 상품명과 가격을 입력받고 출력
		//총 지불가격 출력
		//입력->메서드 , 출력->메서드로 구현
		 MapEx02_1 shop = new  MapEx02_1();
		 shop.input();
		 shop.out();
		
		

	}
	public void input() {
		int i = 1;
		System.out.println("상품등록을 시작합니다!");
		while(true) {
			
			if(i == 0) {
				break;
			}
			System.out.println("상품명: ");
			String name = scan.next();
			System.out.println("가격: ");
			int price = scan.nextInt();
			
			map.put(name, price);
			
			System.out.println("(상품등록 종료:0, 지속:1)");
			i = scan.nextInt();
		}
		System.out.println("상품등록을 종료합니다!");
	}

	public void out() {
		int sum = 0;
		System.out.println("< 등록된 상품 >");
		for(String tmp : map.keySet()) {
			System.out.println(tmp+ ": "+map.get(tmp));	
			sum += map.get(tmp);
		}
		System.out.println("<총 상품의 가격>");
		System.out.println(sum);
		
		
	}
	
	
	
	
	
	
	
}
