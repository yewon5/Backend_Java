import BookPack.Book;
import BookExtend.Book_v1;

public class BookManager {
	public static void main(String[] args) {
		// TODO 패키지 테스트
		Book[] books = new Book[4];
		books[0] = new Book("Java", "Tom", 2005);
		books[1] = new Book("JSP", "Jane", 2007);
		books[2] = new Book("Spring", "John", 2000);
		books[3] = new Book("React", "Marry", 2010);
		
		for(int i=0; i<books.length; i++) {
			books[i].display();
		}
		System.out.println();
		
		Book_v1[] books_v1 = new Book_v1[4];
		books_v1[0] = new Book_v1("Java", "Tom", 2005, "A");
		books_v1[1] = new Book_v1("JSP", "Jane", 2007, "A");
		books_v1[2] = new Book_v1("Spring", "John", 2000, "B");
		books_v1[3] = new Book_v1("React", "Marry", 2010, "C");
		
		for(int i=0; i<books_v1.length; i++) {
			books_v1[i].display();
		}
	}
}
