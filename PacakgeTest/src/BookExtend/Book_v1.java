package BookExtend;

import BookPack.Book;

public class Book_v1 extends Book {
	private String pubName;
	
	public Book_v1(String t, String a, int y, String p){ //생성자가 public이어야 호출 가능
		title = t;
		author =a;
		year = y; //위의 2개 protected상속, year public상속
		//super(t, a, y); //부모의 생성자호출
		pubName = p;
	}
	
	public void display() { //Book 오버라이딩
		System.out.println(title + ", " + author + ", " + year  + ", " + pubName);
		
	}
}
