class Employee { //접근 제어자를 명시하지않으면 default(부분 허용) 기본값
	int no;
	public String name;
	private double salary;
	
	void setSalary(double sal) { //객체의 필드 값을 설정하는 메서드 Setter method 
		salary = sal;
	}
	
	double getSalary() { //객체의 필드 값을 가져오는 메서드 Getter method
		return salary;
	}
}

public class AccessModifierTest {
	public static void main(String[] args) {
		// TODO 접근 제어명시자 테스트
		
		Employee emp = new Employee(); //인스턴스 생성
		emp.no = 1234; //default 외부 접근 부분 허용
		emp.name = "홍길동"; //public 외부 접근 완전 허용
		
		//emp.salary = 1000000; //private 외부 접근 완전 거부
		emp.setSalary(1000000); //Setter 메서드를 이용해서 값을 설정한다.
		System.out.println(emp.getSalary()); //Getter 메서드를 이용해서 값을 출력한다.
	}
}
