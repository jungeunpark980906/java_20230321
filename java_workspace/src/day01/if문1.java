package day01;

public class if문1 {

	public static void main(String[] args) {
		/* 조건문 : 주어진 조건에 맞을 경우 실행문을 처리하는 구문
		 * if / switch 문
		 * if문 : if / if~else, if~else if
		 * 
		 * if (조건식) {
		 * 	true일 경우의 실행문;
		 * } 
		 *	예외) 실행문이 하나일 경우 {} 생략 가능
		 *  주의! if문의 조건식에 세미콜론을 사용하면 안됨.
		 */
		
		/* num1의 값을 주고, num1이 0이면 "num1은 0입니다." 라고 출력 / 0이아닌경우에는 "num1은 0이 아닙니다.라고 출력 */
		int num1 = -1;
		if(num1 == 0) {
			System.out.println("num1은 0입니다.");
		}
		
		if(num1 != 0) {
			System.out.println("num1은 0이 아닙니다.");
		}
	
			// num1이 0이면 0입니다.라고출력, 0이 아니면 0이 아닙니다라고 출력
			if(num1 == 0) {
				System.out.println("num1은 0입니다.");			
			}
			else { 
				System.out.println("num1은 0이 아닙니다.");
			}
	
			
		//num1이 양수(0을 포함하지않는 양수)인 경우 양수, 0이면 0이라 출력, 아니면 음수라고 출력
		if(num1 > 0) {
			System.out.println("num1은 양수입니다.");
		} else if(num1 == 0) { // else if를 이용하여 여러 조건을 나열할 수 있음
			System.out.println("num1은 0입니다.");
		} else { //else는 마지막에 한번만 가능
			System.out.println("num1은 음수입니다.");
		}
	
	
		//num2가 짝수인지, 홀수인지 판별하세요. (num2 % 2)
		int num2 = 3;
		
		if((num2 % 2) == 0 ) {
			System.out.println("num2는 짝수입니다.");
		} else { System.out.println("num2는 " + num2 + "이므로, num2는 음수입니다.");
		}
		
		
		
	}

}
