package day12;

public class 과제 {

	public static void main(String[] args) {
		// TV 세부기능
		//- 채널은 0~10..0123순환
		//- 볼륨은 0~20까지 / 0: "음소거" 출력 / 0미만 20초과x
		
		Tv t = new Tv();
		
		
		try {
		t.powerOn();
		
		t.channelUp();
		t.channelUp();
		t.channelDown();
		
		t.volUp();
		t.volUp();
		
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
	
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		
	}



}
interface remocon{
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
	
	
	
}

class Tv implements remocon{
	private boolean power;
	private int ch;
	private int vol;
	
	
	
	
	@Override
	public void powerOn() {
		System.out.println("전원이 켜졌습니다.");
		power = true;
		
	}

	@Override
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다.");
		power = false;
	}

	@Override
	public void channelUp() {
		if(power) {
			if(ch < 10) {
				ch ++;
			} else {
				ch = 0;
			}
			System.out.println("현재 채널: " + ch);
		}else {
			System.out.println("현재 TV의 전원이 꺼져있습니다.");
		}	
		
	}

	@Override
	public void channelDown() {
		if(power) {
			if(ch > 0) {
				ch --;
			} else {
				ch = 10;
			}
			System.out.println("현재 채널: " + ch);
		} else {
			System.out.println("현재 TV의 전원이 꺼져있습니다.");
		}

	}
	
	@Override
	public void volUp() {
		if(power) {
			if(vol < 20) {
				vol ++;
			} else {
				throw new RuntimeException("최대 볼륨입니다.");
			}
			System.out.println("현재 볼륨: " + vol);
		}else {
			System.out.println("현재 TV의 전원이 꺼져있습니다.");
		}		
	}

	@Override
	public void volDown() {
		if(power) {
			if(vol > 0) {
				vol --;
			} else {
				throw new RuntimeException("음소거입니다.");
			}
			System.out.println("현재 볼륨: " + vol);
		}else {
			System.out.println("현재 TV의 전원이 꺼져있습니다.");
		}		
	}
		
	
	
}