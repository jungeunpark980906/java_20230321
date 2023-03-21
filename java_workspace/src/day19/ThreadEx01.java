package day19;

public class ThreadEx01 {

	public static void main(String[] args) {
		/* Thread(쓰레드) : 
		 * - 실행중인 프로그램(process)이 OS(운영체제)로부터 메모리를 할당받아 process 상태가 됨 
		 * - 하나의 프로세스는 하나 이상의 Thread를 가지게 되고, 실제 작업을 수행하는 단위는 Thread 단위
		 * - thread 단위는 실제 CPU가 처리하는 단위
		 * 
		 * - multi=thread : 여러 thread가 동시에 수행되는 프로그래밍
		 * - CPU는 시간을 잘게 쪼개서 thread를 수행하면 사용자들은 동시에 처리하는 듯한 효과를 받음
		 * - thread는 각각 자신만의 작업 공간을 가짐(context)
		 * 
		 * - 각 thread 사이에 공유하는 자원이 있을 수 있음
		 * (자바에서는 static instance)
		 * - 여러 thread들이 공유하는 자원 중 경쟁이 발생하는 부분 = 붕괴영역 critical section
		 * - critical section에 대한 동기화(동기화=순차적 수행)을 구현하여 오류를 방지 : .join()
		 * 
		 * thread 구현방식
		 * 1. 상속(extends Thread)
		 * 2. 구현(implements Runnable)
		 * - 모두 run()메서드 구현 필요
		 * */
		System.out.println(Thread.currentThread());//현재 실행중인 thread
		
		MyThread th = new MyThread();
		th.start(); //run()이 실행
		
		MyThread th2 = new MyThread();
		th2.start();
		
		
		
		
	}

}

//1.Thread 클래스를 상속해 실행하는 방법

class MyThread extends Thread{
	//Thread상속시 반드시 run() 메서드 구현필요
	public void run() { //내가 이 thread를 불렀을경우 하는 일
		for(int i=0; i<=200; i++) {
			System.out.println(i + "번째" + getName());//getName()=thread의 이름
		}
	}
}
