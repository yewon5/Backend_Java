class ClassDemo2 {
	//ClassDemo2(){//보이지 않지만 기본적으로 모든 클래스에는 생성자가 생략되어 있다.
	//}
	int iValue;
	
	ClassDemo2(int i){
		System.out.println(i); //기본생성자가 없기때문에 17번에서 오류가 난다.
	}
	
	ClassDemo2(){ //기본생성자를 다시 만들어주면 17번의 오류가 풀린다.
	}
}

public class ConsTest1 {

	public static void main(String[] args) {
		// TODO 생성자 기본 개요
		ClassDemo2 ob1 = new ClassDemo2(); 
		ClassDemo2 ob2 = new ClassDemo2(10);
		
		//int i; //초기화를 안 할 경우 출력시 오류남
		int i = 0;
		System.out.println(i);
		System.out.println(ob1.iValue); //인스턴스 변수는 따로 초기화하지 않아도 오류나지 않음
	}
}
