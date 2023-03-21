package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 + - * % 를 작성하여 출력
		 * 두 수를 입력 받아서 연산. 연산자를 입력받아 메서드를 활용하여 연산
		 * 
		 * <순서>
		 * 1. 스케너 열기
		 * 2. 각 메서드를 정의
		 * 3. 메인에서 값을 입력받기 ( 정수2개, 연산자1개 )
		 * 4. switch()문을 통해 각 연산자마다 메서드 호출 / 출력
		 * 
		 */

		 Scanner scan = new Scanner(System.in);
		 
		 int a = 0, b=0;
		 String k ="+";
		 
		 System.out.println("==========계산기==========");
		 System.out.println("두 수를 입력해주세요.: ");
		 a = scan.nextInt();
		 b = scan.nextInt();
		 System.out.println("연산자를 입력해주세요.(+,-,*,/,%): ");
		 k = scan.next();
		 
		 
//		 // 다른 클래스에서 만든 메서드 사용법
//		 Method02 m2= new Method02(); //m2변수에 호출
//		 System.out.println("Method02 class에서 작성된 Method");
//		 m2.sumPrint(a, b); //Method02 class에 있는 .sumPrint를 가져옴
		 
		 
		 
		 
		 switch ( k ) { //String이여도 변수에 " " 따옴표 x
		 case "+" : 
			 System.out.printf("%d+%d=%d",a,b, hap(a, b));
			 break;
//			 hap(k, a, b);
		 case "-" :
			 System.out.printf("%d-%d=%d",a,b, miu(a, b));
			 break;
		 case "*" :
			 System.out.printf("%d*%d=%d",a,b, gob(a, b));
			 break;
		 case "/" :
			 System.out.println(a + k + b + "=" + div(a, b));
			 break;
		 case "%" :
//			 System.out.println(a + k + b + "=" + remain(a, b));
			 //return을 배열로 : 몫과 나머지를 순서대로 double로 담아서 return
			 double arr[] = remain(a, b);
			 
			 System.out.println("나누기의 결과: " + arr[0] );
			 System.out.println("나누기의 나머지: " + arr[1] );
			 break;
		default :
			System.out.println("잘못된 연산자를 입력하셨습니다.");
			break;
		 }
		 

		 
		scan.close(); 
		 
	}

	public static int hap (int num1, int num2) {
		return num1 + num2;
	}	
//	public static void hap(String k, int num1, int num2) { // 이때 순서는 상관이 없음
//		Sysem.out.println(num1 + k + num2 + "=" + (num1 +num2));
	
	public static int miu (int num1, int num2) {
		return num1 - num2;
	}
	
	public static int gob (int num1, int num2) {
		return num1 * num2;
	}
	
	public static double div (int num1,int num2) {
		return (double)num1 / num2; //double을 만들기 위해 한쪽을 형변환
	}
	
	
//	public static int remain (int num1, int num2) {
//		return num1 % num2;
//	}
	
	// 기능 : 두 정수를 입력받아, 두 정수를 나눈 몫과 나머지를 double[] 배열로 리턴
	// 리턴값: / 변수명: remain / 매개변수: 
	
	public static double[] remain(int num1, int num2) {
		double arr[] = new double[2];
		arr[0] = (double)num1 / num2;
		arr[1] = num1 % num2;
		return arr;
		
	}
	
	
	
	
	
	
	
	
	
	
}
