package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest3 {
	public static void main(String[] args) throws IOException {
		// TODO 성적표를 파일로 저장
		
		//PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\sungjuk.txt"))); //파일을 메모리로 저장함.
		
		//위의 코드를 아래코드로 쓸 수 있다. PrintWriter는 BufferedWriter, FileWriter가 포함된 클래스이다.
		PrintWriter pw = new PrintWriter("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\sungjuk.txt"); 
		
		pw.println("**************성적표**************");
		pw.println("------------------------------------------");
		pw.printf("%3s : %5d %5d  %5.1f %n", "홍길동", 98, 67, (float)(98+67)/2);
		//3자리문자열s : 5자리정수d 5자리정수d 정수5자리.소수1자리실수f 줄바꿈%n printf는 float만 된다.
		pw.printf("%3s : %5d %5d  %5.1f %n", "임꺽정", 88, 77, (float)(88+77)/2);
		pw.printf("%3s : %5d %5d  %5.1f %n", "신돌석", 55, 65, (float)(55+65)/2);
		
		pw.close();
	}
}
