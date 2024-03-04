/*
class StopDemo implements Runnable {

	@Override
	public void run() {
		
		try {
			while(true) { //스레드가 계속 실행되는 코드
				System.out.println("Thread is alive...");
				Thread.sleep(500);
				}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead...");
		}
	}
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료 : stop() 방식
		
		StopDemo demo = new StopDemo(); //객체 생성
		Thread t = new Thread(demo); //스레드 객체 생성
		t.start(); //스레드 실행
		
		Thread.sleep(3000); //3초후에
		
		t.stop(); //while문 강제 종료. 다른 스레드가 충격을 받든 말든 종료시킴
	}
}
*/

/*
class StopDemo implements Runnable {

	@Override
	public void run() {
		
		try {
			while(true) { //스레드가 계속 실행되는 코드
				System.out.println("Thread is alive...");
				Thread.sleep(500);
				}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead...");
		}
	}
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료 : interrupt() 방식
		
		StopDemo demo = new StopDemo(); //객체 생성
		Thread t = new Thread(demo); //스레드 객체 생성
		t.start(); //스레드 실행
		
		Thread.sleep(3000); //3초후에
		
		t.interrupt(); //while문 강제 종료. 예외를 발생시켜서 코드 처리를 할 수 있도록 해줌.
	}
}
*/

class StopDemo implements Runnable {
	private boolean stopped = false; //Flag 변수 준비.
	
	void off() { //메서드 준비
		stopped = true;
	}

	@Override
	public void run() {
		
		try {
			while(!stopped) { //stopped이 true면 종료
				System.out.println("Thread is alive...");
				Thread.sleep(500);
				}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thread is dead...");
		}
	}
}

public class StopTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드 강제 종료 : 직접 제어(Flag)
		
		StopDemo demo = new StopDemo(); //객체 생성
		Thread t = new Thread(demo); //스레드 객체 생성
		t.start(); //스레드 실행
		
		Thread.sleep(3000); //3초후에
		
		demo.off(); //stopped = true; 실행시켜서 while문 강제 종료.
	}
}