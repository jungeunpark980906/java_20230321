package day03;

import java.util.Scanner;

public class For문Break문 {

	public static void main(String[] args) {
		// Break문 : 조건식,반복문을 빠져나오는 역할을 하는 키워드
		// 반복문에서 조건(if문)을 동반함 (이 조건이 되면 이 루트는 빠져나오겠습니다)
		
		//1~100까지의 합계를 나타내는데, 
		int i = 1; //(초기값)
		int sum = 0;
		
		for( ; ; ) {
			// System.out.print(i + " ");
			sum += i; //(조건식)
			if(i == 100) { //(실행문)
				break;
			}
			i++; //i+=1과 동일 (증감식) 
			// 초기값 - 조건식 - 실행문 -다음에-> 증감식이기 때문에 꼭 실행문다음에 증감식 순서!!
		}
		
		System.out.println("1~100까지의 합: " + sum);
		
		
		
		//글자를 입력받아 (한글자) 그대로 글자를 출력하세요.(a->a, b->b, y->종료)
		// y를 입력받는 경우에는 종료
		
		
		Scanner word = new Scanner(System.in);
		
		
		for ( ; ; ) {
		
		System.out.println("한글자를 입력해주세요.(단, y/Y를 입력하는 경우 종료됩니다): ");
		//charAt : 지정한 문자의 위치를 추출
		//next는 한글자만 받을 수 있어서 charAt으로 첫 문자를 가져와야함
		char ch = word.next().charAt(1); 
		System.out.println(ch + "를 입력하였습니다.");
		System.out.println("--------------------------------------------");
		if( ch == 'y' || ch == 'Y') {
			System.out.println("종료되었습니다.");
			break;
			}
		}
	
		word.close();
	}

}
