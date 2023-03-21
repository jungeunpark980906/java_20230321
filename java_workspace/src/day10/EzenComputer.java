package day10;

import java.util.Scanner;


public class EzenComputer {
	/* 학생기본정보 : 이름, 생년월일, 나이, 전화번호
	 * 학원기본정보 : 이름 = EZEN(final), 지점
	 * 수강정보: 수강과목, 기간
	 *  - 1명의 학생이 여러과목을 수강 할 수 있음 (=과목이 여러개)
	 *  - 과목(기간),과목(기간)... => 배열로 처리
	 * 
	 *  출력 = 홍길동, 990101, 20, 010-1111-2222
	 *  	= EZEN, 인천
	 *  	= 자바(6개월), DB(1개월), HTML(2개월)
	 *  
	 *  기능: 
	 *  1.학생의 기본정보를 출력
	 *  2.학생의 학원정보를 출력 
	 *  3.학생의 수강정보를 출력 (배열 출력) + 배열길이:5
	 *  4.학생의 수강정보를 추가하는 기능 -> 배열에 추가
	 * 
	 * */
	
	//멤버변수
	private String studentName;
	private String studentBirth;
	private int studentAge;
	private String studentNumber;
	
	private final static String ezenName = "EZEN";
	private String ezenPlace;
	
	private String[] study = new String[5]; //수강과목
	private String[] period = new String[5]; //수강기간
	private int cnt; //수강과목과 기간의 index 처리
	
	
	//생성자
	public EzenComputer() {}
	
	public EzenComputer(String studentName, String studentBirth, int studentAge, 
						String studentNumber,String ezenPlace) {
		this.studentName = studentName;
		this.studentBirth = studentBirth;
		this.studentAge = studentAge;
		this.studentNumber = studentNumber;
		
		this.ezenPlace = ezenPlace;	
	}
	
	//최소한의 정보만 넣을 수 있는 생성자
	public EzenComputer(String studentName, String studentNumber,String ezenPlace) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.ezenPlace = ezenPlace;	
	}
		
	
	
	
	
	
	//getter/setter
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentBirth() {
		return studentBirth;
	}
	
	public void setStudentBirth(String studentBirth) {
		this.studentBirth = studentBirth;
	}
	
	public int getStudentAge() {
		return studentAge;
	}
	
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public String getEzenName() {
		return ezenName;
	}
	
	
	public String getEzenPlace() {
		return ezenPlace;
	}
	
	public void setEzenPlace(String ezenPlace) {
		this.ezenPlace = ezenPlace;
	}
	
	public String[] getStudy() {
		return study;
	}
	
	public void setStudy(String[] study) {
		this.study = study;
		
	}
	
	
	
	//<Method>
	//1.학생의 기본정보를 출력
	public void printStudent() {
		System.out.print("학생 이름: " + studentName );
		System.out.print(", 학생 생일: " + studentBirth);
		System.out.print(", 학생 나이: " + studentAge + "세");
		System.out.print(", 학생 번호: " + studentNumber);
		System.out.println();
	}
	
	//2.학생의 학원정보를 출력 
	public void printEzen() {
		System.out.println("학원 이름: " + ezenName + ", 학원 위치: " + ezenPlace);
		System.out.println();
	}
	
	//3.학생의 수강정보를 출력 (배열 출력) + 배열길이:5

//	public void printStudy() {
//		for(String tmp : study) {
//			System.out.print(tmp + " ");
//		}
//		System.out.println();
//	}
	
	public void printStudy() {
		if (study.length == 0) {
			System.out.println("수강이력이 없습니다.");
			return; //아무것도 없는 값을 돌려줌 (method의 종료)
		} 
		for (int i=0; i<cnt; i++) {
			System.out.print("과정: " + study[i] + period[i] + " ");
		}
		
	}
	
	//4.학생의 수강정보를 추가하는 기능 -> 배열에 추가
	
//	public void studyPlus() {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("추가하실 수강정보를 입력해주세요. 수강과목(개월 수): ");
//		for(int i=0; i<study.length; i++) {
//			if(study[i] == null) {
//				study[i] = scan.next();
//				break;
//			} 
//		}	
//		scan.close();
//		
//	}
	
//	public void plue(String[] arr) {
//		int num = 0;
//		Scanner scan = new Scanner(System.in);
//		if(num<5) {
//			return;
//		} 
//		arr[num]=scan.next();
//		num++;
//		
//		scan.close();
//	}
//	
	
	
	public void studyPlus( String study, String period) {
		this.study[cnt] = study;
		this.period[cnt] = period;
		cnt++;
		
	}
	
	

	
	
}
