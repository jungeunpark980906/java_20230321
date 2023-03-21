package day07;

import java.util.Scanner;


public class 과제_2 {
//method없이 main에서 사용할 경우!
	
	public static void main(String[] args) {
		
		//1. Scanner 열기
		Scanner scan = new Scanner(System.in);
		
		//2. 지역 변수들 선언
		int comNum[] = new int[3]; //컴퓨터가 결정한 숫자
		int myNum[] = new int[3]; //유저가 결정한 숫자
		int cnt = 0; //게임 횟수
		
		//3. 컴퓨터가 결정한 랜덤 3가지 숫자를 중복되지 않게 추출 -> 한번 생성
		//반복적으로 추출 => for, while
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break; 
					//for(j)구문을 빠져나가서 전번지로 돌아가는 i--;를 타고 나가
					//for(int i=0; i<comNum.length; i++)를 타서 원래 번지의 수를 변경
					// 0 0 0 -> 3 0 0 -> 3 3 0 -> 3 4 0..
					// 0 0 0 -> 3 4 3 -> 3 4 4 -> 3 4 5..
				}
			}
		}
		
		
//		//3.lotto예제에서 만든 메서드를 호출
//		Lotto예제 lotto = new Lotto예제();
//		lotto.randomArr(comNum);
//		Lotto예제.randomPrint(comNum); //=> static의 경우에만 바로 이용가능 
		
		
		//시작문은 while문 위에 배치 (반복x)
		System.out.println("=====야구게임 시작=====");
		
		
		
		//4. 사용자의 수 입력받기 -> 반복 생성
		//반복적으로 입력: while (for문은 반복횟수 지정이 안되서 사용x)
		//반복을 빠져나가는 break문은 s가3개일떄!
		while (true) {
			int s = 0, b = 0;
			System.out.println("> 숫자 입력 (1~9까지 숫자 3개) ");
			
			
//			//숫자를 하나씩 int로 받는 경우사용
//			for (int i=0; i<myNum.length; i++) {
//				myNum[i] = scan.nextInt();
//			}
			
			//값을 문자로 입력받아 int로 비교하는 경우!!!중요!!!
			String myStr = scan.next(); //String으로 123 한번에 받음
			String[] myNumStr = myStr.split(""); //.splir("")을 이용해 한글자씩 잘라 배열에 저장
			 for(int i=0; i<myNum.length; i++) {
				 myNum[i] = Integer.parseInt(myNumStr[i]); //이때 자료형이 다르므르 str->int로 변환(Integer.parseInt)
			 }
			
			cnt++;
			
			//5. 숫자를 비교
			for(int i=0; i<comNum.length; i++) { //컴퓨터 넘버 기준 탐색
				for(int j=0; j<myNum.length; j++) { //유저 넘버 기준 탐색
					if(comNum[i] == myNum[j] && i == j) { //s조건 : 값+자릿수 동일
						s++;
					} else if(comNum[i] == myNum[j] && i != j) {//b조건 : 값 동일+자릿수 비동일
						b++;
					}
				}
			}
			
			//6. 출력 조건
			if ( s==0 && b==0) { //out조건
			System.out.println("out!");
			} else { //out제외 나머지조건
				System.out.println(">" + s + "S " + b + "B");
				System.out.println("시도횟수: " + cnt);
			}
			
			
			
			
			//7. 정답의 조건123
			if(s == 3) {
				System.out.println("정답!");
				break;
			}
			//6.출력 조건을 7. 정답 조건보다 먼저 적어 => 정답이여도 출력조건의 else를 타고 내려옴
			
		}
		
		
		
		
		scan.close();
		
	}

}