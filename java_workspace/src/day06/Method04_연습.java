package day06;

public class Method04_연습 {

	public static void main(String[] args) {
		/* 1.랜덤 정수(1~100) 5개를 배열에 담는 메서드 생성 -> 정수 배열을 리턴
		 * 2.배열을 전달받아 평균을 연산하는 메서드 생성 -> 평균을 리턴(double)
		 * 3.정수5개와 평균을 출력하는 메서드 생성
		 * 
		 * main : 연산식x, 메서드간의 전달 및 호출만 
		 * 
		 * 
		 * */

		
		
		int[] arr = random();
		double avg =average(arr);
		
		print(arr, avg);
		
		
		
		
		
		
	}

	public static int[] random() {
		
		int arr[] = new int[5];
		for (int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*100)+1;
			arr[i] = random;
		}
		return arr;
	}
	
	public static double average(int arr[]) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum / arr.length;
		return avg; 
	}
	
	public static void print(int arr[], double avg) {
		System.out.println("5개의 정수: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println( );
		System.out.println("평균: "+ avg);
	}
	
	
}
