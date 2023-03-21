package day06;

public class Method04 {

	public static void main(String[] args) {
		/* 1.랜덤 정수(1~100) 5개를 배열에 담는 메서드 생성 -> 정수 배열을 리턴
		 * 2.배열을 전달받아 평균을 연산하는 메서드 생성 -> 평균을 리턴(double)
		 * 3.정수5개와 평균을 출력하는 메서드 생성
		 * 
		 * main : 연산식x, 메서드간의 전달 및 호출만 
		 * 
		 * 
		 * */

		
		int[] arr = ran();
		//double evg = avg(arr);
		//print(arr, evg);//한 메서드 안에서만 맞추면 됨 /다른 메서드의 경우 값만 맟추면 됨	
		print(arr, avg(arr));
		
		
//		System.out.println("-----------------");
//		print(ran(), avg(ran())); 
//		// 주의!! 메서드를 호출할 때마다 다른 수가 출력되어, ran()과 avg(ran())의 랜덤값이 다름!
		
	
		
	}
	//기능 : 랜덤정수를 받아 배열에 담아 정수 배열을 리턴
	//리턴타입 : 정수배열 int[] , 매개변수x
	public static int[] ran() {
		int[] arr= new int[5];
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	return arr;
	}
	
	
	//기능 : 배열을 전달받아 평균을 연산해 리턴
	//리턴타입: double 평균, 매개변수: 배열 int arr[]
	public static double avg(int arr[]) {
		//int arr[] = ran();
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum/arr.length;
		return avg;
	}
	
	//기능 : 정수 5개와 평균을 출력하는 기능
	//리턴타입 : void, 매개변수: 배열, 평균값
	public static void print(int arr[], double avg) {
		System.out.println("정수 5개: ");
		for (int p : arr) {
			System.out.print(p+" ");
		}
		System.out.println( );
		System.out.println("평균: "+ avg);
	}
	
	
	
	
	
	
	
	
}
