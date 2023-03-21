package day19;

class Bank{
	//계좌의 돈
	private int money = 10000;
	
	// getter,setter
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	//입금
	public synchronized void saveMoney(int save) { //synchronized를 적는 경우) 이 객체에 접근하는 경우, Bank에 접근금지
		int m = this.money;
		try {
			Thread.sleep(3000); //3초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m + save);
		
	}
	
	//출금
	public synchronized void MinusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(200);//0.2초 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m - minus);
	}
		
}

class Hong extends Thread{
	public void run() { //입금
		System.out.println("입금시작");
		SyncMain.myBank.saveMoney(3000); //static이 가장 먼저 만들어져서 바로 가져오기가능
		System.out.println("3천원 입금 후 : " + SyncMain.myBank.getMoney());
	}
}

class HongWife extends Thread{
	public void run() { //출금
		System.out.println("출금시작");
		SyncMain.myBank.MinusMoney(1000);
		System.out.println("1천원 출금 후 : " + SyncMain.myBank.getMoney());
		
	}
}

public class SyncMain {

	public static Bank myBank = new Bank(); //Bank를 공유영역으로 설정 = 하나의 계좌를 함께 사용
	
	public static void main(String[] args) {
		Hong h = new Hong();
		h.start();
		
		HongWife hw = new HongWife();
		hw.start();
	}

}
