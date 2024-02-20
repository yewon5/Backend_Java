class Student {
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
	Student(String name, int no, int kor, int eng) {
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	}
}
public class Sungjuk_v3 {
	public static void main(String[] args) {
		// TODO class와 배열을 이용한 성적표
		
		Student[] students = new Student[3]; //배열 선언. Student 클래스의 객체들을 담을 수 있다. 참조변수 3개 생성. 객체주소 저장 공간
		students[0] = new Student("홍길동", 1, 98, 90); //Student 클래스의 인스턴스생성(객체생성) 생성자 호출.
		students[1] = new Student("임꺽정", 2, 76, 55);
		students[2] = new Student("신돌석", 3, 85, 73);
		
		//총점
		for(int i=0; i<students.length; i++) {
			students[i].tot = students[i].kor + students[i].eng; 
		}
		
		
		//평균
		for(int i=0; i<students.length; i++) {
			students[i].avg = students[i].tot / 2;
		}
		

		//학점
		for(int i=0; i<students.length; i++) {
			if(students[i].avg >= 90)
				students[i].grade = 'A';
			else if (students[i].avg >= 80)
				students[i].grade = 'B';
			else if (students[i].avg >= 70)
				students[i].grade = 'c';
			else if (students[i].avg >= 60)
				students[i].grade = 'D';
			else
				students[i].grade = 'F';
		}

		
		//등수
		for(int i=0; i<students.length; i++) {
			students[i].rank = 1;
			for(int j=0; j<students.length; j++) {
				if(students[j].avg > students[i].avg) {
					students[i].rank++;
				}
			}
		}

		
		System.out.println("**** 성적표 ****");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("------------------------------------------------------------");
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].no + "\t" + students[i].name + "\t"+ students[i].kor + "\t" + students[i].eng + "\t" 
		+ students[i].tot + "\t" + students[i].avg + "\t" + students[i].grade + "\t" + students[i].rank);
		}
		
		System.out.println("\n\n 정렬 후 ...\n");
		
		for(int row=0; row<students.length-1; row++) { //행의 반복 
			for(int col=row+1; col<students.length; col++) {
				if(students[row].avg < students[col].avg) {
					Student temp = students[row]; //students 배열의 요소가 int형이 아니라 Student 객체라서 temp 변수를 Student 객체로 선언하고 사용해야 한다.
					students[row] = students[col];
					students[col] = temp;
					}
				}
			}
		
		System.out.println("**** 성적표 ****");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점\t등수");
		System.out.println("------------------------------------------------------------");
		for(int i=0; i<students.length; i++) {
			System.out.println(students[i].no + "\t" + students[i].name + "\t"+ students[i].kor + "\t" + students[i].eng + "\t" 
		+ students[i].tot + "\t" + students[i].avg + "\t" + students[i].grade + "\t" + students[i].rank);
		}
		
	}
}
