package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderEx02 {

	public static void main(String[] args) throws IOException {
		// BufferedReader, PrintWriter
		// 해당 파일을 읽어들여 복사해 객체생성
		// out.txt에서 파일읽기 -> out2.txt에 적용
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		FileWriter fw = new FileWriter("out2.txt",true);
		//PrintWriter pr = new PrintWriter(System.out);
		
		
		System.out.println("읽어들이는중");
		while(true) {
			String line = br.readLine();
			if(line == null) {
				fw.close();
				break;
			}
			fw.write(line+"\n");
			System.out.println(line);
		}
		br.close();
		
//------------------------------------------------------------------------------------
		
		BufferedReader br1 = null;
		PrintWriter pw1 = null;
		
		final String Path_OUT = "out2.txt";
		System.out.println("읽어들이는중");
		 
		br1= new BufferedReader(new FileReader("out.txt"));
		pw1= new PrintWriter(new FileWriter(Path_OUT));
		
		System.out.println("복사를 위해 객체생성 완료");
		
		String line = "";
		 
		while((line= br1.readLine())!=null){
			System.out.println(line);
			pw1.println(line);
			pw1.write(line+"\r\n");
		}
		
		System.out.println("텍스트 복사 완료");
		
		if(br!=null) {
			br1.close();
		}
		if(pw1 != null) {
			pw1.close();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
