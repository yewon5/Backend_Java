/*
class  ThreadDemo extends Thread { //Thread 클래스 방식
	//private String name;
	
	public ThreadDemo(String name) { //생성자 메서드 (클래스의 인스턴스를 생성할 때 호출)
		//this.name = name;
		super(name); //부모한테 저장함. 다시 부모로부터 받아오는 것 getNmae()
	}

	@Override
	public void run() {
		int sum = 0;
		for(int i=0; i<5; i++) {
			try {
				sleep(100); //스레드에 쉬는시간을 줘서 번갈아 실행. 0.1초로 설정해서 동시에 실행되는 것처럼. 오버라이드에서는 Throws 쓸 수 없다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			sum += i;
			System.out.println(getName() + " : " + sum);
		}
	}
}

public class ThreadTest1 {
	public static void main(String[] args) { //main 기본 스레드. 부모스레드
		// TODO Thread 클래스 방식
		ThreadDemo demo1 = new ThreadDemo("first"); //객체를 생성해서 스레드가 하나 더 만들어짐. 그외에 자식스레드
		ThreadDemo demo2 = new ThreadDemo("second"); //여기까지 총 3개의 스레드가 생성됨.
		
		demo1.start(); //스레드를 만들었으면 start();해줘야 run()이 실행된다.
		demo2.start(); 
		//cpu는 한 번에 한가지 작업밖에 못한다. 그럼 어떻게 동시에 실행할까? Time Sharing 정확히 동시에 실행되는 건 아니지만 동시에 실행되는 것처럼 보여진다.
	}
}
*/

class  ThreadDemo implements Runnable { //Runnable 인터페이스 상속 방식
	private String name;
	
	public ThreadDemo(String name) { //생성자 메서드 (클래스의 인스턴스를 생성할 때 호출)
		this.name = name;
		//super(name); Runnable 인터페이스라서 생성자가 없다. 추상 클래스라서 부모는 객체가 생성되는 것이 아니기때문에 부모를 호출할 수 없다.
	}

	@Override
	public void run() {
		int sum = 0;
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(100); //스레드에 쉬는시간을 줘서 번갈아 실행. 0.1초로 설정해서 동시에 실행되는 것처럼. 오버라이드에서는 Throws 쓸 수 없다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			sum += i;
			System.out.println(name + " : " + sum);
		}
	}
}

public class ThreadTest1 {
	public static void main(String[] args) { 
		// TODO Runnable 인터페이스 상속 방식
		ThreadDemo demo1 = new ThreadDemo("first"); 
		ThreadDemo demo2 = new ThreadDemo("second"); 
		
		Thread t1 = new Thread(demo1); //별도의 스레드 객체를 생성해야 demo1,2가 스레드가 된다.
		Thread t2 = new Thread(demo2);
		
		t1.start();
		t2.start(); 
	}
}
