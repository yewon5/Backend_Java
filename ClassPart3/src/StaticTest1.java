class StaticDemo {
	int a;
	int b;
	static int c;
}

public class StaticTest1 {
	static int d; //static/정적/클래스 변수. 반드시 클래스안에서만 선언해야한다. 
	
	//void method1()는 인스턴스를 생성해야만 사용되는 메서드인데, static이면 바로 호출가능하다. static에는 this가 없다. 딱 1개밖에 없으니 주소를 구별할 필요가 없다.
	static void method1() { 
		System.out.println("method1 호출됨");
	}
	
	public static void main(String[] args) {
		// TODO static이란?
		
		StaticDemo.c = 100; 
		System.out.println(StaticDemo.c);
		
		StaticDemo demo1 = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();
		
		System.out.println(demo1.c);
		
		demo1.c = 200;
		System.out.println(StaticDemo.c);
		System.out.println(demo2.c);
		
		//StaticTest1.d = 300; //인스턴스를 만들지 않고도 바로 값을 넣을 수 있다.
		d = 300; //위의 코드를 간단하게. 같은 클래스일 경우엔 클래스명은 생략가능하다.
		System.out.println(d);
		
		//StaticTest1.method1(); 
		method1();//클래스명 생략가능
	}
}
