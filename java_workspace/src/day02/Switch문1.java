package day02;

public class Switch문1 {

	public static void main(String[] args) {
		// Switch : 값을 케이스마다 분리해서 실행시켜주는 조건문
		/*
		 * Switch(변수/식) {
		 * case 값1: 
		 * 		실행문; 
		 * 		break; 
		 * case 값2:
		 * 		실행문;
		 * 		break;
		 * ...
		 * default:
		 * 		실행문;
		 * 		break; (break는 선택)
		 * }
		 * */
	
		int num = 3;
		
		switch(num) { 
		case 1:
			System.out.println("number은 1입니다.");
			break; //break가 없으면, 다음 break가 있는 순간까지 진행
		case 2:
			System.out.println("number은 2입니다.");
			break;
		case 3:
			System.out.println("number은 3입니다.");
			break;
		default:
			System.out.println("number은 1, 2, 3이 아닙니다.");
			break;
		}
	
	
	
	
	
	
	}

}
