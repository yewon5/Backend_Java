import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		
		set.add("carrie");
		set.add("Kabbin");
		set.add("kairo");
		set.add("kairo");
		set.add("kariss");
		
		System.out.println("데이터의 갯수 : " + set.size()); //중복된 데이터 제거
		System.out.println(set.toString()); //무작위로 저장됨
		
		TreeSet ts  = new TreeSet();
		ts.add("juliet");
		ts.add("terry");
		ts.add("kabbin");
		ts.add("terry");
		ts.add("carrie");
		System.out.println("데이터의 갯수 : " + ts.size()); //중복된 데이터 제거
		System.out.println(ts.toString()); //오름차순 정렬
		
		/*
		for(int i=0; i<set.size(); i++) {
			System.out.println(set.get(i)); //get메서드가 없다.
		}
		*/
		
		//그럼 set은 어떻게 불러올까?
		Iterator it = set.iterator(); // iterator set의 데이터를 열거, 나열, 줄세운다
		while(it.hasNext()) { 
			System.out.println(it.next());
		}
	}
}
