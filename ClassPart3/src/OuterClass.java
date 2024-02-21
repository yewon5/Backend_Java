/*
public class OuterClass {
	private int outer;
	
	static class InnerClass { //new OuterClass 없어도 new InnerClass 인스턴스 만들 수 있다
		private int inner;
		
		void innerMethod() {
			System.out.println("inner : " + inner);
			
			OuterClass oc = new OuterClass();
			oc.outer = 200;
			System.out.println("outer : " + oc.outer);
		}
	}
	
	public static void main(String[] args) {
		// TODO 내부클래스가 static(정적)인 경우
		
		InnerClass ic = new InnerClass();
		ic.inner = 100;
		ic.innerMethod();
	}
}
*/

public class OuterClass {
	private int outer;
	
	class InnerClass {
		private int inner;
		
		void innerMethod() {
			System.out.println("inner : " + inner);
			
			outer = 200;
			System.out.println(outer);
		}
	}
	
	public static void main(String[] args) {
		// TODO 내부클래스가 일반 클래스(비정적)인 경우
		
		//InnerClass ic = new InnerClass(); 
		//오류가 나는 이유는 static을 제거해서. 내부 클래스가 외부 클래스의 인스턴스에 종속되어 있기 때문에 독립적으로 객체를 생성할 수 없다.
		
		//OuterClass객체가 생성되고 난 다음에 InnerClass객체를 생성해야 한다.
		//OuterClass oc = new OuterClass();
		//InnerClass ic = oc.new InnerClass();
		
		//위의 두개의 코드를 더 간단하게
		OuterClass.InnerClass ic = new OuterClass().new InnerClass();
		ic.inner = 100;
		ic.innerMethod();
	}
}