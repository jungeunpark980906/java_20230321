package day11;

public class 인터페이스01 {

	public static void main(String[] args) {
		// 메서드를 쫘가아아악 나열해놓은 것 = 메뉴얼화 해놓은 것 (일반적으로 협업에서 사용)
		/* 
		 * <인터페이스>
		 * 인터페이스 : 상수와 추상메서드만으로 구성
		 * 키워드 : interface
		 * - 기능요약서
		 * - 자체적으로는 사용이 불가능, 인터페이스를 구현한 클래스로 활용
		 * - 구현 키워드: implements
		 * - 인터페이스는 멤버변수x (항상 이부분을 염두에 두고 메서드 정리!)
		 * 
		 * 
		 * */
		
		Tv t = new Tv();
		t.turnOn();
		t.chUP();
		t.chUP();
		t.chUP();
		t.chDown();
		t.chDown();
		t.turnOff();
		

	}

}
interface Power{
	abstract void turnOn(); //어차피 기능구현이 안되므로 abstract를 넣어도, 안넣어도 상관x
	abstract void turnOff();
}

interface Remocon{
	void chUP();
	void chDown();
	
}

class Tv implements Power, Remocon { //구현은 다중 구현이 가능 (기능구현이 안되는 경우만) + 구현과 상속은 같이 가능 (단, 상속은 한번에 하나만 가능)
	//멤버변수
	boolean power;
	int ch;
	
	//Tv에 손을 올리면 아직 구현이 안된 변수를 만들어줌
	@Override
	public void chUP() {
		if(ch < 100) {
			ch++;
		} else {
			ch = 0;		
		}
		System.out.println(ch);
	}
	@Override
	public void chDown() {
		if(ch > 0) {
			ch--;
		} else {
			ch = 100;	
		}
		System.out.println(ch);
	}
	@Override
	public void turnOn() {
		System.out.println("TV가 켜졌습니다");
		power = true;
		
	}
	@Override
	public void turnOff() {
		System.out.println("TV가 꺼졌습니다");
		power = false;
	}
	
	
	
	
}