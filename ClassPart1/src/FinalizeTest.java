class FDemo { //자바는 기본적으로 상속을 받는 클래스가 존재한다.
	int count;
	
	FDemo(int i) { //객체를 생성할 때 마다 count 변수에 들어간다.
		count = i;
	}
	
	protected void finalize() {
		System.out.println("Garbage Collection 가동 : " + count);
	} //오버라이딩
}

public class FinalizeTest {
	public static void main(String[] args) {
		// TODO Garbage Collection 확인
		
		for(int i=0; i<1000000; i++) {
			new FDemo(i);
		}
	}
}