class Toilet {
	//synchronized 키워드 : 메서드, 블록을 동기식으로 처리해준다. 여러개의 스레드가 동시에 사용할 수 없게 한다.
	public synchronized void openDoor(String name) { //누가 들어왔는지 매개변수로 받기, 키값이 실행되는 동안 누가 들어올 수 없게
		System.out.println(name + "가 화장실에 들어왔습니다.");
		
		//화장실 소요 시간ㅎ
		for(int i=0; i<10000; i++) {
			if(i == 5000) {
				System.out.println(name + " : 끄응~~");
			}
			
			
		}
		
		System.out.println(name + "가 화장실에서 나갔습니다.");
	}
}

//화장실 사용(동작)하는 npc준비
class Family extends Thread { //가족들이 동작을 하는 것이니까 여기에 스레드를 만들어야 함. 스레드를 안 만들면 무조건 순차적으로 들어가는데, 동시에(비동기식) 실행되게 하려고 만드는 것.
	//화장실의 주소를 받기 위한 변수 준비
	Toilet toilet;
	String who;
	
	//생성자 준비
	Family(Toilet t, String w){
		toilet = t;
		who = w;
	}

	@Override
	public void run() { //run()은 화장실을 가게 만들면 된다.
		toilet.openDoor(who); //어떤 가족이 화장실에 갔는지.
		/* wait을 사용한다면 이렇게 사용하면 된다. notify()로 깨워주기.
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}

public class SyncTest {
	public static void main(String[] args) {
		// TODO 동기식 처리(동시에 처리되면 안 됨. 하나씩 순차적으로 처리 ex)화장실^^ )
		Toilet t = new Toilet();
		
		Family father = new Family(t, "아버지");
		Family mather = new Family(t, "어머니");
		Family brother = new Family(t, "오빠");
		Family syster = new Family(t, "언니");
		Family me = new Family(t, "내");
		
		father.start();
		mather.start();
		brother.start();
		syster.start();
		me.start();
	}
}
