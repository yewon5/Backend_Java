public class ExceptionTest2 {
	public static void main(String[] args) {
		try {
			System.out.println("여기는 try블럭 내부임... ");
			throw new RuntimeException("이것은 테스트용이다.");
		}
		catch(RuntimeException e) {
			System.out.println("잘 처리됨... " + e.getMessage()); 
		}
	}
}
