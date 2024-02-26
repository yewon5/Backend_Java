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

class TV implements Volume, Power { //오버라이딩을 해야하기때문에 무조건 volumeUP, volumeDown을 써야한다.(표준화)
	private int vol; //볼륨 변수 준비
    private int nowVol = 0; //현재 볼륨을 저장할 변수
	
	@Override
	public void powerOn() {
		System.out.println("TV 전원이 켜졌습니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원을 종료합니다");
	}
    
	public void volumeUP(int vol) { //오버라이딩.
        if (this.nowVol + vol > 50) {
            System.out.println("최대 소리는 50입니다.");
            this.nowVol = 50;
        } else {
            this.nowVol += vol;
            System.out.println("TV 소리를 " + vol + "만큼 올렸습니다.");
        }
	}
	
	//@가 붙으면  Annotation. 만약 스펠링이 틀리면 새로운 메서드가 만들어지는데 코드 바로 위에 @Override 써주면 오류를 잡아준다.
	@Override //아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		if (this.nowVol - vol < 0) {
            System.out.println("음소거가 되었습니다.");
            this.nowVol = 0;
        } else {
            this.nowVol -= vol;
            System.out.println("TV 소리를 " + vol + "만큼 내렸습니다.");
        }
	}
	
	public void display() {
		System.out.println("현재 소리는 " + this.nowVol + "입니다.");
	}
}

class Radio implements Volume, Power {
	private int vol; //볼륨 변수 준비
    private int nowVol = 0; //현재 볼륨을 저장할 변수
	
	@Override
	public void powerOn() {
		System.out.println("Radio 전원이 켜졌습니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Radio 전원을 종료합니다");
	}
	
	public void volumeUP(int vol) {
        if (this.nowVol + vol > 50) {
            System.out.println("최대 소리는 50입니다.");
            this.nowVol = 50;
        } else {
            this.nowVol += vol;
            System.out.println("Radio 소리를 " + vol + "만큼 올렸습니다.");
        }
	}

	@Override //아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		if (this.nowVol - vol < 0) {
            System.out.println("음소거가 되었습니다.");
            this.nowVol = 0;
        } else {
            this.nowVol -= vol;
            System.out.println("Radio 소리를 " + vol + "만큼 내렸습니다.");
        }
	}
	
	public void display() {
		System.out.println("현재 소리는 " + this.nowVol + "입니다.");
	}
}

class Speaker implements Volume, Power {
	private int vol; //볼륨 변수 준비
    private int nowVol = 0; //현재 볼륨을 저장할 변수
	
	@Override
	public void powerOn() {
		System.out.println("Speaker 전원이 켜졌습니다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("Speaker 전원을 종료합니다");
	}

	public void volumeUP(int vol) {
        if (this.nowVol + vol > 50) {
            System.out.println("최대 소리는 50입니다.");
            this.nowVol = 50;
        } else {
            this.nowVol += vol;
            System.out.println("Speaker 소리를 " + vol + "만큼 올렸습니다.");
        }
	}

	@Override //아직 구현되지 않는 메서드를 추가해주겠다.
	public void volumeDown(int vol) {
		if (this.nowVol - vol < 0) {
            System.out.println("음소거가 되었습니다.");
            this.nowVol = 0;
        } else {
            this.nowVol -= vol;
            System.out.println("Speaker 소리를 " + vol + "만큼 내렸습니다.");
        }
	}
	
	public void display() {
		System.out.println("현재 소리는 " + this.nowVol + "입니다.");
	}
}
public class InterfaceTest2  {
	public static void main(String[] args) throws IOException {
		// TODO 인터페이스를 이용한 표준화

		Scanner scanner = new Scanner(System.in);
		TV tv = new TV();
		Radio radio = new Radio();
		Speaker speaker = new Speaker();

        while(true) {
		System.out.print("제품을 선택해주세요.\n1. TV \n2. Radio \n3. speaker\n번호 입력 : ");
		int choice = scanner.nextInt();
		System.out.println();
		
	//TV
			if(choice == 1) {
				System.out.print("TV 전원을 켜시겠습니까? \n1. Yes \n2. No\n번호 입력 : ");
				int power = scanner.nextInt();
				System.out.println();
				
				if(power == 1) {	
					tv.powerOn();
					
					while (true) {
					    System.out.print("1. 소리 증가\n2. 소리 감소\n번호 입력 : ");
					    int volchoice = scanner.nextInt();
					    System.out.println();

					    if (volchoice == 1) {
					        System.out.print("소리를 조절하세요.(0~50)\n입력 : ");
					        int vol = scanner.nextInt();
					        System.out.println();

					        if (vol <= 0) {
					            tv.volumeDown(0);
					            System.out.println("음소거가 되었습니다.");
					        } else if (vol > 50) {
					            tv.volumeUP(50);
					            System.out.println("최대 소리로 설정되었습니다.");
					        } else {
					            tv.volumeUP(vol);
					        }

					        tv.display();
					        System.out.println();
					    } else if (volchoice == 2) {
					        System.out.print("소리를 조절하세요.(0~50)\n입력 : ");
					        int vol = scanner.nextInt();
					        System.out.println();

					        if (vol <= 0) {
					            tv.volumeDown(0);
					            System.out.println("음소거가 되었습니다.");
					            System.out.println();
					        } else if (vol > 50) {
					            tv.volumeUP(50);
					            System.out.println("최대 소리로 설정되었습니다.");
					        } else {
					            tv.volumeDown(vol);
					        }

					        tv.display();
					        System.out.println();
					    }
					}				
	//TV 종료
				}else {
					tv.powerOff();
				}
				//Radio
			}else if(choice == 2) {
					System.out.print("Radio 전원을 켜시겠습니까? \n1. Yes \n2. No\n번호 입력 : ");
					int power = scanner.nextInt();
					System.out.println();
					
					if(power == 1) {	
						radio.powerOn();
					
					while (true) {
					    System.out.print("1. 소리 증가\n2. 소리 감소\n번호 입력 : ");
					    int volchoice = scanner.nextInt();
					    System.out.println();

					    if (volchoice == 1) {
					        System.out.print("소리를 조절하세요.(0~50)\n입력 : ");
					        int vol = scanner.nextInt();
					        System.out.println();

					        if (vol <= 0) {
					            tv.volumeDown(0);
					            System.out.println("음소거가 되었습니다.");
					        } else if (vol > 50) {
					            tv.volumeUP(50);
					            System.out.println("최대 소리로 설정되었습니다.");
					        } else {
					            tv.volumeUP(vol);
					        }

					        tv.display();
					        System.out.println();
					    } else if (volchoice == 2) {
					        System.out.print("소리를 조절하세요.(0~50)\n입력 : ");
					        int vol = scanner.nextInt();
					        System.out.println();

					        if (vol <= 0) {
					            tv.volumeDown(0);
					            System.out.println("음소거가 되었습니다.");
					            System.out.println();
					        } else if (vol > 50) {
					            tv.volumeUP(50);
					            System.out.println("최대 소리로 설정되었습니다.");
					        } else {
					            tv.volumeDown(vol);
					        }

					        tv.display();
					        System.out.println();
					    }
					}
	//Radio 종료
				}else {
					radio.powerOff();
				}		
					//Speaker			
			}else if(choice == 3) {
				System.out.print("Speaker 전원을 켜시겠습니까? \n1. Yes \n2. No\n번호 입력 : ");
				int power = scanner.nextInt();
				System.out.println();
				
				if(power == 1) {	
					speaker.powerOn();
				
				while (true) {
				    System.out.print("1. 소리 증가\n2. 소리 감소\n번호 입력 : ");
				    int volchoice = scanner.nextInt();
				    System.out.println();

				    if (volchoice == 1) {
				        System.out.print("소리를 조절하세요.(0~50)\n입력 : ");
				        int vol = scanner.nextInt();
				        System.out.println();

				        if (vol <= 0) {
				            tv.volumeDown(0);
				            System.out.println("음소거가 되었습니다.");
				        } else if (vol > 50) {
				            tv.volumeUP(50);
				            System.out.println("최대 소리로 설정되었습니다.");
				        } else {
				            tv.volumeUP(vol);
				        }
				        
				        tv.display();
				        System.out.println();
				    } else if (volchoice == 2) {
				        System.out.print("소리를 조절하세요.(0~50)\n입력 : ");
				        int vol = scanner.nextInt();
				        System.out.println();

				        if (vol <= 0) {
				            tv.volumeDown(0);
				            System.out.println("음소거가 되었습니다.");
				            System.out.println();
				        } else if (vol > 50) {
				            tv.volumeUP(50);
				            System.out.println("최대 소리로 설정되었습니다.");
				        } else {
				            tv.volumeDown(vol);
				        }
				        
				        tv.display();
				        System.out.println();
				    }
				}
	//Speaker 종료				
				}else {
					speaker.powerOff();
				}
			} else {
				System.out.println("1, 2, 3번 중 다시 선택해주세요.");
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