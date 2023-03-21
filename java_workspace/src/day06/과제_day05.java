package day06;

import java.util.Scanner;

public class 과제_day05 {

	public static void main(String[] args) {
		// 가위바위보 게임 ( 반복X )

	System.out.println("가위바위보 게임 시작 > ");
	
	Scanner scan = new Scanner(System.in);
		
	int comNum = (int)(Math.random()*3)+0;
	System.out.println("컴퓨터가 결정을 완료하였습니다.");
	System.out.println("가위바위보 중 하나를 선택하세요 > ");
	String myChoice = scan.next(); // 내 선택		
		
	//컴퓨터의 선택을 String으로 변환
	String comChoice = (comNum == 0)? "가위" : (comNum == 1)? "바위" : "보";
	System.out.println("com선택 > " + comChoice);
	
	//비교 (승부)
	//비기는경우
	if (comChoice.equals(myChoice)) { //String을 비교할 때 는 ==말고 이거사용
		System.out.println("비겼습니다.");
	} else {
		if (comChoice.equals("가위")) {
			System.out.println(myChoice.equals("바위")? "이겼습니다" : "졌습니다");
		} else if (comChoice.equals("바위")) {
			System.out.println(myChoice.equals("보")? "이겼습니다" : "졌습니다");
		} else {
			System.out.println(myChoice.equals("가위")? "이겼습니다" : "졌습니다");
		}
	}
		
	System.out.println("게임 종료!");	
		
		

		
		
	scan.close();	//메소드가 끝날때 적용 (한번 열수있음)
		
	}

}
