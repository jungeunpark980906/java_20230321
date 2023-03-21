package day08;

public class MethodOverloading {

	public static void main(String[] args) {
		/* 메서드 오버로딩
		* - 동일한 이름을 가지는 메서드를 여러개 만드는 경우
		* 1. 매개변수의 개수가 다르면 가능
		* 2. 매개변수의 종류(자료형)가 다르면 가능
		* 	(리턴타입, 매개변수 이름은 상관x)
		* 
		* */
		
		int a = 10;
		int b = 20;
		
		System.out.println(sum(a, b));
		System.out.println(sum(1.2, 3.4));
		
		//가변길이 메서드
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10)); 
		
		int arr[] = {78,45,98,456,21,54,87};
		System.out.println("arr배열의 합: " + sum(arr)); 
		
		
	}
	
	
	
	/* 더하기를 하는 메서드 생성
	 * 리턴:더한 결과값 int
	 * 매개변수: int num1, int num2
	 * 메서드명: sum
	 * */
	

	public static int sum (int num1, int num2) {
		return (num1 + num2);
	}
	
	
	
	//1. 자료형이 모두 다른 메서드 오버로딩
	
	public static double sum (double num1, double num2) {
		return (num1 + num2);
	}
	
	//2. 개수가 다른 메서드 오버로딩
	public static int sum (int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	
	//3. 자료형이 하나만 다른 메서드 오버로딩
	public static double sum (double num1, int num2) {
		return (num1 + num2);
	}
	
	//4. 자료형이 하나만 다르고, 자료형의 순서가 다른 메서드 오버로딩
	public static double sum (int num1, double num2) {
		return (num1 + num2);
	}
	
	
	/*가변길이 메서드
	 * 1+2 1+2+3 45+78+78+89..
	 * 피연산자의 값이 일정하지않은 경우 매개변수의 개수와 상관없이 매개값을 줄 떄 사용
	 * */
	
	//가변길이 메서드 = 가변 길이를 배열처럼 생각
	public static int sum (int ...num) { 
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
			return sum;
	}

	
	
	
	
	
}
 