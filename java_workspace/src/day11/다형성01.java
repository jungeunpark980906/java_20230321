package day11;

public class 다형성01 {

	public static void main(String[] args) {
		/* 모든 클래스의 최고 조상은 Object class
		 * 모든 클래스는 Object가 제공하는 클래스를 사용할 수 있고, 오버라이딩 할 수 있음
		 * 
		 * 상속은 단일 상속이 원칙! only 부모는 하나
		 * 
		 * 
		 * 
		 * */

		
		A a = new A();
		a.num = 10;
		System.out.println(a);
		
		
		
		A b = new B(0);
		b.num = 20;
		System.out.println(b);
		
		
		
		
		
		
		
	}

}
class A{
	int num;

	@Override
	public String toString() {
		return "A [num="+ num +"]";
	}
	
}	
class B extends A {
	public B(int num) {
		super.num=num;
	}
	
}
	
//class C extends B extends A => 불가능
	
	
