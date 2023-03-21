package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception06 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
//		try {
			String name = br.readLine();
			System.out.println(name);
			br.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
			
			
			//현재보이는 거는 try-catch를 열지않은 경우
			//throws IOException 사용 없이 try-catch사용도 가능

	}

}
