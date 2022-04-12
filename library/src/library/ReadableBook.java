package library;

import java.util.Scanner;

public class ReadableBook extends Book {

	public ReadableBook(TYPES_BOOK type, String bookTitle, Author author, int quantity) {
		super(type, bookTitle, author, quantity);
	}

	@Override
	public void approach() {
		System.out.println("this book is for reading only\n1)you want to read\n2 you want to return?\n3 exit");
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		do {
			String userInput = scanner.nextLine();
			input = Integer.parseInt(userInput);
			
			switch (input) {
			case 1:
				read();
				break;
			case 2:
				returnBook();
				break;
			case 3:
				System.out.println("bye bye");
				break;
			default:
				System.out.println("invalid input try again");
			}
		} while (input != 3);
		
		scanner.close();
	}
}
