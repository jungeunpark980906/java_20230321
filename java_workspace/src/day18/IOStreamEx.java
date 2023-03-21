package day18;

import java.io.IOException;

public class IOStreamEx {

	public static void main(String[] args) {
		/* 자바(프로그래밍언어)는 입력스트림,출력스트림을 통해 데이터를 입출력함.
		 * 스트림 : 단방향으로 데이터가 흘러가는 형태
		 * 다양한 입출력 장치에 의해 입출력이 이루어짐
		 * 다양한 장치에 독립적으로 일관성있는 입출력을 유지하기위해 입출력스트림을 통해 일관성을 제공
		 * 
		 * 두 가지 형태의 스트림 구분
		 * 1.바이트 형태의 스트림 : 기본형 (문자, 그림, 멀티미디어)
		 * 2.문자 형태의 스트림 : 문자만 입출력하는 경우 사용
		 * 
		 * 한글 가 = 2바이트, 영어 a = 1바이트
		 * 
		 * - 바이트스트림 p.781
		 * 1. 입력 : InputStream : fileInputStream, ButteredInputStream, DataInputStream
		 * 2. 출력 : OutputStream :  fileOutputStream, ButteredOutputStream, DataOutputStream
		 * - 문자스트림
		 * 1.입력: Reader : FileReader, BufferedReader, InputStreamReader
		 * 2.출력: Writer : FileWriter, PrintWriter, BufferedWriter
		 * 
		 * - 기반스트림 / 보조스트림
		 * 1. 기반 스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * 2. 보조 스트림 : 직접 읽고 쓰는 기능은 없지만 추가적인 기능을 더해주는 스트림
		 * 
		 * - 기반스트림 ex) fileInputStream, fileOutputStream, FileReader, FileWriter
		 * - 보조스트림 ex) InputStreamReader, BufferedReader, BufferedWriter,  ButteredOutputStream
		 * 
		 * 
		 * */
		//표준 출력(모니터=콘솔) 스트림
		System.out.println();
		
		//표준 입력(키보드) 스트림
		//int d = System.in.read(); //한바이트 읽기 -> 오류(try/catch)사용하기
		try {
			int a = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		//표준 에러 출력(모니터) 스트림
		System.err.println();
		
		
		

	}

}
