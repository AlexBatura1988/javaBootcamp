package javabootcamp.basic.string.ex1;

import java.util.Scanner;

public class Runner {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		printMenu();
		
		int input =0;
		do {
			String userInput = scanner.nextLine();
			input = Integer.parseInt(userInput);
			
			switch(input) {
			case 1:
				question1();
				break;
			case 2:
				question2();				
				break;
			case 3:
				question3();
				break;
			}
			
			
		}while(input != 7);
		scanner.close();

	}

	public static void printMenu() {
		String menuText = "Please enter the number of your selection from the following options:\r\n";
		menuText += "1. Enter 2 sentences and I’ll tell you if one is the other written backwards.\r\n";
		menuText += "2. Enter a word and I’ll tell you if it is a palindrome.\r\n";
		menuText += "3. Enter a sentence and a word and I’ll remove that word from anywhere in the sentence for you.\r\n";
		menuText += "4. Enter a sentence and I’ll capitalize the beginning of each word in it.\r\n";
		menuText += "5. Enter a sentence and 2 words and I’ll replace that first word with the second from everywhere in the sentence for you.\r\n";
		menuText += "6. Enter a sentence and a letter and I’ll print all the words that start with that letter.\r\n";
		menuText += "7. Exit\r\n";
		System.out.println(menuText);


	}
	public static void question1() {
		System.out.println("enter a string 1");
		String s = scanner.nextLine();
		System.out.println("enter a string 2");
		String s1 = scanner.nextLine();
		System.out.println(isTwoStringRevers(s, s1));
		
	}
	public static void question2() {
		System.out.println("enter a string");
		String s = scanner.nextLine();
		System.out.println(isPalindrom(s));
	}
	public static void question3() {
		String result;
		System.out.println("enter string");
		String s = scanner.nextLine();
		System.out.println("enter remove world");
		String ch = scanner.nextLine();
		result = removeWorld(s, ch);
		System.out.println(result);
		
	}

	private static boolean isPalindrom(String s) {
		int i = s.length() - 1;
		int j = 0;
		while (i > j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i--;
			j++;
		}

		return true;
	}

	private static boolean isTwoStringRevers(String s1, String s2) {
		String res = "";
		for (int i = 0; i < s2.length(); i++) {
			res = s2.charAt(i) + res;
		}

		if (s1.equals(res)) {
			return true;
		}
		return false;
	}

	private static String removeWorld(String s, String world) {
		if(s.contains(world)) {
			String temp = world + "";
			System.out.println(temp);
			s = s.replaceAll(temp, "");
			temp = "" + world;
			s = s.replaceAll(temp, "");
		}

		return s;
	}
}

