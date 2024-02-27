class GenericDemo<T> { 
	private /*int*/T value;
	
	public GenericDemo(/*int*/T v) {
		value = v;
	}
	
	/*int*/T getValue() {
		return value;
	}
}

public class GenericTest2 {
	public static void main(String[] args) {
		// TODO Generic class 만들기
		
		GenericDemo<Integer> demo1 = new GenericDemo<Integer>(10); //제너릭을 사용하면 확실하고 안전하게 코드를 사용할 수 있다. 객체타입이 와야함 대문자!!
		System.out.println(demo1.getValue()); //게터메서드로 불러오기
		
		//실수 값을 넣고 싶을 떄
		GenericDemo<Double> demo2 = new GenericDemo<Double>(3.14);
		System.out.println(demo2.getValue());

		//문자열 값을 넣고 싶을 떄
		GenericDemo<String> demo3 = new GenericDemo<String>("100");
		System.out.println(demo3.getValue());
	}
}
