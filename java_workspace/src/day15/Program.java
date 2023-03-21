package day15;

import java.util.Scanner;

public interface Program {
		// 수강관리 프로그램
			// 인터페이스 : 1-5 메뉴
			//1. 학생리스트 출력 2.학생등록 3.학생검색 4.수강신청 5.수강철회
	void printStudent(); //학생 전체 리스트
	void printStudent(Student[] list);
	void insertStudent(Scanner scan); // 스케너로 입력를 받아 사용하겠습니다.
	void searchStudent(Scanner scan);
	void reisterSubject(Scanner scan);
	void deleteSubject(Scanner scan);
}
