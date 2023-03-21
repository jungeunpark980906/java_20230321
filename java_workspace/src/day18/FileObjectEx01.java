package day18;

import java.io.File;
import java.util.StringTokenizer;

public class FileObjectEx01 {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보를 출력
		// D:\워크스페이스\java_workspace\\out.txt (파일경로)
		File f = new File("D:\\워크스페이스\\java_workspace\\out.txt");
		
		String fileName = f.getName();
		System.out.println(fileName); //only 파일명
		
		
		System.out.println(f.getPath()); //경로+파일명
		System.out.println(f.getAbsolutePath()); //절대 경로+파일명
		
		System.out.println(f.getParent()); //only 경로
		
		System.out.println(File.separator); //파일 구분자 -> \ (가장 많이 사용)
		System.out.println(File.pathSeparator);
		
		//시스템에서 알아낸 사용자 파일의 경로를 분리해보기
		
		String fstr = f.toString(); //해당경로+파일명
		System.out.println(fstr);
		//드라이브만 추출
		System.out.println(fstr.substring(0, 1)); 
		System.out.println(fstr.substring(0,fstr.indexOf(File.separator)-1));
		//파일명만 추출
		System.out.println(fstr.substring(fstr.indexOf(fileName)));
		System.out.println(fstr.substring(fstr.lastIndexOf(File.separator)+1));
		//파일경로만 추출
		System.out.println(fstr.substring(fstr.indexOf(File.separator)+1, fstr.lastIndexOf(File.separator)));
		
		//파일명과 확장자 분리추출
		System.out.println(f.getName());
		String[] str = f.getName().split(File.separator+".");
		System.out.println("파일명: "+str[0]);
		System.out.println("확장자: "+str[1]);
		
		//StringTokenizer 클래스 사용
		//각각의 값을 분리
		StringTokenizer stk = new StringTokenizer(f.getName(),".");
		while(stk.hasMoreElements()) { //토큰 요소에 값이 있다면 true리턴
			System.out.println(stk.nextElement());
		}
		
		
	}

}
