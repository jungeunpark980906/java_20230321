package day18;

import java.io.IOException;

public class SystemInEx01 {

	public static void main(String[] args) {
		
		// 알파벳 하나를 쓰고 enter을 누르면 알파벳을 콘솔에 출력 (Scanner사용x)
		System.out.println("알파벳 하나를 입력하고 Enter: ");
		int i;
		try {
			i = System.in.read(); //read() : 하나의 바이트 값만 받을수있음
			System.out.println(i); //i의 아스키코드값
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//알파벳 여러개를 쓰고 enter을 누리면 알파벳을 하나씩 콘솔에 출력 (read()사용)
		System.out.println("알파벳 여러개를 입력하고 Enter: ");
		int h;
		try {
			while((h=System.in.read()) != '\n') { //enter치기 전까지 while문
				System.out.println((char)h);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
