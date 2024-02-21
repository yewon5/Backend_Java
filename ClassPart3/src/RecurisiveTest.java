public class RecurisiveTest {
	//반복문
	int fact1(int num) { 
		int result = 1;
		
		for(int i=1; i<=num; i++) {
			result *= i;
		}
		
		return result;
	}
	
	//재귀함수	
	int fact2(int num) { //4부터 시작. 재귀 호출될때마다 새로운 스택 프레임을 생성한다.
		int result = 0; //초기화 팩토리얼 값 저장
		
		if(num == 1) { 
			return 1; //21번의 가장 마지막 주소부터 stack 방식으로 주소를 꺼내오며 다시 14번으로 돌아간다. num이 1인 경우 팩토리얼 값은 1이므로 1을 반환하고 메서드 종료
		} //끝나는 조건이 반드시 있어야한다. 그렇지 않으면 무한루프!
		
		result = fact2(num-1) * num; //14번으로 간다.
		return result;
	}
	
	public static void main(String[] args) {
		// TODO 재귀 함수 (stack 메모리 활용)

		RecurisiveTest rt = new RecurisiveTest();
	
		System.out.println("반복문 사용 : " + rt.fact1(4));
		System.out.println("재귀호출 사용 : " + rt.fact2(4)); // 현재 주소를(100번지) 저장해놓고 14번으로 간다.
	}
}
