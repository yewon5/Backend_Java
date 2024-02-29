package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileTest4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee[] emp = new Employee[3];
		emp[0] = new Employee(1, "홍길동", "영업", 110, 1000000);
		emp[1] = new Employee(2, "임꺽정", "기술", 111, 1200000);
		emp[2] = new Employee(3, "신돌석", "개발", 112, 1500000);
		
		//ObjectOutputStream 객체 oos를 생성하여 파일에 객체를 직렬화하여 저장하기 위한 준비를 한다. 이때, 생성자에는 파일 경로를 인자로 전달
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\emp.dat"));
		
		oos.writeObject(emp[0]);
		oos.writeObject(emp[1]);
		oos.writeObject(emp[2]);
		
		oos.close();
		
		System.out.println("*******사원 정보*******");
		System.out.println("사번\t이름\t업무\t부서번호\t급여");
		System.out.println("----------------------------------------------------");
		
		//ObjectInputStream 객체 ois를 생성하여 파일에서 직렬화된 객체를 읽어들이기 위한 준비를 한다. 이때, 생성자에는 파일 경로를 인자로 전달
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\acorn\\Desktop\\won\\BackEnd\\JAVAwork\\FileTest\\emp.dat"));

		for(int i=0; i<3; i++) {
			Employee e = (Employee)ois.readObject(); //읽어들인 객체를 Employee 클래스의 변수에 저장하기 위해 형변환 (클래스명)
			System.out.println(e); //e.toString() 투스트링은 생략 가능
		}
			
		ois.close();
	}
}
