package RefValueTypes;

public class RefValueTypes2 {
	public static void main(String[] args) {
		// reference types, b is a reference and not a value
		Book b = new Book();
		
		b.setTitle("Harry Potter");
		b.setAuthor("J.K. Rowling");
		b.setYear(1999);
		
		System.out.println(b.getTitle());
		bookChanger(b);
		System.out.println(b.getTitle());
		
		Book b2 = b;	// copy reference only => 2 reference on the same object(value)
	}
	public static void bookChanger(Book b) {
		// Book b = new Book();		// create new object with new values and new memory place, forget about argument b
		b.setTitle("New Title");
	}
}
