//고객정보 저장하는 기능만 만들어보기.
public class Cms {
	private int no;
	private String name;
	private char level;
	//변수 앞에 private을 붙이면 자식 클래스 변수에 오류가 뜬다. 상속은 됐지만 접근을 못하는 것. 어떻게 해결할까?
	
	//아래의 생성자를 만들때는 기본생성자도 꼭 명시해두기.
	public Cms() {} 
	
	//클래스에 정의된 필드(멤버 변수)를 기반으로 생성자를 자동으로 생성 (Source → Generate Constructor using Fields)
	//생성자 제외, 변수와 display 메서드만 상속이 된다.
	public Cms(int no, String name, char level) { 
		super();
		this.no = no;
		this.name = name;
		this.level = level;
	}
	
	//출력 기능
	void display() {
		System.out.println("고객번호 : " + no);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + level);
	}
}
