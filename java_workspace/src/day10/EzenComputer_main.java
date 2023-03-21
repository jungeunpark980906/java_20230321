package day10;

public class EzenComputer_main {

	public static void main(String[] args) {
		// EzenComputer main 테스트용

		EzenComputer ec = new EzenComputer("박정은","980906",26,"010-3308-9260","인천");
		
		ec.printStudent();
		ec.printEzen();
		
		ec.studyPlus("JAVA", "(6개월)");
		ec.studyPlus("HTML", "(1개월)");
		ec.studyPlus("DB", "(2개월)");
		
		ec.printStudy();
		
		System.out.println();
		
		
		
		
		//배열로 5명의 학생 등록 후
		//- 학생이름으로 검색 => 개인정보 출력
		//- 지정명으로 검색 => 학생이 있는지 출력
		
		EzenComputer[] std = new EzenComputer[6];
		std[0] = new EzenComputer("박희은", "010-5508-9260","인천");
		std[1] = new EzenComputer("홍길동", "010-1108-9260","서울");
		std[2] = new EzenComputer("홍길동", "010-2208-9260","인천");
		std[3] = new EzenComputer("강감찬", "010-4408-9260","부산");
		std[4] = new EzenComputer("홍길동", "010-6608-9260","부산");
		std[5] = ec;
		
		
		//std배열에 있다면 출력
		String serchName = "홍길동"; //홍길동이 상담받은 지점정보, 개인정보 출력
		String serchPlace = "인천"; //지점정보, 개인정보 출력
		
		
		int cnt = 0;
		System.out.println(serchName + "이 이름인 학생 정보 > ");
		for(int i=0; i<std.length; i++) {
			if (std[i].getStudentName().equals(serchName)) {
				System.out.print(std[i].getStudentName());
				System.out.print(std[i].getStudentNumber());
				System.out.print(std[i].getEzenPlace());
				System.out.println();
				cnt++;
			}
		
		}
		
		System.out.println(serchPlace + "이 지점인 학생 정보 > ");
		for(EzenComputer tmp : std) {
			if(tmp.getEzenPlace().equals(serchPlace)) {			
				System.out.print(tmp.getStudentName());
				System.out.print(tmp.getStudentNumber());
				System.out.print(tmp.getEzenPlace());
				System.out.println();
			}
		}
		
		System.out.println(serchPlace + "이 지점이고 " + serchName + "이 이름인 학생 정보 >");
		for(EzenComputer tmp : std) {
			if(serchName.equals(tmp.getStudentName())
					&& (tmp.getStudentName().equals(serchName))) {			
				System.out.print(tmp.getStudentName());
				System.out.print(tmp.getStudentNumber());
				System.out.print(tmp.getEzenPlace());
				System.out.println();
			}
		}

		
		if(cnt == 0) {
			System.out.println("찾으시는 값이 없습니다.");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
