abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	public TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}

	//private일때는 Getter, Setter 메소드 필수 (Source
	public double getWidth() {return width;}
	public double getHeight() {return height;}
	public String getName() {return name;}
	
/*	
	double area() {
		System.out.println("면적 구하기");
		return 0.0; //19번과 20번은 사실 없어도 되는 코드이다. 
	} 
*/	
	//추상메서드 : 내용 없이 메서드를 만들 수 있게 하는 것 1번에도 abstract를 붙인다. 
	abstract double area();
	
	//여기까지가 2차원도형을 만들때 부모가 준비할 최소한의 코드
}


class Triangle extends TwoDShape {
	public Triangle(double w, double h) {
		super(w, h, "triangle"); //부모의 생성자를 호출해서 
	}
	
	/* 17번 double area() 메서드가 상속을 받아 숨겨져 있다 */
	
	//삼각형의 면적을 구하는 코드
	double area() {
		return getWidth() * getHeight() / 2; 
	}//17번의 코드를 고쳐서 쓴다. 오버라이딩
}


class Rectangle extends TwoDShape {
	public Rectangle(double w, double h) {
		super(w, h, "rectangle"); //부모의 생성자를 호출
	}
	
	//사각형의 면적을 구하는 코드
	double area() {
		return getWidth() * getHeight();
	}
}


public class OverrideTest {
	public static void main(String[] args) {
		// TODO 부모-자식의 참조 관계, 오버라이딩

		TwoDShape shapes[] = new TwoDShape[5];
		shapes[0] = new Triangle(8.0, 12.0);
		shapes[1] = new Rectangle(20.0, 10.0);
		shapes[2] = new Rectangle(10.0, 4.0);
		shapes[3] = new Triangle(7.0, 10.0);
		//shapes[4] = new TwoDShape(1.0, 1.0, "일반"); //추상클래스느 더이상 인스턴스를 생산할수 없다.
		
		for(int i=0; i<4; i++) {
			System.out.println("이름 : " + shapes[i].getName());
			System.out.println("면적 : " + shapes[i].area());
			System.out.println("-----------------------------");
		}
	}
}
