package charstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharTest1 {
	public static void main(String[] args) throws IOException {		
		StreamTest(System.in); //System.in는 바이트스트림으로 받아야한다.
	}

	static void StreamTest(InputStream a) throws IOException { //여기까지 바이트스트림
		InputStreamReader isr = new InputStreamReader(a);
		//InputStreamReader바이트스트림을 InputStreamReader클래스로 바꿔준다
		BufferedReader br = new BufferedReader(isr); //readLine(); 메서드를 사용하기 위해 한 번 더 포장해서 기능을 확장시킴
		
		/*
		int input = 0;
		while ((input = isr.read()) != -1) { //read()한글자씩 읽어온다 비효율적.
			System.out.print((char)input); 
		}
		*/
		
		String input = br.readLine();
		while(input != null) {
			if(input.equals("end"))
				break;
			
			System.out.println(input);
			
			input = br.readLine();
		}
		
		isr.close();
		br.close();
	}
}
