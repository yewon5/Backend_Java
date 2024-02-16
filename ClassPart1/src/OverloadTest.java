public class OverloadTest {
	
	void dispaly() {//아무 인자 없이 출력
		System.out.println("출력 내용이 없음");
	}
	
	void dispaly(int i) { //객체 지향 언어는 똑같은 메서드 생성 가능
		System.out.println(i);
	}
	
	void dispaly(int i, double d) {
		System.out.println(i + "," + d);
	}
	
	void dispaly(double d,int i){ //정수 먼저, 실수 나중
		System.out.println(d + "," + i);
	}
	
	public static void main(String[] args) {
		// TODO 메서드의 오버로드 
		//.println도 오버로드
		
		OverloadTest ot = new OverloadTest();
		ot.dispaly();
		ot.dispaly(10);
		ot.dispaly(3.14, 100);
		ot.dispaly(100, 2.5);	
	}
}
