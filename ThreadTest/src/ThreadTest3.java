class ThreadDemo3 extends Thread {
	String name;
	
	ThreadDemo3(String name) {
		this.name = name;
		//super(name);
	}

	@Override
	public void run() {
		int cnt = 0;
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			cnt++;
			System.out.println(name + " : " + i);
		}
	}	
}
public class ThreadTest3 {
	public static void main(String[] args) {
		// TODO Thread 문제 : main에 추가하지말고 Thread 클래스만 수정해서 스레드1~3이(run메서드) 실행하도록 만들어 보기.
		ThreadDemo3 d1 = new ThreadDemo3("스레드1");
		ThreadDemo3 d2 = new ThreadDemo3("스레드2");
		ThreadDemo3 d3 = new ThreadDemo3("스레드3");
		
        d1.start();
        d2.start();
        d3.start();
	}
}
