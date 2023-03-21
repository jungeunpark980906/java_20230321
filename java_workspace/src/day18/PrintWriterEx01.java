package day18;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterEx01 {

	public static void main(String[] args) throws IOException {
		// PrinterWriter : 개체의 형식화된 표현을 텍스트 출력 - 스트림으로 출력
		// println, print, printf와 같은 역할
		
		PrintWriter pw = new PrintWriter(System.out);
		
		String str = "Hello";
		pw.print(str);
		pw.println(); // 줄바꿈
		pw.println(str);
		pw.printf("%.2f", Math.PI); //Math.PI = 파이값
		
		pw.flush(); // 잔류바이트 버퍼를 지우는 용도 (메모리공간에 남아있는 정보를 삭제 = clear역할)
		pw.close(); // => flush+close역할이 모두 기본으로 됨.(사실 닫으면 flush가 필요없음)
		
		PrintWriter pw1 = new PrintWriter("test2.txt");
		for(int i=0; i<=10; i++) {
			String data = i+"Test2 입니다";
			pw1.println(data); //알아서 줄을 바꿔서 입력
		}
		pw1.close();

		//추가모드로 파일에 데이터를 추가하고 싶은 경우 -> 파일 객체로 생성해서 추가 (FileWriter 이용)
		PrintWriter pw2 = new PrintWriter(new FileWriter("test2.txt",true));
		for(int i=11; i<=20; i++) {
			String date = i+"Test2 이지롱롱";
			pw2.println(date);
		}
		pw2.append('+'); //append(하나씩 추가)
		pw2.append("추가");
		pw2.close();
		
		
		
		
		
		
		
	}

}
