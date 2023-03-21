package day02;

public class MathClass {

	public static void main(String[] args) {
		/* Math.method
		 * 수학적 기능을 하기위함 클래스
		 * 반올림, 올림, 버림, max, min, random
		 * */
		double num1 = 5.623456;
		//Math.round : 정수가 나오는 반올림 (소수점을 선택하는 기능x)
		System.out.println(Math.round(num1));// Math는 괄호안의 매개변수와 리턴하는 자료형를 선택해서 사용함. -> 사용시 먼저 어떤자료형을 할껀지 생각
	
		//Math.ceil : 올림, Math.floor : 버림
		System.out.println(Math.ceil(num1)); //나오는 자료형이 double
		System.out.println(Math.floor(num1));
		
		//Math.max : 최대값, Math.min : 최소값
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		//Math.abs : 절대값
		System.out.println(Math.abs(-5));
	
		//Math.pow : 제곱, Math.sqrt : 제곱근(루트씌우기), Math.random : 0~1 사이의 랜덤값
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(25));
		System.out.println(Math.random()); //double의 값으로 추출됨
		
			//Math.random을 이용하여 1~10까지 중 랜덤값 추출 하기
			//(int)(Math.random()*n)+start
			//(int)(Math.random()*10)+1 : 1~10까지의 랜덤값
			int random = (int)(Math.random()*10)+1; 
			System.out.println(random);	
				
		
				//나오는 수가 double이므로 (int)이용하여 정수 형태로 형변환 
				//+ 0~1을 0~10으로 바꾸기위해 (Math.random()*10)	
				//+ 시작값을 만들기위하여 +시작값 : +1
	
	
	
	
	
	}

}
