package day08;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		
		
		int comNum[] = new int[3]; //컴퓨터가 결정한 숫자
		int userNum[] = new int[3]; //유저가 작성한 숫자
		
		System.out.println("=======야구게임을 시작합니다========");
		
		
//		System.out.println("컴퓨터가 설정한 수");
//		PrintArr(comNumArr(comNum));
//		System.out.println();
		
		comNumArr(comNum);
		userNumArr(userNum);		
		game(comNum, userNum);
		
		

	}
	// >>> Method 
	
	// 컴퓨터의 숫자를 랜덤으로 추출 -> 중복확인 후 배열삽입
	public static int[] comNumArr(int[] comNum) {
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		return comNum;
	}
	
	
	// 유저에게 숫자를 받아 배열삽입
	public static void userNumArr(int[] userNum) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("> 숫자를 입력해주세요 (1~9) ");
		String user = scan.next();//string으로 받기
		
		String[] userStr = user.split(""); //string으로 받은 숫자 -> 한개씩 나눠 int로 변환
		for(int i=0; i<userNum.length; i++) {
		userNum[i] = Integer.parseInt(userStr[i]);
		}
	}
	
	//배열 프린트
	public static void PrintArr(int arr[]){		
		for(int i=0;i<arr.length; i++) {			
			System.out.print(arr[i]+" ");		
		}
	}	
	
	// 랜덤 숫자, 유저 숫자 비교
	public static void game(int[] comNum, int[] userNum) {
		int cnt =0;
		
		while(true) {
			int s=0, b=0;
			cnt++;
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<userNum.length; j++) {
					if(comNum[i]==userNum[j] && i==j) { //s조건
						s++;
					} else if (comNum[i]==userNum[j] && i != j) { //b조건
						b++;
					}
				}
			}
			
			if (s==0 && b==0) { //out조건
				System.out.println("out!");
			} else { //결과 출력
				System.out.println("=== " + s + "S " + b + "B");
				//System.out.println("시도 횟수: " + cnt);
			
				
			}
			
			if ( s==3 ) { //3S이면 반복문 break
				System.out.println("정답입니다! 시도횟수:  " + cnt) ;
				break;
			}
			System.out.println();
			userNumArr(userNum); //다시 유저에게 숫자받기
		}
	}
	
	
	
	
	
	
	
	
	
}
