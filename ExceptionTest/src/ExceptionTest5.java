public class ExceptionTest5 {
	public static void main(String[] args) {
		try {
			System.out.println("여기는 try블럭 내부임... ");
			//throw new RuntimeException("이것은 예외 테스트용이다."); //예외 발생하면 9번 코드 실행
			int i = 10/0; //예외 발생
		}
		catch(RuntimeException e) {
			System.out.println("잘 처리됨... " + e.getMessage()); 
			return; //에러를 catch가 잡으면 finally만 실행하고 16번코드 실행 안됨.
			//System.exit(0); //아묻따 finally까지 종료시켜버리는 코드. 웬만하면 쓰지 말고 return;쓰면 됨
		}
		finally { //finally 반드시 실행해야하는 코드
			System.out.println("finally 영역은 반드시 실행됨."); //위에서 예외가 발생하든 말든 무조건 실행되는 코드
		}
		System.out.println("try/catch가 끝나고 난 후... ");
	}
}