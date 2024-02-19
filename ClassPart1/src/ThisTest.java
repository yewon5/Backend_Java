class ThisDemo { //class 설계도만 생성 → 활용하려면 인스턴스를 생성해야함(20번)
	int iValue;
	double dValue;
	
	//ThisDemo(int i, double d){ //ThisDemo() 기본생성자 만들기, (int i, double d) 매개변수 (오버로딩) 생성
	//	iValue = i;
	//	dValue = d;
	//}
	
	//지역변수 이름을 인스턴스 변수와 똑같은 이름으로 했을때
	ThisDemo(int iValue, double dValue){ //ThisDemo() 기본생성자 만들기, (int i, double d) 매개변수 (오버로딩) 생성
		iValue = iValue; //지역변수들끼리 값을 넣어줘서 0이 출력된다.
		this.dValue = dValue; //this로 구분하면 값이 출력된다.
	}
	
	ThisDemo(){} //기본 생성자에 매개변수를 넣으면 기본생성자는 사라지므로 1개 만들어준다.
	
	void display() {
		System.out.println("결과 : " + iValue + ", " + dValue); //여기서 iValue 2번
	}
}

public class ThisTest {
	public static void main(String[] args) {
		// TODO this의 개념
		ThisDemo td1 = new ThisDemo(10, 10.0);
		ThisDemo td2 = new ThisDemo(20, 20.0);
		ThisDemo td3 = new ThisDemo(30, 30.0);
		
		td1.display();
		td2.display();
		td3.display();
	}
}
