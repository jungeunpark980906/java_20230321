package day04;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		// 1~50사이의 랜덤 수 하나를 생성 후 그 수를 맞추는 게임.
		// 예) 컴퓨터가 랜덤 수를 생성했습니다.(범위 1~50) 45
		// 사용자 입력: 20
		// up!
		// 사용자 입력 : 50
		// down!
		// 사용자 입력 : 45
		// 정답! 

		
		
		
		//1.do~while문을 이용하는 방법
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 설정한 랜덤 수: " + random);
		
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int count =0;
		
		
	/*	do {
			System.out.println("랜덤 수를 맞춰보세요.(1~50): ");
			i = scan.nextInt();
			
			if (i>50 || i<1) {
				System.out.println("범위에서 벗어난 수를 입력하였습니다.");
			} else if (i < random) {
				System.out.println("up!");
				//break;
			} else if (i > random){
				System.out.println("down!");
				//break;
			} else if (i == random) {
				System.out.println("정답입니다! 랜덤 수는 " + random + "입니다.");
				//break;
			}
			count++;
			
		} while (i != random);
		System.out.println("프로그램을 종료합니다.");
		System.out.println("시도 횟수: "+count);
*/		
		
		//2.while문을 이용하는 방법
		while (i != random) {
			System.out.println("랜덤 수를 맞춰보세요.(1~50): ");
			i = scan.nextInt();
			count ++;
			if (i>50 || i<1) {
				System.out.println("범위에서 벗어난 수를 입력하였습니다.");
			} 
			//else{ //else안에 if를 넣어도 가능
			//	if (i < random) {
			//		System.out.println("up!");
			//	} else if (i > random){
			//		System.out.println("down!");
			//	} else if (i == random) {
			//		System.out.println("정답입니다! 랜덤 수는 " + random + "입니다.");
			  else if (i < random) {
				System.out.println("up!");
				//break;
			} else if (i > random){
				System.out.println("down!");
				//break;
			} else if (i == random) {
				System.out.println("정답입니다! 랜덤 수는 " + random + "입니다.");
				//break;
			}
			System.out.println("게임시도 횟수: "+count);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
