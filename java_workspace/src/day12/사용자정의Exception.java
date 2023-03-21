package day12;

public class 사용자정의Exception {

	public static void main(String[] args) {
		/* PasswordException 
		 * 
		 * - 비밀번호는 null일 수 없음(null=예외)
		 * - 비밀번호의 길이는 5자 이상 (5자미만=예외)
		 * - 문자+숫자나 특수문자 포함 (문자로만 이루어짐=예외)
		 * 
		 * */
		PasswordTest pt = new PasswordTest();
		//String password = null; // null오류
		//String password = "abc"; // 5자리보다 적어서 오류
		//String password = "abcdefg"; //특수문자나 숫자가 없어서 오류
		String password = "abcdefg@";
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		}catch(PasswordException e){
			System.out.println(e.getMessage());
		}

		
		
		
	}

}
class PasswordTest{
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) { //예외 던져주기
		
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (password.length() < 5) {
			throw new PasswordException("비밀번호는 5자리 이상이야합니다.");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야합니다.");
		}
		
		this.password = password;
	}
	
	
}