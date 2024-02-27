public class ExceptionTest1 {
	public static void main(String[] args) {
		/* 예외처리 안 했을 때
		int[] arr = new int[3];
		System.out.println("첫번째 예외처리 테스트");
		arr[7] = 10; //방을 3개만 만들어 놓고 7번째에서 값을 찾으니 안보인다. JVM은 이러한 종류의 오류를 감지하고 예외(Exception)를 발생시킨다. 
		System.out.println("이 메시지가 보이는가?"); //이미 JVM한테 주도권을 뺏겨서 프로그램이 비정상적으로 종료되어 출력이 안된다.
		*/
		
		try {
			int[] arr = new int[3];
			System.out.println("첫번째 예외처리 테스트");

			//arr[7] = 10; 
			arr[0] = 10/0;
		}
		catch(ArrayIndexOutOfBoundsException e) { //어떤 오류인지 모르니 일부러 오류를 내고 콘솔창에 뜨는 것을 참고하여 예외 클래스를 적어주고 변수명을 선언한다.
			System.out.println("배열의 인텍스를 벗어났습니다. : " + e); //원인도 같이 출력
		}
		catch(ArithmeticException e) {
			System.out.println("산술연산을 잘못했습니다. : " + e);
		}
		catch(RuntimeException e) { //위에서 못잡은 오류를 런타임이 잡도록
			System.out.println("런타임 오류 발생");
		}
		catch(Exception e) { //모든 오류 잡는 대빵
			System.out.println("예외 발생"); 
		}
		System.out.println("이 메시지가 보이는가?");
	}
}
