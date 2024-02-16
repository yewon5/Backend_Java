import java.io.IOException;

public class Inputtest {
	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력 받기
		System.out.print("입력 : ");
		char input = (char)System.in.read();
		System.out.println("입력받은 값은 " + input + "입니다.");
		
		System.in.skip(2); // 최소 2byte이상(한글자이상) 건너뛴다.
		
		System.out.print("입력 : ");
		input = (char)System.in.read();
		System.out.println("입력받은 값은 " + input + "입니다.");
		
		System.in.skip(2);
		
		System.out.print("숫자 입력 : ");
		int num = System.in.read();
		System.out.println("입력받은 값은 " + (num-48) + "입니다."); 
		// num → (num-48) ASCII코드값을 숫자값으로 변환
	}
}
