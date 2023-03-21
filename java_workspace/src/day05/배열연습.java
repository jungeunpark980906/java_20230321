package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아 배열에 저장하고,
		 * 점수의 합계, 평균, 최대, 최솟값을 출력
		 * 
		 * */

		/* 해결방법
		 * 1. 스케너 열기
		 * 2. 배열 선언, 변수들 선언
		 * 3. for문을 이용하여 배열안을 탐색, index번지에 값을 지정
		 * 4. 합계, 평균, 초대, 최소의 값을 구하기
		 * 5. 출력
		 * */
		
		//1
		Scanner scan = new Scanner(System.in);
		
		//2
		int size = 5;
		int[] arr = new int[size];
		int sum = 0;
		double evg = 0;
		int max = 0;
		int min = 999;
		
		//3
		for (int i=0; i<arr.length; i++) {
			System.out.println("점수를 입력해주세요.(5명의 점수): ");
			arr[i] = scan.nextInt();
			System.out.println("남은 점수는 " + (arr.length-i) + "개 입니다.");
			
		//4	
			sum += arr[i];
			
			if(max<arr[i]) {
				max = arr[i];
			} 
			//max=Math.max(max, arr[i]); 도 사용가능
			if (min>arr[i]) {
				min = arr[i];	
			}
			//min=Math.min(min,arr[i]); 도 사용가능
		}
		evg = sum/arr.length;
		//5
		System.out.println("5명의 점수 합계:" + sum);
		System.out.println("5명의 점수 평균:" + evg);
		System.out.println("가장 작은 점수: " + min);
		System.out.println("가장 큰 점수: " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	scan.close();	
		
		
		
		
		
	}

}
