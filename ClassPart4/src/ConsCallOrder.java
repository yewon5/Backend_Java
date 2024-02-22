class  A {
	A(){}
	A(String s) {
		System.out.println("A생성자 호출됨");
	}
}

class  B extends A{
	B(){} //기본생성자를 만들어주면 해결된다. 임의의 생성자를 만들게 되면 더 이상 기본생성자는 제공되지 않기 때문에
	B(int i) { //변수를 넣어주니 오류가 뜬다. 해결 방법은?
		//super(); 기본값으로 숨겨진 코드. 부모 A부터 호출하고와!
		System.out.println("B생성자 호출됨");
	}
}

class  C extends B{
	C() {
		//super(); 기본값으로 숨겨진 코드. 부모 B부터 호출하고와!
		System.out.println("C생성자 호출됨");
	}
}

public class ConsCallOrder {
	public static void main(String[] args) {
		// TODO 생성자 호출 순서

		new C();
	}
}
