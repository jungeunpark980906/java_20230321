package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		// out.txt 파일을 읽어들여 map에 저장 -> 이름:점수 총합계와 인원수 출력
		
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		
		while(true) {
			String line= br.readLine();
			if(line==null) break;
			
			String name = line.substring(0,line.indexOf(" ")); //(시작번지=포함, 끝번지=미포함)
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
			
		}
		br.close();
		
		
		System.out.println("--학생 정보--");
		//System.out.println(map.entrySet());
		int sum=0;
		int cnt = 0;
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
			sum += map.get(tmp);
			cnt++;
		}
		
		System.out.println("--전체 정보--");
		System.out.println("점수 합계: "+sum);
		System.out.println("학생 수: "+cnt);
		//System.out.println("학생 수: "+map.size());
		System.out.println("학생 평균: "+(double)sum/cnt);
		
		
		

	}

}
