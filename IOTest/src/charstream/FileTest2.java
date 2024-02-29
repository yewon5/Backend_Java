package charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest2 {
	public static void main(String[] args) {
		// TODO 키보드로부터 입력을 받아서 파일로 출력
		
		FileWriter fout = null;
		BufferedReader br = null;
		try {
			fout = new FileWriter("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\out.txt"); //출력은 파일이 없어도 알아서 생성됨.
			br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true) {
				String input = br.readLine();	
				if(input == null) { 
					break;
				}
				
				fout.write(input + "\n");
				//fout.write(System.lineSeparator());
				fout.flush(); //출력할때 사용 권장. flush 강제로 버퍼를 비워주는 메서드
			}
			
			//fout.close(); //위에서 오류가 발생하면 바로 캐치를 실행하기 때문에 close 실행 안됨. finally에 넣기
			//br.close();
		}
		catch(IOException err) {
			System.out.println(err);
			err.printStackTrace();
		}
		finally {
            try { fout.close(); } catch (IOException err) {}
            try { br.close(); } catch (IOException err) {}
        }
    }
}