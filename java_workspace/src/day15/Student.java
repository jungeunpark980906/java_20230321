package day15;

import java.util.Arrays;
import java.util.Scanner;

//학생 클래스
class Student{
	// 한 학생의 정보를 나타내는 클래스 
	//학번 이름 주민번호 학부 학과 수강과목(과목클래스를 배열 생성=여러개 들어갈 수 있도록, 5개)
		//수강과목의 번지를 대신할 count를 가지는 것 추천!

	//멤버변수
	private String stdname;
	private String registNum;
	private String stdNum;
	private String faculty; //학부
	private String major; //학과
	private Subject[] subjectList = new Subject[5];
	private int subCount;
	
	//생성자
	public Student() {}
	public Student(String stdNum) {
		super();
		this.stdNum = stdNum;
	}
	public Student(String stdname, String registNum, String stdNum, String faculty, String major) {
		super();
		this.stdname = stdname;
		this.registNum = registNum;
		this.stdNum = stdNum;
		this.faculty = faculty;
		this.major = major;
	}

	//getter,setter
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getRegistNum() {
		return registNum;
	}
	public void setRegistNum(String registNum) {
		this.registNum = registNum;
	}
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Subject[] getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}
	public int getSubCount() {
		return subCount;
	}
	
	
	//메서드 
	//수강과목 추가 -> 추가시 배열의 포화상태일 경우, 배열을 늘려주기
	public void insertSubject(Subject subName) {
		if(subCount == subjectList.length) {
			//new를 이용해 새 배열 생성 -> arraycopy를 이용해 배열 복사 -> 연결
			Subject[] tmp = new Subject[subjectList.length+5]; //subCount+5도 동일
			System.arraycopy(subjectList, 0, tmp, 0, subCount);
			subjectList = tmp;	
		}
		subjectList[subCount]=subName;
		subCount++;
	}
	//수강과목 삭제
	public void deleteSubject(String subName) {
		int index = -1; //찾는 과목의 위치를 나타내는 변수
		
		//찾을 subName을 잘못해서 안넣은 경우
		if(subName == null) {
			return;
		}
		
		//배열에 있는지 확인하는 for문
		for(int i=0; i<subCount; i++) {//subCount=값이 있는 곳까지만 확인
			if(subjectList[i].getSubName().equals(subName)) {
				index=i; //있다면 index에 과목 위치 삽입
				break;
			}	
		}
		
		//찾는 subName이 배열에 없는 경우
		if(index == -1) {
			System.out.println("해당 과목이 존재하지 않습니다.");
			return; 
		}
		
		//찾는 subName이 배열에 있는 경우
			//찾은 위치부터 뒷 번지의 값을 앞으로 쭉쭉 밀어서 저장 
			//subCount=1 =1과목이 있다는 의미 =subjectList는 0번지
		for(int i=index; i<subCount-1; i++) { //subCount-1까지 하는게 중요!!
			subjectList[i] = subjectList[i+1];
		}
		//= 마지막 번지를 null로!
		//예) 과목이 3인 경우: 0 1 2
		subjectList[subCount-1]=null;
		subCount--;
		
		
		
		
		

	
	}
	//학생 개인정보 프린트
	public void stdPrint() {
		System.out.println("학생명(학번): "+stdname+"("+stdNum+")");
		System.out.println("학부(학과): "+faculty+"("+major+")");
	}
	//학생 수강과목 프란트
	public void subPrint() {
		if(subCount==0) {
			System.out.println("수강하는 과목이 없습니다.");
		}
		for(int i=0; i<subCount; i++) {
			System.out.println(subjectList[i]);
		} //subjectList[i].print(Subject class에 print메서드가 있어 이용할 경우)
	}
	
	
	
}
