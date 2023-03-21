package day07;

public class 클래스 {
//맴버변수의 자리: 모든 메서드에서 사용가능
	
	public static void main(String[] args) {
		/* <클래스 - 설계도>
		 * 객체를 생성하기 위한 설계도
		 * 메서드 - 클래스 안의 구성 정보들의 기능
		 * 
		 * 클래스의 구성정보
		 * - 속성: 맴버변수 = 모든 메서드에서 사용이 가능 (메서드안에서 사용하는 변수는 지역변수)
		 * - 기능: 메서드
		 * 
		 * 예) 프린터 클래스
		 * - 속성(정보)  : 크기, 색, 제조사, 이름, 구동방식
		 * - 기능: 인쇄, 스캔, 펙스, 복사
		 * 
		 * 맴버변수: 클래스 안+메서드 밖(위쪽)에 작성 => 4번라인
		 * 맴버변수는 클래스 안에서 사용이 가능 (모든 메서드 포함)
		 * 
		 * <클래스 형태>
		 * 접근제한자 class 클래스명{ // 클래스명은 반드시 대문자 시작!
		 * 
		 * }
		 *  
		 * <객체 선언 및 초기화>
		 * - 객체 선언 
		 * 클래스명 객체명;
		 * 
		 * - 객체 선언 + 초기화(생성)
		 * 클래스명 객체명 = new 클래스명();
		 * 
		 * <맴버 메서드 사용 방법>
		 * 객체명.메서드명();
		 * 
		 * 같은 클래스 안에서 메서드를 호출하는 경우, 메서드 명으로 호출가능 : 메서드명();
		 * 다른 클래스에서 메서드를 호출하는 경우, 객체를 이용하여 호출가능: 객체명.메서드명();
		 * 
		 * <접근제한자 = 접근제어자>
		 * 1. public : 누구나 제한없이 사용 가능
		 * 2. protected : 나 (현재 class) + 같은 package + 자식class 허용
		 * 3. (default)-안적는 경우 default : 나 (현재 class) + 같은 package
		 * 4. private : 나 (현재 class)
		 * 
		 * <제한>
		 * only! 클래스에서 public을 사용할 수 있음 => 내 파일명과 내 클래스명이 동일한 경우만 가능!
		 * 나머지 맴버변수, 메서드는 public을 사용하는 것에 제한x
		 * 
		 * private : 맴버변수/메서드를 다른 클래스에서 사용하지 못하게함.
		 * - 일반적으로 맴버변수=private/메서드=public사용 (일반적으로)
		 * - 개인정보 보관
		 * - 일반적으로 private으로 선언된 맴버변수는 getter(넣는 메서드)/setter(수정하는 메서드)를 통해서 변수에 접근 가능
		 */

		Point p =new Point(); //class선언(Scanner와 동일)
		p.print();
		p.move(5, 3); //x,y값 변경가능 (public, private가능)
		p.print();
		
//		p.x = 7; //public int x로 선언해서 x값 변경이 가능
//		p.y = 10; //private int y로 선언해서 y값을 보는건 가능, 변경과 프린트는 불가능
//		p.print();
		
//		System.out.println(p.x); //public int x로 선언해서 p.x의 값 프린트도 가능
//		System.out.println(p.y); //private int y로 선언해서 y값을 보는건 가능, 변경과 프린트는 불가능
		
		p.getY(); //y의 값을 프린트해서 볼수없기때문에 메서드를 만들어 접근 (값 프린트가능)
		
		p.setY(100); //private int y를 변경이 가능하도록 변경한 뒤, 7-> 100으로 변경 (값 변경가능)
		System.out.println(p.getY()); //y=100을 확인
		
		
		
		
		System.out.println("==========================================");
		
		Point1 p1 = new Point1();
		p1.print1();
		p1.move1(1, 2, 3);
		p1.print1();
		
		p1.x = 4;
		p1.y = 5;
		p1.z = 6;
		p1.print1();
		
		p1.setX(40);
		p1.setY(50);
		p1.setZ(60); // 숫자를 넣어서 변경
		
		System.out.print(p1.getX());
		System.out.print(p1.getY());
		System.out.print(p1.getZ()); //변경한 맴버변수를 매개변수로 리턴
	;
	
	}

}
//class는 다른 클래스 밖에서 생성.

/* 클래스명은 대문자로 시작
 * 접근제한자 class 클래스명{
 * }
 * 
 * 
 * */
class Point{
//접근제한자 (default) : 나 (현재 class) + 같은 package
	//맴버변수는 초기화하지 않아도 기본 0 또는 null로 초기화됨.
	 //변경, 프린트로 출력하는 접근 가능
	private int x;
	private int y; //현재 class내에서만 값 변경, 프린트로 출력가능 (타 class에서는 불가능)
	
	//(x,y)를 프린트하는 메서드
	public void print() {
		//원하는 프린트 모양(0,0)
		System.out.println("(" + x + "," + y + ")");
	}
	
	//x,y 좌표를 변경하는 메서드
	//매개변수: x,y의 값을 주고 맴버변수의 x,y를 변경
	public void move(int x, int y) {
		this.x = x; //표기가 같을 경우, this.을 붙이면 맴버변수를 의미 
		this.y = y; 
	}
	
	
	
	//===========================================================================
	//private int y -> 타 class에서 접근할 수 있도록하기위한 메서드
	
	public int getY() {
		return y;
	}//매개변수없이 y의 값을 리턴
	
	
	public void setY(int y) {
		this.y = y;
	} //맴버변수y를 접근가능한 변수y로 변경
	

}

class Point1{
	
	//x,y,z를 맴버변수로 선언
	public int x;
	public int y;
	public int z;
	
	//(x,y,z)를 찍는 print 메서드 생성
	
	public void print1( ) {
		System.out.printf("(%d, %d, %d)\n", x,y,z);
	}

	
	//x,y,z의 값을 변경하는 move메서드 생성
	
	public void move1(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	//각각의 값을 getter/setter 생성
	
	

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}







