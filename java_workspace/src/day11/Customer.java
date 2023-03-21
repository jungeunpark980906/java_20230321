package day11;

public class Customer {
	/* 일반 고객 / Gold 고객 / VIP 고객
	 * 
	 * 고객 ID : customerID
	 * 고객 이름 : customerName
	 * 고객 등급 : customerGrade
	 * 보너스 포인트 (적립금) : bonusPoint
	 * 보너스 포인트 적립 비율 : bonusRatio
	 * 
	 * 상속에 맞게 멤버변수를 설정
	 * 
	 * - Customer 객체생성자
	 * 기본 customerGrade : Silver 
	 * 기본 bonusRatio : 0.01
	 * 
	 * - Gold 등급
	 * 제품을 구매하는 경우 10%의 할인 / 보너스 포인트 2% 적립
	 * (할인에 관한 값 추가 표현)
	 * 
	 * 
	 * - VIP 등급
	 * 제품을 구매하는 경우 10%의 할인 / 보너스는 5% 적립
	 * 전담상담사(담당자)를 배정
	 * 
	 * 
	 * 
	 * - 메서드
	 * 1.보너스 적립 계산 메서드(메서드명 : calcPrice(int price))
	 * 	= 구매금액을 주고, 적립 보너스를 계산 bonusPoint 에 누적
	 *  = 할인여부를 체크하여 구매 price에 리턴
	 * 2.출력 메서드 (메서드명 : customerInfo)
	 *  = 홍길동 님의 등급은 VIP이며, 보너스 포인트는 1000입니다.
	 * 
	 * */
	
	//멤버변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio; //포인트적립비율
	
	//생성자
	public Customer() {} //상속받는 class들이 사용하게 편하도록 항상 기본생성자 생성!!
	
	public Customer (String name, int id) {
		customerName = name;
		customerID = id;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	
	
	//getter,setter
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	//<메서드>
	// 1.보너스 적립 계산 메서드(메서드명 : calcPrice(int price))
	//	= 구매금액을 주고, 적립 보너스를 계산 bonusPoint 에 누적
	//	= 할인여부를 체크하여 구매 price에 리턴
	public int calcPrice (int price) {
		 bonusPoint += (int)(price * bonusRatio);
		 return price;
	}
	
	
	// 2.출력 메서드 (메서드명 : customerInfo)
	//  = 홍길동 님의 등급은 VIP이며, 보너스 포인트는 1000입니다.
	public void customerInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, ");
		System.out.print("보너스 포인트는 " + bonusPoint + "입니다.");
	}
	
	
	
}


