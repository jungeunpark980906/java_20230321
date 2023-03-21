package day12;

public class 내부클래스 {

	public static void main(String[] args) {
		/* < 내부클래스 (=중첩클래스) >
		 * 
		 * - 클래스 내부에 선언한 클래스 
		 * - 내부클래스를 포함한 외부클래스와 밀접한 연관이 있고, 
		 * 	다른 외부에서 내부클래스를 사용할 일이 없는 경우 사용 => private 사용 권장
		 * - 인스턴스 내부클래스, 정적(static) 클래스, 지역(local) 내부클래스
		 * 	, 익명(anonymous)로 선언하기도 함 -> 익명클래스를 사용하기 위해 내부클래스를 자주 사용
		 * 
		 * - 내부적으로 사용할 목적으로 만드는 클래스이기 때문에 private로 선언하는 것을 권장
		 * - 내부 클래스 생성시기 : 외부클래스가 생성된 후 생성됨 (단, static 예외)
		 * - 내부클래스가 private가 아닌경우, 타 외부 클래스에서 가져가서 생성, 이용 가능
		 * 
		 * */
		
		Outclass o = new Outclass(); //Outclass를 생성하면 inclass도 자동으로 생성됨
		
		System.out.println("외부 클래스를 이용하여 내부 클래스의 메서드를 호출");
		o.usingClass();
		
		
		System.out.println();
		
		//외부 클래스에서 내부 클래스를 생성
		//Outclass를 안거치고 Inclass를 사용x
		//private로 선언된 내부클래스는 접근 불가x
		Outclass.Inclass inclass = o.new Inclass();
		System.out.println("외부 클래스변수를 이용하여 내부 클래스 생성");
		inclass.inClassprint();
		
		
		//외부 클래스에서 객체생성 없이 바로 정적(static) 내부 클래스 생성
		System.out.println();
		System.out.println("정적(static) 내부 클래스의 static메서드 호출");
		Outclass.InStaticClass.sTest();
		
		System.out.println();
		System.out.println("정적(static) 내부 클래스의 일반메서드 호출");
		Outclass.InStaticClass sInclass = new Outclass.InStaticClass();
		sInclass.inTest();

	}

}
class Outclass{
	private int num = 10;
	private static int sNum = 20;
	private Inclass in;
	
	public Outclass() {
		
		//생성자
		in = new Inclass(); //Inclass생성
		
		
		
	}
	
	
	
	//Outclass에서 멤버변수로 추가하는 것과 같은 효과
	class Inclass{
		int inNum = 100;
		//static sInNum = 200; //안되는 케이스 (static X)
		void inClassprint() {
			System.out.println("Outclass Num = " + num + "(외부클래스의 인스턴스 변수)");
			System.out.println("Outclass sNum = " + sNum + "(외부클래스의 static 변수)");
			System.out.println("Inclass inNum = " + inNum + "(내부클래스의 인스턴스 변수)");
			
		}
		//static void sTest() { //안되는 케이스 (static X)
		//}
		
		
		
		
	}//Inclass 끝
	
	//Inclass를 호출하는 Outclass의 메서드
	public void usingClass() { 
		in.inClassprint(); //생성한 내부클래스 변수를 이용하여 메서드를 호출
	}
	
	//
	static class InStaticClass{
		int inNum = 1000;
		static int sInNum = 2000; //class가 static이므로 선언이 가능
		
		void inTest() {//정적(static)클래스의 일반메서드
			//System.out.println("Outclass Num = " + num + "(외부클래스의 인스턴스 변수)"); //사용불가능
			
			System.out.println("Outclass sNum = " + sNum + "(외부클래스의 static 변수)");
			System.out.println("Inclass inNum = " + inNum + "(내부클래스의 인스턴스 변수)");
			System.out.println("INclass sNum = " + sInNum + "(내부클래스의 static 변수)");
		}
		
		
		
		
		static void sTest() { //정적(static)클래스의 정적(static)메서드 //class가 static이므로 static 메서드 생성가능
			//System.out.println("Outclass Num = " + num + "(외부클래스의 인스턴스 변수)");
			//System.out.println("Inclass sNum = " + inNum + "(내부클래스의 인스턴스 변수)");				
			System.out.println("Outclass sNum = " + sNum + "(외부클래스의 static 변수)");//static이 있는 것만 가능
			System.out.println("Outclass sNum = " + sInNum + "(외부클래스의 static 변수)");
		}
		
		
		
		
		
		
		
		}
	
	
	
}//Outclass끝
