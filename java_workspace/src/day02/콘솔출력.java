package day02;

public class 콘솔출력 {

	public static void main(String[] args) {
		// System.out.println(); 줄바꿈 o
		//System.out.print(); 줄바꿈 x
		//System.out.printf(); C언어에서 사용하는 콘솔출력 함수
		
		// 서식지정자를 통해 출력할 데이터의 서식을 지정할 수 있음
		// %c : 한글자, %s : 문자열, %d : 10진정수, %f : 실수

		// escape sequence : \
		//	예) \'('),  \"("), \t(탭)
		// 		\n(줄바꿈), \r(캐리지리턴: 끝으로 인식하고 다음줄에서 새로 시작하는 경우\n과 함께 사용) 
	
	
		int num1 = 3;
		int num2 = 5;
		//3+5=8
		//System.out.print(num1 + num2); // 줄바꿈x
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.printf("%d+%d=%d\n", num1,num2,(num1 + num2)); // num1+num2=(num1+num2)를 숫자열로 나타내겠습니다.
	
		
		
		double num3=78;
		double num4=7;
		System.out.println(num3+ "/" + num4 + "=" + (num3 / num4));
		System.out.printf("%.0f / %.0f = %.2f\n", num3, num4, (num3/num4));
	
	}

}
