package day08;

public class 클래스03 {

	public static void main(String[] args) {
		// Card 클래스 생성
		

		Card card = new Card();
		
		card.print();
		
		card.setNum(5);
		card.setShape('◆');
		card.print();
		
		card.setNum(15);
		card.setShape('☆');
		card.print();
		//카드에 있지않은 숫자,문자를 넣는 경우, 초기값 출력 => set에서 설정
		
		
		
		
		
	}
}
	/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
	 * 모양: ♥ ♣ ◆ ♠
	 * 숫자: 1(A) 2 3 4 5 6 7 8 9  10 J(11) Q(12) K(13) 
	 * 
	 * 호출하면 이 중 모양과 숫자가 하나씩 나오는 메서드
	 * 
	 * 클래스 구성
	 * - 멤버변수 : char shape, int num
	 * - 메서드: print(모양, 숫자) => 1♥
	 * - 생성자 : 하트 1 (1♥)
	 * - getter/setter
	 * 
	 * */
class Card {
	
	//멤버변수  
	private char shape; //모양
	private int num; //숫자
	
	//생성자
	public Card () { //매개변수와 멤버변수가 동일할 경우에만 this.
		shape = '♥'; 
		num = 1;
	}
	
	

	
	//getter,setter
	public char getShape() {
		return shape;
	}

	
	public void setShape(char shape) {

//		if ( shape == '♥' || shape == '♣' || shape == '♠' || shape == '◆') {
//			this.shape = shape;
//		} else {
//			this.shape = '♥';
//		}
//	}
		switch (shape) {
		case '♥': case '♣': case '♠': case '◆':
			this.shape = shape;
			break;
		default:
			this.shape = '♥';
			break;
		}
		
	
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if ( num > 13 || num < 1) {
			this.num = 1;
		} else {
		this.num = num;
		}
	}
	
	
	//<메서드>
	//프린트
	public void print() {
	
		switch(num) {
		case 11:
			System.out.println("J");
			break;
		case 12:
			System.out.println("Q");
			break;
		case 13:
			System.out.println("K");
			break;
		default:
			System.out.print(num);
			break;
		}
		System.out.println(shape);
	}
	
	//랜덤으로 출력
	
	
	
	
	
}
	
	
	

