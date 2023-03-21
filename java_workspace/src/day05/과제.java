package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		 * 내가 가위, 바위, 보 중에서 선택해서 입력
		 * 승 패 무승부의 결과를 출력
		 * 
		 * 삼항연산자 (조건식)? true : false;
		 * */

		
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*3);
//		System.out.println("랜덤의 수: " + random);
//		if(random == 0 ) {
//			System.out.println("컴퓨터: 가위");
//		} else if (random == 1) {
//			System.out.println("컴퓨터: 바위");
//		} else {
//			System.out.println("컴퓨터: 보");
//		}
		
		
		System.out.println("가위 ,바위, 보!: ");
		String play = scan.next();
		
		if(play.equals("가위")) {
			if(random == 0) {
				System.out.println("컴퓨터는 가위! 비겼다");
			} else {
			System.out.println((random == 2)? "컴퓨터는 보! 이겼다" : "컴퓨터는 바위! 졌다");
			}
		} else if (play.equals("바위")) {
			if(random == 1) {
				System.out.println("컴퓨터는 바위! 비겼다");
			} else {
			System.out.println((random == 0)? "컴퓨터는 가위! 이겼다" : "컴퓨터는 보! 졌다");
			}
		} else if (play.equals("보")) {
			if(random == 2) {
				System.out.println("컴퓨터는 보! 비겼다");
			} else {
			System.out.println((random == 1)? "컴퓨터는 바위! 이겼다" : "컴퓨터는 가위! 졌다");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
