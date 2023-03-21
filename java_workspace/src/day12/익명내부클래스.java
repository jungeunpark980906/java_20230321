package day12;

public class 익명내부클래스 {

	public static void main(String[] args) {
		//지역(local) 내부클래스 => 이름이 사라지면 => 익명(anonymous)클래스

		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		
		
	}

}


class Outer{
	int outNum =10;
	static int sNum = 20;
	
	//예전에는 매개변수와 지역변수는 final이 아니면 선언이 불가능 했음.
	// => 현재는 컴파일에서 자동으로 해줘서 가능.
	Runnable getRunnable(int i) {
	//매개변수와 지역변수는 값이 들어올때 final로 변경되어 들어옴	
		int num = 100;
		//(final)int num = 100; => 예전방식

	
	class MyRunnable implements Runnable{
		int localNum = 1000;
		
		@Override
		public void run() {
			//i =10; //변경은 불가능
			//num = 1;
			
			System.out.println("매개변수: " + i);
			System.out.println("메서드 안 num = " + num);
			System.out.println("클래스 안 localNum = " + localNum);
			
			System.out.println("out클래스 outNum = " + outNum);
			System.out.println("out클래스 static sNum = " + sNum);
			
		}
	
	}
	
	return new MyRunnable();
	}
	
	
	
	
}