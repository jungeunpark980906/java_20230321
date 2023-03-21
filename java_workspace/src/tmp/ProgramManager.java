package tmp;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramManager implements Program{
	ArrayList<Student> stdList = new ArrayList<>();
	Student std = new Student();
	@Override //모든 학생의 기본정보 출력
	public void printStudent() {
		for(Student tmp : stdList) {
			System.out.println(tmp);
		}	
	}

	@Override //학생등록
	public void insertStudent(Scanner scan) {
		System.out.println("등록할 학생 이름 입력: ");
		String stdName = scan.next();
		System.out.println("학생 전화번호 입력: ");
		String stdNum = scan.next();
		System.out.println("학생 전공 입력: ");
		String major = scan.next();
		Student std = new Student(stdName , stdNum, major);
		stdList.add(std);	
	}

	@Override //한 학생을 서치후 정보 출력
	public void searchStudent(Scanner scan) {
		System.out.println("찾을 학생의 이름을 입력: ");
		String stdName = scan.next();
		boolean b = false;
		for(int i = 0; i < stdList.size(); i++) {
			if(stdList.get(i).getStdname().equals(stdName)) {
				stdList.get(i);
				b = true;
			}
		}
		if(b == false) {
			System.out.println("등록되지 않은 학생입니다.");
		}
		
	}

	@Override //수강 등록
	public void reisterSubject(Scanner scan) {
		System.out.println("수강등록할 학생 이름 입력: ");
		String stdName = scan.next();
		boolean b = false;
		for(int i = 0; i < stdList.size(); i++) {
			if(stdList.get(i).getStdname().equals(stdName)) {
				stdList.get(i).insertSubject();
				b = true;
			}
		}
		if(b == false) {
			System.out.println("등록되지 않은 과목입니다.");
		}
	}

	@Override //수강 철회
	public void deleteSubject(Scanner scan) {
		System.out.println("수강철회할 학생 이름 입력: ");
		String stdName = scan.next();
		boolean b = false;
		for(int i = 0; i < stdList.size(); i++) {
			if(stdList.get(i).getStdname().equals(stdName)) {
				stdList.get(i).deleteSubject();
				b = true;
			}
		}
		if(b == false) {
			System.out.println("등록되지 않은 과목입니다.");
		}
	}

}
