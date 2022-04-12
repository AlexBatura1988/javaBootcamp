package library;

import java.util.Scanner;

public class BookForSelling extends BorrowableBook implements Sellable {
	protected double price;
	public BookForSelling(TYPES_BOOK type, String bookTitle, Author author, int quantity, int borrowingPeriod,
			double price) {
		super(type, bookTitle, author, quantity, borrowingPeriod);
		this.price = price;
	}

	@Override
	public void approach() {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		System.out.println("this book is available for borrow and reading\nand selling\n"
				+ "1 you want read?\n2 you want borrow?\n3 you want rerurn\n4 you want to buy?\n5 exit");
		
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
				buyBook();
				break;
			case 5:
				System.out.println("bye bye!!");
				break;
			default:
				System.out.println("invalid input try again");
			}

		} while (input != 5);
		scanner.close();
	}
	@Override
	public void buyBook() {
		if (this.quantity > 0) {
			System.out.println("you buy a book " + super.toString());
			this.quantity--;
		} else {
			System.out.println("no books for buy");
		}
	}
	@Override
	public String toString() {
		return "[price=" + price + ", borrowingPeriod=" + borrowingPeriod + ", type=" + type + ", author=" + author
				+ ", quantity=" + quantity + ", bookTitle=" + bookTitle + "]";
	}

}
