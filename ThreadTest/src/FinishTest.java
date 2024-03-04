class FinishDemo implements Runnable {
	private String name;
	
	FinishDemo(String name){
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name +"자식 스레드 시작");
		
		int cnt = 0;
		do { //자식은 숫자세기
			try {
				Thread.sleep(500); //0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			cnt++;
			System.out.println(cnt);
		}while (cnt < 10); 
		
		System.out.println(name + "자식 스레드 끝");
	}	
}

public class FinishTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO 스레드의 종료 시점 지정하기
		System.out.println("메인 스레드 시작");

		FinishDemo child1 = new FinishDemo("first");
		FinishDemo child2 = new FinishDemo("second");
		
		Thread t1 = new Thread(child1);
		Thread t2 = new Thread(child2);
		
		t1.start();
		t2.start();
		
		int cnt = 0;
		do { // 메인은 점찍기
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			cnt++;
			System.out.print(".");
		}while (cnt < 10);
		//while(t1.isAlive() || t2.isAlive()); //t1, t2 살아있니? 살아있으면 main도 계속 일함
		//while (cnt < 10); 10번만 돌고 할 일 끝나면 종료
		
		t1.join(); //t1이 끝날때까지 main이 기다리고 마지막에 끝나도록
		t2.join();
		
		System.out.println("메인 스레드 끝");
	}
}