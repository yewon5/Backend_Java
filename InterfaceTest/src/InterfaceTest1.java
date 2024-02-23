interface Inter1 { //원래는 interface파일을 따로 만들어야하는데 편의상 여기에 만들었다.
	int a = 10; //static final public 인터페이스 안에 있는 변수가 갖는 기본적인 특징 3가지.

	void inter1Method(); //인터페이스는 완전 추상메서드이기 때문에 내용이 있으면 안된다.{코드블럭}이 있으면 안됨.
}

interface Inter2 { //extends 인터페이스끼리 상속 가능.
	int b = 20;
}

interface Inter3 extends Inter1, Inter2{
	int c = 20;
}

//implements Inter1, Inter2, Inter3 이렇게 다중 상속이 가능하다.
//Inter3가 1, 2를 모두 상속 받았기때문에 Inter3만 명시해도 된다.
public class InterfaceTest1 implements Inter3 { 
	public void inter1Method() {
		System.out.println("오버라이딩");
	}
	public static void main(String[] args) {
		// TODO 인터페이스 기본 문법
		
		
		//추상클래스는 인스턴스를 생성할 수 없다. 어떻게 사용할까? 기본적으로 static의 특징을 갖고있어서 인스턴스 없이도 사용할 수 있다.
		//System.out.println(Inter1.a); 
		//Inter1.a=100; //final의 특징을 갖고 있어서 값을 수정할 수가 없다.
		
		System.out.println(a + ", " + b + ", " + c);
		
	}
}
