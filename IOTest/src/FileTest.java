import java.io.File;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		// TODO File 클래스
		
		File f = new File("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\emp.dat");
		
		//해당파일이 존재하는지 확인
		if(f.exists()) {
			System.out.println("파일의 이름 : " + f.getName());
			System.out.println("파일의 경로(상대) : " + f.getPath()); //처음부터 절대경로로 지정했기때문에 똑같다
			System.out.println("파일의 경로(절대) : " + f.getAbsolutePath()); 
			System.out.println("파일의 크기 : " + f.length() + "byte");
			System.out.println("마지막 수정일 : " + new Date(f.lastModified()));
		}
		else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		f.delete(); //파일 삭제
	}
}
