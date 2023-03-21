package day09;

public class CardMain { //Card 메서드 출력용

	public static void main(String[] args) {
		
		Card c = new Card(); //new의 뒤에 있는 Card가 생성자!
//		// 생성자 : 멤버변수를 초기화하는 메서드 = new 키워드가 있을 경우 한번만 초기화!
//		c.print();
//		
//		c.random();
//		c.print();
//		
		CardPack cp = new CardPack();
////		for(int i=0; i<52; i++) {
////			System.out.println(cp[i]);
//		} // cp[i]를 찍을 능력x
		
		//c = cp.pick(); //ctrl을 누르면 구현한  위치로 이동가능
		//가장 위에 있는 카드 한장을 pick c 객체에 저장
//		Card tmp = cp.pick(); 
//		////가장 위에 있는 카드 한장을 임시변수 tmp에 저장
//		tmp.print();
//		tmp = cp.pick();
//		tmp.print();
//		tmp = cp.pick();
//		tmp.print();
//		tmp = cp.pick();
//		tmp.print();
//		
		//모양대로 4열횡대, 한모양이 바뀌면 줄바꿈
		
//		for (int i=1; i<=52; i++) {
//			tmp = cp.pick();
//			tmp.print();
//			if((i % 13)==0) {
//				System.out.println();
//			}
//		}
		
		Card tmp;
//		for(int i=1; i<=4; i++) { //줄바꿈
//			System.out.println();			
//			for(int j=1; j<=13; j++) {
//				tmp = cp.pick();
//				tmp.print();
//			}
//		}
		
		
		
		
		a: for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				tmp = cp.pick();
				if( tmp != null ) {
					tmp.print();
				} else {
					System.out.println("카드가 없습니다!. 초기화 해주세요.");
					break a;
				}
			}
			System.out.println();
		}
		
		
		 
		System.out.println();
		System.out.println("===============순서 섞은 후================");
		
		cp.init();
		cp.shuffle();
		
 		for(int i=1; i<=4; i++) { //줄바꿈
			System.out.println();
			for(int j=1; j<=13; j++) {
//				tmp = cp.pick();
//				tmp.print();
				cp.pick().print();
			}
		}
		
 		System.out.println();
		System.out.println("==============섞은 후 한장 뽑기=============");
		
		cp.init();
		cp.shuffle();
		cp.pick().print();
		
		
		
	
		
		
		
		
		
		
		
		

	}
	
	
	

}
