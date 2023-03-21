package day17;

import java.util.ArrayList;

public class LambdaEx {

	public static void main(String[] args) {
		//Lambda expression : 람다식
		// 함수형 프로그램(Funtional Programming : FP )
		// 순수한 함수를 두현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)를 주지 않도록 구현하는 방식
		// 순수함수 (pure function) 
		//  :  매개변수만을 사용하여 만드는 함수 = 함수 내부에서 변수를 사용하지 않아 함수가 실행되더라도 외부에 영향을 주지 않는 형태
		// js에서 많이 사용 / java는 잘 사용x
		
		// < 기본메서드 >
		int result = add(3,5);
		System.out.println(result);
		
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		
		for(Integer i : number) {
			System.out.print(i+" ");
		};
		
		System.out.println();
		System.out.println("--람다식 사용--");
		
		// < 람다식 >
		
		//(int x, int y) -> {return x+y}
		//int x -> {return x+y}
		
		//return 있으면 중괄호 생략 불가능
		//return 없으면 중괄호 생략 가능 
		//예) str -> System.out.println(str);
		
		
		//.forEach : 향상된 for과 같은 역할
		//1. (n=매개변수)를 사용하는 방법
		number.forEach((n)->{ //n을 넣으면 아래 실행구문을 처리해!
			System.out.print(n+" ");
		});
		
	
		//2. 메서드에 직접 참조하는 방법 (매개변수를 사용하지 않는 방법)
		number.forEach(System.out::println);
		
		System.out.println("--number list의 총 개수--");
		System.out.println(number.stream().count());
		
		

	}
	//기본 메서드
	public static int add(int x, int y) {
		return x+y;
	}
	//
	
	
	
	
}
