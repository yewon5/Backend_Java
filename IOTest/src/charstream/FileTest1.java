package charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		// TODO 파일로부터 입력받아 콘솔로 출력
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\test.txt")); //클래스 객체 생성. 입력은 반드시 파일이 있어야함
		
		while(true) {
			String input = br.readLine();
			
			if(input == null) {
				break;
			}
			
			System.out.println(input);
		}
		
		br.close(); //실무 작업시 큰 파일을 작업할때 메모리부족 현상이 나타날 수 있으니 파일을 닫아준다.
	}
}