package day11;

public class 추상클래스01 {

	public static void main(String[] args) {
		/* <추상메서드>
		 * 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스: 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)
		 * 			- 미완성 클래스라 객체를 생성할 수 없음
		 * 
		 * abstract : 이는 미완성이니 객체가 없어도 오류x
		 * 			- 클래스나 메서드의 앞에 위치
		 * abstract 리턴타입 메서드명 (매개변수);
		 * 			- 부모 클래스에서 상속받았을 경우, 특정메서드가 자식 클래스에 자주 오버라이딩될때
		 * 				해당메서드를 추상 메서드로 작성
		 * 			- 상속을 받은 클래스에서는 추상메서드가 있다면 반드시 구현해야 함
		 */
		
		Dog d =new Dog("멍멍이","개과");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("다래","고양이과");
		c.printInfo();
		c.howl();
		
		Tiger t = new Tiger("호랭우이","고양이과");
		t.printInfo();
		t.howl();
		
		//추상클래스는 객체 생성이 불가능
		

	}

}
//Animal 클래스 = 추상클래스
abstract class Animal{ //package가 다르기 때문에 Animal사용 가능
	private String name;
	private String category;
	
	public void printInfo() {
		System.out.println("==========");
		System.out.println("이름: " + name);
		System.out.println("분류: " + category);
	}
	
	abstract public void howl(); //추상메서드 -> 사용시 클래스도 추상클래스여야함 -> abstract class Animal
									//interface는 추상메서드라는 의미를 담고 있어서 abstract를 붙이지 않아도 추상으로 인식


	
	//setter,getter
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
}



//추상 클래스 Animal을 상속 받는 class
//추상 클래스를 상속받는 자식 메서드는 반드시 추상메서드를 구현해야함! (단, 자식클래스가 추상일 경우x)
class Dog extends Animal{

	public Dog() {}
	public Dog (String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	
	@Override
	public void howl() {
		System.out.println("멍멍!");
		
	}
	
	
}	
class Cat extends Animal{
	
	public Cat (String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	
	@Override
	public void howl() {
		System.out.println("야옹!");
		
	}
	
	
}

class Tiger extends Animal{
	
	public Tiger (String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	
	@Override
	public void howl() {
		System.out.println("어흥!");
		
	}
	
	
}
	
	
	
	
	
