package day17;

public class Customar implements Comparable<Customar> {
	private String name;
	private int age;
	private int price;
	
	public Customar() {}
	public Customar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
//		if(age>=15) {
//			this.price = 100;
//		} else {
//			this.price = 50;
//		}
		this.price = (age >15)? 100 : 50; //삼함연산자 이용
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	@Override
	public int compareTo(Customar o) {
		return this.name.compareTo(o.name);
	}
	
	
	@Override
	public String toString() {
		return name + "(" + age + ") / 비용: " + price;
	}
	
	
	
	

}
