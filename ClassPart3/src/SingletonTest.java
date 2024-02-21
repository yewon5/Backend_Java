class SingletonDemo { //클래스의 인스턴스를 단 1개만 생성해보자.
	private int i; 
	private static SingletonDemo instance = new SingletonDemo();

	private SingletonDemo() { //기본 생성자에 접근 제한을 둔다.
	}
	
	 public static SingletonDemo getInstance() {
		 return instance;
	 }
	 //변수를 직접 가져다 사용하지 말고 메서드를 통해서 전달받을 수 있게 하자
}
public class SingletonTest {

	public static void main(String[] args) {
		// TODO Singleton Pattern

		//SingletonDemo demo1 = new SingletonDemo();
		//SingletonDemo demo2 = new SingletonDemo();//아직 여러개 만들어도 제약이 없다.
	
		SingletonDemo demo1 = SingletonDemo.getInstance();
		SingletonDemo demo2 = SingletonDemo.getInstance();
		//이미 만들어진 것의 주소만 가져오면 1개의 인스턴스로 계속 사용할 수 있다. 
		
		System.out.println(demo1 == demo2); //true 주소 같다
	}
}
