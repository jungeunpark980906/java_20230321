package day05;

public class Method01 {

	public static void main(String[] args) {
		// main클래스 : 출력을 위한 클래스 -> main클래스 = 콘솔에 출력
		/* method 매서드 : 기능 / 함수
		 * 
		 * 접근제한자 (public = 모두 가능): 접근할 수 있는 주체의 제한 범위 
		 * 리턴타입 (void = 실행 후 리턴x): 메서드의 실행 결과로 받을 수 있는 정보의 값(자료형)
		 * 메서드명 : 메서드 이름 (main): 소문자로 시작
		 * 매개변수 (String[] args): 메서드를 실행하기 위하여 필요로 하는 값
		 * 
		 * 메서드 선언 및 구현 방법
		 * 접근제한자 리턴타입 메서드명(매개변수) {
		 * 기능구현;
		 * }
		 * 
		 * 메서드 선언 위치
		 * 클래스 안, 다른 메서드 밖
		 * */

		int num1 =10;
		int num2 = 20;
		System.out.println(num1+num2);
		
		int hap = sum(100,200); //메서드에서 sum을 만들어서 가져옴
		System.out.println(hap);
		
		
	//메인 메서드는 출력되는 값만 적음.
	}
	
	
	
	//메서드의 위치
	/* 기능 : 두 정수가 주어지면 두 정수의 합을 구해주는 메서드
	 * 접근제한자 : public static
	 * 리턴타입 : 합을 리턴함-> (int)
	 * 메서드명 : sum
	 * 매개변수 : 두 정수 (int num1, int num2) = 자료형 이름으로 구성
	 * */
	
	public static int sum(int num1, int num2) {
		int sum = num1 + num2;
		return sum; //sum을 호출하면, 이 값이 int자료형을 가진 sum으로 기능을 해줌
	}
	
	
	
	
	
	
	
	
	
}
