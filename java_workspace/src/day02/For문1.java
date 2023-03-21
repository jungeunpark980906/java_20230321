package day02;

public class For문1 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 일을 반복적으로 해야하는 경우 사용하는 문법
		 * 종류 : for, while, do~while
		 * 
		 * for (초기화; 조건식; 증감연산식;){
		 * 	실행문;
		 * }
		 * 
		 * 1. 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화 (처음 한번만 실행, 생략가능)
		 * 2. 조건식 : 반복문의 반복을 결정하는 식. 참=반복, 거짓=멈춤 (생략하면 무조건 true)
		 * 3. 증감연산식 : 조건식에서 사용되는 변수를 증가/감소시켜 반복횟수를 결정 (생략가능)	
		 * 
		 * 순서 : 초기화 - 조건식 - 실행문 -> 증감연산식 - 조건식 - 실행문 -> 증감연산식 (반복)
		 * 
		 */
		
		//1~20까지 출력하는 예제
		//초기화 : 시작하는 값 설정(증감변수 i, j) // 1부터 시작 (i=1)
		//조건식 : 끝나는 값 설정 // 10까지 (i<=10) -> 11이되면 false가되서 멈춤
		//증감연산식 : 1씩 증가 (i = i+1, i++), 1씩 감소 (i = i-1, i--)
		//반복 종료후 실행문 : 없음.
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}

		// 지역변수의 범위는 { 선언    소멸 }
		//int i = 1;의 변수 와 for문 속 i 변수는 다름.
		
			System.out.println( ); //줄바꿈
		
		for (int i=1; i<=10; i=i+2) { //i=i+2와 i+=2 동일
			System.out.print(i+" ");
		}
		
			System.out.println( ); //줄바꿈
			
		
		//10~1까지 출력하기
		for (int i=10; i>=1; i-=1) { //i--도 가능
			System.out.print(i+" ");
		}
		
			System.out.println( ); //줄바꿈
		
		//1~10까지 짝수 출력
		for (int i=2; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		
			System.out.println( ); //줄바꿈
			
		// 1~10까지 짝수만 출력, if문 사용하여 조건에 맞는 경우 출력
		for (int i=1; i<=10; i++) {
			if ((i % 2) == 0) {
				System.out.print(i+" ");	
			} 
		}
		
		
		// 1~10까지의 합계 출력
			//실행문: 누적, 실행 후 출력(sum이용)
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("1~10까지의 합계: "+ sum);
		
		
		
		
	}

}
