package day11;

public class CustomerMain {

	public static void main(String[] args) {
	
		
		Customer[] customerList = new Customer[10];
		//< 업캐스팅 >  => 묵시적인 형변환이 가능
		
		Customer c = new Customer("강아지",1234);
		Customer g = new GoldCustomer("고양이",4567);
		Customer v = new VIPCustomer("판다",8910,111);
		
		int cnt = 0;
		customerList[cnt] = c;
		cnt++;
		customerList[cnt] = g;
		cnt++;
		customerList[cnt] = v;
		cnt++;
		
		//< 다운캐스팅 > => 반드시 명시적으로 형변환을 해주어야함!
		//System.out.println(v.getAgentId); -> 바로 가져오기 불가능
		
		VIPCustomer vCostomer = (VIPCustomer) v;
		System.out.println(vCostomer.getAgentId());
		
//==============================================================================		
		
//		//< instanceod > : 원래 인스턴스의 형이 맞는지 여부를 체크하는 명령어
//		//맞으면 true, 아니면 false 출력
//		//어떤 형태로 형변환을 해야하는지 알아보는 용도
//		//System.out.println(vCostomer.saleRatio);
//		
//		if(v instanceof VIPCustomer ) {
//			
//			VIPCustomer vCostomer1 =(VIPCustomer) v;
//			System.out.println(VIPCustomer.getAgentId);
//			
//		} else if (v instanceof GoldCustomer) {
//			
//			GoldCustomer vCostomer1 =(GoldCustomer) v;
//			System.out.println(vCustomer.getSaleRatio);
//			
//		} else {
//			System.out.println("error!");
//		}
//		
		
		
//================================================================================	
		
		
		System.out.println("=====고객정보 출력=====");
		//고객정보출력
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println();
		}
		
		System.out.println("=====할인율과 포인트 계산=====");
		int price = 10000;
		
		for(int i=0; i<cnt; i++) {
			System.out.println(customerList[i].getCustomerName() + "님이 지불하실 금액은 "
					+ customerList[i].calcPrice(price) + "입니다.");
			System.out.println(customerList[i].getCustomerName() + "님의 포인트는 "
					+ customerList[i].bonusPoint + "입니다." );
			System.out.println();
		}
		
		
		
		
		
//		Customer c = new Customer("강아지",1234);
//		c.calcPrice(10000);
//		c.customerInfo();
//		System.out.println();
//		c.calcPrice(10000);
//		c.customerInfo();
//		
//		System.out.println();
//		System.out.println("=======================");
//		
//		Customer g = new GoldCustomer("고양이",4567);
//		g.calcPrice(10000);
//		g.customerInfo();		
//		System.out.println();
//		System.out.println("=======================");
//		
//		Customer v = new VIPCustomer("판다",8910,111);
//		v.calcPrice(10000);
//		v.customerInfo();
//		
//		
//		
//	//========================================================================================	
//		
//		System.out.println();
//		System.out.println("=====할인율과 포인트 계산=====");
//		
//		int price = 10000;
//		int cost = c.calcPrice(price);
//		
//		System.out.println(c.getCustomerName() + "님이 지불하실 금액은 "+ cost + "입니다.");
//		System.out.println(c.getCustomerName() + "님의 포인트는 " + c.bonusPoint + "입니다.");
//		
//		System.out.println();
//		System.out.println("=======================");
//		
//		int cost1 = g.calcPrice(price);
//		
//		System.out.println(g.getCustomerName() + "님이 지불하실 금액은 "+ cost1 + "입니다.");
//		System.out.println(g.getCustomerName() + "님의 포인트는 " + g.bonusPoint + "입니다.");
//		
//
//		System.out.println();
//		System.out.println("=======================");
//		
//		int cost2 = v.calcPrice(price);
//		
//		System.out.println(v.getCustomerName() + "님의 지불하실 금액은 " + cost2 + "입니다.");
//		System.out.println(v.getCustomerName() + "님의 포인트는 " + v.bonusPoint + "입니다.");
//		//System.out.println(v.getCustomerName() + "님의 전담상담사는 " + v.counselor + "입니다.");
//		v.customerInfo();
//		
//		
	}

}
