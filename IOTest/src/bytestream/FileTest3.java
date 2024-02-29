package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3 {
	public static void main(String[] args) throws IOException {
		// TODO 기본 데이터타입 입출력, DataInputStream, DataOutputStream
		//Filter 클래스(객체를 도와줌). 다시 포장해서 그 클래스가 갖지 못한걸 추가로 가질 수 있게 확장시켜주는 것. 
		//wrapper 클래스(객체가 아닌 것을 객체로) : Byte, Short, Integer, Long, Float, Double, Character, Boolean
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\DataOut.txt");		
		
		DataOutputStream dout = new DataOutputStream(fout);
		
		//각각 형식에 맞게 메서드 호출
		dout.writeChar('가');
		dout.writeInt(100);
		dout.writeDouble(3.14);
		dout.writeBoolean(true); 
		//2진수로 저장돼서 글자가 깨짐
		
		dout.close();	
		fout.close();
		
		
		//FileInputStream fin = new FileInputStream("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\DataOut.txt");		
		//포장해서 쓰는 것이기 때문에 굳이 주소를 저장해서 불러올 필요가 없고 바로 불러오면 된다.
		DataInputStream din = new DataInputStream(new FileInputStream("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\DataOut.txt"));
		
		System.out.println(din.readChar());
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		//저장된 순서대로 읽어와야 한다. 데이터를 다시 불러오니 잘 저장됐음.
		
		din.close();
	}
}
