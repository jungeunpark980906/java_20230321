package day12;

public class Exception01 {

	public static void main(String[] args) {
		/* Exception : 예외처리
		 * 실행시 발생할 수 있는 예외를 처리하여 정상 처리로 유지시키는 기능
		 * try - catch - finally(선택 사용) 구조
		 * try: 예외가 발생할 수 있는 구문 작성
		 * catch : 예외가 발생할 경우 처리하는 실행문
		 * finally : try구문과 반드시 실행되어야하는 구문이 있을경우 사용 (없으면x)
		 * */
		
		
		//num1=0으로 입력한 값이 잘못되었 경우가 있는 구문
		double res =0;
		int num = 10;
		int num1 =0;
		
		try {
			int sum=num1 + num;
			System.out.println("sum => " + sum);
			
			res = num / num1;
			System.out.println(res); //오류
			
		} catch (Exception e) {
			System.out.println("0으로 나누었습니다. Exception 발생!");
		}finally {
			System.out.println("꼭 처리되어야하는 구문");
		}
		System.out.println("종료");
		
	
	
	}

}
