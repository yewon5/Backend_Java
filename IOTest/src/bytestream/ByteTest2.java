package bytestream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest2 {
	public static void main(String[] args) throws IOException {
		/*
		while(true) {
			int input = System.in.read();
			
			if(input == -1) { //-1는 ctrl+z를 뜻하며, 동시에 눌렀을때 종료된다. 실제로 -1을 입력하면 키 값을 2번 받는 거라 안됨.
				break;
			}
			
			System.out.print((char)input);
		}
		*/
		
		/*
		//위와 같은 코드
		int input = 0;
		while ((input = System.in.read()) != -1) { //ctrl+z 아닌 경우 계속 반복
			System.out.print((char)input);
		}
		*/
		
		StreamTest(System.in, System.out); //키보드 장치에서 입력 받은 것을 StreamTest() 메서드에서 처리하도록
	}
	//in 주소를 받으려면 괄호안에 어떤 변수를 선언해야할까? 일단 부모로 받아놓으면 된다. read는 byteStream이라서 그의 부모 InputStream
	static void StreamTest(InputStream in, OutputStream out) throws IOException {
		int input = 0;
		while ((input = in.read()) != -1) { //ctrl+z 아닌 경우 계속 반복
			// System.out.print((char)input); 아래의 코드로 바꿀 수 있다.
			out.write((char)input); //out은 모니터 장치를 가리킨다. OutputStream에는 print라는 메서드가 없기때문에 write로 바꿔준다.
			//write는 쪼개진 바이트를 조립해서 출력해주는 기능을 갖고 있기때문에 한글도 출력이 된다.
		}
	}
}
