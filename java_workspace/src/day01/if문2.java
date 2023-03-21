package day01;

public class if문2 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력.
		 * 평균이 80점 이상이면 합격 아니면 불합격
		 * 출력 : 합계, 평균, 평가(평가는 if문 사용)
		 */
		
		int kor = 70;
		int eng = 91;
		int math = 80;
		
		int sum = kor + eng + math;
		double evg = sum / 3.0;
		
		System.out.println("세과목의 합계는 " + sum + ",  세과목의 평균은 " + evg + "입니다.");
		if(evg >= 80) {
			System.out.println("평균은 " + evg + "으로 합격입니다.");
		} else { System.out.println("평균이 " + evg + "이므로 불합격입니다.");}
	
		
		// 평가를 A(평균>=90), B(평균>=80), C(평균>=70), D(평균>=60), f(평균<60)로 나누어라
		if (evg >= 90) {
			System.out.println("평균이 " + evg +"으로 A등급입니다.");
		} else if (evg >= 80) {
			System.out.println("평균이 " + evg +"으로 B등급입니다.");
		} else if (evg >= 70) {
			System.out.println("평균이 " + evg +"으로 C등급입니다.");
		} else if (evg >= 60) {
			System.out.println("평균이 " + evg +"으로 D등급입니다.");
		} else {
			System.out.println("평균이 " + evg +"으로 F등급입니다.");
		}
	
	
	}
}
