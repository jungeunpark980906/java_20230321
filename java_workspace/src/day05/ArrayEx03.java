package day05;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 5자리 숫자를 입력받아 입력받은 숫자를 거꾸로 출력
		// 각 자리수 합계 출력 
		// ex) 11456 => 65411 => 6+5+4+1+1
		// ex) 19874 = > 47891 => 4+7+8+9+1
		// 배열에 담아서 사용.
		
		/* 1.스케너 열기
		 * 2.입력받기
		 * 3.배열 선언, 변수들 선언
		 * 4.반복문을 이용하여 마지막 자리가 없어질때까지 배열에 저장 / 합계
		 * 5. %과 /를 while문 이용
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		int size = 5;
		int arr[] = new int[size];
		int num = 0;
		int sum = 0;
		
		System.out.println("5자리의 숫자를 입력해주세요: ");
		num = scan.nextInt();
		
		System.out.print(num+ " => ");
//1. 모두 적는 방법		
//		arr[0]=num % 10;
//		arr[1]=(num % 100) /10;
//		arr[2]=(num % 1000) / 100;
//		arr[3]=(num % 10000) / 1000;
//		arr[4]=num / 10000;
//		
//		for(int tmp : arr) {
//			System.out.print(tmp);
//			sum += tmp;
//		}
//		System.out.println(" => " + sum);
		
//2. for문 이용 방법	
//		for(int i = 0; i <arr.length; i++) {
//			arr[i] = num % 10;
//			num /= 10;
//		}
//		
//		for(int tmp : arr) {
//			System.out.print(tmp);
//			sum += tmp;
//		}
//		System.out.println(" => " + sum);
	
//3. while문 이용방법
		int i=0;
		while (num > 0) { //입력받은 num가 0이 되기전까지 반복
			int b = num % 10; //마지막 자리
			arr[i] = b;
			sum = sum+b;
			num = num/10; //몫 저장 -> 소수점은 버려짐
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println( );
		System.out.println("sum: " + sum);
		
		
		
		
		
		
		
		
		scan.close();
		
	}

}
