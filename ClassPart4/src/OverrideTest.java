class TwoDShape {
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
	
	double area() {
		System.out.println("면적 구하기");
		return 0.0;
	} //여기까지가 2차원도형을 만들때 부모가 준비할 최소한의 코드
}


public class OverrideTest {

	public static void main(String[] args) {
		// TODO 부모-자식의 참조 관계, 오버라이딩

	}

}
