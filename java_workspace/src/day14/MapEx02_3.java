package day14;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02_3 {//3. 메서드 내부에서 map을 생성하는 형태 (리턴이 map의 형태)
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		//map에 상품명과 가격을 입력받고 출력
		//총 지불가격 출력
		//입력->메서드 , 출력->메서드로 구현
		MapEx02_3 shop = new MapEx02_3();
		
		shop.out(shop.input());

	}

	public HashMap<String, Integer> input() {
		HashMap<String, Integer> map = new HashMap<>();
		int i = 1;
		
		System.out.println("상품등록을 시작합니다!");
		while(true) {

			System.out.println("상품명: ");
			String name = scan.next();
			System.out.println("가격: ");
			int price = scan.nextInt();
			
			map.put(name, price);
			
			System.out.println("(상품등록 종료:0, 지속:1)");
			i = scan.nextInt();
			
			if(i == 0) {
				break; 
			}
			
		}
		System.out.println("상품등록을 종료합니다!");
		
		return map;
	}
	
	public void out(HashMap<String, Integer> map) {
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
