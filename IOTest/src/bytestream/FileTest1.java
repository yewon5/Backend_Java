package bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		// TODO 파일로부터 입력받아 콘솔로 출력
		
		FileInputStream fin = new FileInputStream("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\test.txt"); //클래스 객체 생성. 입력은 반드시 파일이 있어야함
		
		while(true) {
			int input = fin.read(); //파일로부터 입력받도록. ByteStream이라서 한글은 깨진다.
			
			if(input == -1) { //File에서는 마지막 글자가 없으면 read 메서드는 -1을 반환한다. 
				break;
			}
			
			//System.out.print((char)input);
			System.out.write(input);
		}
		
		fin.close(); //실무 작업시 큰파일을 작업할때 메모리부족 현상이 나타날 수 있으니 파일을 닫아준다.
	}
}