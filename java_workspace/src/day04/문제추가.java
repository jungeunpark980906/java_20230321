package day04;

import java.util.Scanner;

public class 문제추가 {

	public static void main(String[] args) {
		// 1~50사이의 랜덤 수 하나를 생성 후 그 수를 맞추는 게임.
		// 예) 컴퓨터가 랜덤 수를 생성했습니다.(범위 1~50) 45
		// 사용자 입력: 20		
		// up!
		// 사용 입력 : 50
		// down!
		// 사용자 입력 : 45
		// 정답! 

				
				
				
		//do~while문을 이용하는 방법 + 5회이상이되면 종료
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 설정한 랜덤 수: " + random);
		
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int count =0;
				
				
		do {
			System.out.println("랜덤 수를 맞춰보세요.(1~50): ");
			i = scan.nextInt();
			count++;
			
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
			
			System.out.println("남은 시도 횟수: " + (10-count));	
			System.out.println("----------------------------");
			
			
		} while (!((i == random)||(count==10)));
		
		System.out.println("프로그램을 종료합니다.");
		
		if(count==10) {
			System.out.println("시도 횟수 10회가 종료되었습니다! 정답은 "+ random + "이였습니다.");
		} else if (i==random) {
			System.out.println("총 시도횟수는 "+count+"회 입니다.");
		}
		
		
		
		
		scan.close();
		
		
		
		
		
		
	}
}
	
