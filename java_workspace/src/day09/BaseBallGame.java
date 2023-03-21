	package day09;

import java.util.Scanner;

public class BaseBallGame {

	public static void main(String[] args) {
		// 야구게임 메서드로 변경하는 방법
		/* 메서드 : 매개변수의 개수는 정해진것이 없음
		 * but!	리턴타입 = 1개 => 메서드를 이용해서 받을 수 있는 값은 하나
		 * 
		 * 야구게임 메서드
		 * 1. 랜덤번호를 생성
		 * 2. 배열에 추가 / 중복 메서드
		 * 3. 스트라이트 
		 * 4. 볼
		 * 5. 출력
		 * 
		 * - while문(결과 판정),Scanner(유저숫자받기)는 main에서 사용 + 메서드 호출로 값
		 * 
		 * */
		
		
		//int comNum; //-> null (정해진 값(칸)이 없음)
		int[] com = new int[3];
		int[] user = new int[3];
		
		//랜덤 수 지정
		int max=9,min=1; 
		int s=0, b=0;
		
		//유저 숫자 받기
		Scanner scan = new Scanner(System.in);
		randomArr(com, max, min); //컴퓨터의 숫자넣기
		System.out.println(">>>야구게임 시작");
		System.out.println("컴퓨터가 수를 결정하였습니다.");
		
		
		while (3 != s) {
			//사용자 번호 입력받기
			System.out.println("1~9까지 숫자 3개 입력해주세요 > ");
			for(int i=0; i<user.length; i++) {
				user[i] = scan.nextInt();
				
			}
			//cnt++;
			//결과 판정 (s,b 각각 호출)
			s = strike(com, user);
			b =ball(com, user);
			
			//0일떄 표현하고 싶지 않은 경우
			
			
			if(s!=0) {
				System.out.print(s+"S ");
			} 
			if(b!=0) {
				System.out.print(b+"B ");
			}
			System.out.println();
			if(s==0 && b==0) {
				System.out.println("out!");
			}
			
			//System.out.printf("결과: %d S, %d B",s,b);
			
		}
		System.out.println("정답입니다! 게임을 종료합니다.");
		System.out.println();
		
		
		
		
		
		
		
		
		scan.close();

	}

	//1. 랜덤번호 생성 : 매개변수로 범위 설정
	// 매개변수 : 개수 cnt, 시작값 start  
	// 리턴 :  랜덤값 int
//	public static int random(int start, int cnt) {
//		return (int)(Math.random()*cnt)+start;
//	}
	
	public static int random (int max, int min) { // 시작숫자, 마지막숫자
		if (max<min) { //숫자값이 변경되어 오는 경우, 변
			int tmp=max;
			max = min;
			min = tmp;
		
		}
		return (int)(Math.random()*(max-min+1))+min;
		//cnt 개수 구하는 법: 마지막 수 - 시작 수 + 1
		//범위가 20~30 => start=20, cnt=10
	}
	
	//2.중복확인
	public static boolean isContain (int arr[], int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false; // 모든 반환이 종료된 이후에 false
	}
	
	
	//3.배열 생성 (중복제거)
	//true 리턴 : 정상적으로 배열이 생성됨을 알리는 기능 (false의 경우 생성이 안됨)
		//void이용 sysout으로 배열 생성에 실패를 알리는 것도 방법
	public static boolean randomArr(int arr[], int max, int min) {
		if( arr == null) {
			return false; //배열에 자리가 없어 생성이 안되는 경우
		} 
		if ((max-min+1) < arr.length) {
			return false; // 중복이 안되는 랜덤 수의 개수가 배열의 length보다 작은 경우 
		}
		int i=0;
		while (i<arr.length) {
			int r = random(max, min); //매개변수 max,min담기
			if(!isContain(arr, r)) { //중복이 아니라면 넣어라
				arr[i] = r;
			}
		}
		return true; //배열이 성공적으로 들어감
	}
	
	//4.배열 출력
	public static void printArr(int[] arr) {
		for(int tmp : arr) {
			System.out.println(tmp+" ");
		}
		System.out.println();
	}
	
	//5.스트라이크 
	//기능:com[] user[]의 위치와 값이 일치하면 cnt를 반환
	//메서드명: strike
	
	public static int strike(int[] com, int[] user) {
		int cnt=0;
		for (int i=0; i<com.length; i++) {
			if(com[i] == user[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	
	//6.볼 
	//기능:com[] user[]의 위치상관없이 값이 일치하면 cnt를 반환
		//이중 for문을 돌려 확인하는 방법도 가능
	 public static int ball(int[] com, int[] user) {
		 int cnt=0;
		 for (int i=0; i<com.length; i++) {
			 if(isContain(user, i)) { //user배열에 i가 있는지 확인
				 cnt++;//자리 상관없이 일차하면 cnt++ = 스크라이크도 포함되어있음
			 }
		 }
		 return cnt-strike(com, user);
		 //스트라이크의 개수를 차감
	 }
	
	 
	
	
	
	
	 
	
}
