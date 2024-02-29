/*
class ThreadDemo2 extends Thread{
	ThreadDemo2(String name){
		super(name);//first라는 이름을 사용하게 됨
	}

	@Override
	public void run() {
		System.out.println(getName() + "자식 스레드 시작");
		
		int cnt = 0;
		do { //자식은 숫자세기
			try {
				sleep(100); //0.1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			cnt++;
			System.out.println(cnt);
		}while (cnt < 10); 
		System.out.println(getName() + "자식 스레드 끝");
	}	
}
public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");

		ThreadDemo2 child1 = new ThreadDemo2("first");
		child1.start(); //이렇게 해줘야 자식 스레드가 생성된다.
		
		int cnt = 0;
		do { // 메인은 점찍기
			try {
				Thread.sleep(100); //0.1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			cnt++;
			System.out.print(".");
		}while (cnt < 10);
		System.out.println("메인 스레드 끝");
	}
}
*/

class ThreadDemo2 implements Runnable {
	private String name;
	
	ThreadDemo2(String name){
		//super(name);//first라는 이름을 사용하게 됨
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
public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");

		ThreadDemo2 child1 = new ThreadDemo2("first"); //private String name; , this.name = name; 추가
		//child1.start(); 
		
		Thread t1 = new Thread(child1);
		t1.start();
		
		int cnt = 0;
		do { // 메인은 점찍기
			try {
				Thread.sleep(100); //0.1초. 메인스레드에 일을 더 많이 주고 싶으면, 부모 시간을 짧게 자식 시간을 길게 해주면 된다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			cnt++;
			System.out.print(".");
		}while (cnt < 10);
		System.out.println("메인 스레드 끝");
	}
}