import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("carrie"); //컬렉션 인터페이스에 add메서드가 있어서 상속 받음
		list.add("kairo");
		list.add("kabbin");
		list.add("kairo");
		list.add("terry");
		
		System.out.println("데이터의 갯수 : " + list.size()); //중복된 데이터 포함
		System.out.println(list.toString()); //입력된 순서대로 저장됨
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		if(list.contains("kairo")) {//kairo가 있는지 찾아준다
			System.out.println("찾았다.");
			System.out.println((list.indexOf("kairo") + 1) + "번째 있다."); //문자열 인덱스가 0부터 시작이라 보기 쉽게 +1해줬음
			
		} else {
			System.out.println("못찾았다.");
		}
		
		//2번째자리에 100 데이터를 삽입
		list.add(2, 100);
		System.out.println(list); //[carrie, kairo, 100, kabbin, kairo, terry]
		
		//3번째자리 삭제
		list.remove(3);
		System.out.println(list); //[carrie, kairo, 100, kairo, terry]
	}
}
