package day11;

public class VIPCustomer extends Customer{

	//생성자
	double saleRatio;
	//String counselor;
	private int agentId;
	
	
	
	
	//할인율
	public VIPCustomer () {}
	public VIPCustomer(String name, int id, int agentid) {
		super(name,id);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		//counselor = "정은";
		this.agentId = agentid;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("담당 상담원 번호는 " + agentId + "입니다.");
	}
	public int getAgentId() {
		return agentId;
	}
	
	
	

	
}
