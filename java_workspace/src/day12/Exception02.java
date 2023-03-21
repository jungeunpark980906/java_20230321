package day12;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//예외가 발생할 수 있는 구문
			System.out.println(calc1(4, 0, '+'));
			System.out.println(calc1(4, 0, '-'));
			System.out.println(calc1(4, 0, '*'));
			System.out.println(calc1(4, 0, '$'));//오류
			System.out.println(calc1(4, 0, '/'));//오류
			System.out.println(calc1(4, 0, '%'));//오류
		} catch (Exception e) {
			//예외처리에 필요한 문구 출력
			System.out.println(e.getMessage());
			e.printStackTrace(); 
			//printStackTrace(); : 오류(예외)가 어디에서 발생하는지 알려주는 역할
			// java.lang.RuntimeException: num2는 0이 될 수 없습니다.
			//at day12.Exception02.calc1(Exception02.java:79)
			//at day12.Exception02.main(Exception02.java:15)
		}
		System.out.println("계산기 종료");
		
	}
	//기능 : 두 수를 입력받고, 연산자를 입력받아 사칙연산의 결과를 리턴하는 메서드 형성
	
//	public static double calc(int num1,int num2,char ch) {
//		double res = 0;
//		try {
//			switch (ch){
//			case '+': 
//				res = num1 + num2;
//				System.out.println(res);
//				return res;
//			case '-': 
//				res = num1 - num2;
//				System.out.println(res);
//				return res;
//			case '*': 
//				res = num1 * num2;
//				System.out.println(res);
//				return res;
//			case '/': 
//				res = num1 / num2;
//				System.out.println(res);
//				return res;
//			case '%': 
//				res = num1 % num2;
//				System.out.println(res);
//				return res;
//			} 
//			} catch (Exception e) {
//				System.out.println("잘못된 연산자를 입력하셨습니다. Exception 발생!");
//			} finally {
//				System.out.println("꼭 처리되어야하는 구문");
//			}
//			System.out.println("종료");
//			
//			
//			
//		}
		//throw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상이 발생
		//throw를 발생시키면 메서드 선언문 끝에 throws를 발생할 수 있는 예외를 반드시 적어야함
		//throw new RuntimeException 은 생략이 가능
		public static double calc1(int num1, int num2, char op) throws RuntimeException{
			double res=0;
			//예외처리는 앞에서 미리해주는 것이 좋음
			if((op == '/') || (op == '%') && num2 == 0) {
				throw new RuntimeException("num2는 0이 될 수 없습니다.");
			}
			switch(op) {
			case '+' : res=num1+num2; break;
			case '-' : res=num1-num2; break;
			case '*' : res=num1*num2; break;
			case '/' : res=num1/num2; break;
			case '%' : res=num1%num2; break;
			default: 
				throw new RuntimeException(op + "는 산술연산자가 아닙니다.");
			}
			return res;
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	

