package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 맴버변수(private): color, power, speed
		 * 메서드: 호출할 때마다 powerOn => sysout 전원이 켜졌습니다, powerOff => sysout 전원이 꺼졌습니다 (power의 값은 true,false)
		 * 		speedUp => +10, speedDown => -10
		 * 멤버변수 : private = 확인, 수정시 getter.setter
		 * 
		 * */

		
		Car c = new Car("빨강",2); //생성자 public Car (String color)로 초기(기본값)의 색상을 넣어줌

		
		c.print(); //현재 차의 색상을 출력하는 메소드 -> 기본 검정 
		c.setColor("노랑이"); // 노랑으로 색변경
		System.out.println(c.getColor()); //c차의 현재 색을 확인 ( 기본 검정->노랑 )
		
		c.powerOn();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.powerOff();
		c.speedUp(); //시동이 꺼져있다는 안내문자 출력 + speed=0;
		
		
		System.out.println("=======================================================================");
		
		Car c2 = new Car(); //생성자 public Car ()로 기본생성자 null
		System.out.println("다른 자동차 >> ");
		c2.getColor();
		c2.print();
		System.out.println(c2.isPower()); //현재 차의 시동상태를 확인
		System.out.println(c2.getSpeed()); //현재 차의 속도를 확인
		c2.setColor("빨강이"); //c2차의 이름 변경 (기본 검정 -> 빨강이)
		
		c2.powerOn();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedDown();
		c2.speedDown();
		c2.powerOff();
	}

}


class Car {
	
	//멤버변수 선언
	private String color; // null
	private int door;
	private boolean power; //false
	private int speed; //0
	
	//생성자 위치 (멤버변수 선언 뒤)
	//생성자 : 생성자를 안넣는 경우 자동으로 기본생성자가 추가됨
	
	public Car (String color) {
		this.color = color;
	}
	
	
	public Car (String color, int door) {
		this.color = color;
		//this(color);  -> 위의 생성자를 가져옴(생성자 호출) 단! 호출하는 생성자는 앞에 있어야함
		this.door = door;
	}
	public Car () {	} //기본생성자 => 생성자를 만드는 경우 기본적으로 세팅
	//생성자 오버로딩(여러개의 생성자 생성)
	
	
	
	
	
	
	//getter,setter
	public String getColor () {
		return color;
	}
	
	public void setColor (String color) {
		this.color = color; // 내 멤버변수 color을 외부에서 받은 color로 변경해조
	}
	
	
	public boolean isPower() { //boolean은 자동으로 get->is로 변경
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	//자동으로 찍는 방법 : 마우스 우클릭 => sourse => generate getter/setter
	
	
	
	//차의 색을 찍는 print 메서드
	public void print() {
		System.out.println(color);
	}
	
	
	
	//power,speed 메서드
	public void powerOn( ) {
			System.out.println(color + "차의 시동이 켜졌습니다");
			power = true;
	}
	
	public void powerOff() {
		System.out.println(color + "차의 전원이 꺼졌습니다");
		power = false;
	}
	
	
	
	public void speedUp() {
		
		if(power) { // power은 멤버변수로 따로 불러오지않아도 바로 사용가능!!
			speed += 10;
			System.out.println( color +"속도+10. 현재 속도: " + speed );
		} else {
			System.out.println(color + "차의 시동이 꺼져있습니다. 시동을 켜주세요");
		}
		
		
	}
	
	public void speedDown() {
	
		if( speed > 0 ) {
		speed -= 10;
		//System.out.println("속도-10. 현재 속도: " + speed );
		} else {
			speed = 0;
			//System.out.println("속도가 0으로 멈춰있습니다.");
		}
	
		System.out.println(color + "차 속도 : " + ((speed<=0)? 0 : speed)); //삼항연산자를 사용해서 속도 표현
	}
	
	
}