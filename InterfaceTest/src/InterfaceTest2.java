interface Volume {
	void volumeUP(int vol);
	void volumeDown(int vol);
}

interface Power {
	void powerOn(); //추상메서드 준비
	void powerOff();
}


class TV implements Volume { //오버라이딩을 해야하기때문에 무조건 volumeUP, volumeDown을 써야한다.(표준화)
	private int vol; //볼륨 변수 준비
	
	public void volumeUP(int vol) { //오버라이딩.
		this.vol += vol;
		System.out.println("현재 TV볼륨을" + vol + "만큼 올렸습니다.");
	}
	
	//@가 붙으면  Annotation. 만약 스펠링이 틀리면 새로운 메서드가 만들어지는데 코드 바로 위에 @Override 써주면 오류를 잡아준다.
	@Override //아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		this.vol -= vol;
		System.out.println("현재 TV볼륨을" + vol + "만큼 내렸습니다.");
	}
	
	public void display() {
		System.out.println("현재 볼륨을" + vol + "입니다.");
	}
}

class Radio implements Volume {
	private int vol; //볼륨 변수 준비
	
	public void volumeUP(int vol) {
		this.vol += vol;
		System.out.println("현재 라디오의 볼륨을" + vol + "만큼 올렸습니다.");
	}

	@Override //아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		this.vol -= vol;
		System.out.println("현재 라디오의 볼륨을" + vol + "만큼 내렸습니다.");
	}
	
	public void display() {
		System.out.println("현재 볼륨을" + vol + "입니다.");
	}
}

class Speaker implements Volume{
private int vol; //볼륨 변수 준비
	
	public void volumeUP(int vol) {
		this.vol += vol;
		System.out.println("현재 스피커의 볼륨을" + vol + "만큼 올렸습니다.");
	}

	@Override //아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		this.vol -= vol;
		System.out.println("현재 스피커의 볼륨을" + vol + "만큼 내렸습니다.");
	}
	
	public void display() {
		System.out.println("현재 볼륨을" + vol + "입니다.");
	}
}

public class InterfaceTest2 {
	
	public static void main(String[] args) {
		// TODO 인터페이스를 이용한 표준화

		TV tv = new TV();
		tv.volumeUP(10);
		tv.volumeDown(5);
		tv.display();
		
		Radio radio = new Radio();
		radio.volumeUP(15);
		radio.volumeDown(7);
		radio.display();
		
		Speaker speaker = new Speaker();
		speaker.volumeUP(20);
		speaker.volumeDown(12);
		speaker.display();
	}
}


/* 
 * 1. 파워 인터페이스를 상속받아 볼륨과 마찬가지로 오버라이딩을 한다.
 * 2. 소리를 높일 때 50이상 넘지 않도록 한다.
 * 3. 소리를 낮출 때 0미만으로 줄일 수 없도록 한다. (0은 뮤트기능)
 * 4. 소리를 높이거나 낮출 때에는 전원이 켜져있는 상태에서만 가능하게 한다.
 * ----------
 * 제품선택
 * 1. TV
 * 2. Raido
 * 3. Speaker
 * 선택 : _
 * 
 * TV 전원을 켜시겠습니까? (y/n) : _
 * 
 * 전원이 켜져있다면
 * 1. 소리 증가
 * 2. 소리 감소
 * 선택 : _
 * 
 * 현재 ~의 볼륨은 ~만큼 올렸습니다.(내렸습니다.)
 * 현재 볼륨은 ~ 입니다.
 */
