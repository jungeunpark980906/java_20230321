package day11;

import java.io.FileInputStream;
import java.util.Scanner;

public class 과제 {


	public static void main(String[] args) {
		/* 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 생성
		 * (파일명.확장자)를 5개 받음
		 * 입력받은 파일 중에 (.jpg .png .gif .jpeg )파일 형식을 찾아 출력하는 코드
		 * String[] fileName = {"java.txt","String.jpg","method.png","strind.png","java.pdf"}
		 * 
		 * ==이미지 파일==
		 * "String.jpg"
		 * "method.png"
		 * 
		 * 
		 * */

		String[] file = new String[5];
		String[] img = {"jpg","png","gif","jpeg"};
		fileIn(file);
		
		print(file);
		
		scan(file, img);
		
//		//파일명에서 확장자만 분리하는 방법
//		String[] fileName = {"java.txt","String.jpg","method.png","strind.png","java.pdf"};
//		String search = fileName[2].substring(fileName[2].indexOf(".")+1);
//		System.out.println(search);
//		
//		for(String tmpFile :fileName) {
//			String search = tmpFile.substring(tmpFile.indexOf(".")+1);
//			if(isContains(img,search))
//		}
	
		
	}
	//<메소드>
	//문자열을 입력받아 배열에 넣는 메소드
	public static String[] fileIn(String arr[]) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			System.out.println("파일을 입력해주세요: ");
			arr[i] = scan.next();
		}	
		scan.close();
		return arr;
		
	}	
//	
//	//배열에서 찾는 문자열이 있는지 체크, 있으면 true
//	public static boolean isContains(String arr[], String search) {
//		//배열이 없는 경우
//		if(arr==null || arr.length == 0)
//			return false;
//		} 
//		if (search == null) {
//			return false;
//		}
//		for(String tmp : arr) {
//			if(tmp.equals(search));
//			return true;
//		}
//
//	}
		
	//전체 파일 프린트 메소드
	public static void print(String arr[]) {
		System.out.println("=====현재 입력된 전체 파일=====");
		for(String tmp : arr) {
			System.out.println(tmp+ " ");
		}
		
	}
	
	//확장자를 찾는 메소드
	public static void scan(String file[], String img[]) {

		
		int cnt = 0;
		char ch;
		
		System.out.println("=====확장자가 포함된 파일=====");
		for (int i=0; i<file.length; i++) {
			for(int j=0; j<img.length; j++) {
				if (file[i].contains(img[j])) {
				System.out.println(file[i]);
				cnt++;
				}
			}
		}
			
		
		if (cnt == 0) {
			System.out.println("찾으시는 확장자를 포함한 파일이 없습니다.");
		}

	}
	
	
	
	
	
	
	
}
