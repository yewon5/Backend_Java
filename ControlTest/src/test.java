import java.io.IOException;
import java.util.Scanner;

interface Volume {
	
	void volumeUP(int vol);
	void volumeDown(int vol);
}

interface Power {
	void powerOn(); //추상메서드 준비
	void powerOff();
}

class Connect implements Power {

	@Override
	public void powerOn() {
		System.out.println();
	}

	@Override
	public void powerOff() {
		System.out.println();
	}
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


public class test {
	public static void main(String[] args) throws IOException {
		// TODO 인터페이스를 이용한 표준화

		Scanner sc = new Scanner(System.in);
		final int MAX = 50;
		
		System.out.print("제품을 선택해주세요.\n1. TV \n2. Radio \n3. speaker\n숫자 입력 : ");
		int input1 = sc.nextInt();
		
		if(input1 == 1) {
			System.out.print("TV전원을 켜시겠습니까? (yes/no) : ");
			String answer = sc.next();
			if(answer.equals("yes")) {
				System.out.println("TV 전원이 켜졌습니다.볼륨을 몇으로 할까요?");
				String Volume = sc.next();
				System.out.println("현재 볼륨은" + Volume + "입니다.");
				
			}else {
				System.out.println("TV전원을 켜지않습니다.");
			}
			
		} else if (input1 == 2){
			System.out.print("Radio전원을 켜시겠습니까? (yes/no) : ");
			String answer = sc.next();
			if(answer.equals("yes")) {
				System.out.println("Radio 전원이 켜졌습니다. 볼륨을 몇으로 할까요?");
			}
			else {
				System.out.println("Radio전원을 켜지않습니다.");
			}
			
		} else {
			System.out.print("speaker전원을 켜시겠습니까? (yes/no) : ");
			String answer = sc.next();
			if(answer.equals("yes")) {
				System.out.println("speaker 전원이 켜졌습니다. 볼륨을 몇으로 할까요?");
			}else {
				System.out.println("speaker전원을 켜지않습니다.");
			}
		}

		

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
