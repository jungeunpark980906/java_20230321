package day07;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {
		// 배열이 주어졌을 때 배열을 출력하는 메서드

		
		int arr[] = new int[] {1,3,5,4,9,7,8,2,11,16,15,6,10,30};
		
		
		System.out.println("정수를 한줄에 5개씩 출력 >");
		printArray(arr);
		
		
//		System.out.println( );
//		System.out.println("정수를 내림차순(작은수부터)정렬 후 출력 >");
//		for (int tmp : sortArray(arr)) {
//			System.out.print(tmp + " ");
//		}
		
		System.out.println();
		System.out.println("정수를 오름차순(작은수부터)정렬 후 5개씩 출력 >");
		sortArray(arr); //오름차순 정렬
		printArray(arr); //5개씩 출력

	
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("랜덤할 수의 숫자를 입력하세요.(랜덤수 1~100): ");
		int size = scan.nextInt();
		
		System.out.println("-----randomArray출력-------");
		//int arr2[] = randomArray(size); //main에서 randomArray(size) 배열을 넣을 배열이 필요
		//printArray(arr2);
		
		printArray(randomArray(size));
		
		//sortArray(randomArray(arr2);
		//printArray(randomArray(arr2));
		
		
		scan.close();
	}
	
//==========================================================================================================	
	
	//기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	//매개변수: 정수배열 => int[] arr / 리턴타입: void / 메서드명: printArray
	//5개씩 한줄에 출력

	
//방법1
//	public static void printArray (int[] arr) {
//		
//		int cnt=0;
//		for (int i=0; i<arr.length; i++) {
//		System.out.print(arr[i] + " ");
//		cnt++;
//			if((cnt % 5)==0) { 
//				System.out.println( );
//			}
//		}
//	}
	
//방법2	
	public static void printArray (int[] arr) {
	
		for (int i=0; i<arr.length; i++) {
			if(( i % 5 )==0 && (i != 0)) { 
				System.out.println();
			}
		System.out.printf("%3d", arr[i]);
		}
	}
	

//==================================================================================================	
	
	//기능 : 주어진 정수 배열을 정렬하는 기능(오름차순:작은 수부터)
	//매개변수: 정수배열 / 리턴타입 :배열 / 메서드명: sortArray
//	public static int[] sortArray(int[] arr) {
//		for (int i=0; i<arr.length-1; i++) {
//			for (int j=i+1; j<arr.length; j++) {
//				if (arr[i]>arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//
//		
//		return arr;
//	}
	
	
	public static void sortArray(int[] arr) {
		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) { //오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

	}
	
//========================================================================================================	
	
	//기능: 새로운 배열을 만들어서 랜덤 수를 채워 리턴하는 메서드 (랜덤수1~100)
	//매개변수: main에서 size를 받아서 사용 / 리턴: 배열 int[] random / 메서드명: randomArray
	
	public static int[] randomArray(int size) { //여기서 사용하는 변수명은 main이랑 관련x
		
		int[] random = new int[size];
		for(int i=0; i<random.length; i++) {
			random[i] = (int)(Math.random()*100)+1;
			
		}
		return random;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
