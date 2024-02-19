public class ArrayTest {
	public static void main(String[] args) {
		// TODO 배열의 기본
		int no=1, kor=70, eng=55, mat=87;

/*
		//위의 4개의 공간을 한줄로 연속적으로 붙여놓음. new int는 주소 arr 참조변수. 타입명뒤에 []붙인다.
		//배열은 떨어져 있는 각각의 메모리를 연속적으로 붙여놓는다. 시작주소만 알면 인덱스로 접근한다 [0], [1], [2] ...
		int arr[] = new int[4]; //int[] arr 대괄호의 위치는 상관 없다.
		arr[0] = 1;
		arr[1] = 70;
		arr[2] = 55;
		arr[3] = 87;
*/
		
		//위의 코드를 한줄로 간단하게.
		int arr[] = {1, 70, 55, 87}; //선언하자마자 동시에 초기화해야함.
		
		//배열을 사용하면 반복문을 쓸 수 있다.
		for(int i=0; i<arr.length; i++) { //배열의 수가 항상 같을 순 없으니까 arr.length; 객체를 이용한다.
			System.out.println(arr[i]);
		}
	}
}
