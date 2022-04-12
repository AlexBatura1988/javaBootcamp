package library;


import library.Book.TYPES_BOOK;

public class Runner {

	public static void main(String[] args) {

		Book book = new BookForSelling(TYPES_BOOK.COOKIN, "Cook Pizza", new Author("Alex", 's'), 2, 3, 100);
		book.approach();
		
//		Book book1 = new BorrowableBook(TYPES_BOOK.DICTIONARIES, "dictonary", new Author("Roma",'m') , 4, 2);
//		//book1.approach();
//		
//		Book book2 = new ReadableBook(TYPES_BOOK.NOVELS, "jjj", new Author("mm",'s'), 2);
//		//book2.approach();

	}

}
