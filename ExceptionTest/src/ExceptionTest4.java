import java.io.IOException;

public class ExceptionTest4 {
	static void second() throws IOException, ArithmeticException { //first 너가 예외처리해
		System.out.println("second");
		
		//System.out.print("입력 : ");
		//int data = (char)System.in.read()-48;
		
		//int result = 10 / data;
		int result = 10 / 0;
	}
	
	static void first() throws IOException { //나도 하기 싫어 메인이가 해
		System.out.println("first");
		second();
	}
	
	public static void main(String[] args) {
		try {
			first();
		}
		catch(Exception err) {
			System.out.println("mina에서 모두 처리함 : " + err);
			err.printStackTrace(); //어디서 에러가 났는지 추적 
		}
	}
}
