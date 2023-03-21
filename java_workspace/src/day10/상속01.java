package day10;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속: 부모의 것을 자식에게 물려주는 것
		 * class상속 : 부모class의 멤버변수/멤버 메서드를 물려주는 것
		 * 상속 이유: 재사용으로 중복코드를 줄이는 것
		 * 
		 * class A (부모 class) -> class B (자식 class)
		 * class B extends A (extends : 상속 키워드)
		 * 상속을 받으면 부모의 멤버변수와 메서드 사용가능 (단,접근제한자 private 제외)
		 * 상속받는 자식에게 허용하는 제어자 : 접근제한자 protected
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		A a = new A();
		a.setA(10);
		a.print();
		System.out.println("====================");
		
		B b = new B();
		b.setB(20); //부모 클래스의 A의 b값도 변경이 가능
		System.out.println(b.getB());
		System.out.println("====================");
		
		b.print1();
		System.out.println("====================");
		
		b.num = 100; //protected int num;의 경우) 자식이 직접 접근이 가능한 
		b.print1();
		

	}

}
//부모 클래스
class A {
	private int a, b, c; //자신만 사용 가능
	protected int num; // 상속가능
	
	
	public void print() {
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		System.out.println("num: " + num);
	}
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
}
//자식 클래스
class B extends A { // a, b, c = getter/setter로 접근이 가능 + d, e, f 직접 접근, 사용 가능
	
	private int d, e, f;
	
	//자동으로 print를 하는 방법 : 마우스 우키 - sourse - override 
	//단, print() 라는 같은 이름의 메소드가 없어야함!
	@Override
	public void print() {
		super.print();
	}


	public void print1() {
		super.print(); //super : 부모클래스의 값을 가져올때 사용
		System.out.println("d: " + d + " e: " + e + " f: " + f);
	}

	
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	
	
}