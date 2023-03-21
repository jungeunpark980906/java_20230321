package day06;

import java.util.Scanner;

public class 과제 {
	// 맴버변수의자리
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 계산기 (+ - * / % )  각각 메서드 만들기
		// 메서드에서 바로 출력
		// 1. 숫자를 입력받는 메서드 -> 숫자는 int배열로 2개 입력받기 -> void 3+2=5
		// 2. 메뉴 메서드 -> 원하는 계산을 선택해주세요 (고를수있도록)
		//				=> 1: 덧셈 2:뺼셈 3:곱셈 4:나눗셈 5:나머지 -> return
		// 3. main : switch문으로 이용
		// 			1) 1번 메서드에서 입력받은 숫자 호출-> 배열에 저장
		//			2) 2번 메서드 호출 -> 선택번호 return으로 가져오기
		//			3) switch문으로 return값을 case로 분류해 계산

		
		
		
		
		int arr[] = number();
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		int chioceNum = menu();
		System.out.println(chioceNum);
		
		switch ( chioceNum ) { 
		 case 1 : 
			 add(arr[0], arr[1]);
			 break;
		 case 2 :
			 miu(arr[0], arr[1]);
			 break;
		 case 3 :
			 gob(arr[0], arr[1]);
			 break;
		 case 4 :
			 div(arr[0], arr[1]);
			 break;
		 case 5 :
			rem(arr[0], arr[1]);
			 break;
		default :
			System.out.println("잘못된 연산자를 입력하셨습니다.");
			break;
		 }
		System.out.println("프로그램 종료!");
		
//		switch ( choiceNum ) {
//		case 1: getSumResult(arr); break;
//		case 2: getSubResult(arr); break;
//		case 3: getMulResult(arr); break;
//		case 4: getDivResult(arr); break;
//		case 5: getModResult(arr); break;
//		default: System.out.println("연산을 잘못입력하셨습니다"); break;
//		}
		
		
		
	}
	// 숫자를 배열로 입력받는 메서드 / 매개변수:x /  리턴:배열 /
	public static int[] number() {
		
		
//		System.out.println("숫자를 2개 입력해주세요.: ");
		int arr[] = new int[2];
		for (int i=0; i<arr.length; i++) {
			System.out.println((i+1) + "번째 숫자를 입력해주세요.");
			arr[i] = scan.nextInt();
		}
//		arr[0] = scan.nextInt();
//		arr[1] = scan.nextInt();
		
		
		
		return arr;
		
	}
	
	//메뉴를 나타내는 메서드 / 매개변수x /리턴:메뉴에서 고른  숫자
	public static int menu() {
		
		
		System.out.println("==============메뉴==============");
		System.out.println("1.덧셈 2.뺼셈 3.곱셈 4.나눗셈 5.나머지");
		System.out.println("===============================");
		System.out.println("메뉴를 선택해주세요: ");
		int choiceNum = scan.nextInt();
		
	
		return choiceNum;
		
	}
	//각 기능에 대한 메서드
	public static void add(int a, int b) {
		System.out.println("덧셈: " +(a+b));
	}

	public static void miu(int a, int b) {
		System.out.println("뺄셈: " +(a-b));
	}


	public static void gob(int a, int b) {
		System.out.println("곱셈: " +(a*b));
	}	

	public static void div(int a, int b) {
		System.out.println("나눗셈: " +((double)a/b));
	}

	public static void rem(int a, int b) {
		System.out.println("나머지: " +(a%b));
	}

//	public static void getSumResult(int arr[]) {
//		int result = 0;
//		for(int i=0; i<num.length; i++) {
//			result += a[i];
//		}
//		System.out.println(arr[0] + "+" + arr[1]+ "=" + result);
//	}
	public static void getMiuResult(int arr[]) {
		System.out.println("뺄셈: " + (arr[0]-arr[1]));
	}
}	

