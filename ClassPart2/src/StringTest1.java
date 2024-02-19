import java.util.jar.Attributes.Name;

public class StringTest1 {
	public static void main(String[] args) {
		// TODO String클래스 사용법

/*
		//문자에 배열사용시 매우 비효율적.
		char name1[] = {'홍', '길', '동'}; 
		for(int i =0; i<name1.length; i++)
			System.out.println(name1[i]);
*/
		//방법1
		String name1 = new String(); //name1참조변수. new String빈 문자열
		name1 = "홍길동";
		System.out.println(name1);
		
		String name2 = new String("임꺽정");
		System.out.println(name2);
		
		String name3 = "김수한무거북이와두루미";
		System.out.println(name3);
		System.out.println();
		
		//방법2 배열 사용
		String[] names = new String[3]; //3개의 문자열을 따로따로 저장한다.
		names[0] = "홍길동";
		names[1] = "임꺽정";
		names[2] = "김수한무거북이와두루미";
		
		for(int i=0; i<names.length; i++)
			System.out.println(names[i]);
		
		System.out.println("김수한무거북이와두루미".length()); 
		//"김수한무거북이와두루미"문자열은 String 클래스의 인스턴스라서 .length()메서드를 사용할 수 있다.
	}
}
