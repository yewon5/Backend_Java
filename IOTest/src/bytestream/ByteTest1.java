package bytestream;

import java.io.IOException;

public class ByteTest1 {
	public static void main(String[] args) throws IOException {
		byte[] bArr = new byte[10]; //배열 생성
		
		System.out.print("문자 입력 : ");
		System.in.read(bArr); 
		//in은 따로 지정하지 않으면 키보드 장치를 가리키는 참조 변수. ByteStream이라서 아스키코드값으로 입력 받음. 한글을 입력하면 깨진다.
		System.out.println("입력한 값 : " + bArr);
		for(byte b : bArr) {
			 System.out.print((char)b);
		}
	}
}
