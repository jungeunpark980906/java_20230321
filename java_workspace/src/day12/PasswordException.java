package day12;

public class PasswordException extends IllegalArgumentException{
	//IllegalArgumentException 잘못된 값을 받아주는 예외기능
	//이 기능을 PasswordException에 넣어줌

	public PasswordException(String message) { //메세지를 받으면 super의 멤버변수로 넣어줌
		super(message); //super의 멤버변수
	}
	
	
	
}
