package day10;

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모클래스에서 물려받은 메서드를 재정의하는 것
		 * - 부모 클래스의 메서드와 선언부가 완전히 일치해야함.
		 * - 접근제한자는 같거나 더 넓은 범위를 사용 (범위 축소X)
		 * - 
		 * - 
		 * 
		 * */

		Dog d = new Dog();
		d.info();
		d.howl();
		
		d.setName("댕댕이");
		d.info();
		d.howl();
		
		//Cat c = new Cat(); -> 기본생성자가 없어서 error
		Cat c = new Cat("야옹이","고양이과");
		c.setName("다래");
		c.info();
		c.howl();
		
		Tiger t = new Tiger("호랑이","고양이과");
		t.info();
		t.howl();
		
		
		
		
		
	}

}
class Animal {
	private String name; //이름
	private String category; //종
	
	//생성자
	public Animal() { }
	
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	
	
	
	
	
	//info 메서드
	public void info() {
		System.out.println("===============");
		System.out.println("이름: " + name);
		System.out.println("분류: " + category);
		
	}
	
	//울음소리 메서드
	public void howl() {
		System.out.println("==" + name + " 울음소리==");	
	}

	//getter/setter
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

class Dog extends Animal {

	public Dog() {
		setName("멍멍이");
		setCategory("개과");
//		public void setName(String name) {
//			this.name = name;
//		} => Animal의 setName사용
	}

	@Override
	public void howl() {
		super.howl(); //System.out.println("==" + name + " 울음소리==");
		System.out.println("멍멍!");
	}
	
	
	
	
	
	
	
}

class Cat extends Animal{
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹!");
	}
	
	
	
}

class Tiger extends Animal{
	public Tiger(String name, String category) {
		super(name, category); //생성자 호출
		
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥~!");
	}
	
	
	
	
}