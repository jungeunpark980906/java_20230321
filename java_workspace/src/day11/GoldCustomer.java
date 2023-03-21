package day11;

public class GoldCustomer extends Customer {

	
	//생성자
	double saleRatio;
	
	
	//할인율
	public GoldCustomer() {}
	public GoldCustomer(String name, int id) {
		super(name,id);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price*saleRatio);
	}
	
	
	
	
	
	
	
}
