package day09;


 public class Card{
	/* 
	 * 생성자: 클래스의 멤버변수를 초기화하는 메서드
	 * => Card c = new Card(); new뒤에 있는 Card가 생성자
	 * => new 키워드가 있을 경우에 사용 + 한번만 초기화가 가능!!
	 * 생성자가 하나도 없으면 기본생성자를 자동으로 생성
	 * 생성자가 하나라도 있으면 기본생성자는 생성되지 않음
	 * 생성자의 이름은 클래스명과 동일, 리턴자리는 없음, 매개변수는 가질 수 있음
	 * 
	 * main메서드 밖: 콘솔에 출력이 불가능
	 * 메서드는 호출을 해야지만 사용!
	 * 
	 * */
	 
 
	 
	 
	//멤버변수
	private char shape;
	private int num;
	
	//생성자
	public Card () {
		shape = '♥';
		num = 1;
	}

	
	//gettet/setter 
		// = private 멤버변수를 사용하지 않는 경우, 멤버변수를 절대 변경하지 않는 경우(예, 로고/ 브랜드 )에 setter사용 x
	
	public char getShape() {
		return shape;
	}
	
	public void setShape(char shape) {
		switch (shape) {
		case '◆': case '♥': case '♠': case '♣':
			this.shape = shape;	
			break;
		default:
			this.shape = '♥';
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
	
	// < method >
	
	//프린트 메서드
	public void print() {
		System.out.print(shape);
		
		switch ( num ) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
		default:
			System.out.print(num+" ");
			break;
		}
		
		//System.out.println();
	}
	
	//랜덤으로 뽑는 메서드
	public void random() {
		//숫자랜덤
		num = (int)(Math.random()*13)+1;
		
		//모양랜덤
		int randomShape = (int)(Math.random()*4)+1;
				
		switch (randomShape) {
		case 1:
			shape ='♥';
			break;
		case 2:
			shape = '◆';
			break;
		case 3:
			shape = '♣';
			break;
		case 4:
			shape = '♠';
			break;		
		}
		
		
	}
	
	
	//=======> CardPack class에서 생성
	
	//전체 카드팩을 출력
	
	//전체 카드팩을 랜덤으로 섞기
	
	//섞인 전체 카드팩에서 한장을 골라 출력
	
	//섞인 카드팩을 원래 상태로 정리
	
	
	
	
	
	
	
	
	
 }
