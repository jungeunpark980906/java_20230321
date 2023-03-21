package day01;

import java.util.Scanner;

public class if문3 {

	public static void main(String[] args) {
		// Scanner 클래스 사용 = 값을 입력받고 싶은 경우에 사용
		Scanner scan =  new Scanner(System.in);
		
	
		//유도 안내문자
		System.out.println("점수를 입력해주세요.(0~100): 국어, 영어, 수학순서로 ");
		
		int kor = scan.nextInt(); // 받는 값은 Int라는 의미 -> int로 받고 int로 담음 (next_는 받을때 사용)
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		if (kor < 0 || kor > 100 ) {
			System.out.println("국어 점수 오류.");
		}
		if (eng < 0 || eng > 100 ) { 
			System.out.println("영어 점수 오류.");
		}
		if (math < 0 || math > 100 ) {
			System.out.println("수학 점수 오류.");
		}
		
		//합계 구하기
		int sum = kor + eng + math;
		double evg = sum / 3.0;
		
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.2f\n ", evg); // %f는 나누기를 할 서식지시자, .2는 소수점 자리 수(그 뒤자리에서 반올림된 값)
		
		//등급 구하기
		char ch = 'F'; //조건이 맞지 않아 if문을 사용못하는 경우, ch의 값은 'F'(초깃값) -> 지역변수는 초깃값 필수
						//' '공백이나 0도 가능
		if (evg > 100 || evg < 0 ) {
			System.out.println("평균 계산 오류");
		} else if (evg >= 90 ) {
			ch = 'A';
		} else if (evg >= 70) {
			ch = 'C';
		} else if (evg >= 60) {
			ch = 'D';
		} else  {
			ch = 'F';
		} 
		System.out.println("등급: " + ch );
		
		

		
		//test
		//System.out.println(kor);
		scan.close(); // 마지막에 작성
	}

}
