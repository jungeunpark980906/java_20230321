package day18;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {

	public static void main(String[] args) {
		// 한글을 읽고 출력 (여러글자)
		System.out.println("한글로 입력 (enter): ");
		int i;
		
		//InputStreamReader -> 보조스트림
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			while((i=isr.read()) != '\n') {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
