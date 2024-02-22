//extends : Cms의 코드 상속 받기! Cms(super 부모클래스) CmsExt(sub 자식 클래스)
public class CmsExt extends Cms{ 
	private String address;
	
	public CmsExt (int no, String name, char level, String address){ //생성자
		//this.no= no;
		//this.name= name;
		//this.level= level;
		//Cms클래스 변수 앞에 private을 붙이니 위의 변수에 오류가 뜬다. 어떻게 해결할까? 아래와 같이 super() 생성자에 매개변수를 넣어준다.
		super(no, name, level); //부모를 호출할때는 CmsExt생성자의 맨 첫번째줄에서 사용해야 한다. 
		this.address= address;
		//위의 변수를 만들지 않았는데도 사용할 수 있는 이유는 extends Cms 코드를 상속 받았기때문에
	}
	
/*
	//숨겨져있지만 부모클래스에서 아래 메서드도 상속 받음
	void display() {
		System.out.println("고객번호 : " + no);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + level);
	} 
 */

/*
	//오버라이딩. 위의 부모 메서드 코드랑 똑같이 해주면 된다. 하지만 이렇게 하면 무한루프다
	void display() { //display(int i) 이건 오버로딩임
		display(); //부모클래스의 display라는 메서드도 여기 있기때문에 사용가능
		System.out.println("고객주소 : " + address);
	}
*/
 	//super를 추가한다.
	void display() { //display(int i) 이렇게하면 오버로딩임
		super.display();
		System.out.println("고객주소 : " + address);
	}
}
