package day19;

public class ThreadEx02 {

	public static void main(String[] args) {
		// 2. Runnabke을 구현해 사용하는 방법
		
		//2-1.사용방법
		MyThread2 mth = new MyThread2();
		Thread th1 = new Thread(mth);
		
		th1.start();
		
		//순차적으로 수행하도록 만들기
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		//2-2.사용방법
		Thread th2 = new Thread(new MyThread());
		
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 끝!");
	}

}


class MyThread2 implements Runnable{

	@Override
	public void run() {
		// 반드시 run()을 구현 (=1.상속과 동일)
		for(int i=0; i<=200; i++) {
			System.out.println(i + "번째" + Thread.currentThread().getName());
		}
		
	}
	
}