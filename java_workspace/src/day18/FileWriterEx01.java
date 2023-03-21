package day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {

	public static void main(String[] args) throws IOException {
		// < 문자 기반 스트림 > 
		
		FileWriter fw = new FileWriter("test.txt"); //try/catch도 가능(파일이 없을 경우대비)
		
		for(int i=0; i<=10; i++) {
			String data = i+"test \r\n";
			//\r\n : 캐리지리턴 (다음줄의 처음위치로 돌아가세요)
			fw.write(data);		
		}
		fw.close();//파일 닫기
		
		
		// + 파일을 추가모드로 열어라 (같은 파일명에 11~20까지 넣기) -> "파일명",true 
		// FileWriter에만 존재하는 기능
		FileWriter fw1 = new FileWriter("test.txt",true); // ,true 추가모드로 열것인가를 boolean으로 확인! 있는 파일에 넣겠습니다
		
		for(int i=11; i<=20; i++) {
			String date = i+"test1 \r\n";
			fw1.write(date);
		}
		fw1.close();
		
		
		
	}

}
