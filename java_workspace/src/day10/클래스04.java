	package day10;

public class 클래스04 {

	public static void main(String[] args) {
		// Car class의 메인

		Car c = new Car("black", 4, true); //생성자를 이용해 기본값 설정
		
		c.powerOn();
		
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		c.powerOff();
		c.speedUp();
		
		c.print();
		
		Car c2 = new Car("red", 2, false);
		c2.print();
		
		System.out.println(c2.toString());
		//print메소드를 만들지 않아도 현재값을 알 수 있음.
		// 단, toString사용시 없는경우 : System.out.println(c2.toString()); -> 주소 출력
		
		
		
		
		
	}

}
 class Car{
	 //멤버변수 : color door airback power speed
	 private String color;
	 private int door;
	 private boolean airback;
	 private int speed;
	 private boolean power;
	 
	 //생성자 : 빈 생성자, color만 넣는 생성자, (color,door) , (color,door, airback) , 전체
	 public Car() {}
	 public Car(String color) { //set과 동일 의미
		 this.color = color;
	 }
	 public Car(String color, int door) {
		 this.color = color;
		 this.door = door;
	 }
	 public Car(String color, int door, boolean airback) {
		 //내class에서 생성자 호출
		 //단, 호출시 모든 생성자를 가져와야 호출이 가능
		 this(color, door);
		 this.airback = airback;
	 }
	
	 	//자동으로 생성자 만들기
	 	//오른쪽 마우스 - sourse - generate constructor using fields..
	 public Car(String color, int door, boolean airback, int speed, boolean power) {
		//super(); //부모의 생성자를 호출하는 경우 사용
		this.color = color;
		this.door = door;
		this.airback = airback;
		this.speed = speed;
		this.power = power;
	}
	 
	 
	 
	 
	 //메서드 : print, powerOn, powerOff, speedUp, speedDown
	 //멤버변수는 매개변수로 받을 필요가 없음
	 public void print() {
		 System.out.println("==========My Car==========");
		 System.out.println("차의 색: " + color);
		 System.out.println("차의 문 개수: " + door);
		 System.out.println("차의 에어백 창착/미장착: " + airback);
		 System.out.println("차의 시동상태: " + power);
		 System.out.println("차의 속도: " + speed);
		 System.out.println("==========================");
		 
	 }
	 
	 //자동으로 멤버변수들을 출력해주는 메소드 (해당값을 한줄로 출력)
	 //마우스 우키 - sourse - tostring
	 
	 @Override
	 public String toString() {
		 return "Car [color=" + color + ", door=" + door + ", airback=" + airback + "]";
	 } //String으로 반환하므로 sysout과 동일 //main에서 출력시 sysout이 필요
	 
	 
	 public void powerOn() {
		 System.out.println("차의 시동이 켜졌습니다.");
		 power = true;
	 }
	public void powerOff() {
		 System.out.println("차의 시동이 꺼졌습니다.");
		 power = false;
	 }
	 public void speedUp() {
		 if(power) {
			 speed += 10;
			 System.out.println("속도 +10, 현재속도: " + speed);
		 } else {
			 System.out.println("현재 차의 시동이 꺼져있습니다. 시동을 켜주세요");
		 }
	 }
	 public void speedDown() {
		 if(speed > 0) {
			 speed -= 10;
			 System.out.println("속도 -10, 현재속도: " + speed);
		 } else {
			 speed = 0;
			 System.out.println("차의 속도가 0입니다.");
		 }
	 }
	 
	 
	 
	 
	 //getter,setter
	 	//절대 변경하면 안되는 경우 setter을 만들지x 
	 public String getColor() {
		 return color;
	 }
	 public void setColor(String color) {
		 this.color = color;
	 }
	 public int getDoor() {
		 return door;
	 }
	 public void setDoor(int door) {
		 this.door = door;
	 }
	 public boolean isAirback() {
		 return airback;
	 }
	 public void setAirback(boolean airback) {
		 this.airback = airback;
	 }
	 public int getSpeed() {
		 return speed;
	 }
	 public void setSpeed(int speed) {
		 this.speed = speed;
	 }
	 public boolean isPower() {
		 return power;
	 }
	 public void setPower(boolean power) {
		 this.power = power;
	 }
	 
	 
	 
 }