import java.io.IOException;

/*
public class ExceptionTest3 {
	public static void main(String[] args) {
		System.out.print("입력 : ");
		
		char input=' '; //지역변수로인해 밖에 선언
		try {
			input = (char)System.in.read(); //입력받을 때는 예외처리를 반드시 해야한다
		}
		catch(IOException e) {
			
		}
		System.out.println("입력받은 값은 " + input + "입니다."); //input 지역변수라 밖에 선언해준다.
	}
}
*/

public class ExceptionTest3 {
	public static void main(String[] args) throws IOException, RuntimeException {
		System.out.print("입력 : ");
		
		char input=' '; //지역변수로인해 밖에 선언
		input = (char)System.in.read();
		
		System.out.println("입력받은 값은 " + input + "입니다."); //input 지역변수라 밖에 선언해준다.
	}
}