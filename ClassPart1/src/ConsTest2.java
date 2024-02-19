class ClassDemo3 {
	int iValue;
	double dValue;
	
	void print() { //38번
		System.out.println(iValue + "," + dValue);
	}
	
	//void setValue(int i, double d) {
/*
		//검증 코드
		iValue = i;
		dValue = d;
*/		
	//}

	 ClassDemo3(int i, double d){ //37번 생성자 메서드
		//검증 코드
		iValue = i;
		dValue = d;
	 }
}

public class ConsTest2 {
	public static void main(String[] args) {
		// TODO 생성자 활용 사례

/*		
		ClassDemo3 demo1 = new ClassDemo3(); //iValue; dValue; .println 각각 메모리에 저장. demo1 인스턴스의 주소를 저장하는 참조 변수
	
		demo1.iValue = 10; //직접 변수에 값을 넣는 것은 검증이 되지 않기때문에 선호하지 않는다. 메서드를 이용해서 값을 넣자.
		demo1.dValue = 3.14;
		demo1.print();

		demo1.setValue(10, 3.14); //.setValue 메서드를 이용해서 값을 넣자.
*/
		ClassDemo3 demo1 = new ClassDemo3(10, 3.14);
		demo1.print();
	}
}
