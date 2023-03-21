package day02;

public class 자료형변환 {

	public static void main(String[] args) {
		// 자료형변환 : 변수의 값과 리터럴의 값이 자료형이 맞지않는 경우 오류 -> 자료형을 맞춰줌
		// 변수 = a 저장하려고하는 값이 자료형이 일치하지 않는 경우 형을 맞추기위해 형변환을 함
		
		// casting
		
		// 기본 타입 허용 범위 : byte < short, char < int < long < float < double
		// 1. 자동타입변환(자동 자료형 변환) : 자료형 변환시 생략해도 문제가 없는 경우
		//		값의 허용 범위가 작은타입 -> 큰 범위 타입에 대입되는 경우 (byte-> int)
		// 		변수 > 값 : 변수의 범위가 더 넓은 경우
		
		// 2. 강제타입변환(명시적 자료형 변환) : 필요에 의해 형변환이 필요한 경우
		//		큰 허용 범위타입 -> 작은 범위 타입(int->char), 형식이 맞지 않는 경우(int->double)
		//		리터럴 값 앞에 (타입) => (int)Math.random();
		
	
		int num = (int)Math.random(); //결과는 무조건 0
		double num1 = 10;
		byte num2 = 1;
		int num3 = num2;
		
		int num4 = (int)num1;
		
		
	}

}
