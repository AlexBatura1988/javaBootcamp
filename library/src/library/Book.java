package library;

public abstract class Book implements Readable {

	protected TYPES_BOOK type;
	protected Author author;
	protected int quantity;
	private final int CAPACITY;
	protected String bookTitle;

	public Book(TYPES_BOOK type, String bookTitle, Author author, int quantity) {
		this.type = type;
		this.author = author;
		this.bookTitle = bookTitle;
		this.quantity = quantity;
		CAPACITY = quantity;
	}
	
	public abstract void approach();

	@Override
	public void read() {
		if (quantity != 0) {
			System.out.println("take a book for read " + toString());
			quantity--;
		} else {
			System.out.println("no books for read");
		}
	}

	@Override
	public void returnBook() {
		if (quantity < CAPACITY) {
			quantity++;
			System.out.println("book is returned " + toString());
		} else {
			System.out.println("no book to return");
		}
	}

	

	@Override
	public String toString() {
		return "Book [type=" + type + ", author=" + author + ", quantity=" + quantity + ", bookTitle=" + bookTitle
				+ "]";
	}

	enum TYPES_BOOK {
		COOKIN, NOVELS, DICTIONARIES
	}
}
