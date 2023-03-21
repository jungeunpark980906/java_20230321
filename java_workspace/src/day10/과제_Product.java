package day10;

public class 과제_Product {
	//멤버변수
	private String productName;
	private int productPrice;
	

	//생성자
	public 과제_Product() {}
	
	public  과제_Product(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	} //생성자를 이용해서 삽입하는 경우, 삽입메서드 사용할 필요x
	
	//getter,setter
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	//<Method>
	//상품 등록 메서드
	public void insertProduct(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
		
	}
	
	//상품 출력 메서드
	public void print() {
			System.out.println("상품이름: " + productName + " / 상품가격: " + productPrice);
	}
	
	
	
	
	
	
	
	
}
