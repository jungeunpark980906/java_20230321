package product;


public class Product {
	private String Menu;
	private int Price ;
	private int orderCnt;
	
	public Product() {}
	public Product(String menu, int price) {
		super();
		Menu = menu;
		Price = price;
	}
	public Product(String menu, int price, int orderCnt) {
		super();
		Menu = menu;
		Price = price;
		this.orderCnt = orderCnt;
	}
	
	
	
	public String getMenu() {
		return Menu;
	}
	public void setMenu(String menu) {
		Menu = menu;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getOrderCnt() {
		return orderCnt;
	}
	public void setOrderCnt(int orderCnt) {
		this.orderCnt = orderCnt;
	}
	
	
	@Override
	public String toString() {
		return "Product [Menu=" + Menu + ", Price=" + Price + "]";
	}
	
	
	
	

}
