//고객정보 저장하는 기능만 만들어보기.
public class Cms {
	private int no;
	private String name;
	private char level;
	
	//클래스에 정의된 필드(멤버 변수)를 기반으로 생성자를 자동으로 생성 (내ㅛ → Generate Constructor using Fields)
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
