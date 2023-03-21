package day04;

import java.util.Scanner;

public class 배열2 {

	public static void main(String[] args) {
		/* 5개의 값을 담는 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * 입력과 출력은 for문을 활용
		 * 출력모양 => 배열이름[번지]=값
		 * arr[0] = 1
		 * */


	
		int size=5;
		int arr[] = new int[size];
		
		for (int i=0; i<arr.length; i++) {
			arr[i]= i+1;
			System.out.println("arr["+ i + "] = " + (arr[i]));
		}
		
		
		
		
		System.out.println( );
		// 10개의 값을 갖는 배열을 생성하고, 짝수만을 저장하고 출력
	
		int num1=10;
		int arr2[] = new int[num1];
		
		for (int i=0; i<arr2.length; i++) {
			arr2[i]= (i+1)*2;
			System.out.printf("arr2[%d]=%d\n",i,arr2[i]);
		}
		
		
		
		System.out.println( );
		// 10개의 값을 갖는 배열을 생성하고(1~10), 배열 중 짝수 값을 갖는 배열만 출력
	
		int num=10;
		int arr1[] = new int[num];
		
		for (int i=0; i<arr1.length; i++) {
			arr1[i]= i+1;
			if (arr1[i] %2 ==0) {
			System.out.printf("arr1[%d]=%d\n",i,arr1[i]);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
