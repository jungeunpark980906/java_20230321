package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력받아 배열에 저장하고,
		 * 그 점수의 합계와 평균을 출력
		 * 합계:
		 * 평균:
		 * 
		 * */

		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];
		int num = 0;
		int sum = 0;
		int max = 0; 
		int min = 999;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println("5명의 점수를 입력하세요.: ");
			System.out.println("남은 점수는 "+ (arr.length-i) + "개입니다.");
			num = scan.nextInt();
			arr[i] = num; 
			//arr[i]=scan.nextInt(); 로 한번에 넣기도 가능
			sum += arr[i];
			
			// max=Math.max(max,arr[i]); 이걸로 for문없이 최고점수 확인가능
			// min = Math.min(min, arr[i]); 이걸로 for문없이 최소점수 확인가능
			

			if (arr[i]>max) {
				max = arr[i];
				}
			// int min=0;으로 하고싶은 경우, min = arr[0]; 으로 선언하고 실행
			if (arr[i]<min) {
				min = arr[i];
			}
			
				
			
		}
		
		int avg = sum /arr.length;
		System.out.println("5명 점수의 합계: "+ sum);
		System.out.println("5명 점수의 평균: "+ (double)avg);
		System.out.println("최고점수: " + max);
		System.out.println("최소점수: "+ min);
		
		
		 
		/* 1. Scanner열기
		 * 2. 배열선언 int arr[] = new int[5];
		 * 3. 값을 배열에 추가 arr[0] = 점수;... =>for문으로 값을 추가 
		 * 4. 합계를 구하기위해 지역변수sum 선언 및 구하는 식 sum += arr[i];
		 * 5. for문 밖에서 평균구하기 
		 * */
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
