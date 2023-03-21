package day15;

import java.util.Scanner;

public class ProgramManager implements Program{

	
	//멤버변수로 student class를 가져옴, + 저장한 학생의 수인 stdCount 변수를 사용
	private Student[] std = new Student[5];
	private int stdCount;
	
	@Override
	public void printStudent() {
		System.out.println("--전체 학생 정보--");
		for(int i=0; i<stdCount; i++) {
			//std[i].stdPrint();//학생의 기본정보만 출력
			printStudentOne(std[i]);//학생의 기본정보+수강정보출력
		System.out.println("--------------");
		}
	}

	//1명의 학생정보+수강정보를 함께 출력하고 싶은 경우
	public void printStudentOne(Student s) {//한명의Student객체
		System.out.println("==학생 정보==");
		s.stdPrint();
		System.out.println("==학생 수강 정보==");
		s.subPrint();
	}
	
	
	
	@Override
	public void printStudent(Student[] list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		//1명의 학생 등록 값을 입력받음 -> 객체 생성 후 등록(객체를 생성하지 않으면 저장이 불가능!)
		System.out.println("--학생 정보 입력--");
		System.out.println("이름: ");
		String name = scan.next();
		System.out.println("학번: ");
		String sNum = scan.next();
		System.out.println("주민번호: ");
		String rNum = scan.next();
		System.out.println("학부: ");
		String faculty = scan.next();
		System.out.println("학과: ");
		String major = scan.next();
		System.out.println("-------------");
		
		Student s = new Student(name, sNum, rNum, faculty, major);
		
		if(stdCount == std.length) { //배열의 길이보다 더 넣는 경우 실행
			Student[] tmp = new Student[std.length+5];
			System.arraycopy(std, 0, tmp, 0, stdCount);
			std = tmp;
		}
		
		std[stdCount] = s; //배열에 넣기
		stdCount++;
	}

	@Override
	public void searchStudent(Scanner scan) {
//		char user = 'y';
		int index=-1;
//		a:
//		 do{
			System.out.println("찾으시는 학생의 이름을 입력해주세요.");
			String findName = scan.next();
			
			for(int i=0; i<stdCount; i++) {
				if(std[i].getStdname().equals(findName)) {
					printStudentOne(std[i]);
					index = i;
//					break a;
				} 
			}
			if(index== -1) {
				System.out.println("찾으시는 학생이 없습니다.");
			}
//			System.out.println("찾으시는 학생이 없습니다.");
//			System.out.println("한번 더 찾아보기(아무키나 입력)/나가기(n/N)");
//			user = scan.next().charAt(0);
//			
//		} while(!(user == 'n' || user == 'N'));
	}

	
	//수강 신청!!
	@Override
	public void reisterSubject(Scanner scan) {
		System.out.println("수강신청할 학생의 이름또는 학번을 입력하세요");
		String name = scan.next();
		int index = -1;
		
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdname().equals(name) || std[i].getRegistNum().equals(name)) {
				index = i;
				break;
			} 
		}
		
		if(index== -1) {
			System.out.println("찾으시는 학생이 없습니다.");
			return;
		} else {
			System.out.println("<수강신청할 과목 정보 입력>");
			System.out.println("과목 코드: ");
			String subCode = scan.next();
			System.out.println("과목명: ");
			String subName = scan.next();
			System.out.println("과목의 학점: ");
			double subCredite = scan.nextDouble();
			
			Subject s = new Subject(subCode, subName, subCredite);
			std[index].insertSubject(s);
			
			System.out.println();
			System.out.println("변경 후--->");
			printStudentOne(std[index]);	
		}

	}

	//수강철회!!
	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강철회 할 학생의 이름또는 학번을 입력하세요");
		String name = scan.next();
		int index = -1;
		
		for(int i=0; i<stdCount; i++) {
			if(std[i].getStdname().equals(name) || std[i].getRegistNum().equals(name)) {
				index = i;
				break;
			} 
		}
		
		if(index== -1) {
			System.out.println("찾으시는 학생이 없습니다.");
			return;
		} else {
			printStudentOne(std[index]);
			System.out.println();
			System.out.println("수강철회 할 과목의 과목명을 입력하세요");
			String sub = scan.next();
			
			std[index].deleteSubject(sub);
			
			System.out.println();
			System.out.println("변경 후--->");
			printStudentOne(std[index]);

		}
		
	}

}
