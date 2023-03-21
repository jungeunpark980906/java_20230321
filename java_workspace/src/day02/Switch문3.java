package day02;

public class Switch문3 {

	public static void main(String[] args) {
		// 계절을 출력. 1~12월까지 랜덤으로 생성 후 해당하는 월과 계절을 출력
		// 3~5월 봄, 6~8 여름, 9~11 가을, 12~2 겨울
		
		int RandomMonth = (int)(Math.random()*12)+1; //+1이 없으면 0~11로 나옴
		System.out.println(RandomMonth + "월이 나왔습니다.");
		
		//If문 이용 
		if (RandomMonth >=3 && RandomMonth <=5 ) { // 3
			System.out.println(RandomMonth + "월으로 계절은 봄입니다.");
		} else if (RandomMonth >=6 && RandomMonth <=8 ) {
			System.out.println(RandomMonth + "월으로 계절은 여름입니다.");
		} else if (RandomMonth >=9 && RandomMonth <=11 ) {
				System.out.println(RandomMonth + "월으로 계절은 가을입니다.");
		} else if (RandomMonth == 12 || RandomMonth == 2 || RandomMonth == 1){
			System.out.println(RandomMonth + "월으로 계절은 겨울입니다.");
		} else {
			System.out.println(RandomMonth+ "월으로 잘못된 값을 입력하셨습니다.");
		}
			
		
		//Switch문 이용
		switch (RandomMonth) {
		case 3: case 4: case 5:
			System.out.println(RandomMonth + "월으로 계절은 봄입니다.");
			break;
		case 6: case 7: case 8: 
			System.out.println(RandomMonth + "월으로 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println(RandomMonth + "월으로 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println(RandomMonth + "월으로 계절은 가을입니다.");
			break;
		default:
			System.out.println(RandomMonth + "월으로 잘못입력하셨습니다.");
			break;
		}
		
		
		
		
		

	}

}
