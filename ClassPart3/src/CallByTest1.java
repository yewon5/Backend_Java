/*
public class CallByTest1 {
	void display(int a, int b, int c, int d, int e) { //괄호안에 매개 변수 넣기
		System.out.println(a + "," + b + "," + c + "," + d + "," + e);
	}
	
	public static void main(String[] args) {
		// TODO 값에 의한 전달
		
		int a=4, b=7, c=15, d=80, e=9; // 임시저장소 stack에 저장됨
		
		CallByTest1 call = new CallByTest1(); //인스턴스(객체)를 생성해야 실제 메모리에 공간이 생성된다
		call.display(a, b, c, d, e);
		//main이 출력하는게 아니고 display가 출력하도록 
	}
}
*/

/*
public class CallByTest1 {
	void display(int[] arrays) { //매개변수로 타입과 int 배열 넣기
		for(int arr : arrays) { //arrays의 값을 arr에게 전달.
			System.out.println(arr);
		}
	}
	
	public static void main(String[] args) {
		// TODO 참조에 의한 전달1 : 배열을 이용한 방법
		
		//int a=4, b=7, c=15, d=80, e=9; //많은 데이터를 한번에 불러오기위해 heap을 이용하자. 어떻게? 주소를 만들자.
		int[] arr = {4, 7, 15, 80, 9}; //배열로 만들면 arr의 주소가 생긴다. 배열은 arr은 스택에 주소를 만들고 값은 heap에 저장한다.
		
		CallByTest1 call = new CallByTest1(); //객체를 생성해야 실제 메모리에 공간이 생성된다
		call.display(arr);
		//main이 출력하는게 아니고 display가 출력하도록 
	}
}
*/

/*
public class CallByTest1 {
	int a=4, b=7, c=15, d=80, e=9; //인스턴스 변수 선언.
	void display() { //클래스 내부의 인스턴스 변수를 사용하기때문에 괄호에 인자값을 넣지 않고 이름만 호출하면 된다.
		System.out.println(a + "," + b + "," + c + "," + d + "," + e);
	}
	
	public static void main(String[] args) {
		// TODO 참조에 의한 전달2 : 인스턴스(객체) 변수를 이용하는 방법
		
		//int a=4, b=7, c=15, d=80, e=9; //main안에서만 사용가능한 지역 변수이다. CallByTest1 클래스로 옮기자.
		
		CallByTest1 call = new CallByTest1(); //call은 CallByTest1클래스의 인스턴스를 가리키는 참조 변수. 인스턴스 변수 int를 포함하고 있다.
		call.display(); //메서드 호출 
		//main이 출력하는게 아니고 display가 출력하도록 
	}
}
*/

class Data {
	int a=4;
	double b=3.14;
	char c='가';
	boolean d=true;
	String e="홍길동";
	//CallByTest1클래스에 변수를 선언하면 출력하기 쉽겠지만 만약 main의 지역변수라면 어떻게 display로 출력할 수 있을까?
	//이렇게 Data 클래스를 만들면된다.
}

public class CallByTest1 {
	void display(Data data) { 
		System.out.println(data.a + "," + data.b + "," + data.c + "," + data.d + "," + data.e);
	}
	
	public static void main(String[] args) {
		// TODO 참조에 의한 전달3 : 클래스를 이용하는 방법
		
		Data data = new Data(); 
		
		CallByTest1 call = new CallByTest1();
		call.display(data);
		//main이 출력하는게 아니고 display가 출력하도록 
	}
}