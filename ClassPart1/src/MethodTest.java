class UI{
	void line(int cnt, char type) { //void 반환형이 없다. 있다면 타입/클래스 이름을 적는다. line()메서드이름. 매개 변수도 항상 타입으로 선언해준다.
		for(int i=0; i<cnt; i++)
			System.out.print(type); //print 줄바꿈 없음
		
		System.out.println(); //println 줄바꿈
	}
}
public class MethodTest {
	int sum(int num1, int num2) {
		int num3 = num1 + num2;
		return num3;
		//System.out.println("결과 : " + num3); 
	}
	public static void main(String[] args) {
		// TODO 메서드 작성 방법과 사용법
		
		UI ui = new UI();
		
		ui.line(30, '*');
		System.out.println("채팅 프로그램");
		ui.line(30, '-');
		System.out.println("1. 방 만들기");
		System.out.println("2. 나가기");
		ui.line(30, '~');
		
		//반환형이 있는 경우
		int num1=10, num2=5;
		
		System.out.println("두 수의 합계");
		MethodTest mt = new MethodTest();
		int num3 = mt.sum(num1, num2); //11번 → 12번 → 33번 
		System.out.println("결과 : " + num3);
	}
}
