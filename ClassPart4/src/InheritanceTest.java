public class InheritanceTest {
	public static void main(String[] args) {
		// TODO 기본 상속 개념
		
		Cms kim = new Cms(1, "김유신", 'C');
		kim.display();
		
		System.out.println("--------------------");
		
		CmsExt hong = new CmsExt(2, "홍길동", 'A', "서울시 강남구"); //객체2개 생성. Cms객체가 먼저 생성되고, CmsExt객체가 생성된다.
		hong.display();
		
		System.out.println("--------------------");
		
		// toString() 활용
		System.out.println(hong); 
		System.out.println(hong.toString()); //홍의 주소값 CmsExt@1c6b6478
		//CmsExt에서 오버라이딩 했기때문에 [address : 서울시 강남구]가 출력된다.
	}
}
