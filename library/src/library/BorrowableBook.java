package library;

import java.util.Scanner;

public class BorrowableBook extends Book {

	protected int borrowingPeriod;

	public BorrowableBook(TYPES_BOOK type, String bookTitle, Author author, int quantity, int borrowingPeriod) {
		super(type, bookTitle, author, quantity);
		this.borrowingPeriod = borrowingPeriod;
	}

	@Override
	public void approach() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		System.out.println("this book is available for borrow and reading\n"
				+ "1 you want read?\n2 you want borrow?\n3 you want rerurn\n4 exit");
		
		do {
			String userInput = scanner.nextLine();
			input = Integer.parseInt(userInput);
			switch (input) {
			case 1:
				read();
				break;
			case 2:
				BorrowBook();
				break;
			case 3:
				returnBook();
				break;
			case 4:
				System.out.println("bye bye");
				break;
			default:
				System.out.println("invalid input try again");
			}
		} while (input != 4);
		
		scanner.close();
	}

	public void BorrowBook() {
		if (this.quantity != 0) {
			System.out.println("take a book for borrow " + toString());
			this.quantity--;
		} else {
			System.out.println("no books for borrowing");
		}
	}

	@Override
	public String toString() {
		return "BorrowableBook [borrowingPeriod=" + borrowingPeriod + ", type=" + type + ", author=" + author
				+ ", quantity=" + quantity + ", bookTitle=" + bookTitle + "]";
	}

	

}
