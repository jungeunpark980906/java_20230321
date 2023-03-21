package day18;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_try {

	public static void main(String[] args) {
		//FileWriter 연습용
		
		try {
			FileWriter fw = new FileWriter("연습.txt");
			for(int i=0; i<=10; i++) {
				String data = i+"뿡 \r\n";
				fw.write(data);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
