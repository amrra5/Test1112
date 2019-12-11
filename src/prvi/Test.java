package prvi;

public class Test {

	public static void main(String[] args) {
		
		Author author = new Author("Jack", "jack5@gmail.com",'M');
		Book book = new Book("Days",author,20.5,3);
		System.out.println(book.toString());

	}

}
