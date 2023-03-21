package day01;
// 어느 폴더안에 들어가 있는지 알려주는 package
public class 변수 {

	public static void main(String[] args) {
		// 변수명, 클래스명 한글사용 가능.
		// main method부분
		System.out.println("method 내부");
		System.out.println(1234);
		
		// 변수 : 리터럴값을 담는 메모리 공간
		// 주석 : 코드에 영향을 미치지 않는 구문, 설명을 위해 사용
		/* 여러줄 
		 * 주석입니다.*/
		// 변수 선언 방법 : 변수타입 변수명;
		
		int num, num2, num3, num4; //선언만 (단, 같은 자료형일 경우 여러 변수를 동시에 선언)
		num = 123; // 값 지정
		
		int num1 = 123;// 선언 후 값 지정
		byte num5;
		char ch1;
		double dou1;
		boolean bool;
		// 노란 밑줄 : 경고, 한번도 사용도지 않은 경우
		// 빨간 밑줄 : error
		
		int appleCount; //변수명은 카멜 표기법으로 의미 넣어 지정
		int applecount; //대소문자를 인식하므로 위의 선언과 다르다고 확인
		
		//int num; //중복선언 불가능
		System.out.println("num1의 값: "+num1);
		
		//a라는 int변수를 선언 후 값을 지정하고, a변수의 값을 출력하시오
		int a = 1234;
		System.out.println("a의 값: "+a);
		
		//num1과 a 변수의 값을 하나의 구문으로 출력
		System.out.println("num1의 값은" + num1 + "입니다. 그리고 a의 값은" + a + "입니다.");
		
		
		
		
		
		//문자
		char ch = 'a'; //""문자열, 1글자의 문자는 ''/ char은 한글자의 문자만 사용 가능 ''
		System.out.println("ch는" + ch);
		
		//특수문자를 넣고싶은 경우에는 앞에 \를 넣어 사용가능
		char sh = '\'';
		System.out.println(sh);
		
		String str = "abc"; // 여러 글자를 사용하는 경우에는 String
		//일반적인 class는 객체를 만들어 사용하지만 String의 경우 자주사용해 자료형으로 사용이 가능함.
		System.out.println("str는" + str);
	
		
		
		
		int b = 10; //10진수의 10
		int c = 010; //8진수의 10 (0~7까지 사용 8=10)
		int d = 0x10; // 16진수의 10 (0~9 A B C D E F까지 사용 16=10)
		
		//int e = 123456789012; //int영역의 범위를 넘어가는 경우 error
		//long의 형태로 변수 선언 (이때 값이 크든 작든 숫자의 마지막에 접미사 L(대소문자 상관없음)을 꼭 넣어줘야함)
		long e = 123456789012L; 
		
		//기본 실수형은 double로 인식함
		//float형의 실수값은 접미사 F를 반드시 써야함
		float f =1.2345f;
		
		bool = true;
		boolean bool2 = false;
		
		int kor = 100;
		int kor1 = kor;
		// = : 대입, 오른쪽의 값(값을 가지고 있는 값, 변수)을 왼쪽(반드시 변수)에 담아라
			// 예) 1= kor; 왼쪽의 값이 변수가 아니므로 error
		
		int g = 10, h= 20, y=50; //동시에 선언도 가능
		int k, z = 10; //k는 값이 없고(선언만 함), z는 10의 값을 가짐.
		
		
		
	} 
	// class안에서 동작을 할 수 있도록 하는 부분: method 부분 - 이 부분에서 작업해야 처리가 가능(기능)
	
} 
// class는 여기까지
