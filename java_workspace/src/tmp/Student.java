package tmp;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {
		//멤버변수
		private String stdName;
		private String registNum;
		private String stdNum;
		private String faculty; //학부
		private String major; //학과
		private ArrayList<Subject> subList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		public Student() {}
		public Student(String stdname, String registNum, String stdNum, String faculty, String major,
				ArrayList<Subject> subList) {
			this.stdName = stdname;
			this.registNum = registNum;
			this.stdNum = stdNum;
			this.faculty = faculty;
			this.major = major;
			this.subList = subList;
		}		
		public Student(String stdname, String stdNum, String major) {
			this.stdName = stdname;
			this.stdNum = stdNum;
			this.major = major;
		}
		//getter/setter
		public String getStdname() {
			return stdName;
		}
		public void setStdname(String stdname) {
			this.stdName = stdname;
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
		public ArrayList<Subject> getSubList() {
			return subList;
		}
		public void setSubList(ArrayList<Subject> subList) {
			this.subList = subList;
		}
		//수강과목 등록
		public void insertSubject() {
			System.out.println("등록하실 과목의 코드를 입력해주세요: ");
			String subCode = sc.next();
			System.out.println("과목의 이름을 입력해주세요: ");
			String subName = sc.next();
			System.out.println("과목의 필수 이수 시간을 입력해주세요: ");
			int subTime = sc.nextInt();
			System.out.println("교수님의 성함을 입력하세요: ");
			String subprofessor = sc.next();
			Subject tmp = new Subject(subCode, subName, subTime, subprofessor);
			subList.add(tmp);
			//public Subject(String subCode, String subName, int subTime, String subProfessor)
		}
		//수강과목 삭제
		public void deleteSubject() {
			boolean b = false;
			System.out.println("삭제하실 과목의 코드를 입력해주세요: ");
			String subCode = sc.next();
			for(int i = 0; i < subList.size(); i++) {
				if(subList.get(i).getSubCode().endsWith(subCode)) {
					subList.remove(i);
					b = true;
				}
			}
			if(b == false) {
				System.out.println("입력하신 과목이 존재하지 않습니다.");
			}
		}
		
}
