package day06;

public class Method02 {

	public static void main(String[] args) {
		// Method : 메서드 => 기능 함수
		// - 접근제한자 : 접근할 수 있는 주체의 제한범위
		// - 리턴타입 : 메서드 실행 후 결과로 얻을 수 있는 값 (자료형으로 표현) - 보내는 값
		// - 메서드명 : 메서드를 구분하는 명 (소문자 시작, 카멜표기법)
		// - 매개변수 : 기능을 수행하기위해 필요로 하는 정보값 - 들어오는 값
		// - void : 반환할 값이 없을 경우 사용
		
		/* 접근제한자 리턴타입 메서드명 (매개변수) {
		 * 기능구현;
		 * }
		 * 리턴타입이 있을 경우(void가 아닌경우) : 반드시 return을 포함!
		 * 
		 * 메서드의 위치 : class안쪽, 다른 method의 밖
		 * 
		 * */

		int hap = sum(100,200);
		System.out.println("두 수의 합:" + hap);
		
		
		sumPrint(hap, 200); //sysout이 필요없음
		
		int gop = gob(2,5);
		System.out.println("두수의 곱:" +  gop);
		
		
	}

	//메서드의 위치
	/* 기능 : 두 정수(매개변수)가 주어지면, 두 정수의 합을 알려주는(리턴타입) 매서드
	 * 리턴타입 : 합 => int(자료형만)
	 * 매개변수 : 두 정수 => int num1, int num2(자료형과 이름)
	 * 메서드명 : sum
	 * */
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
		
	} //매개변수를 받아서 처리 후 return으로 보냄
	
	
	/* 기능: 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : 두 정수 = int num1, int num2
	 * 메서드명 : sumPrint
	 * */
	
	public static void sumPrint(int num1, int num2) { //void이므로 return x
		System.out.println(num1 + num2);
	}
	
	
	// 기능 : 두정수가 주어지면 두 정수의 곱을 알려주는 메서드
	// 리턴타입 : int/ 매개변수 int num1, int num2/ 메서드명 gop
	
	public static int gob(int num1, int num2) {
		int gob = num1 * num2;
		return gob;
		//return num1*num;
	}
	
	
	
	
	
	
	
	
}
