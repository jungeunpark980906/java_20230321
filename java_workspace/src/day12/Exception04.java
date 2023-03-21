package day12;

public class Exception04 {

	public static void main(String[] args) {
		/* catch문을 여러개 두는 경우
		 * 
		 * try{
		 * 코드
		 * 
		 * }catch(예외 클래스 명 객체){
		 * 처리문;
		 * }catch(예외 클래스 명2 객체){
		 * 처리문;
		 * }catch(예외 클래스 명3 객체){
		 * 처리문;
		 * }catch(예외 클래스 명4 객체){
		 * 처리문;
		 * }
		 * 
		 * 
		 * */
		
		double res = 0;
		
		try {
			res = 1/10;
			
			//int arr[] = null;
			//arr[5] = 10; => 예외발생!
			
			int arr[] = new int[3];
			arr[5] = 10; // => 배열범위가 넘어갔습니다
			
		}catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외발생!");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("배열범위가 넘어갔습니다");
		}catch(Exception e) { // 가장 큰 범위이므로 예외 중 항상 마지막에 위치!!! (default 유사)
			e.printStackTrace();
		}
		System.out.println("종료");
	}
	

}
