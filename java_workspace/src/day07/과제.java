package day07;

import java.util.Random;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성(1~9까지)
		 * 유저가 3자리의 숫자를 맞추는 게임
		 * 각 선정번호는 배열로 생성, 몇번째에 맞추는지 cnt
		 * 
		 * 3 5 7 / 3 4 6 - 1s (자리와 숫자가 일치하면 스트라이크)
		 * 3 5 7 / 5 1 6 - 1b (숫자는 일치, 자리는 불일치는 볼)
		 * 3 5 7 / 1 2 4 - out (모두 일치하지 않으면 아웃)
		 * 
		 * 
		 * */
		int[] random = new int[3];
		int[] user = new int[3];
		
		System.out.println("====야구게임 시작====");
		System.out.println("컴퓨터가 설정한 야구게임 숫자 > ");
		gameNum(random);
		print(random);
		
		System.out.println();
		userNum(user);
		System.out.println("유저가 넣은 야구게임 숫자 > ");
		print(user);
		
		game(random, user);
		
		
		
		
	}

	//=======method======
	
	//컴퓨터 숫자를 랜덤으로 생성
	public static int randomNum() {
	
			return (int)(Math.random()*9)+1;
			
	}
	
	
	//유저에게 숫자를 받아 배열에 넣기
	public static void userNum(int arr[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.(1~9, 3자리) > ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		
		}
		scan.close();
	}
	
	// 정수 배열을 콘솔에 출력
	public static void print(int arr[]) {
		for ( int tmp : arr) {
			System.out.print(tmp+" ");
		}
	}
	
	
	//컴퓨터 숫자 중복확인
	public static boolean isCheck(int[] arr1, int num) {
		for (int tmp : arr1) {
			if( tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	//컴퓨터숫자 배열에 넣기
	public static void gameNum(int arr[]) {
		int i =0;
		while (i<arr.length) {
			int r = randomNum();
			if(!isCheck(arr, r)) {
				arr[i] = r;
				i++;
			}
		}	
	}
	
	//트라이크,볼,아웃을 확인하는 기능
	public static void game(int randomArr[], int userArr[]) {
		//유저 숫자와 컴퓨터 숫자의 길이가 다를 경우
		if (randomArr.length != userArr.length) {
			System.out.println("숫자가 잘못입력되었습니다.");
		}	
		
		
		//s,b,out
		
		int cnt = 0;
		while (true) {
			int s=0, b=0;
			cnt++;
			for (int i=0; i<randomArr.length; i++) {			
				for (int j=0; j<userArr.length;j++) {
					if(randomArr[i] == userArr[j]) {
						if(i == j)  s++;  
						else  b++; 
					}		
				}
			}
			
			if(s==0 && b==0) {
				System.out.println("out!");
				
			}
			
			if(s==3) {
				System.out.println("정답입니다! 시도횟수: " + cnt);
				break;
			}
			System.out.println("게임결과: " + s + "s " + b + "b" );
			userNum(userArr);
		
		}	
		}
	}
	

