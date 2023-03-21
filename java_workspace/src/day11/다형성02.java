package day11;

public class 다형성02 {

	/* 객체지향 프로그램의 4가지 특징
	 * 객체지향프로그램 : 프로그램을 독립된 단위 객체들을 모아서 처리하는 모임
	 * - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리함(리턴,매개변수)
	 * 
	 * <특징>
	 * 1. 추상화 (Abstraction)
	 * 	- 핵심적인 코드만 보여주기
	 * 	- 인터페이스와 구현을 분리
	 * 	- 불필요한 부분을 숨김
	 * 
	 * 2. 캡슐화(Encapsulation)
	 * 	- 데이터 보호 (정보은닉) // 정처기에서 필수문제
	 * 	- 멤버변수(필드)와 메서드를 하나로 묶는 것
	 * 	- 멤버변수(필드)는 숨기고 메서드로 접근하도록 함
	 * 	- 은닉화: 객체의 내부 정보는 숨겨서 외부로 드러나지 못하게해 외부에서 데이터에 직접 접근X
	 * 
	 * 3. 상속(Inheritance)
	 * 	- 코드 재사용(확장)
	 * 	- 클래스를 상속받아 수정하여 사용하게 되면 중복코드를 줄일 수 있음
	 * 
	 * 4. 다형성(Polymorphism)
	 * 	- 객체 변경 용이
	 * 	- 하나의 코드가 여러 자료형으로 구현되어 실행
	 * 	- 같은 코드 -> 여러 다른 실행결과
	 * 	- 다형성을 잘 활용하면 유연하고, 정확성있는, 유지보수가 편리한 프로그램을 만들 수 있음
	 * 
	 *
	 * */
	
	public static void main(String[] args) {
		/* 다형성(polymorphism) : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
		 * 같은 코드 -> 여러 다른 실행결과를 얻을 수 있음
		 * 다형성을 잘 활용하면 유연하고, 정확성있는, 유지보수가 편리한 프로그램을 만들 수 있음
		 * 
		 * */
	
		
		
	//<업캐스팅>	
		Animal1 hAnimal = new Human(); //Human객체를 Animal의 기준으로 생성
		Animal1 tAnimal = new Tiger1(); //자식객체를 부모객체의 기준으로 생성
		Animal1 eAnimal = new Eagle(); 

//==========================================================================
	//<다운캐스팅>
		
		//hAnimal.read는 호출이 x
		//hAnumal이 Animal1으로 부모변수로 생성되었기때문에 -> Animal1이 가지고 있는 것만 가져오기(오버라이딩 가능)
		
		//해결: 다운라이딩 (instanceof를 사용하여 나의 부모가 누구인지 알아보고 다운캐스팅 진행)
		//( hAnimal(객체명) instanceof Human(변환하려고 하는 클래스명) )
		if(hAnimal instanceof Human) { //형변환이 가능하다면 true = 아래 작업 실행
			Human human = (Human)/*원래는 이거였어!*/ hAnimal; //변경
			human.read();//원하는 호출 실행
			
		}
		
		Animal1[] AnimalList = new Animal1[10]; 
		
		int cnt=0;
		AnimalList[cnt] = hAnimal;
		cnt++;
		AnimalList[cnt] = tAnimal;
		cnt++;
		AnimalList[cnt] = eAnimal;
		cnt++;
		
		//1. 메소드를 static으로 만드는 경우
		testDownCasting(AnimalList, cnt);
		
//=============================================================================
		다형성02 test = new 다형성02();
		test.moveAnimal(eAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(hAnimal);
		
		//2.(메소드 static X) class명으로 새로 생성 -> 호출하는 경우
		test.testDownCasting(AnimalList, cnt);
		
		
		

	}
	//<Method>
	//다형성을 실행하는 메서드
	public void moveAnimal(Animal1 animal) {
		animal.move();
	}
	
	
	
	
	//다운캐스팅 메서드
	public static void testDownCasting(Animal1[] list ,int cnt) {
		for(int i=0; i<cnt; i++) {
			if(list[i] instanceof Human) {
				Human h = (Human)list[i]; //업캐스팅으로 못쓰는 메소드를 사용하기 위해 다운캐스팅 실행
				h.read();
			}
			if(list[i] instanceof Tiger1) {
				Tiger1 t = (Tiger1)list[i];
				t.hunting();
			}
			if(list[i] instanceof Eagle) {
				Eagle e = (Eagle)list[i];
				e.flying();
			}
		}
		
	}
	
	
	
	
	

}
class Animal1{
	
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
		
}
class Human extends Animal1 {

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}//부모에게서 물려받은 것 (오버라이드)
	public void read() {
		System.out.println("사람이 공부를 합니다.");
	}//각 개인적으로 가지고 있는 것
	
}

class Tiger1 extends Animal1 {
	
	public void move() {
		System.out.println("호랑이가 어슬렁 거립니다.");
	}
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
	
}

class Eagle extends Animal1 {
	
	public void move() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 두 날개를 폅니다.");
	}
	
}


