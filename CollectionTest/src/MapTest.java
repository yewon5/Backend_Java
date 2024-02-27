import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("k1", "홍길동"); // put(key, value)
		map.put("k2", "임꺽정");
		map.put("k3", "유비");
		map.put("k4", "관우");
		map.put("k5", "장비");

		System.out.println("데이터의 갯수 : " + map.size());
		System.out.println(map.toString()); //k1=홍길동 키와 값이 한 쌍
		
		System.out.println(map.get("k2")); //key값으로 바로 꺼내오기
		
		//map(Collection)은 인덱스가 없기때문에 반복문으로 바로 꺼내오는 것은 불가 → key만 꺼내서 set계열로 바꿔줘야 한다.
		Set set = map.keySet(); //keySet(): Map에 있는 모든 키를 반환
		Iterator it = set.iterator(); //iterator set의 데이터를 열거, 나열, 줄세운다
		while(it.hasNext()) { //hasNext() 다음 요소가 있는지 확인하고 있으면 꺼내온다
			String key = (String)it.next(); //(String)캐스팅. 서로 다른 클래스는 캐스팅 불가한데, 가능한 이유는 next() 메서드가 일반적으로 Object를 반환하기 때문에 Object는 최상위 부모클래스
			System.out.println(map.get(key)); //get(key) 해당 값 반환
		}
	}
}
