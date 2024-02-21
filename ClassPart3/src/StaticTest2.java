
public class StaticTest2 {
	StaticTest2(){
		System.out.println("생성자가 호출됨"); //나중 호출
	}
	
	static double d1, d2;
	static {
		System.out.println("static이 호출됨"); //먼저 호출
		d1 = Math.sqrt(4.0); //Math.sqrt 제곱근구하기
		d2 = Math.sqrt(8.0); //sqrt은 Math클래스의 static 메서드
	}
	
	public static void main(String[] args) {
		// TODO static block과 생성자와의 생성 순서비교
		new StaticTest2();
		System.out.println(d1 + ", " + d2); 
		//기본메서드라면 new Math라는 객체를 생성해서 호출해야하는데, static 메서드라서 바로 호출가능하다.
	}
}
