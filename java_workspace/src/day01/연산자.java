package day01;

public class 연산자 {

	public static void main(String[] args) {
		/* 대입연산자 : =을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
		 * 예) a=b b의 값을 a에 덮어쓰기 (a는 반드시 변수, a의 이전의 값은 사라짐)
		 */
		int a = 10;
		int b = 20;
		a = 30; // 기존 a의 값은 사라짐 (덮어쓰기)
		b = b + 10; // 기존 b의 값에 10을 넣는 연산 후 대입 (누적)
		System.out.println("a: "+ a + ", b: " + b);
		
		//b+30 = a; error
		
		//산술연산자 : +, -, *, /, %(나머지)
		System.out.println(4+3);
		System.out.println(4-3);
		System.out.println(4*3);
		
		System.out.println(1.2 + 3.4);
		System.out.println(1.2 - 3.4);
		System.out.println(1.2 * 3.4);
		
		/* 나누기
		 * 정수 / 정수 = 정수 (소수점을 버림)
		 * 정수 / 실수 = 실수
		 * 실수 / 실수 = 실수
		 */
		System.out.println(3/2);
		System.out.println(3/2.0);
		System.out.println(3.0/2.0);
		
		//자료형 정수 -> 실수로 변환 = 형변환(자료형변환)
		int num1 = 3;
		int num2 = 2;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / (double)num2);
			// 일시적으로 자료형 변환을 할 경우
			// double을 붙여 실수형으로 변환해 실행
		
		
		//나머지 연산자 % (배수를 구하는 경우)
		System.out.println( 4 % 2 );
		System.out.println( 44 % 7 );
		
			/* 문제: 국어 70점, 영어 35점, 수학 97점일 경우, 국영수 세과목의 합과 평균을 구하여 콘솔에 표시하시오. */
			int kor = 70, eng = 80, math = 97;
			int sum = kor + eng + math;
			double aver = sum / 3.0;
			System.out.println("국어, 영어, 수학과목의 합은: " + sum + ", 국어, 영어, 수학과목의 평균은: " + aver + "입니다.");
				// 나누는 값을 0으로 두는 경우, 예외 error가 발생
		
		// 비교연산자와 논리연산자는 if문에서 확인
		// 비교연산자의 결과는 true / false로 출력
		System.out.println( 4 > 5 );
		
		// 삼항연산자 : (조건식) ? A : B
		// 예) 평균이 80이상이면 합격, 아니면 탈락
		System.out.println( (aver >= 80) ? "합격" : "탈락");
	
		
		
	}

}
