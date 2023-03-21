package day12;

public class 익명클래스 {

	public static void main(String[] args) {
		/* 익명클래스: 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 때 클래스없이 바로 구현
		 * 익명클래스를 사용하는 이유
		 * - 인터페이스의 기능이 적은
		 * - 해당 객체가 하나면 필요한 경우(다른 곳에서 사용하지 않는 경우)
		 * - 메서드의 매개변수로 사용해야하는 경우
		 * 
		 * */
		
//		Tv t = new Tv(); //class Tv를 여러번 사용하는 경우에는 원래 방법 사용
//		product(t);
		
		//익명클래스로 작업한 경우 : 메서드의 매개변수로 사용해야하는 경우
		//class Tv implements power{} 사용x
		product(new power() {
			
			@Override
			public void turnOn() {
				System.out.println("전원이 켜졌습니다.");	
			}
		
			@Override
			public void turnOff() {
				System.out.println("전원이 꺼졌습니다.");
				
			}	
		});
		

	}

	public static void product(power p) {
		p.turnOn();
		System.out.println("티비가 작동중입니다.");
		p.turnOff();
	}
	
	
	
	
}
interface power{
	void turnOn();
	void turnOff();
	
	
	
}
//class Tv implements power{
//
//	@Override
//	public void turnOn() {
//		System.out.println("전원이 켜졌습니다.");	
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("전원이 꺼졌습니다.");
//		
//	}
//	
//	
//}