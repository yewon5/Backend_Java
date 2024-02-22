class First {
	int a = 10;
	
	void display() {
		System.out.println("a : " + a);
	}
}

class Second extends First { //First의 상속을 받아 a와 display메서드가 존재함
	int b = 20; //
	
	void print() {
		System.out.println("b : " + b);
	}
}

public class ReferenceTest {
	public static void main(String[] args) {
		// TODO 부모 클래스와 자식 클래스의 참조 관계

		First f1 = new First();
		f1.display();
		
		Second s1 = new Second();
		s1.print();
		
		First f2 = f1;
		f2.display();
		
		//f2 = s1; 서로 다른 클래스들끼리는 절대로 참조할 수 없다. 캐스팅으로도 안된다(기본타입끼리만 가능함)
		
		//s1자식의 주소 잠시 보관
		f2 = s1; //extends 상속을 추가하니 오류 해결. Second의 주소를 받음. 
		f2.a =11; //변수 11로 초기화
		f2.display();
		
		
		//부모는 부모가 물려준 a와 display만 참조 가능하다. b나 print는 자식이 만든거라 접근 불가하다.
		//f2.b = 21; 
		//f2.print();
		
		//부모의 주소 넘기기
		//Second s2 = f1; 오류.
		//Second s2 = (Second)f1; //캐스팅을 하면 될까?
		//s2.b = 21; //문법적으로는 맞지만, 변환할 수 없다는 오류가 뜬다.
		
		Second s2 = (Second)f2;
		s2.a=12;
		s2.display();
		s2.b =21;
		s2.print();
		
	}
}