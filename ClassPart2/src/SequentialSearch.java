import java.io.IOException;

public class SequentialSearch {
	public static void main(String[] args) throws IOException {
		// TODO 순차 검색 (문제:이진검색으로도 바꿔보기)
		char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		System.out.print("찾고자 하는 문자 : ");
		char search = (char)System.in.read();
		
		boolean result = false; //추가
		int i;
		for(i=0; i<data.length; i++) { //입력 값을 찾을때까지 반복
			if(search == data[i]) { //배열의 현재 요소가 검색 대상 search와 일치하는지 확인
				result = true; //추가. 만약 일치하는 요소를 찾았다면, result 변수에 true 값을 할당한다. 이는 검색 결과가 발견되었음을 나타낸다.
				break; //찾을 경우 반복문 종료.
			}else {
				result = false; //만약 현재 요소가 검색 대상과 일치하지 않는다면, result 변수에 다시 false 값을 할당
			}
		}
		
		if(result == true) { //반복이 끝나고 나서 조건문을 걸어준다.
			System.out.println("찾았다! " + (i+1) + "번째에 있다.");
		}else {
			System.out.println("못찾았다..");
		}
	}
}
