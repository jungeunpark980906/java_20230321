package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 주사위를 던져서 총 30칸을 이동하면 완주
		// 주사위는 : 1~6까지의 랜덤수
		// 주사위 : 3 -> 3칸전진 ,27칸 남았습니다.
		// 도착 시, 도착!! 총 이동횟수: 00번
		
		
		
		
		
		
		int sum = 0; //이동 거리 합산
		int dice = 0; //주사위 값
		int count = 0; //던진 횟수
		String play = "apple";
		int last = 30; //최종 목표값
		
		Scanner scan = new Scanner(System.in);
		
		
		
		do { //sum이 last가 될 때 까지 반복
			System.out.println("주사위를 던지세요.(단, stop을 적으면 중지): ");
			count++;
			play = scan.next();
			
			dice = (int)(Math.random()*6)+1;
			sum += dice; //거리 합산
			
				
			if( play != "stop" ) { 
				System.out.println(dice + "칸 전진, " + (last-sum) + "칸 남았습니다.");
			} else {
				System.out.println("stop!");
				break;
			}
				
	
		
	
			
		} while ( sum<last );
		System.out.println(dice + "칸 전진. 도착! 총 이동횟수: " + count);
		
		

		
		scan.close();
		
		

	}

}
