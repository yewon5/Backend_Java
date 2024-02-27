import java.util.ArrayList;

public class GenericTest1 {
	public static void main(String[] args) {
		// TODO 타입을 미리 체크하기
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		//문자열을 저장하려고 만든 자료인데 모르고 숫자를 저장했을 때 코드에 오류가 뜨진 않지만 출력했을때 오류가 뜬다. 
		list.add("100"); 
		
		String str = null;
		for(int i=0; i<list.size(); i++) {
			str = (String)list.get(i);
			System.out.println(str);
		}
	}
}
