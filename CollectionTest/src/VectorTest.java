import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.addElement("홍길동");
		v.addElement(true);
		v.addElement(100);
		v.addElement(3.14);
		v.addElement('가');
		
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.elementAt(i)); //get도 사용 가능
		}
		
		//capacity Vector의 저장 용량. 몇개까지 저장할 수 있는가?
		System.out.println(v.capacity()); //10. 기본적으로 10개
		
		for(int i=0; i<7; i++) {
			v.addElement(v); //v를 추가로 7개 생성
		}
		System.out.println(v.capacity()); //20. 10개가 넘으면 저장 공간을 10개씩 늘린다.
		
		//배열 크기에 맞춰서 딱 맞게 저장공간 생성
		v.trimToSize();
		System.out.println(v.capacity()); //12. 상단의 5개와 반복문 7개를 합쳐 딱맞게 12개 
	}
}
