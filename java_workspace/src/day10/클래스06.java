package day10;

public class 클래스06 {

	public static void main(String[] args) {
		/* final : 클래스, 변수, 메서드에 붙일 수 있음
		 * final은 수정이 불가한 상수
		 *
		 * final 멤버 변수 : 상수 (수정 불가)
		 * final 멤버 메서드 : 오버라이딩(@Overriding) 불가능 = (타인이 만든 메서드를 내 마음대로 바꿔 재사용하는 것)
		 * final 클래스 : 상속 불가능 + 부모 클래스 불가능
		 * 
		 * 
		 * */
		
		//1. 생성자 이용
		EzenStudent e = new EzenStudent("인천", "박정은", "1반", "01033089260");
		
		//2. setter이용
		EzenStudent e2 = new EzenStudent();
		e2.setBan("2반");
		e2.setName("박희은");
		e2.setNumber("01055089260");
		e2.setPlace("인천");
		
		e.print();
		e2.print();
		
		
		
		
		
		
		
	}

}
/* 초기화 방법 
 * 1. 기본값 
 * 2. 명시적 초기값 : 멤버변수 선언과 동시에 초기값 지정
 * 				private String place = "인천";
 *				- private static String place; => 모든 사람이 사용
 *				- private final static String place; => 모든 사람이 사용 + 상수로 적용(변경 불가)
 * 3. 초기화 블럭 : { } 맴버변수 초기화
 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
 * 
 * 	우선순위: 기본값 -> 명시적 초기값 -> 초기화 블럭 -> 생성자 (가장 우선적용)
 * 
 * 
 * */







//멤버변수 : 지점, 이름, 반, 전화번호
//메서드 : 출력(print메서드, tostring가능)


class EzenStudent{
	
	private String place;
	private String name;
	private String ban;
	private String number;
	//연산이 되어야하는 경우에 int사용
	{
		ban = "미정"; //초기화 블럭 =  멤버변수들을 초기화
	}
	
	public EzenStudent() {}
	public EzenStudent(String place, String name, String ban, String number) {
		//super();
		this.place = place;
		this.name = name;
		this.ban = ban;
		this.number = number;
	}

	
	public void print() {
		System.out.println("=============Student==============");
		System.out.println("위치: " + place);
		System.out.println("이름: " + name);
		System.out.println("반: " + ban);
		System.out.println("전화번호: " + number);
		System.out.println("==================================");
		
	}

//	@Override
//	public String toString() {
//		return "EzenStudent [place=" + place + ", name=" + name + ", ban=" + ban + ", number=" + number + "]";
//	}
	
	
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}






	




	
	
	
	
	
	
	
}
