package bytestream;

import java.io.Serializable;

public class Employee implements Serializable { //Serializable 직렬화가 되어 있어야 파일을 읽고 쓸수 있는 클래스가 된다
	private int no;
	private String name;
	private String job;
	private int dept;
	private double sal;
	
	//Employee 클래스의 생성자. 객체 초기화
	public Employee(int no, String name, String job, int dept, double sal) {
		this.no = no;
		this.name = name;
		this.job = job;
		this.dept = dept;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + job + "\t" + dept + "\t" + sal;
	}
}
