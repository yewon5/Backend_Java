class ClassDemo1{ //설계도 iValue,dValue을 묶어서 메모리에 저장.(인스턴스)
	int iValue; //클래스안에서 선언된 인스턴스 변수. 멤버 변수
	double dValue;
}

public class ClassTest {
	public static void main(String[] args) {
		// TODO 클래스의 인스턴스 생성
		//iValue = 10; //오류. 선언된 코드블럭 안에서 변수를 지정해야 한다.
		//new ClassDemo1() .iValue = 10; //new연산자가 ClassDemo1()를 호출. 저장은 성공했지만 꺼내올 수는 없다. 왜일까? 주소를 몰라서!!
		//System.out.println(new ClassDemo1().iValue); //이렇게 하면 출력이 될 것 같지만 새로운 저장소를 또 만든 것.
		
		
		//변수 선언. ClassDemo1는 데이터타입을 int+double 묶어 놨기 때문에 클래스 이름으로 선언해줘야 한다. cd1 메모리의 주소를 저장하는 참조 변수. p164
		ClassDemo1 cd1 = new ClassDemo1(); //참조 변수에서 ClassDemo1설계도로 만든 메모리의 주소만 넣을 수 있다
		cd1.iValue = 10;
		System.out.println(cd1.iValue);
		
		int iValue = 100; //메서드안에서 선언된 변수. 지역 변수. iValue 하나의 값을 저장하는 일반변수(리터럴)
		//cd1 = 1000; //참조 변수 cd1는 ClassDemo1설계도로 만든 메모리의 주소만 넣을 수 있다.
		//iValue = cd1; //iValue는 int형 데이터 값이 들어와야해서 cd1주소값이 들어올 수 없다.
	}
}