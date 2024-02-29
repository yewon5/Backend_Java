package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력을 받아서 파일로 출력
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\out.txt", true); //출력은 파일이 없어도 알아서 생성됨.
		
		while(true) {
			int input = System.in.read();
			
			if(input == -1) { 
				break;
			}
			
			fout.write((char)input); 
			//콘솔창에서 입력 후 엔터를 눌러야지 모든 문자열이 출력된다. 엔터를 치지 않고 ctrl+z를 누르면 마지막 문장은 버퍼에 임시 저장되어있다.
		}
		
		fout.close();
	}
}

// java jcopy a.txt b.txt → a파일내용을 b파일에 복사