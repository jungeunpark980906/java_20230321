package day10;

public class 클래스05 {

	public static void main(String[] args) {
		/* static : 모든 인스턴스(객체) 중에서 공통된 값을 유지해야한다면 사용 (공통적으로 참조or사용하는 경우)
		 * static이 붙은 멤버 변수/메서드들을 클래스 맴버/메서드라고 함
		 * static이 붙지 않은 멤버변수,메서드들은 객제(인스턴스) 멤버변수/메서드 라고 함
		 * 
		 * - 객체 멤버변수/메서드는 객체를 통해 사용되고, 생성된다
		 * - 각 객체마다 독립적인 변수/메서드가 된다.
		 * 
		 * - class 멤버변수와 메서드는 class를 통해 사용된다.
		 * 	=class명 . 변수/멤버변수 로 호출
		 * 
		 * - class멤버변수도 갹채를 통해 호출 가능 but!일반적으로 사용x
		 * - class멤버변수는 하나의 멤버변수를 모든 객체가 공유,사용한다
		 * - class나 객체변수는 생성시점이 다르다 = 메서드에서 사용될 수 있는 환경이 다르다
		 * - 객체멤버변수는 이미 class가 생성된 후 생성, +  class멤버 메서드에서 사용될 수 있다
		 * - class 멤버변수는 클래스/객체 멤버변수에서 모두 사용가능하다
		 * 
		 * **중요**
		 * - 객체 멤버변수는 클래스 멤버 메서드에서 사용할 수 없다
		 * - 객체 맴버 메서드는 객체멤버 메서드에서 사용할 수 있다
		 * 
		 * */
		
		TV t = new TV();
		//객체 멤버 메서드 접근방식: 객체생성 후 객체명.메서드명();
		t.printPower();
		
		System.out.println(TV.brand);
		
		TV.printBrnad();
		//클래스 멤버 메서드 접근방식: 
		//클래스명.매서드명();
		
		
		
		
		
		
		
		
		

	}

}

class TV{
	private boolean power;
	public final static String brand = "Samsung";
	//final : 수정이 불가능한 최종 상수 (기울임 굵은체)
	
	public static void printBrnad() {
		System.out.println("제조사: "+brand); // 객체 메서드에 클래스 변수를 사용 = 가능
		//System.out.println(power); // 클래스 메서드에 객체변수를 사용 =  불가능
		//static이 붙은 메서드는 static변수만 출력가능
		
	}
	
	public void printPower() {
		if(power) {
			System.out.println("TV가 커졌습니다");
		} else {
			System.out.println("TV가 꺼졌습니다");
		}
		System.out.println("제조사: " + brand);
	}
	
	 public void powerOn() {
		 power = true;
	 }
	 public void powerOff() {
		 power = false;
	 }
	 
	
	
	
	
	
}