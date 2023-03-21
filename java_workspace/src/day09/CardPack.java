package day09;

public class CardPack {

	/* CardPack class
	 * - 카드팩 : 52장의 카드들
	 * 
	 * - 기능
	 * 카드를 섞는 기능
	 * 한장을 선택하는 기능
	 * 카드 초기화하는 기능
	 * 출력기능 => Card 클래스에서 print 메소드 가져오기
	 * (생성자 = 52장의 카드를 모두 생성)
	 * (52장의 카드를 배열에 넣기! - 카드(객체)가 담겨 있는 배열 생성
	 * 
	 * */
	
	
	//맴버변수
	
	//52장의 카드를 담을 수 있는 팩 배열
	//카드 팩 배열 . 자료형이 Card/class pack[0]에 Card class하나
	private Card[] pack = new Card[52];  //자료형이 Card
	//카드가 남은 개수
	private int cnt; 
	
	
	//카드 섞기 
	//메서드명: shuffle ,  매개변수: 1~52까지의 배열  , 리턴타입: 섞은 배열
	
	public void shuffle(){
		
		for (int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length)+0; //랜덤 주소를 가져오기
			Card tmp = pack[i]; //임시변수도 Card의 pack[]
			pack[i] = pack[random];
			pack[random] = tmp;		
		}
		
	}
	
//	public void shuffle(){
//		int min = 0;
//		int max = pack.length;
//		for (int i=0; i<pack.length; i++) {
//			int index = (int)(Math.random()*(max-min+1))+min;
//			Card tmp = pack[i];
//			pack[i] = pack[index];
//			pack[index] = tmp;
//		}
		
	
	//카드를 한장 뺴기
	//메서드명: pick, 리턴타입: 카드1장
	//남은 카드의 수가 없는 경우(cnt=52)에 한장을 꺼냄 + 카드가 없는 경우에는 null
	
	public Card pick() {
		
		if(cnt > 0) {
			cnt --;
			return pack[cnt]; //가장 위쪽의 카드는 cnt번지 카드
		} else {
			return null; //객체의 기본값으로 null(아무것도 없다는 의미) 
//			System.out.println("마지막 카드입니다");
//			return pack[cnt]; 
		}
	}
	
	
	//초기화
	public void init() {
	cnt = 52;
		
		//cnt = 0;으로 만드는 경우
		
//		cnt = 0;
//		char shape = '♥';
//		for (int i=1; i<=4; i++) { 
//			switch(i) {
//			case 1: shape = '♥'; break;
//			case 2: shape = '◆'; break;
//			case 3: shape = '♠'; break;
//			case 4: shape = '♣'; break;
//			}
//			for (int j=1; j<=13; j++) { 
//				Card c =new Card(); 
//				c.setShape(shape);
//				c.setNum(j);
//				pack[cnt] = c; 
//				cnt++; 
//			}
//		} 
		
		
	}
		
		
	//생성자
	// => 52장의 카드를 생성 
	public CardPack() {
		char shape = '♥';
		for (int i=1; i<=4; i++) { //shape을 적용하기 위한 i //for문 안에 switch문 (if문 이용가능)
			switch(i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♠'; break;
			case 4: shape = '♣'; break;
			}
			for (int j=1; j<=13; j++) { //num을 적용하기 위한 i
				Card c =new Card(); //카드 한장을 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c; // cnt=1 -> 하트 1, cnt=2 -> 하트2 ... cnt=52 -> 클로버 K
				cnt++; //다음 번지로!
			}
		} 
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
