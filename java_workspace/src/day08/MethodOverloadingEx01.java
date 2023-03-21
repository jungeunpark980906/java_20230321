package day08;

public class MethodOverloadingEx01 {

	public static void main(String[] args) {
		/* calc(1,2"+")
		 * calc(1,"+",2)
		 * calc("+",1,2)
		 * 연산자의 위치에 상관이 없는 메서드 오버로딩
		 * 
		 * 메서드 오버로딩을 이용하여 두 정수와 연산자
		 * 연산의 결과가 출력되는 calc 메서드를 완성
		 * 만약, 잘못된 연산자가 들어가면 "잘못된 연산자입니다" 출력
		 * */
		
		
	calc('+', 100, 200);
	calc(100, '+', 200);
	calc(100, 200, '+');
		
		
	//매개변수의 개수, 매개변수의 자료형, 매개변수 자료형의 자리 (같은 개수, 같은 자료형 자리일 경우 오버로딩 생성x)
	//매개변수의 이름과는 관계x
	

	}

	public static void calc (int num1, int num2, char hap) {
		if( hap == '+') {
		System.out.printf("%d + %d = %d",num1,num2,(num1+num2));
		} else {
			System.out.println("잘못된 연산자입니다.");
		}
		System.out.println();
	}

	//전체 연산자를 사용하는 경우, switch문 이용
//	public static void clac(int num1, int num2, char op) {
//		switch(op) {
//		case '+':
//			System.out.println(num1 + num2);
//			break;
//		case '-':
//			System.out.println(num1 - num2);
//			break;
//		case '*':
//			System.out.println(num1 * num2);
//			break;
//		case '/':
//			System.out.println(num1 / num2);
//			break;
//		case '%':
//			System.out.println(num1 % num2);
//			break;
//		default:
//			System.out.println("잘못된 연산자입니다.");
//			break;
//		}
//	}
	
	
	
	
	public static void calc (int num1, char hap, int num2 ) {
		if( hap == '+') {
			System.out.printf("%d + %d = %d",num1,num2,(num1+num2));
		} else {
			System.out.println("잘못된 연산자입니다.");
		}
		System.out.println();
	}
	
	public static void calc (char hap, int num1, int num2 ) {
		if( hap == '+') {
			System.out.printf("%d + %d = %d",num1,num2,(num1+num2));
		} else {
			System.out.println("잘못된 연산자입니다.");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
