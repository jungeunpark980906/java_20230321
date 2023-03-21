package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferedReaderEx01 {

	public static void main(String[] args) throws IOException {
		// BufferedReader : 문자 기반 보조스트림
		//Buffered가 들어가면 보조스트림
		//1. 라인단위로 읽기가 가능한 기능
		//2. 더 이상 읽을 라인이 없는 경우, null을 리턴
		//3. 보조스트림을 사용할 경우 생성자에 기반 스트림을 매개변수로 꼭 포함!!
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		while(true) {
			String line = br.readLine(); //한 라인씩 읽어들임
			if(line == null) { //더이상 읽을 라인이 없는 경우
				break; 
			}
			 System.out.println(line);
		}
		br.close();
		
		System.out.println("----------------");
		System.out.println("파일이 같은 java_workspace에 있지 않는경우 > ");
		
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\EZENIC-172\\Downloads\\input.txt"));
		//파일이 같은 java_workspace에 있지 않는경우, 파일 위치\\파일명.txt
		while(true) {
			String line = br1.readLine(); //한 라인씩 읽어들임
			if(line == null) { //더이상 읽을 라인이 없는 경우
				break; 
			}
			System.out.println(line);
		}
		br1.close();
		
		
		
		
		
	}

}
