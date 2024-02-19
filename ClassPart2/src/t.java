import java.io.IOException;

public class t {
	public static void main(String[] args) throws IOException {
		// TODO 순차 검색
		char data[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		System.out.print("찾고자 하는 문자 : ");
		char search = (char)System.in.read();
		
		for(int i=0; i<data.length; i++) { //찾을때까지 반복
			if(search == data[i]) {//순서대로 꺼내오기
				System.out.println("찾았다!");
				break; //a를 입력했을때 (못못못...찾) 배열 수 만큼 전부 출력된다. break로 끊어주기.
			}else {
				System.out.println("못찾았다..");
			}
		}
	}
}