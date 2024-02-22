public class InheritanceTest {
	public static void main(String[] args) {
		// TODO 기본 상속 개념
		
		Cms kim = new Cms(1, "김유신", 'C');
		kim.display();
		
		System.out.println("--------------------");
		
		CmsExt hong = new CmsExt(2, "홍길동", 'A', "서울시 강남구"); //객체2개 생성. Cms객체가 먼저 생성되고, CmsExt객체가 생성된다.
		hong.display();
	}
}
